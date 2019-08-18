import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLine()
    val v = sc.nextLine().split(" ").map { it.toInt() }

    println(problem138_c(a, v))
}

fun problem138_c(a: String, v: List<Int>): String {

    val sort = v.sortedByDescending { -it }

    var ave: Double = sort[0].toDouble()

    for ((index, value) in sort.withIndex()) {

        if (index == 0) {
            continue
        }

        ave = (ave + value) / 2
    }

    return ave.toString()
}