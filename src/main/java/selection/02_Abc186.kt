import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val (a, b) = sc.nextLine().split(" ").map(String::toInt)

    println(abc_186a(a, b))
}

fun abc_186a(a: Int, b: Int): String {
    return if (a * b % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }
}

