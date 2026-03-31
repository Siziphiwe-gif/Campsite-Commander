package com.example.socialsparks

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.annotation.SuppressLint

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val timeInput=findViewById<EditText>(R.id.timeInput)
        val resultText=findViewById<TextView>(R.id.resultText)
        val resetButton=findViewById<Button>(R.id.resetButton
        val suggestButton=findViewById<Button>(R.id.suggestButton)

        suggestButton.seClickListener
        val time = timeInput.text.toString().lowercase()

        if (time.isEmpty())
            Toast.makeText(context=this
            text= "Please enter a time of day to get a lets Spark")

   else if (time == "morning")

       resultText.text =
           "Send a Good morning text to a family member"

   else if (time == mid-morning)

       resultText.text =
           "Reach out to a colleague with a quick Thank you"

   else if (time == "afternoon")

       resultText.text =
           "Share a funny meme or interesting link with a friend"

   else if (time =="afternoon snack time")

       resultText.text =
           "Send a quick thinking of you message"

    else if (time=="dinner")

        resultText.text =
            "Call a friend or relative for a 5 minute catch up call"

     else if (time =="after dinner")||(time=="night")

        resultText.text =
            "Leave a thoughtful comment on a friends post"

        resetButton.setOnClickListener

      timeInput.text.clear()
        resultText.text.= ""




        }
    }
}