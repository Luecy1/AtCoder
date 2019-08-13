import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLine().toInt()
    val a = sc.nextLine().split(" ").map { it.toLong() }
    val b = sc.nextLine().split(" ").map { it.toLong() }
    println(problem135_c(n, a, b))
}

fun problem135_c(n: Int, a: List<Long>, b: List<Long>): String {

    var result = 0L

    var killCount = 0L

    for (index in 0 until n) {

        // 正面の敵を倒す場合
        if (index == 0) {
            killCount = Math.min(a[0], b[0])
            result += killCount
        } else {
            killCount = Math.min(a[index] - killCount, b[index])
            result += killCount
        }

        // 斜め右の怪獣を倒す場合
        killCount = Math.min(a[index + 1], b[index] - killCount)
        result += killCount
    }

    return result.toString()
}

