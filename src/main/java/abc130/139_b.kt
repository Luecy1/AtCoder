fun main(args: Array<String>) {

    val (a, b) = readLine()!!.split(" ").map(String::toInt)

    println(method139B(a, b))
}

fun method139B(a: Int, b: Int): Any? {

    val zouka = a - 1

//    return (b - 1 ) / zouka の斬り上げ計算
    return ((b - 1) + zouka - 1) / zouka

//    var unused = 1
//    var count = 0
//    while (true) {
//        if (unused > b) {
//            break
//        }
//
//        count++
//        unused += a - 1
//    }
//
//    return count
}
