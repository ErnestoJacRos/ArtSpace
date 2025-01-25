package com.jacrosdevs.artspace
/**
 * se usa para generar un valor unico apartitr d euna coleccion, por lo general se usa para
 * calcular un total o sumar todos los elementos de una lista para encotrar un promedio*/
fun main() {
    val totalPrice = cookies.fold(0.0) {
        total ,  cookie ->
        total + cookie.price
    }

    println("Total price: $${totalPrice}")
}