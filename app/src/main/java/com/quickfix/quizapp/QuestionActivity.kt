package com.quickfix.quizapp

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_question.*
import kotlinx.android.synthetic.main.activity_question.view.*
import java.lang.reflect.Type


class QuestionActivity : AppCompatActivity() {
    private var questionList:ArrayList<QuestionData>?=null
    private var currentQuestionIndex:Int = 1
    private var selectedIndex:Int = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        setOptionStyle()
        questionList = setData.getQuestion()
        setQuestions()

        opt1.setOnClickListener{
            selectedOption(opt1,1)
        }
        opt2.setOnClickListener{
            selectedOption(opt2,2)
        }
        opt3.setOnClickListener{
            selectedOption(opt3,3)
        }
        opt4.setOnClickListener{
            selectedOption(opt4,4)
        }
        submit.setOnClickListener {
        setOptionStyle()
            if(selectedIndex!=0)
            {
                val question=questionList!![currentQuestionIndex-1]
                if(selectedIndex!=question.correct_answer)
                {
                    setColor(selectedIndex,R.drawable.wrong_option_border)
                }
                setColor(question.correct_answer,R.drawable.correct_option_border)
                if(currentQuestionIndex==questionList!!.size)
                    submit.text="FINISH"
                else
                    submit.text="Go to Next"
            }else{   selectedIndex=0
                currentQuestionIndex++
                when{
                    currentQuestionIndex<=questionList!!.size->{
                        setQuestions()
                    }
                    else->{
                        Toast.makeText(this, "Hello world", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            selectedIndex=0
        }
    }

    private fun setColor (opt: Int, color: Int){
    when (opt) {
      1->{
            opt1.background= ContextCompat.getDrawable(this,color)
        }
        2->{
            opt2.background= ContextCompat.getDrawable(this,color)
        }
        3->{
            opt3.background= ContextCompat.getDrawable(this,color)
        }
        4->{
            opt4.background= ContextCompat.getDrawable(this,color)
        }
    }
}
  private fun setQuestions(){
      var que = questionList!![currentQuestionIndex-1]
      question_text.text = que.question
      progress_bar.progress=    currentQuestionIndex
      progress_text.text  = "${currentQuestionIndex}/${questionList!!.size}"
      opt1.text = que.option_one
      opt2.text = que.option_two
      opt3.text = que.option_three
      opt4.text = que.option_four
    }
    private fun setOptionStyle(){
      var optionList:ArrayList<TextView> = arrayListOf()
        optionList.add(0,opt1)
        optionList.add(1,opt2)
        optionList.add(2,opt3)
        optionList.add(3,opt4)
        for (opt in optionList){
            opt.setTextColor(Color.parseColor("#808080"))
            opt.background=ContextCompat.getDrawable(this,R.drawable.options_border)
            opt.typeface = Typeface.DEFAULT
        }
    }

    private fun selectedOption(view:TextView, opt:Int){
        setOptionStyle()
        selectedIndex = opt
        view.setTextColor(Color.parseColor("#000000"))
        view.background= ContextCompat.getDrawable(this,R.drawable.selected_option_border)
        view.typeface = Typeface.DEFAULT_BOLD
    }
}