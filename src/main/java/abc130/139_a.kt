fun main(args: Array<String>) {

    val s = readLine()!!
    val t = readLine()!!

    println(method139A(s,t))
}

fun method139A(s: String, t: String): Any? {

    var count = 0
    for (index in 0 until 3) {

        if (s[index] == t[index]) {
            count++
        }
    }

    return count
}
