package com.jacrosdevs.artspace
/**
 * Group By se puede usar para convertir una lista en un mapa con base en una funcion
 * Cada valor unico que se muestra de la funcion se convierte en una clave en el mapa resultante,
 * Los valores de cada clave son todos los elementos de la coleccion que produjeron ese valor unico*/

fun main() {
    val groupedMenu = cookies.groupBy {
        it.softBaked
    }
    val softBakeManu =  groupedMenu[true] ?: listOf()
    val crunchMenu = groupedMenu[false] ?: listOf()

    println("Soft Cookies")
    softBakeManu.forEach {
        println("${it.name} -> ${it.price}")
    }
    println()

    println("Crunchy Cookies")
    crunchMenu.forEach {
        println("${it.name} -> ${it.price}")
    }


}