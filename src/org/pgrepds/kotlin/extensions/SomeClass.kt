package org.pgrepds.kotlin.extensions

class SomeClass {

    fun printSomething() {
        println("SomeClass")
    }
}

fun main(args: Array<String>) {

    val test: SomeClass = SomeClass()
    test.printExtension()
}

// I can add methods dynamically outside SomeClass?
fun SomeClass.printExtension() {
    println("This is a class extension")
}