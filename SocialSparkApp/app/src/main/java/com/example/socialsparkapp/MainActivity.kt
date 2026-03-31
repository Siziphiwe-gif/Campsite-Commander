package com.example.socialsparkapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    }

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState()
        setContentView(R.layout.activity_main)

            val timeInput = findViewByyId<EditText>(R.id.timeInput)
            val resultText = findViewById<TextView>(R.id.resultText)
            val suggestButton = findViewById<Button>(R.id.suggestButton)
            val restButton = findViewById<Button>(R.id.restButton)

          suggestButton.setOnClickListener {
              val time = timeInput.text.toString().lowercase()

              If (time.is Empty())
                Toast.makeText(context = this
               text =
                    "Please enter a time of day to get a lETS SPARK!")


             else if (time == "morning")

                  resultText.text =
                      Send a "Good morning text to a family member"

              else if (time == "mid morning")

                  resultText.text =
                      "Reach out to a colleague with a quick Thank you"

              else if (time == "afternoon")

                  resultText.text =
                      "Share a funny meme or interesting link with a friend"

              else if (time == "afternoon snack time")

                  resultText.text = "Send a quick thinking of you message"

              else if (time == "dinner")

                  resultText.text =
                      "Call a friend or relative for a 5 minute catch up"
              else if (time == after dinner) || (time == night)

              resultText.text =
                      "Leave a thoughtful comment on a friends post"

              else

                  resultText.text =
                      "Invalid input. Try Morning,Afternoon,Dinner or Night"


              restButton.setOnClickListener {


                  timeInput.text.clear()
                  resultText.text =""
              }

          }
        }
    }
}