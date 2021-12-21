package `02GenericClass`

fun main() {
    val myDataString: MyData<String> = MyData("Roy")
    myDataString.printData()

    val myDataInt: MyData<Int> = MyData(123456)
    myDataInt.printData()

}