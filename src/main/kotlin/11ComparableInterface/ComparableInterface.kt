package `11ComparableInterface`

fun main() {
    val fruit1 = Fruit("Appple", 10)
    val fruit2 = Fruit("Appple", 10)

    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
}