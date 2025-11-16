package org.example.lesson2_5
const val seconds_in_hour = 3600
const val seconds_in_minute = 60
fun main() {
    val secondsInSpace = 6480
    var hourInSpace = 0
    var minutesInSpace = 0
    var secondsInSpaceEnd = 0

    hourInSpace = secondsInSpace / seconds_in_hour
    minutesInSpace = (secondsInSpace % seconds_in_hour) / seconds_in_minute
    secondsInSpaceEnd = secondsInSpace % seconds_in_minute

    println("Время в космосе: %02d:%02d:%02d".format(hourInSpace, minutesInSpace, secondsInSpaceEnd))
}