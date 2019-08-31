fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map(String::toInt)

    println(abc081b(n, a))
}

fun abc081b(n: Int, a: List<Int>): Any? {

    var count = 0
    val tmpList = a.toMutableList()

    loop@while (true) {

        for (index in 0 until tmpList.size) {
            if (tmpList[index] % 2 == 0) {
                tmpList[index] /= 2
            } else {
                break@loop
            }
        }

        count++
    }

    return count
}
