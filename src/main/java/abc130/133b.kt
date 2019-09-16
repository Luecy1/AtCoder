fun main(args: Array<String>) {

    val (n, d) = readLine()!!.split(" ").map(String::toInt)

    val xList = mutableListOf<List<Int>>()

    repeat(n) {
        xList += readLine()!!.split(" ").map(String::toInt)
    }

    println(fun133b(xList))
}

fun fun133b(xList: MutableList<List<Int>>): Any? {

    var count = 0
    for ((index, x1) in xList.withIndex()) {

        for (index2 in index + 1 until xList.size) {
            val x2 = xList[index2]

            var sum = 0
            for (index3 in 0 until x1.size) {
                sum += (x1[index3] - x2[index3]) * (x1[index3] - x2[index3])
            }

            val nijoList = mutableListOf<Int>()
            for (e in 1..sum) {
                nijoList += e * e
            }

            for (e in nijoList) {
                if (e == sum) {
                    count++
                    break
                }
            }
        }
    }

    return count
}
