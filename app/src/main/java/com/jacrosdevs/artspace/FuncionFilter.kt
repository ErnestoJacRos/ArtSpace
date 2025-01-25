package com.jacrosdevs.artspace

/**
 * filter() te permite crear un subconjunto de una coleccion , por ejemplo, si tuvieras una lista
 * de numeros paodrias usar filter() para crea runa nueva lista que solo tenga numeros divisibles por 2
 * filter genera una nuva List<Cookie> apartir de List<Cookie> pero de menor o igual tamnho
 * */

fun main() {
    val softBaketMenu = cookies.filter {
        it.softBaked
    }
    println("Soft Cookies: ")
    softBaketMenu.forEach {
        println("${it.name} -> $${it.price}")
    }
}