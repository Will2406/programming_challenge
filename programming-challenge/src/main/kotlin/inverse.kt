/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 *
 */

fun main() {
    println(inverseText("Daniel"))
}

fun inverseText(text: String): String {
    val textAsList = text.toList()
    var inverseText = ""
    for (i in textAsList.size - 1 downTo 0) {
        inverseText += textAsList[i].toString()
    }
    return inverseText
}