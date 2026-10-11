package com.example.hw03.task5

// Abstract Class
abstract class SmartDevice(val name: String) {
    abstract fun turnOn()

    fun showName() {
        println(name)
    }
}

// Interfaces
interface Connectable {
    fun connect()
}

interface Rechargeable {
    fun charge()
}

// Subclass
class SmartWatch(name: String) : SmartDevice(name), Connectable, Rechargeable {
    // Private property dengan Custom Setter (range 0..100)
    private var battery: Int = 50
        set(value) {
            field = when {
                value < 0 -> 0
                value > 100 -> 100
                else -> value
            }
        }

    var ownerName: String? = null

    override fun turnOn() {
        println("$name is ON")
    }

    override fun connect() {
        println("$name connected to phone")
    }

    override fun charge() {
        battery += 20
        println("Battery: $battery%")
    }

    fun showOwner() {
        val owner = ownerName ?: "Not set"
        println("Owner: $owner")
    }
}

fun main() {
    val watch = SmartWatch("Galaxy Watch")

    watch.showName()
    watch.turnOn()
    watch.connect()

    // Memanggil charge 3 kali untuk memastikan max 100%
    watch.charge()
    watch.charge()
    watch.charge()

    watch.showOwner()
    watch.ownerName = "Rani"
    watch.showOwner()
}