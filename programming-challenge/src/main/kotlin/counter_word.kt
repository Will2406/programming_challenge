/*
 * Reto #7
 * CONTANDO PALABRAS
 * Dificultad: MEDIA
 *
 * Enunciado: Crea un programa que cuente cuantas veces se repite cada palabra y que muestre el
 * recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que lo resuelvan automáticamente.
 *
 */

fun main() {
    println(
        counterWord(
            "La repetición de palabras que todo palabras, de todas las palabras nuevas. Palabras son las que quiero",
            "palabras"
        )
    )
}

fun counterWord(text: String, word: String): Int {
    val splitText = text.lowercase().split(" ")
    var counter = 0
    splitText.forEach {
        var currentValue = it
        val lastValueOfString = currentValue[it.length - 1].toString()
        if (lastValueOfString == "," || lastValueOfString == ".")
            currentValue = it.substring(0, it.length - 1)
        if (word == currentValue) {
            counter++
        }
    }
    return counter
}