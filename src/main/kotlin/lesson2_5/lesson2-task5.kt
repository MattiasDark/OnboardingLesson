package org.example.lesson2_5

fun main() {
    val secondsInSpace = 6480
    var hourInSpace = 0
    var minutesInSpace = 0
    var secondsInSpaceEnd = 0

    hourInSpace = secondsInSpace / 3600
    minutesInSpace = (secondsInSpace % 3600) / 60
    secondsInSpaceEnd = secondsInSpace % 60

    println(hourInSpace)
    println(minutesInSpace)
    println(secondsInSpaceEnd)


    println("Время в космосе: ${"%02d".format(hourInSpace)}:${"%02d".format(minutesInSpace)}:${"%02d".format(secondsInSpaceEnd)}")

}