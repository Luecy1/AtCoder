fun main(args: Array<String>) {

    val (l, r) = readLine()!!.split(" ").map(String::toLong)

    println(func133c(l, r))
}

fun func133c(l: Long, r: Long): Any? {

    if (2019 <= r - l) {
        return 0
    }

    val rmin = Math.min(r, l + 2019 * 2)

    var ans = Long.MAX_VALUE
    for (i in l..rmin) {
        for (j in (i + 1)..rmin) {
            val x = (i * j) % 2019
            ans = Math.min(ans, x)
        }
    }

    return ans
}
