import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLine()
    val b = sc.nextLine().split(" ").map { it.toLong() }
    println(problem136_c(a, b))
}

fun problem136_c(a: String, b: List<Long>): String {

    if (b.size < 3) {
        return "Yes"
    }

    var zoukaFlg: Boolean? = null
    var last: Long? = null

    for (i in b) {

        // 最初のみ
        if (last == null) {
            last = i
            continue
        } else {

            // 同一の場合問題なし
            if (last == i) {
                continue
            } else if (last == i - 1L) {
                continue
            }

            // 増加か減少か判定
            if (zoukaFlg == null) {
                zoukaFlg = last < i
                last = i
                continue
            }

            if (zoukaFlg) {
                if (last < i) {
                    continue
                } else {
                    // 増加のときに低くしても意味ないのでキャンセル
                    return "No"
                }
            } else {//減少
                if (last > i) {
                    last = i
                    continue
                } else if (last > i - 1L) {
                    last = i - 1L
                    continue
                } else {
                    return "No"
                }
            }

        }
    }

    return "Yes"
}

