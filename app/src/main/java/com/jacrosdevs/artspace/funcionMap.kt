package com.jacrosdevs.artspace
/**
 * permita transformar una coleccion en otra nueva con la smisma cantidad de elementos
 * ejemplo transforamar una List<Cookie> en una List<String> que solo contenga el name de la galleta
 * siempre que le indiques a la funcion map() como crear una String de cada elemento Cookie
* */
fun main() {
    val fullMenu = cookies.map {
        //retorna una String por eso crea una List<String>
        "${it.name} -> $${it.price}"
    }
    println("Full Menu: ")
    fullMenu.forEach {
        println(it)
    }
}