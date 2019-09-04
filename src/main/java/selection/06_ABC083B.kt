fun main(args: Array<String>) {

    val (n, a, b) = readLine()!!.split(" ").map(String::toInt)

    println(abc083b(n, a, b))
}

fun abc083b(n: Int, a: Int, b: Int): Any? {

    var count = 0
    for (e in 1..n) {

        val sum = e.toString().split("").filter { it != "" }.map(String::toInt).sum()

        if (sum in a..b) {
            count += e
        }
    }

    return count
}
