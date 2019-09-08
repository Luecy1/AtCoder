fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    val aList = readLine()!!.split(" ").map(String::toInt)

    println(abc088b(n, aList))
}

fun abc088b(n: Int, aList: List<Int>): Any? {

    val tmpList = aList.sortedDescending()
    var aSum = 0
    var bSum = 0

    var aFlg = true
    for (e in tmpList) {

        if (aFlg) {
            aSum += e
        } else {
            bSum += e
        }

        aFlg = !aFlg
    }

    return aSum - bSum
}
