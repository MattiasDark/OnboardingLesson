package org.example.lesson4_4

fun main() {
    val trainingDay = 5

    val Arms = trainingDay % 2 == 1
    val Legs = !Arms
    val Back = !Arms
    val Abs = Arms

    println("""
        Упражнения для рук:    $Arms
        Упражнения для ног:    $Legs
        Упражнения для спины:  $Back
        Упражнения для пресса: $Abs
    """.trimIndent())
}