fun main(args: Array<String>) {

    val a = readLine()!!

    println(abc141b(a))
}

fun abc141b(a: String): Any? {

    for ((i, e) in a.toCharArray().withIndex()) {

        if (i % 2 != 0) {
            // 偶数
            if (e == 'R') {
                return "No"
            }

        } else {
            // 奇数
            if (e == 'L') {
                return "No"
            }
        }
    }
    return "Yes"
}
