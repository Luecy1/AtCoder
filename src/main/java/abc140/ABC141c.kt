fun main(args: Array<String>) {


    val (n, k, q) = readLine()!!.split(" ").map(String::toInt)

    val alist = mutableListOf<Int>()
    repeat(q) {
        alist += readLine()!!.toInt()
    }

    println(abc141c(n, k, alist))
}

fun abc141c(n: Int, k: Int, alist: MutableList<Int>): Any? {

    val result = mutableListOf<String>()

    val tmpMap = mutableMapOf<Int, Int>()

    for (hito in alist) {
        val value = tmpMap[hito]
        if (value != null) {
            tmpMap[hito] = value + 1
        } else {
            tmpMap[hito] = 1
        }
    }

    repeat(n) {
        if (k - alist.size + (tmpMap[it + 1] ?: 0) > 0) {
            result += "Yes"
        } else {
            result += "No"
        }
    }

//    repeat(n) {
//        val index = it + 1
//
//        var point = k
//        for (a in alist) {
//
//            if (a != index) {
//                point -=1
//            }
//
//            if (point == 0) {
//                result += "No"
//                break
//            }
//        }
//
//        if (point > 0) {
//            result += "Yes"
//        }

//        if (k - huseikai <= 0) {
//            result += "No"
//        } else {
//            result += "Yes"
//        }
//    }
    return result.joinToString("\r\n")
}
