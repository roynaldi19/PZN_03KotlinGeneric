package `08TypeProjection`

class Container<T>(var data: T)

fun copyContainer(from: Container<out Any>, to: Container<in Any>){ //memaksa out dan in
    to.data = from.data
}

fun main() {
    val container1 = Container("Roy")
    val container2 = Container<Any>("Kidd")

    copyContainer(container1, container2)
}