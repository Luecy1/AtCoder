fun main(args: Array<String>) {

    val (n, a, b) = readLine()!!.split(" ").map(String::toInt)

    println(fun133a(n, a, b))
}

fun fun133a(n: Int, a: Int, b: Int): Any? {

    val aCost = n * a

    return if (aCost > b) {
        b
    } else {
        aCost
    }
}
