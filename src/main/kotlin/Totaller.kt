class Totaller(var total: Int = 0) {

    fun add(num: Int): Int {
        total += num
        return total
    }

}


//infix
//If you prefix a function with infix, you can call it without using the dot notation.
class Dog {
    infix fun bark(x: Int): String {
        println("$x pass to this fun without dot operation!")
        return ""
    }
}

fun main() {
    Dog() bark 6
}