import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = sc.nextInt()

    println(problem134_b(n, d))
}

fun problem134_b(n: Int, d: Int): Int {

    val canKanshi = 2 * d + 1

    return if (n % canKanshi == 0) {
        (n / canKanshi)
    } else (n / canKanshi) + 1
}