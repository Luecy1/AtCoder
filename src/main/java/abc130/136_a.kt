import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    println(problem136_a(a, b, c))
}

fun problem136_a(a: Int, b: Int, c: Int): Int {

    val capa = a - b
    return if (c - capa > 0) {
        c - capa
    } else {
        0
    }
}