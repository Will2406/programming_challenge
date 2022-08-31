/*
 * Reto #8
 * DECIMAL A BINARIO
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa se encargue de transformar un número decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 *
 */

fun main() {
    println(convertToBinary(150))
}

fun convertToBinary(number: Int): String {
    var binaryNumber = ""
    var currentNumber: Int = number
    while (currentNumber != 0) {
        binaryNumber += currentNumber % 2
        currentNumber /= 2
    }

    return binaryNumber.reversed()
}