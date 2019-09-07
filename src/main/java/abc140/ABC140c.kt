fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val b = readLine()!!.split(" ").map(String::toInt)

    println(abc140c(n, b))
}

// 0 153 10 10 23
// 0 0   10 10 10 23
fun abc140c(n: Int, bList: List<Int>): Any? {

    val a = mutableListOf<Int>()

    a.add(bList[0])

    for (i in bList.indices) {

        if (i == bList.size - 1) {
            a.add(bList[i])
            break
        }

        // 自分と一個前のbのminを採用
        val tmp = Math.min(bList[i], bList[i + 1])
        a.add(tmp)
    }
    return a.sum()
}
