fun main(args: Array<String>) {

    abc143b()
}


fun abc143b() {
    var result = 0

    val n = readLine()!!
    val dList = readLine()!!.split(" ").map(String::toInt)

    for ((i, d1) in dList.withIndex()) {

        for (i2 in (i + 1) until dList.size) {
            result += d1 * dList[i2]
        }
    }

    println(result)
}
