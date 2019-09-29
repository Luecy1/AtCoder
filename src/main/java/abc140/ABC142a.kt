fun main(args: Array<String>) {

    val a = readLine()!!.toInt()

    println(abc142a(a))
}

fun abc142a(a: Int): Any? {


    val kisuu = (1..a).toList().filter { it % 2 == 1 }.count().toDouble()



    return (kisuu / a)
}
