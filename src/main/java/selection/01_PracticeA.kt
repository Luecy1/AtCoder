import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLine().toInt()
    val (b, c) = sc.nextLine().split(" ").map(String::toInt)
    val s = sc.nextLine()

    println(practiceA(a, b, c, s))
}

fun practiceA(a: Int, b: Int, c: Int, s: String): String {
    return "${a + b + c} $s"
}