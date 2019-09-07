
fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    println(abc140a(n))
}

fun abc140a(n: Int): Any? {
    return Math.pow(n.toDouble(), 3.0).toInt()
}
