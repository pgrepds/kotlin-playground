package org.pgrepds.kotlin.dataclasses

// simple container class. everything is generated. nice feature
data class DataClassTest(val a:Int, val b:Int)

fun main(args: Array<String>) {
    val data: DataClassTest = DataClassTest(24, 24)
    val data2: DataClassTest = DataClassTest(24, 24)
    println(data.a)
    println(data.b)
    // same as calling equals method?
    println(data == data2)

    val data3: DataClassTest = DataClassTest(23, 25)
    // so hashcode and equals are automatically overriden and they are using all fields.
    println(data == data3)

    val a: DataClassWithCustomEqualsAndHashCode = DataClassWithCustomEqualsAndHashCode(42, "Hello")
    val b: DataClassWithCustomEqualsAndHashCode = DataClassWithCustomEqualsAndHashCode(43, "Hello")
    // returns false
    println(a == b)
}

data class DataClassWithCustomEqualsAndHashCode(val id: Int, val a: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DataClassWithCustomEqualsAndHashCode) return false
        // implicit typecasting
        return id == other.id
    }

    override fun hashCode(): Int {
        return this.id.hashCode()
    }
}