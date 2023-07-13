package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "total_answers"

    //we need the constant values to move data from one activity to another





    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?", R.drawable.german,
            "Russia", "England", "Germany", "Netherlands", 3
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )
        questionsList.add(que3)


        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )
        questionsList.add(que4)
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )



        questionsList.add(que5)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionsList.add(que7)

        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsList.add(que8)

        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)
        return questionsList


    }

}