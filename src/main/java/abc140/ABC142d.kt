fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map(String::toLong)

    println(abc142d(a, b))
}

fun abc142d(a: Long, b: Long): Any? {

    val max = Math.max(a, b)
    val min = Math.min(a, b)

    // 公約数を求める
    val kouyakuList = mutableListOf<Long>()

    for (index in 1..(max / 2)) {

        if ((a % index) == 0L && b % index == 0L) {
            if (kouyakuList.isNotEmpty()) {
                var addFlg = false
                for (l in kouyakuList) {
                    addFlg = isSo(index, l)
                }

                if (addFlg) {
                    kouyakuList += index
                }
            } else {
                kouyakuList += index
            }
        }
    }

    return kouyakuList
}

fun isSo(a: Long, b: Long): Boolean {

//    for (i in (2..a).reversed()) {
//
//        if (a % i == 0L && b % i == 0L) {
//            return false
//        }
//    }
//    return true

    var t = 0L
    var ta = a
    var tb = b

    while (tb != 0L) {
        t = ta % tb
        ta = tb
        tb = t
    }

    return (ta != 1L)
}