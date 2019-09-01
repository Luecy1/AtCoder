fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    println(method139d(n))

}

fun method139d(n: Int): Any? {

    val p = mutableListOf<Int>()
    for (e in 0 until n) {
        p.add(e + 1)
    }

    val usefulSet = p.toSet()

    var sum = 0
    for (index in 0 until n) {

        var tmpSum = 0

        for (e in usefulSet) {

            val tmp = p[index] % e

            if (tmpSum < tmp) {

            }
        }

        sum += tmpSum
    }

    return sum
}
