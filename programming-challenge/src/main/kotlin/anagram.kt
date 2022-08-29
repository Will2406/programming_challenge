/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 *
 */

fun main() {
    println(isAnagram("perro", "perro")) //False
    println(isAnagram("repro", "perro")) //True
    println(isAnagram("Repro", "pErro")) //True
    println(isAnagram("Reprr", "pErrs")) //False
}

fun isAnagram(text: String, compareTo: String): Boolean {
    if (text.lowercase() == compareTo.lowercase()) {
        return false
    }
    val textAsList = text.lowercase().toList().sorted()
    val compareToAsList = compareTo.lowercase().toList().sorted()
    return textAsList == compareToAsList
}