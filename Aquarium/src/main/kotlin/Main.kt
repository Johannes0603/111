import kotlin.concurrent.timer

data class Fish(val name: String, val isMale: Boolean, var isHungry: Boolean, var children: Int)

class Aquarium {
    private val sprotten = mutableListOf<Fish>()
    private val piranhas = mutableListOf<Fish>()

    init {
        //5 weibliche und 5 männliche Sprotten hinzu
        for (i in 1..5) {
            sprotten.add(Fish("Weibliche Sprotte $i", false, true, 0))
            sprotten.add(Fish("Männliche Sprotte $i", true, true, 0))
        }

        //5 Piranhas hinzu
        for (i in 1..5) {
            piranhas.add(Fish("Piranha $i", true, true, 0))
        }
    }

    fun start() {
        // Füttere die Fische alle 30 Minuten
        var timer = timer(period = 30 * 60 * 1000) {
            feedFish()
        }
//thred.sleep + while schleife
        //const val SLEEP_TIME: Long = 2000 (angabe in Millisekunden)
        // Die Piranhas fressen alle 60 Minuten eine Sprotte
        timer(period = 60 * 60 * 1000) {
            feedPiranhas()
        }
    }

    private fun feedFish() {
        for (sprotte in sprotten) {
            if (sprotte.isHungry) {
                println("${sprotte.name} wird gefüttert.")
                sprotte.isHungry = false
                sprotte.children += 5
            }
        }
    }

    private fun feedPiranhas() {
        if (sprotten.isNotEmpty()) {
            val sprotteToBeEaten = sprotten.removeAt(0)
            println("${piranhas[0].name} frisst ${sprotteToBeEaten.name}.")
        }
    }
}

fun main() {
    val aquarium = Aquarium()
    aquarium.start()
}