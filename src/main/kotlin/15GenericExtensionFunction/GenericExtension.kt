package `15GenericExtensionFunction`

class Data<T>(val data: T)

fun Data<String>.print() {
    val data = this.data
    println(data)
}

fun main() {
    val data1 = Data(1)
    val data2 = Data("Roy")

    // data1.print() error
    data2.print()
}