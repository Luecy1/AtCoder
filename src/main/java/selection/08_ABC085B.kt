fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    val dList = mutableListOf<Int>()
    repeat(n) {
        dList.add(readLine()!!.toInt())
    }

    println(abc085b(n, dList))
}

fun abc085b(n: Int, dList: MutableList<Int>): Any? {
    return dList.asSequence().sorted().distinct().count()
}

