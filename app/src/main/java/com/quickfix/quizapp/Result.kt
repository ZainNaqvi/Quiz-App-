package com.quickfix.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    var getName:String?= null
    var getScore:String?= null
    var getTotalQuestions:String?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        getName = intent.getStringExtra(setData.name)
        getScore = intent.getStringExtra(setData.score)
        getTotalQuestions = intent.getStringExtra("total_questions")

        name.text= "Congratulations: ${getName} !!"
        score.text= "${getScore}/${getTotalQuestions}"
        button.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}