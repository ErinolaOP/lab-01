class Happy (date : String) : Mood( date)
{
    override fun moodStatus(): String {
        return "Happy on $date"
    }


}