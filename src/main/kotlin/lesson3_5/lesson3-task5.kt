package org.example.lesson3_5
import java.util.Scanner

fun main() {
    val data = "D2-D4;0"
    val scan = Scanner(data).useDelimiter("-|;")

    val part1 = scan.next()
    val part2 = scan.next()
    val part3 = scan.next()

    println("$part1, $part2, $part3")
}