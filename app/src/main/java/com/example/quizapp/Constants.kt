package com.example.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?", R.drawable.german,
            "Russia", "England", "Germany", "Netherlands", 3
        )

        val que2 = Question(
            2, "What country does this flag belong to?", R.drawable.argentina,
            "Armenia", "Lithuanian", "Australia", "Argentina", 4
        )

        questionsList.add(que2)
        questionsList.add(que1)
        return questionsList


    }

}