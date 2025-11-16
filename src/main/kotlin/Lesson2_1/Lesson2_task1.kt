package org.example.Lesson2_1

fun main() {

    val firstStudent = 3
    val secondStudent = 4
    val thirdStudent = 3
    val FourthStudent = 5
    val totalStudens = 4

    val averageScore= ((firstStudent + secondStudent + thirdStudent + firstStudent)/totalStudens).toDouble()

    println("%.2f".format(averageScore))

}