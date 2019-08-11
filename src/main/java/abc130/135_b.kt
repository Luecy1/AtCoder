import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLine().toInt()
    val b = sc.nextLine().split(" ").map { it.toInt() }
    println(problem135_b(a, b))
}

fun problem135_b(a: Int, b: List<Int>): String {
    val list = b.toMutableList()

    var swapCount = 0

    for (i in 1..b.size) {

        // 間違っている場合入れ替えを行う
        if (list[i - 1] != i) {

            if (swapCount > 0) {
                return "NO"
            }

            val tmpA = list[i - 1]
            list[i - 1] = list[tmpA - 1]    // 左側の値を正しいものに
            list[tmpA - 1] = tmpA
            swapCount++

        }
    }
    return "YES"
}

