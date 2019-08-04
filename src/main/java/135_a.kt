import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problem135_a(a, b))
}

fun problem135_a(a: Long, b: Long): String {

    val sa = Math.abs(a - b)

    if (sa % 2L != 0L) {
        // 中間地点は存在しない
        return "IMPOSSIBLE"
    }

    val min = Math.min(a,b)

    return  (min + (sa / 2L)).toString()
}