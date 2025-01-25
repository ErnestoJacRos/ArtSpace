package com.jacrosdevs.artspace

fun main() {
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.sorted()
    println(solarSystem)
    solarSystem.add("Pluto")
    solarSystem.forEach { print("$it, ") }
    solarSystem.add(3, "Theia")
    println()
    solarSystem.forEach { print("$it, ") }
    println()
    solarSystem[3] = "Future Moon"
    println(solarSystem[3])
    println(solarSystem[9])
    println(solarSystem)
    // remover
    solarSystem.removeAt(9) //remover por medio del indice
    println(solarSystem)
    solarSystem.remove("Future Moon") //remover por valor
    println(solarSystem)
    println(solarSystem.contains("Pluto")) //regresa un Booleano haciendo refferencia entre si existe
    println("Future Moon" in solarSystem) // algo mas conciso  devuelve un booleano
}