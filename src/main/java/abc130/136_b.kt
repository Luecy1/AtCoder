import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    println(problem136_b(a))
}

fun problem136_b(a: Long): Int {
    var count = 0
    for (i in 1..a) {
        if (i.toString().length % 2 == 1) {
            count++
        }
    }
    return count
}

