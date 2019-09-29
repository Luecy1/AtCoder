fun main(args: Array<String>) {

    val (n, k) = readLine()!!.split(" ").map(String::toInt)

    val hList = readLine()!!.split(" ").map (String::toInt)

    println(abc142b(k,hList))
}

fun abc142b(k: Int, hList: List<Int>): Any? {
    return hList.filter { it >= k }.count()
}
