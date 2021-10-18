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
    println("you see a door leading into the building")
    println("you don't know what is down there but it")
    println("is better than freezing to death on a rooftop.")
    println("you see a keypad on the door but it is weird")
    println("instead of a normal keypad is a weird sort of")
    println("coin flip like keypad.")
    println("you have to pick either low(1-3) or high(4-6)")
    println(" to open the door, you only get 3 tries")

    val userAnswer = readLine()?.toInt()
    val keypadPick = (1..6).random()
    // TODO: check == problems for strings

    if (keypadPick>4){

        if (userAnswer!! >4)
            {
                challengeThree()
        }

        else {
            gameOver()
        }
    }
    else{
        if (userAnswer!! >4)
        {
            gameOver()
        }

        else {

            challengeThree()
        }

    }


}

fun challengeThree(){
    println("You open the door end go down into the building")
    println("you enter a hallway and hear someone talking")
    println("you slowly sneak closer and see the woman talking on the phone")
    println("'Yeah, i've got another one...yeah...yeah bloodtype Oneg ")
    println("'yeah he's freezing to death on the roof, just have your guy")
    println("at the morgue flag him, i have some contact on the")
    println("black market, organ prices have risen recently")
    println("we'll make a good million at least if all goes right'")
    println(" ")
    println(" ")
    println("you realise you're going to have to fight your way out of this")
    println("you go back in the hallway and open a supply closet")
    println("you look for something to use as a weapon")
    println("you see a broom, a crowbar and a toilet brush")
    println("what do you pick?")


    val answerOne = setOf<String>("broom")
    val answerTwo = setOf<String>("crowbar")
    val answerThree = setOf<String>("brush","toilet","toilet brush")
    val userAnswer = readLine()
    if (answerOne.contains(userAnswer)){
        println("you attack her with a broom")
        println("you fail to knock her out and she screams for help")
        println("you run away and hide in the supply closet as you")
        println("hear a man come and help her, they look for you")
        println("luckily don't find you find you ")
        challengeTwo()
    }
    else if(answerTwo.contains(userAnswer)){
        println("you sneak in behind her and hit her on the head")
        println("with the crowbar, you hear a crunch as you crack her skull.")
        challengeFour()
    }
    else if(answerThree.contains(userAnswer)){

        println("you seriously tried to kill someone with a toilet brush *_*")
        println("what is wrong with you...")
        gameOver()
    }


}

fun challengeFour(){
    println("challenge four")
}