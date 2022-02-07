package `02GenericClass`

class MyData<T>(val firstData: T) {

    fun getData(): T = firstData

    fun printData() {
        println("Data is $firstData")
    }
}