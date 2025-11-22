package org.example.lesson4_2

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {

    val firstWeight = 20
    val firstVolume = 80

    val secondWeight = 50
    val secondVolume = 100


    println("Гру весом $firstWeight кг и объёмом $firstVolume л соответствует категории 'Average':${firstWeight > MIN_WEIGHT && firstVolume<=MAX_WEIGHT && firstVolume<MAX_VOLUME}")
    println("Гру весом $secondWeight кг и объёмом $secondVolume л соответствует категории 'Average':${secondWeight > MIN_WEIGHT && secondVolume<=MAX_WEIGHT && secondVolume<MAX_VOLUME}")


}