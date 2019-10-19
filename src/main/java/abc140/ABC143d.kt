fun main(args: Array<String>) {
    abc143d()
}

fun abc143d() {
    var result = 0

    val n = readLine()!!
    val lList = readLine()!!.split(" ").map(String::toInt)

    for (i1 in lList.indices) {
        val l1 = lList[i1]

        for (i2 in (i1 + 1) until lList.size) {
            val l2 = lList[i2]

            val high = l1 + l2
            val low = Math.max(l2 - l1, l1 - l2)

            if (low < 1) {
                continue
            }

            for (i3 in (i2 + 1) until lList.size) {
                val l3 = lList[i3]

                if (l3 !in (low + 1) until high) {
                    continue
                }

//                println("l1 -> $l1 l2 -> $l2 l3 -> $l3")
                result++
            }
        }
    }
    println(result)
}
