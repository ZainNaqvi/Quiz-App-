package com.quickfix.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        setData.getQuestion()
        var questionResult = setData.getQuestion()
        Log.e("TAG", questionResult.toString())
    }
}