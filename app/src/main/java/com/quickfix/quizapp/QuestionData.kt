package com.quickfix.quizapp

data class QuestionData(
    var question:String,
    var id:Int,
    var option_one:String,
    var option_two:String,
    var option_three:String,
    var option_four:String,
    var correct_answer:Int
)