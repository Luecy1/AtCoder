fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val kList = readLine()!!.split(" ").map(String::toInt)

    println(abc142c(n, kList))
}

fun abc142c(n: Int, kList: List<Int>): Any? {

    val map = mutableMapOf<Int, Int>()

    for ((index, k) in kList.withIndex()) {
        map[index + 1] = k
    }

    return map.toList().sortedBy { it.second }.map { it.first }.joinToString (" ")
}
