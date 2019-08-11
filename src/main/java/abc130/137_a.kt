import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()

    println(problem137_a(a, b))
}

fun problem137_a(a: Int, b: Int): Int {

    val plus = a + b
    val minus = a - b
    val kake = a * b

    return intArrayOf(plus, minus, kake).max()!!
}