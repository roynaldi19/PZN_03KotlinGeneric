package `04Invariant`

class Invariant<T>(var data: T)

fun main() {
    val invariantString = Invariant(String)

    //val invariantAny: Invariant<Any> = invariantString // tidak boleh
    // invariantAny.data = 100  //akan error saat runing karna memasukan INt ke String
}