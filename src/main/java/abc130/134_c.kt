import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = mutableListOf<Int>()
    repeat(n) {
        a.add(sc.nextInt())
    }

    println(problem134_c(n, a))
}

fun problem134_c(n: Int, a: MutableList<Int>): String {
    val result = mutableListOf<Int>()

    val tmpSet = TreeSet<Int> { o1, o2 -> o2 - o1 }

    for (el in a) {
        tmpSet.add(el)
    }

    val tmpList = tmpSet.toList()

    val first = tmpList[0]
    val second = if (a.count { it == first } > 1 || tmpList.size == 1) {
        tmpList[0]
    } else {
        tmpList[1]
    }

    for (e in a) {

        if (e == first) {
            result.add(second)
        } else {
            result.add(first)
        }

    }

    return result.joinToString("\n")
}