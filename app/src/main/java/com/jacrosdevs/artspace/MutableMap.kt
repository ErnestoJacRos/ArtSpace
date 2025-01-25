package com.jacrosdevs.artspace

fun main() {
    val solarSysyem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupyter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    val sS = mutableMapOf(23 to "Earth")

    println(solarSysyem.size)
    //agregar
    solarSysyem["Pluto"] = 5
    println(solarSysyem)

    println(solarSysyem["Pluto"])
    println(solarSysyem.get("Theia")) // si no lo encuentra regresa null

    solarSysyem.forEach{
        println(it)
    }
}