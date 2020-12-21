package org.pgrepds.kotlin

import org.pgrepds.kotlin.different.addDifferent
import org.pgrepds.kotlin.extensions.SomeClass

// a kotlin file is automatically converted to a kotlin class if it contains only a single class
// a kotlin class containing more than one class will automatically be converted to a kotlin file

// there is actually no real difference
// The only difference is that creating a file creates a file with no classes, and creating a class creates a file with one class.
// You can then add more classes to the file, or delete classes, or make any other changes -
// the end result doesn't depend on how the file was created.



fun main(args: Array<String>) {

    // cool, we can call top level functions within the same package
    val result: Int = add(2, 3)
    val result2: Int = addDifferent(2, 2)
    println(result)
    println(result2)

    when(result) {
        1 -> print("result is 1")
        5 -> print("result is 5")

        else -> {
            print("else case")
        }
    }

    val test:List<String> = arrayListOf("hallo", "test");

    // this is cool
    for ((index, value) in test.withIndex()) {
        // wow
        println("the element at $index is $value")
    }

    val classTest: TestOpenClass = TestOpenClass("Name");
    println(classTest.name)

    println(TestOpenClass.createTestOpenClass("Test Factory").name)

    // lets see it this is working
    val testSomeClass: SomeClass = SomeClass()
    testSomeClass.thisWouldBeCrazy()
}

fun SomeClass.thisWouldBeCrazy() {
    println("Kotlin is madness")
}