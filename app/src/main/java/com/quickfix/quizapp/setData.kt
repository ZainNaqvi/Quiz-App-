import com.quickfix.quizapp.QuestionData

object setData {
  fun getQuestion(): ArrayList<QuestionData> {

    val questionsList: ArrayList<QuestionData> = arrayListOf()

    // Question 1
    val question1 = QuestionData(
      "What is the capital city of Pakistan?",
      1,
      "Karachi",
      "Taxila",
      "Islamabad",
      "Peshawar",
      3
    )
    questionsList.add(question1)

    // Question 2
    val question2 = QuestionData(
      "Which river flows through the city of Lahore?",
      2,
      "Chenab",
      "Ravi",
      "Indus",
      "Jhelum",
      2
    )
    questionsList.add(question2)

    // Question 3
    val question3 = QuestionData(
      "Which mountain range is located in Pakistan?",
      3,
      "Rocky Mountains",
      "Andes Mountains",
      "Himalayas",
      "Alps",
      3
    )
    questionsList.add(question3)

    // Question 4
    val question4 = QuestionData(
      "What is the national language of Pakistan?",
      4,
      "Urdu",
      "Punjabi",
      "Sindhi",
      "Pashto",
      1
    )
    questionsList.add(question4)

    // Question 5
    val question5 = QuestionData(
      "Which Pakistani cricketer has the most centuries in Test matches?",
      5,
      "Misbah-ul-Haq",
      "Inzamam-ul-Haq",
      "Mohammad Yousuf",
      "Younis Khan",
      4
    )
    questionsList.add(question5)

    return questionsList
  }
}