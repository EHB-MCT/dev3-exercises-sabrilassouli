fun main(){
    println("you went out partying las night to celebrate your birthday.")
    println(" it was one of the best nights of your life.")
    println("you can't remember the last time you had this much fun!")
    println("you met this pretty girl at a bar and went home with her.")
    println("that is the last thing you remember before waking up ")
    println("on this rooftop in your underwear with no idea where you are.")
    challengeOne()
}

fun gameOver(){
    println("GAME OVER")
    println("you failed to escape the building")
    println("and died of exposure and starvation")
}

fun challengeOne(){
    println("riddle me this, you only had 2 pints of beer last night.")
    println("it usually takes you 5-6 pints to get tipsy.")
    println("so why cant you remember anything?")

    val correctAnswers = setOf<String>("i was drugged", "i was hit on the head", "i was knocked out")
    val userAnswer = readLine()
    if (correctAnswers.contains(userAnswer)){
        challengeTwo()
    }
    else{
        gameOver()
    }
}

fun challengeTwo(){
println("challenge two")
}