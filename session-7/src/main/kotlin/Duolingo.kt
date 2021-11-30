class Duolingo {
    @Suppress("SpellCheckingInspection")
    val words = mutableListOf<Word>(
    Word("nain de jardin", "tuinkabouter",  "nederlands" ),
    Word("ordinateur","computer","nederlands"),
    Word("telephone","telefoon","nederlands"),
    Word("oreillette","koptelefoon","nederlands"),
    Word("oignon","ui","nederlands"),
    Word("rabbit","konijn","nederlands"),
    Word("bullet","kogel","nederlands"),
    Word("community","gemeenschap","nederlands"),
    Word("wood","hout","nederlands"),
    Word("layer","laag","nederlands"),



    )

fun play() {

    for (i in 1..5){
    val randomWord = words.random()
    println(randomWord.original)
    val correctAnswers = randomWord.translated
    val userAnswer = readLine()
    if (correctAnswers == userAnswer){
        println("that's correct, good job")
    }
    else{

        println("too bad the correct answer was")
        print(randomWord.original)

    }
}
}
}