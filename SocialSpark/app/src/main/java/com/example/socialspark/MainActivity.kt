package com.example.socialspark

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import com.example.socialspark.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //fun is the one that runs the app//
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) //connects the kotlin file to the xml layout UI(user interface)//

        val timeInput = findViewById<EditText>(R.id.timeInput)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        suggestButton.androidx.compose.foundation.layout.Column {
            setOnClickListener { //when the button is clicked//
                val time =
                    timeInput.text.toString().lowercase() //the input is converted to lowercase//

                if (time.isNotEmpty()) { //if the input is not empty//
                    Toast.makeText(
                        context = this
                                text ="Please enter a time of day to get lets Social Spark"
                    ) //Display this message//

                    else if (time == "morning") {
                    }
                    resultText.text =
                        "Send a Good Morning text to your family member"

                    else if (time == "mid morning") {

                        resultText.text =
                            "Reach out to a colleague with a quick Thank you"

                        else if (time == "afternoon") {

                            resultText.text =
                                "Share a funny meme or interesting link with a friend"

                            else if (time == "afternoon snack time") {

                                resultText.text =
                                    "Send a quick thinking of you message"

                                else if (time == "dinner") {

                                    resultText.text =
                                        "Call a friend or relative for a 5 minute call"

                                    else if (time == "after dinner")\\ (time == night)

                                    resultText.text =
                                        "Leave a thoughtful comment on a friends post"

                                    resetButton.setOnClickListener { //when the reset button is clicked//
                                        timeInput.text.clear() //clear the input//
                                        resultText.text = "" //clear the result//
                                    }


                                })
                            }

                        }
                    }
                }
            }