
fun main(args: Array<String>) {

    println(abc140a())
}

fun abc140a(): Any? {
    val n = readLine()!!.toInt()

    return Math.pow(n.toDouble(), 3.0).toInt()
}
