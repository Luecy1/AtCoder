fun main(args: Array<String>) {

    for ((key,value) in System.getProperties()) {

        println("key -> $key value -> $value")
    }
}