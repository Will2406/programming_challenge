/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 *
 */

fun main() {
    var firstPreviousValue = 0
    var secondPreviousValue = 1
    var currentValue: Int
    for (i in 0..50) {
        println(firstPreviousValue)
        currentValue = firstPreviousValue + secondPreviousValue
        secondPreviousValue = firstPreviousValue
        firstPreviousValue = currentValue
    }
}