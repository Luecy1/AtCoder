fun main(args: Array<String>) {

    val (n, k) = readLine()!!.split(" ").map(String::toInt)
    val s = readLine()!!

    println(abc140d(n, k, s))
}


fun abc140d(n: Int, k: Int, s: String): Any? {

    val initScore = countHappy(s)

    return Math.min(initScore + 2 * k, s.length - 1)
}

fun countHappy(s: String): Int {
    var count = 0
    for (i in s.indices) {

        // 右端と左端は特別
        if (i == 0) {

            if (s[i] == 'L') {
                continue
            }

            if (s.length < 2) {
                continue
            }

            if (s[i + 1] == 'R') {
                count++
            }
            continue
        }
        if (i == s.length - 1) {
            if (s[i] == 'R') {
                continue
            }

            if (s[i - 1] == 'L') {
                count++
            }
            continue
        }

        if (s[i] == 'L') {
            if (s[i] == s[i - 1]) {
                count++
            }
        } else {
            if (s[i] == s[i + 1]) {
                count++
            }
        }
    }

    return count
}
