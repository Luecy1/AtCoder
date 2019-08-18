import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val tmpNQ = sc.nextLine().split(" ").map { it.toInt() }
    val n = tmpNQ[0]
    val q = tmpNQ[1]

    // 入力木の読み取り
    val abList = mutableListOf<Pair<Int, Int>>()
    repeat(n - 1) {
        val tmpAB = sc.nextLine().split(" ").map { it.toInt() }
        abList.add(Pair(tmpAB[1], tmpAB[0]))
    }

    // カウンター操作の読み取り
    val pxList = mutableListOf<Pair<Int, Int>>()
    repeat(q) {
        val tmpPQ = sc.nextLine().split(" ").map { it.toInt() }
        pxList.add(Pair(tmpPQ[0], tmpPQ[1]))
    }

    println(problem138_d(n, abList, pxList))
}

fun problem138_d(
    n: Int,
    abList: MutableList<Pair<Int, Int>>,
    pxList: MutableList<Pair<Int, Int>>
): String {

//    val tmpMap = mutableMapOf<Int, MutableList<Int>>()
//    // 根
//    tmpMap[1] = mutableListOf()
//    for ((number, parent) in abList) {
//        tmpMap[number] = mutableListOf()
//        tmpMap[parent]!!.add(number)
//    }

    // 親を求めるMap
    val parentMap = abList.toMap()

    val result = mutableListOf<Int>()

    // 親からのカウントになるようにソート
    val sortPxList = pxList.sortedBy {
        it.first
    }

//    var tmpNumber = sortPxList.first().first
//    var tmpCount = 0
//    for ((number, count) in sortPxList) {
//
//        if (tmpNumber != number) {
//            result.add(tmpCount)
//
//            // 親を引き継ぐ
//            tmpCount = result[parentMap[number]!! - 1]
//        }
//
//        tmpCount += count
//    }
//    result.add(tmpCount)

    return result.joinToString(" ")
}