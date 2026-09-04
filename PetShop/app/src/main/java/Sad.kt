
class Sad (date: String) : Mood(date){

    override fun moodStatus(): String {
            return "This pet is feeling sad $date"
    }
}