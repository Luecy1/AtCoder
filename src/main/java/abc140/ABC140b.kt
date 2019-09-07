fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val a = readLine()!!.split(" ").map(String::toInt)
    val b = readLine()!!.split(" ").map(String::toInt)
    val c = readLine()!!.split(" ").map(String::toInt)


    println(abc140b(n, a, b, c))
}

fun abc140b(
    n: Int,
    a: List<Int>,
    b: List<Int>,
    c: List<Int>
): Any? {

    var sum = 0
    var last = -1
    for (e in a) {

        sum += b[e - 1]

        if (last == e - 1) {
            sum += c[e - 1 - 1]
        }

        last = e
    }

    return sum
}
