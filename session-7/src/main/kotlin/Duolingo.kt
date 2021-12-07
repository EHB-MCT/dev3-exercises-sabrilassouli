class Duolingo(var numberOfRounds:String = "5", val language:String = "english") {
    @Suppress("SpellCheckingInspection")
    var words = mutableListOf<Word>(
    FrenchWords("nain de jardin", "tuinkabouter"),
    FrenchWords("ordinateur","computer"),
    FrenchWords("telephone","telefoon"),
    FrenchWords("oreillette","koptelefoon"),
    FrenchWords("oignon","ui"),
    EnglishWords("rabbit","konijn"),
    EnglishWords("bullet","kogel"),
    EnglishWords("community","gemeenschap"),
    EnglishWords("wood","hout"),
    EnglishWords("layer","laag")
    )
init {
    words = words.filter { it.language == language }.toMutableList()
}
fun play() {

    println("welcome to duolingo!")
    println("how many rounds would you like to play")
    numberOfRounds = readLine().toString()
    val currentWords = words.shuffled().take(numberOfRounds.toInt()).toMutableSet()
    while (currentWords.count() > 0){
    //while (currentWords.isNotEmpty()){ works too
        println(currentWords.count())

        val selectedWord = currentWords.random()
        println("whats the translation of ${selectedWord.original}")
        val userAnswer = readLine()
        if (selectedWord.translated == userAnswer){
            println("that's correct, good job")
            currentWords.remove(selectedWord)
        }
        else{

            print("too bad the correct answer was")
            println(selectedWord.translated)

        }
    }
}
}
