package org.example.lesson2_4

fun main() {
    val ironOre = 7
    val cristallOre = 11

    val buff = 1.2

    val ironOreWithBonus = ironOre * buff
    val bonusOnlyIroneOre: Int = (ironOreWithBonus - ironOre).toInt()
    println("Буносная железная руда: $bonusOnlyIroneOre")

    val cristallOreWithBonus = cristallOre * buff
    val bonusOnlyCristalleOre: Int = (cristallOreWithBonus - cristallOre).toInt()
    println("Буносная кристаллическая руда: $bonusOnlyCristalleOre")

}