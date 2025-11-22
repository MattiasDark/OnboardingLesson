package org.example.lesson2_5

import kotlin.math.pow

fun main() {
    val firstMoney = 70000
    val truePercent = 16.7
    val percent = truePercent/100
    val years = 20

    val compoundInterest: Double = firstMoney * ((1 + percent).pow(years))

    println(String.format("%.3f", compoundInterest).replace(',', '.'))
}