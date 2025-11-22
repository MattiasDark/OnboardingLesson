package org.example.lesson3_5
import java.util.Scanner

fun main() {
    val data = "D2-D4;0"
    val scan = data.split(";","-")

    val from = scan[0]
    val to = scan[1]
    val moveNumber = scan[2].toInt()
    println(from)
    println(to)
    println(moveNumber)
}