package org.example.lesson4_3

const val WEATHER_IS_SUNNY = true
const val TENT_ARE_OPENED = true
const val AIR_HUMIDITY = 20

fun main() {
    val weatherAreSunnyToday = true
    val tentAreOpenedToday = true
    val airHumidity = 20
    val seasons = "зима"
    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            weatherAreSunnyToday == WEATHER_IS_SUNNY && tentAreOpenedToday == TENT_ARE_OPENED &&
                    airHumidity == AIR_HUMIDITY && seasons != "зима"
        }"
    )

}