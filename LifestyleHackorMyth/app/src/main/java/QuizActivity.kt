package com.example.lifestylehackormyth

 import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class QuizActivity : AppCompatActivity() {

    //list of questions
    private val hacks = listOf(
        Hack(
            statement = "Paint both sides of a key head with nail polish.", isTrue = true,
            explanation = "Helps to identify your keys at a glance"
        ),
        Hack(
            statement = "Use a string from a old pen for your charger.", isTrue = true,
            explanation = "To keep your charger from bending or breaking"
        ),
        Hack(
            statement = "Eating late at night causes weight gain.", isTrue = false,
            explanation = "Weight gain is more about calories intake than the timing of the meal"
        ),
        Hack(
            statement = "You can sweat out toxins", isTrue = false,
            explanation = "While sweating is a natural process,the body primarily detoxifies through the liver and kidney"
        )

    )
    private var currentIndex = 0 //Tracks the current questions the user is viewing

    private var score = 0 //Tracks the users total correct answers

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz) //Sets the visual layout for the quiz screen

        //Initialize UI elements by linking them to their IDs in activity_quiz.xml
        val textQuestion = findViewById<TextView>(R.id.textQuestion)
        val textFeedback = findViewById<TextView>(R.id.textFeedback)
        val butTrue = findViewById<Button>(R.id.butTrue)
        val butFalse = findViewById<Button>(R.id.butFalse)
        val butNext = findViewById<Button>(R.id.butNext)

        //Initial call to display the first question when user press Start
        loadQuestion(questionView = textQuestion, feedbackView = textFeedback)
        //logic for when the True button is clicked
        butTrue.setOnClickListener {
            checkAnswer(userAnswer = true, feedbackView = textFeedback)
        }
        //Logic for when the False button is clicked
        butFalse.setOnClickListener {
            checkAnswer(userAnswer = false, feedbackView = textFeedback)
        }
        //Logic for Next button to move to the next question
        butNext.setOnClickListener {
            //Increment the index to the point to the next item on the next item on the list
            currentIndex++
            //Check if there are still questions left in the hacks list
            if (currentIndex < hacks.size) {
                //Load the next question into the UI
                loadQuestion(questionView = textQuestion, feedback = textFeedback)
            } else {
                //Navigation to the ScoreActivity
                val intent=Intent(this, ScoreActivity::class.java)
                intent.putExtra("score",score)
                intent.putExtra("total",hacks.size)
                startActivity(intent)
                finish()
            }
        }

    }

    private fun loadQuestion(questionView: TextView, feedbackView: TextView) {
        //Retrieve the current Hack object and set the question text
        questionView.text = hacks[currentIndex].statement
        //Clear the text field for next question
        feedbackView.text = ""
    }

    private fun checkAnswer(userAnswer: Boolean, feedbackView: TextView) {
        //Check if the users button press matches the isTrue property of current hacks
        val correct = hacks[currentIndex].isTrue == userAnswer
        if (correct) {
            //Increment the score if the answer was correct
            score++
            //Display the success message along with the hack explanation
            feedbackView.text = "Correct! ${hacks[currentIndex].explanation}"
        } else {
            //Display failure message along with hack explanation
            feedbackView.text = "Wrong ${hacks[currentIndex].explanation}"

        }
    }
}







}