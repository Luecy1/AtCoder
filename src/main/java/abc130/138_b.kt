import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLine().toInt()
    val a = sc.nextLine().split(" ").map { it.toDouble() }

    println(problem138_b(n, a))
}

fun problem138_b(n: Int, a: List<Double>): Double {


    var sum = 0.0
    for (ele in a) {
        sum += 1 / ele
    }

    return 1 / sum
}