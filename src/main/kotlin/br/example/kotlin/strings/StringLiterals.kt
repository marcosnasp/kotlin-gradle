package br.example.kotlin.strings

const val s = "Hello, world!\n"

const val text = """
for (c in "foo")
print(c)
"""

// Default margin prefix is pipe character | ,
// this can be set as a parameter to trimMargin; e.g. trimMargin(">") .
val text2 = """
|Tell me and I forget.
|Teach me and I remember.
|Involve me and I learn.
|(Benjamin Franklin)
""".trimMargin()


fun main() {
    println(s)
    println(text)
    println(text2)
}