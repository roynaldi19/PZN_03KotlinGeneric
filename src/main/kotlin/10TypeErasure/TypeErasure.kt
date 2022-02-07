package `10TypeErasure`

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}


fun main() {
    val data1 = TypeErasure("Roy")
    val dataString: String = data1.getData()
    println(dataString)

    val data2: TypeErasure<Int> = data1 as TypeErasure<Int>

//    error karna memaksa berubah ke Int
//    val dataInt = data2.getData()
//    println(dataInt)
}