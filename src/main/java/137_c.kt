import java.util.*
import java.io.PrintWriter

val pw = PrintWriter(System.out)

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = Integer.parseInt(readLine())

    val inputStringList = arrayListOf<String>()
    repeat(a) {
        inputStringList.add(readLine()!!)
    }

    pw.println(problem137_c(a, inputStringList))
    pw.flush()
}

fun problem137_c(a: Int, inputStringList: ArrayList<String>): Long {

    val sortedList = inputStringList.map {
        it.toCharArray().sortedArray().joinToString("")
    }.sortedBy { it }

    var result: Long = 0L
    for (i in 0 until (a - 1)) {
        val my = sortedList[i]

        for (j in (i + 1) until a) {
            val that = sortedList[j]

            if (my == that) {
                result++
            } else {
                break
            }
        }
    }

    return result
}

