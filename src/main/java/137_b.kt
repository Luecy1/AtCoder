import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem137_b(a, b))
}

fun problem137_b(a: Int, b: Int): String {

    val result = arrayListOf<Int>()

    val max = b + (a - 1)

    val min = b - (a - 1)

    for (i in min..max) {
        result.add(i)
    }

    return result.joinToString(" ")
}

