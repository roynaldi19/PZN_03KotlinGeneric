package `03GenericFunction`

class Fuction(val name: String) {

    fun<T> sayHello(param: T) {
        println("Hello $param")
    }
}