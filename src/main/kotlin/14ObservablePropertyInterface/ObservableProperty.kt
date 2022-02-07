package `14ObservablePropertyInterface`

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(param: T) : ObservableProperty<T>(param) {


    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("before change property: ${property.name} from $oldValue  $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("after change ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)
}

fun main() {
    var car = Car("BMW", 2018)

    car.brand = "Audi"
    println(car.brand)
    car.year = 2019
    println(car.year)
}
