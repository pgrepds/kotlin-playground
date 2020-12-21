package org.pgrepds.kotlin.delegation

val testVar: String by lazy {
    "Lazy Variable"
}

fun main(args: Array<String>) {
    println(testVar)
    val b = BaseImpl(10)
    BaseImpl2(b).foo() // prints 10 :: accessing the printMe() method
}

interface Base {
    fun foo()
}

class BaseImpl(val x: Int) : Base {
    override fun foo() { println(x) }
}

class BaseImpl2(b: Base) : Base by b
