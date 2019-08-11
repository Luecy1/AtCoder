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

    val tmpList = mutableMapOf<String,Int>()
    for (str in sortedList) {

        var tmpCount = tmpList[str]

        if (tmpCount == null) {
            tmpList[str] = 0
        } else {
            tmpCount++
            result += tmpCount
            tmpList[str] = tmpCount
        }
    }

    return result
}

