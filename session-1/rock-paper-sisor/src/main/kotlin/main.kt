import java.awt.Choice

val choices = arrayOf("Rock","Paper","Scissors")

val cPick = (0..2).random()

fun main() {

        println("rock=1  Paper=2  scissors=3")

        val userPick = Integer.valueOf(readLine())

        println("The entered number is: " + choices[userPick])

        println("computer picks " + choices[cPick])


}