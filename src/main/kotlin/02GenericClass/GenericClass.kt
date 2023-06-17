package `02GenericClass`


class MyData<T, U>(val firstData: T, val secondData: U) {

    fun getFirst(): T  = firstData

    fun getSecond(): U = secondData

    fun printData() {
        println("Data is $firstData $secondData")
    }
}

fun main() {
    val myDataString = MyData("Roy", 123456)
    myDataString.printData()

    val myDataInt: MyData<Int, String> = MyData(123456, "Kidd")
    myDataInt.printData()

}