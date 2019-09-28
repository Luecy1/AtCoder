import java.util.*

fun main(args: Array<String>) {

    val n = readLine()!!
    val s = readLine()!!

    println(arc098c(s))
}

fun arc098c(s: String): Any? {

    val v = IntArray(s.length)
    val e = IntArray(s.length)


    for (i in s.indices){

        if(i >= 1) v[i] += v[i-1]
        if(s[i] == 'W') v[i] += 1

        val a = s.length - i

        if(a >= 1) e[a] += e[a+1]
        if(s[a] == 'E') e[a] += 1
    }

    return  e.toList()
}

