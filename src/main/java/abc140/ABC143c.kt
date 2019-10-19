fun main(args: Array<String>) {
    abc143c()
}

fun abc143c() {
    var result = 0

    val n = readLine()!!
    val s = readLine()!!

    var lastChar: Char? = null
    for (c in s) {

        if (lastChar == null) {
            lastChar = c
            result++
            continue
        }

        if (lastChar == c) {
            continue
        }

        lastChar = c
        result++
    }


    println(result)
}
