package br.example.kotlin.strings

val str1 = "Hello, World!"
val str2 = "Hello," + " World!"

val string1 = """
|Hello, World!
""".trimMargin()

val string2 = """
#Hello, World!
""".trimMargin("#")

val string3 = str1

fun main(args: Array<String>) {
    println(string1 == string2) // Prints true

    println(str1 == str2) // Prints true
    println(string1 === string2) // Prints false
    println(str1 === string3) // Prints true
}
