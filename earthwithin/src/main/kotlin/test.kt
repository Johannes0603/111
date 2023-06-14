fun main(){

    var inhaltLexicon: MutableMap<Int, Any> = mutableMapOf(
        1 to lexiconPflanzen("apfel","pektin"),
        2 to lexiconPflanzen("birne", "stuff")
    )
    println(inhaltLexicon)
    println("wähle Zahl")
    val auswahlNum = readLine()?.toInt()
    val auswahlPflanze = inhaltLexicon[auswahlNum]
    if (auswahlPflanze != null){
        println(" $auswahlPflanze")
    }else{
        println("nicht vorhanden, wähle eine Zahl")
    }
}
/*fun listLexicon2(menu: String){

    val num2 = lexiconPflanzen("Apfel", "Pektin")
    val num3 = lexiconPflanzen("Birne","")
    val num4 = lexiconPflanzen("Birke","")
    val num5 = lexiconPflanzen("Brombeere","")
    val num6 = lexiconPflanzen("Chilli","")
    println("""
        Lexicon:
        [1]zurück
        [2]${num2}
        [3]${num3}
        [4]${num4}
        [5]${num5}
        [6]${num6}
        
        """.trimIndent())

    var input: String = readln()
    when(input){
        "1" -> return hauptMenu(menu)
        "2" -> println(num2.toString())
        "3" -> println("")
        "4" -> println("")
        "5" -> println("")
        "6" -> println("")
        else ->{ println("Eingabe ungültig, wähle eine Zahl und bestätige mit Eingabe")
            hauptMenu(menu)
        }
    }
}*/

/*
fun hauptMenuTest(menu: String){
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
        "1" -> { println("phytotherapie")
            menuPhytotherapie("")
        }//weiterleitung menü phytotherapie
        "2" -> { println("lexicon")
            listLexicon("") }
        "3" -> println("scan/kamera")
        "4" -> println("shop")
        "5" -> println("kochen")
        "6" -> println("beenden")
        else ->{ println("Eingabe ungültig, wähle eine Zahl und bestätige mit Eingabe")
            hauptMenuTest(menu) }
    }
}

val lexicon: MutableMap<String, String> = mutableMapOf(
    "Apfel" to "Ein Obst mit süßem Geschmack.",
    "Banane" to "Eine gelbe Frucht mit weicher Textur.",
    "Orange" to "Eine Zitrusfrucht mit saftigem Fruchtfleisch."
)
fun menuLexikon() {
    println("Lexikon Menü:")
    println("Folgende Begriffe sind im Lexikon verfügbar:")
    for ((index, term) in lexicon.keys.withIndex()) {
        println("[$index] $term")
    }
    println("[Zahl] Zurück zum Hauptmenü")

    var input: String? = readLine()

    if (input?.toIntOrNull() != null) {
        val index = input.toInt()
        if (index in 0 until lexicon.size) {
            val term = lexicon.keys.elementAt(index)
            val definition = lexicon[term]
            println("Begriff: $term")
            println("Definition: $definition")
        } else {
            println("Ungültige Eingabe. Bitte wählen Sie eine Zahl und bestätigen Sie mit Enter.")
            menuLexikon()
        }
    } else {
        hauptMenuTest("menu")
    }}*/