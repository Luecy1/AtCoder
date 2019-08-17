import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine().split(" ")
    val n = Integer.parseInt(input[0])
    val m = Integer.parseInt(input[1])

    val alist = mutableListOf<Int>()
    val blist = mutableListOf<Int>()

    repeat(n) {
        val input = sc.nextLine().split(" ")
        alist.add(Integer.parseInt(input[0]))
        blist.add(Integer.parseInt(input[1]))
    }

    println(problem137_d(n, m, alist, blist))
}

fun problem137_d(
    n: Int,
    m: Int,
    alist: MutableList<Int>,
    blist: MutableList<Int>
): Long {

    var result = 0L

    // 利用済みリスト
    val used = mutableSetOf<Int>()

    for (remainDay in 1..m) {
        // 候補を選ぶ
        val kouhoList = mutableListOf<Int>()

        for (i in 0 until alist.size) {
            if (alist[i] <= remainDay && !used.contains(i)) {
                kouhoList.add(i)
            }
        }

        if (kouhoList.isEmpty()) {
            continue
        }

        // 候補の中で最大を選ぶ
        var tmpMax = 0
        var tmpI = 0
        for (i in 0 until kouhoList.size) {
            if (blist[kouhoList[i]] > tmpMax) {
                tmpMax = blist[kouhoList[i]]
                tmpI = kouhoList[i]
            }
        }

        result += blist[tmpI]
        used.add(tmpI)
    }

    return result
}