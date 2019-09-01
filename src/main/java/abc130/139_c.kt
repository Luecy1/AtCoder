fun main(args: Array<String>) {

    val n = readLine()!!
    val h = readLine()!!.split(" ").map(String::toLong)

    println(method139C(n, h))
}

fun method139C(n: String, h: List<Long>): Any? {

    var current = 0
    var max = 0

    val length = n.toInt() - 1

    for (index in 0 until length) {

        if (h[index] >= h[index + 1]) {
            // 移動可能
            current++
        } else {
            // 不可能
            if (max < current) {
                max = current
            }
            current = 0
        }
    }

    // 右橋が最大のとき
    if (max < current) {
        max = current
    }
    return max
}
