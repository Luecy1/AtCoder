fun main(args: Array<String>) {

    val s = readLine()!!

    println(abc049c(s))
}

fun abc049c(s: String): Any? {

    val parts = arrayOf("dream", "dreamer", "erase", "eraser")

    var tmps = s

    loop@ while (true) {

        for (e in parts) {
            if (tmps.endsWith(e)) {
                tmps = tmps.removeSuffix(e)
                continue@loop
            }
        }

        return if (tmps.isBlank()) {
            "YES"
        } else {
            "NO"
        }
    }
}
