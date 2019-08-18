import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLine().toInt()
    val s = sc.nextLine()

    println(problem138_a(a, s))
}

fun problem138_a(a: Int, s: String): String {

    return if (a >= 3200) {
        s
    } else {
        "red"
    }
}