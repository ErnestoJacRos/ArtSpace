package com.jacrosdevs.artspace

fun main() {

    val solarSystem: List<String> = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)//retorna un entero que es el tamanho del del array

    println(solarSystem[2])//trae el valor del indice indicado
    println(solarSystem.get(3))//trae el valor del indice indicado
    println(solarSystem.indexOf("Earth"))//busca el indice conforme el valor
    println(solarSystem.indexOf("Pluto"))//muestra menos uno si no existe el valor
    //iteracion
    for (palnet in solarSystem) {
        print("$palnet, ")
    }
    println()
    val sorted = solarSystem.sorted()
    for (palnet in sorted) {
        print("$palnet, ")
    }



}
