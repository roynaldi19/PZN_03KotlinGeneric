package `09StarProjection`

fun dispalySize(array: Array<*>) {
    println("Total array is ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val arrrayString: Array<String> = arrayOf("roynaldi", "Kidd")

    dispalySize(arrayInt)
    dispalySize(arrrayString)
}