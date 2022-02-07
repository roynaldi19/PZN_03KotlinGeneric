package `09StarProjection`

fun displaySize(array: Array<*>) {
    println("Total array is ${array.size}")
}

fun main() {

    // boleh type genric apapun
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val arrayString: Array<String> = arrayOf("roynaldi", "Kidd")

    displaySize(arrayInt)
    displaySize(arrayString)
}