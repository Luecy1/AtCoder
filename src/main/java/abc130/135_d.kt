import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.nextLine()
    println(problem135_d(s))
}

val N = 13
fun problem135_d(s: String): String {

    var dp = arrayOf(1L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

    val mod = 1000000007L

    var mul = 1
    for (index in s.length - 1 downTo 0) {
        val c = s[index]
        val nextDp = arrayOf(0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

        if (c == '?') {

            for (k in 0 until 10) {
                addDpTable(nextDp, k, mul, dp, mod)
            }
        } else {
            val k = c - '0'
            addDpTable(nextDp, k, mul, dp, mod)
        }

        mul *= 10
        mul %= N
        dp = nextDp
    }

    return dp[5].toString()
}

private fun addDpTable(
    nextDp: Array<Long>,
    k: Int,
    mul: Int,
    dp: Array<Long>,
    mod: Long
) {
    for (j in 0 until N) {
        val inde = (k * mul + j) % N
        nextDp[inde] += dp[j]
        nextDp[inde] %= mod
    }
}


