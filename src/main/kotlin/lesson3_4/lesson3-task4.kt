package org.example.lesson3_4

fun main() {
    var firstFieldCharacter = 'A'
    var firstFieldNumber = 1
    var turnNumber = 0
    var secondFieldCharacter = 'A'
    var secondFieldNumber = 1

    ++turnNumber
    firstFieldCharacter = 'E'
    firstFieldNumber = 2
    secondFieldCharacter = 'E'
    secondFieldNumber = 4
    var turn: String = "$firstFieldCharacter$firstFieldNumber-$secondFieldCharacter$secondFieldNumber;$turnNumber"

    println(turn)

    ++turnNumber
    firstFieldCharacter = 'D'
    firstFieldNumber = 2
    secondFieldCharacter = 'D'
    secondFieldNumber = firstFieldNumber + 1
    turn= "$firstFieldCharacter$firstFieldNumber-$secondFieldCharacter$secondFieldNumber;$turnNumber"
    println(turn)
}