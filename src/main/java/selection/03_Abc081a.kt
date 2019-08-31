fun main(args: Array<String>) {

    val s = readLine()!!

    println(abc081a(s))
}

fun abc081a(s: String): Any? {

    return s.toCharArray().filter { it == '1' }.count()
}
