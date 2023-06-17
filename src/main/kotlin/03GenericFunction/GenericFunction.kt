package `03GenericFunction`

class Fuction(val name: String) {

    fun<T> sayHello(param: T) {
        println("Hello $param, My name is $name")
    }
}

fun main() {
    val function = Fuction("Roy")
    function.sayHello("Budi")
    function.sayHello(12)

}