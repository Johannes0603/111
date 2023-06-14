/*fun hauptmenue(){
    var auswahl: Int? = null //Platzhalter null muss explizit makiert sein
    while (auswahl != 6){
        println("hauptmenue:")
        println("1. phytotherapie")
        println("2. lexikon")
        println("3. scan/kamera")
        println("4. zu verkaufen")
        println("5. kochen")
        println("6. beenden")
        println("wähle von 1 bis 5 (mit enter bestätigen):")
        auswahl = readlnOrNull()
    }
    when (auswahl){
        1 -> {
            println("phytotherapie")
        }
        2 -> {
            println("lexikon")
        }else -> println("ungültig")
    }
}*/
/*import kotlin.String

fun hauptmenü() {
    val menuPunkte = mutableListOf<String>(
        "1.phytotherapie" ,
        "2.lexicon",
        "3.scan/kamera",
        "4.zu verkaufen",
        "5.kochen",
        "6.beenden"
    )
    println("Hy, wähle von 1 bis 6 und bestätige mit enter")
    menuPunkte.forEach { println(it) }
    var auswahl = readln()
    var indexOfInput = menuPunkte.indexOfFirst { it.startsWith("$auswahl") }

    if (indexOfInput in 0..5) {
        val num = menuPunkte[indexOfInput]
        println(num)
    } else {
        println("ungültig, bitte wähle erneut")
        hauptmenü ()
    }
}*/

fun hauptMenu(menu: String){
    println("""
        Willkommen, folgende Themen stehen zur Auswahl:
        [1]phytotherapie
        [2]lexicon
        [3]scan/kamera
        [4]shop
        [5]kochen
        [6]beenden
        """.trimIndent())

    var input: String = readln()
    when(input){
        "1" -> { println("Menu Phytotherapie")
            menuPhytotherapie("")
        }//weiterleitung menü phytotherapie
        "2" -> { println("")
            lexiconPflanzenList("") }
        "3" -> println("scan/kamera")
        "4" -> println("shop")
        "5" -> println("kochen")
        "6" -> println("beenden")
        else ->{ println("Eingabe ungültig, wähle eine Zahl und bestätige mit Eingabe")
            hauptMenu(menu) }
    }
}

fun menuPhytotherapie(menu: String){
    println("""
        [1]overview plants
        [2]liquids
        [3]ointment/cream
        [4]dried drugs
        [5]saved favorites
        [6]return hauptMenu
        """.trimIndent())//zum linksbündig setzen des textes

    var input: String = readln()
    when(input){
        "1" -> { println("all plants") }
        "2" -> println("liquids alc")
        "3" -> println("ointment/cream")
        "4" -> println("dried drugs")
        "5" -> println("saved favorites")
        "6" -> return hauptMenu(menu)
        else ->{ println("Eingabe ungültig, wähle eine Zahl und bestätige mit Eingabe")
            hauptMenu(menu)
        }
    }
}

/*fun Lexicon(menu: String){

    val num2 = lexiconPflanzen("Apfel", "Pektin")
    val num3 = lexiconPflanzen("Birne","")
    val num4 = lexiconPflanzen("Birke","")
    val num5 = lexiconPflanzen("Brombeere","")
    val num6 = lexiconPflanzen("Chilli","")
    println("""
        Lexicon:
        [1]zurück
        [2]Apfel
        [3]Birne
        [4]Birke
        [5]Brombeere
        [6]Chilli
        
        """.trimIndent())

    var input: String = readln()
    when(input){
        "1" -> return hauptMenu(menu)
        "2" -> println(num2)
        "3" -> println(num3)
        "4" -> println(num4)
        "5" -> println(num5)
        "6" -> println(num6)
        else ->{ println("Eingabe ungültig, wähle eine Zahl und bestätige mit Eingabe")
            hauptMenu(menu)
        }
    }
}*/

fun lexiconPflanzenList(menu: String): List <lexiconPflanzen> {
    val pflanzen = mutableListOf<lexiconPflanzen>(
        lexiconPflanzen("Apfel", "Pektin"),
        lexiconPflanzen("Birne", ""),
        lexiconPflanzen("Birke", "")
    )
    println(
        """
            Lexicon
            [1]zurück
            [2]Apfel
            [3]Birne
            [4]Birke
            """.trimIndent()
    )
    var input: String = readln()
    when(input){
        "1" -> return pflanzen
        in "2".."4" ->{
            val index = input.toInt()
            val lexiconPflanzen = pflanzen.getOrNull(index - 2)
            if (lexiconPflanzen != null){
                println("Name: ${lexiconPflanzen.name}")
                println("Wichtige Inhaltstoffe: ${lexiconPflanzen.wichtigeInhaltsstoffe}")
            } else {
                println("Ungültige Auswahl.")
            }
        }
    }
    return lexiconPflanzenList(menu)
}