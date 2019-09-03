fun main(args: Array<String>) {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val x = readLine()!!.toInt()

    println(abc087b(a, b, c, x))
}

fun abc087b(a: Int, b: Int, c: Int, x: Int): Any? {

    var count = 0

    for (aElement in 0..a) {
        for (bElement in 0..b) {
            for (cElement in 0..c) {
                val sum = aElement * 500 + bElement * 100 + cElement * 50
                if (sum == x) {
                    count++
                }
            }
        }
    }

    return count
}
