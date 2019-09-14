fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val list = mutableListOf<travel>()

    repeat(n) {
        val (tmpT, tmpX, tmpY) = readLine()!!.split(" ").map(String::toInt)

        list += travel(tmpT, tmpX, tmpY)
    }

    println(abc086c(list))
}

fun abc086c(t: MutableList<travel>): Any? {

    var currentX = 0
    var currentY = 0
    var currentTime = 0

    for (e in t) {

        val distance = Math.abs(e.x - currentX) + Math.abs(e.y - currentY)

        val distTime = e.t - currentTime

        if (distTime < distance) {
            return "No"
        }

        val oddFlg = distTime % 2 == 0
        val distOddFlg = distance % 2 == 0

        if (oddFlg != distOddFlg) {
            return "No"
        }

        currentX = e.x
        currentY = e.y
        currentTime = e.t
    }

    return "Yes"
}

data class travel(
    val t: Int,
    val x: Int,
    val y: Int
)
