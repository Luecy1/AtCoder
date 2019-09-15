fun main(args: Array<String>) {

    val (n, m) = readLine()!!.split(" ").map(String::toInt)

    val aList = readLine()!!.split(" ").map(String::toInt)

    println(abc141d(n, m, aList))
}

fun abc141d(n: Int, m: Int, aList: List<Int>): Any? {

    var aMutaList = aList.sortedDescending().toMutableList()

    repeat(m) {
        aMutaList[0] /= 2

        // ２番めが大きければ入れ替え
        if (aMutaList.size > 2 && aMutaList[1] > aMutaList[0]) {
            val tmp = aMutaList[0]
            aMutaList[0] = aMutaList[1]
            aMutaList[1] = tmp
        }
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
    for (e in aMutaList) {
        sum += e
    }
    return sum
}

