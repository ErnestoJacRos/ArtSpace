package com.jacrosdevs.artspace

/**
 * En estos casos, las colecciones de Kotlin proporcionan una función sortedBy().
 * sortedBy() te permite especificar una expresión lambda que muestra la propiedad según
 * la cual deseas ordenar. Por ejemplo, si deseas ordenar por price, la lambda mostrará it.price.
 * Siempre y cuando el tipo de datos del valor tenga un orden natural (las cadenas se ordenan
 * alfabéticamente y los valores numéricos se ordenan de forma ascendente), se ordenará como si se
 * tratara de colecciones de ese tipo.
 * */
fun main() {
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("Alphabetical Menu:\n")

    alphabeticalMenu.forEach {
        println(it.name)
    }
}