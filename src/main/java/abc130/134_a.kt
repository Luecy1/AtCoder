import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r = sc.nextLong()
    println(problem134_a(r))
}

fun problem134_a(r: Long): Int {
    return (3 * Math.pow(r.toDouble(), 2.0)).toInt()
}