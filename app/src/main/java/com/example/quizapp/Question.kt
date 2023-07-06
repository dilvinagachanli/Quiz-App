package com.example.quizapp

data class Question(
    val id: Int, //which question are we at?
val question : String, //what data type should be the question?
val image : Int, //a location inside the files
val optionOne : String,
    val optionTwo : String,
    val optionThree : String,
    val optionFour : String,
    val correctAnswer: Int //checking the index


    )
