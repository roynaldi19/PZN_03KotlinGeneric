package `06Contravaraint`

class Contravariant<in T> { // hanya menerima input
    fun sayHello(param: T){
        println("Hello $param")
    }

//    tidak boleh
//    fun getData(): T {
//        return data
//    }
}

fun main() {
    val contravariantAny = Contravariant<Any>()
    val contravariantString: Contravariant<String> = contravariantAny

    contravariantString.sayHello("Roy")
    // contravariantString.getData() // error
}