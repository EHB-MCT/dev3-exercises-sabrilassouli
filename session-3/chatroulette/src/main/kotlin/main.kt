fun main() {
    val chatPartners = arrayOf(Student("Sabri"), Teacher("Hajar"), Comedian("Nadia"),Chatbot())

    val chatMatch = chatPartners.random()
    chatMatch.introduce()
    chatMatch.talk()



}