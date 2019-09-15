fun main(args: Array<String>) {

    val a = readLine()!!

    println(abc141a(a))
}

fun abc141a(a: String): Any? {

     return when (a) {

         "Sunny" -> "Cloudy"
         "Cloudy" -> "Rainy"
         "Rainy" -> "Sunny"

         else -> ""
     }

}
