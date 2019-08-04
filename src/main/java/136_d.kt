import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLine()
    println(problem136_d(a))
}

fun problem136_d(a: String): String {

    val result = IntArray(a.length)
    Arrays.fill(result, 0)

    val loopFlgList = mutableListOf<Boolean>()

    for (i in 0 until a.length) {

        // out of rangeよけ
        if (i == 0) {
            if (a[1] == 'L') {
                loopFlgList.add(true)
            } else {
                loopFlgList.add(false)
            }
        } else if (i == (a.length - 1)) {
            if (a[a.length - 2] == 'R') {
                loopFlgList.add(true)
            } else {
                loopFlgList.add(false)
            }

        } else {
            // 左右どちらかがRLと隣り合うと違う場合はtrue
            if ((a[i - 1] == 'R' && a[i] == 'L') ||
                a[i] == 'R' && a[i + 1] == 'L'
            ) {
                loopFlgList.add(true)
            } else {
                loopFlgList.add(false)
            }
        }
    }

    for (i in 0 until a.length) {
        var moveCount = 0
        var nowI = i

        // 今いる位置がループ箇所出ない場合、ループ箇所まで移動
        if (!loopFlgList[i]) {
            val leftFlg = a[nowI] == 'R'

            while (true) {
                if (leftFlg) {
                    nowI++  // 右移動
                    moveCount++
                } else {
                    nowI--  // 左移動
                    moveCount++
                }

                // ループ箇所だとブレイク
                if (loopFlgList[nowI]) {
                    break
                }
            }
        }

        // moveCountが偶数の場合今いる箇所にとどまる
        if (moveCount % 2 == 0) {
            result[nowI]++
        } else {
            if (a[nowI] == 'R') {
                result[nowI + 1]++ // 一つ右をいんくり
            } else {
                result[nowI - 1]++ // 一つ左をいんくり
            }

        }
    }

    return result.joinToString(" ")
}

