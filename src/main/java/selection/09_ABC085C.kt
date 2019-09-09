fun main(args: Array<String>) {

    val (n, y) = readLine()!!.split(" ").map(String::toInt)

    println(abc085c(n, y))
}

fun abc085c(n: Int, y: Int): Any? {

    for (man in 0..n) {
        for (gosen in 0..n) {

            val sen = n - (man + gosen)

            if (sen < 0) {
                break
            }
            if (man * 10000 + gosen * 5000 + sen * 1000 == y) {
               return "$man $gosen $sen"
            }
        }
    }

    return "-1 -1 -1"
}

