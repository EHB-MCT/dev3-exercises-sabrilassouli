class Teacher (override val name: String): Person(name), ChatPartner{
    override fun talk(){
        funFact()
    }
    fun funFact(){
        println("did you know kotlin was named after an island")
    }
}