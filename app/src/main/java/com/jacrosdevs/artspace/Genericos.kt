package com.jacrosdevs.artspace

fun main() {


//    println(question2.toString())
//
//    var question4 = question2.copy(answer = true)
//    println("Question4 -> $question4")
//    println( question4.difficulty)
//
//    println("${StudentProgress.answered} of ${StudentProgress.total} answered")
    // println("${Quiz.answered} of ${Quiz.total} answered")

    //println(Quiz.progressText)
    println(Quiz().printProgressBar())
//    val quiz = Quiz()
//    println(quiz.printQuiz())
//    val quiz = Quiz().apply {
//        println(printQuiz())
//    }

    Quiz().apply {
        printQuiz()
    }


}

//Alamcena datos y resprentar objetos de valor simple keyword: data
//Generiocos: con llaves <> con paremntro T para especificar
data class Question<T>(val questionText: String, val answer: T, var difficulty: Difficulty)

//Enum conjunto de constantes
enum class Difficulty {
    EASY, MEDIUM, HARD
}

//Interface
interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}

class Quiz public constructor() : ProgressPrintable {
    override val progressText: String
        get() = "${answered} of ${total} answered"

    val question1 = Question<String>(
        questionText = "Quoth the raven__", answer = "nevermore",
        difficulty = Difficulty.MEDIUM
    )
    val question2 = Question<Boolean>(
        questionText = "The sky is green, true or false", answer = false,
        difficulty = Difficulty.EASY
    )
    val question3 = Question<Int>(
        questionText = "How many days are there between full mooons",
        answer = 28,
        difficulty = Difficulty.HARD
    )

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)

    }
//uso de let te permite hacer referencia a un obnjeto en una expresion lambda
    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }

        println()
    }

    //singleton no tiene constructor y cre instancas
    //se agrego companion (meter una clase en otra) y acceder con la clase host
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

//es una propiedad de extension  solo de lectura
//val Quiz.StudentProgress.progressText: String
//    get() = "${answered} of ${total} answered"

//funcion de extencion
//fun Quiz.StudentProgress.printProgressBar() {
////    repeat(Quiz.answered) { print("▓") }
////    repeat(Quiz.total - Quiz.answered) { print("▒") }
////    println()
////    println(Quiz.progressText)
//
//}

//funciones de extenciones con interfaces

