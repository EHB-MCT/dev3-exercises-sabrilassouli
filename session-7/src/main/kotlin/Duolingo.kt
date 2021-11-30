class Duolingo {
    @Suppress("SpellCheckingInspection")
    val words = mutableListOf<Word>(
    Word("nain de jardin", "tuinkabouter",  "français" ),
    Word("ordinateur","computer","français"),
    Word("telephone","telefoon","français"),
    Word("oreillette","koptelefoon","français"),
    Word("oignon","ui","français"),
    Word("rabbit","konijn","english"),
    Word("bullet","kogel","english"),
    Word("community","gemeenschap","english"),
    Word("wood","hout","english"),
    Word("layer","laag","english")
    )

fun play() {

    val currentWords = words.shuffled().take(5).toMutableSet()

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
