package `05Covariant`

class Covariant <out T>(val data: T) { //cuma boleh di output

    fun data(): T {
        return data
    }

//    tidak boleh menerima data dari luar
//    fun setData(param: T){
//        data = param
//    }
}

fun main() {
    val covariantString = Covariant("Roy")
    val covariantAny: Covariant<Any> = covariantString

    //  covariantAny.setData(100) // error saat jalan
}