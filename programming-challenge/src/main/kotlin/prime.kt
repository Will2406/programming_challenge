/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 *
 */

fun main() {
    for (i in 1..100 ) println("$i is prime? ${isPrime(i)}")
}

fun isPrime(number: Int): Boolean {
    return if (number == 2 || number == 3 || number == 5 || number == 7) true
    else if (number % 2 == 0) false
    else if (number % 3 == 0) false
    else if (number % 5 == 0) false
    else number % 7 != 0
}