fun main(args: Array<String>) {
    abc143a()
}

fun abc143a() {

    val (a, b) = readLine()!!.split(" ").map(String::toInt)

    val length = b * 2

    val result = if (a - length > 0) {
        a - length
    } else {
        0
    }
    println(result)
}
