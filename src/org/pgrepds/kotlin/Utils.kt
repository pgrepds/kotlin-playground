// make it callable for Java users
// this must be declared before the package declaration.
@file:JvmName("Utils")
package org.pgrepds.kotlin

// unlike Java, there are no static functions in kotlin
// furthermore, we do not need to wrap top-level classes in functions anyway

fun add(a: Int, b: Int): Int {
    return a + b;
}