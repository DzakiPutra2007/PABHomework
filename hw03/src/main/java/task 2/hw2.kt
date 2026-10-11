package com.example.hw03.task2

open class SmartDevice(val name: String) {
    var status = "off"

    open fun turnOn() {
        status = "on"
        println("$name is ON")
    }

    open fun turnOff() {
        status = "off"
        println("$name is OFF")
    }
}

class SmartTvDevice(name: String) : SmartDevice(name) {
    // Custom setter + private set (Bonus +5 Poin)
    var speakerVolume = 5
        private set(value) {
            field = if (value in 0..100) value else field
        }

    var channelNumber = 1

    override fun turnOn() {
        super.turnOn()
        println("TV: display on")
    }

    fun increaseVolume() {
        speakerVolume += 1
        println("Volume: $speakerVolume")
    }

    fun nextChannel() {
        channelNumber += 1
        println("Channel: $channelNumber")
    }
}

fun main() {
    val tv = SmartTvDevice("Living Room TV")
    tv.turnOn()
    tv.nextChannel()
    tv.increaseVolume()
    tv.turnOff()

    // tv.speakerVolume = 10 // Baris ini tidak bisa di-compile dari luar class (Bonus requirement)
}