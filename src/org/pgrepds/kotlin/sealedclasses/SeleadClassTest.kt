package org.pgrepds.kotlin.sealedclasses

// this is like an extension of enums
sealed class TestDataType(test:String) {

    var a: Int = 10;
    var b: Int = 30;

    class Case1 : TestDataType("Case1 Type")
    class Case2 : TestDataType("Case2 Type")
}

fun main(args: Array<String>) {

    // this is not working in sealed classes
    //val a: TestDataType = TestDataType("hello")

    // sealed classes are restricted

    val a: TestDataType = TestDataType.Case1()
    val b: TestDataType = TestDataType.Case2()

    val c: TestDataType = TestDataTypeExtension("hello")

}

class TestDataTypeExtension(test:String) : TestDataType(test) {

}