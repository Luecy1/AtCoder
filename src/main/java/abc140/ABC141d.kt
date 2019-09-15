import java.util.*

fun main(args: Array<String>) {

    val (n, m) = readLine()!!.split(" ").map(String::toInt)

    val aList = readLine()!!.split(" ").map(String::toInt)

    println(abc141d(n, m, aList))
}

fun abc141d(n: Int, m: Int, aList: List<Int>): Any? {

    class Rev : Comparator<Int> {
        override fun compare(o1: Int?, o2: Int?): Int {
            return o2!! - o1!!
        }
    }
//    val comp = Comparator<Int>() { i1: Int, i2: Int ->
//        return@Comparator i2 - i1
//    }

    val tmpQueue = java.util.PriorityQueue<Int>(aList.size, Rev())

    for (a in aList) {
        tmpQueue.offer(a)
    }

    repeat(m) {
        val tmp = tmpQueue.poll()!! / 2
        tmpQueue += tmp
    }

//    repeat(m) {
//
//        var tmpMax = 0
//        var tmpindex = -1
//        for ((index,a) in aMutaList.withIndex()) {
//            if (a > tmpMax) {
//                tmpMax = a
//                tmpindex =  index
//            }
//        }
//
//        if (tmpindex > -1) {
//            val hanbun = tmpMax / 2
//            aMutaList[tmpindex] = hanbun
//        }
//    }


    var sum = 0L
    for (e in tmpQueue) {
        sum += e
    }
    return sum
}

