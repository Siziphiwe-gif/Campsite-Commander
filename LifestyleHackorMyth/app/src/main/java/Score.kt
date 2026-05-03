package com.example.lifestylehackormyth


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        //links this file Kotlin file to the activity_score.xml layout file
        setContentView(R.layout.activity_score)

       // Retrieve the data passed from Quiz activity
        val score = intent.getIntExtra("score",0)
        val total = intent.getIntExtra("total",0)

        //Connect the UI components from the XML layout to variables
        val textMessage = findViewById<TextView>(R.id.textMessage)
        val textScore =findViewById<TextView>(R.id.textScore)

        //Display the numerical results using string templates
        textScore.text  = "You scored $score out of $total"

        //Determines the message based on performance
        textMessage.text = if (score >total /2 ) {
            "Smart Beast!"
        }else{
            "Keep practicing "

    }
    }
}