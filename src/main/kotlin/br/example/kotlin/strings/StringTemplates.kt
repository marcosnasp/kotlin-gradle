package br.example.kotlin.strings

val i = 10
val st = "i = $i" // evaluates to "i = 10"

const val str = "Hello, World!"

const val strAbc = "abc"
const val str3 = "$str.length is ${s.length}" // evaluates to "abc.length is 3"

val str2w = "\$foo" // evaluates to "$foo"

fun main() {
    for (c in str) {
        println(c)
    }

    str.forEach { c -> println(c) }
    str.forEach { it -> println(it) }
}