/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

fun main() {
    printAreaPolygon(TypePolygon.Square(4.0))
}

fun printAreaPolygon(type: TypePolygon) {
    when (type) {
        is TypePolygon.Rectangle -> println(type.area())
        is TypePolygon.Square -> println(type.area())
        is TypePolygon.Triangle -> println(type.area())
    }
}

sealed class TypePolygon {
    data class Triangle(val base: Double, val height: Double) : TypePolygon() {
        override fun area() = (base * height) / 2
    }

    data class Square(val base: Double) : TypePolygon() {
        override fun area() = (base * base)
    }

    data class Rectangle(val base: Double, val height: Int) : TypePolygon() {
      override fun area() = (base * height)
    }

    open fun area():Double{
        return 0.0
    }
}