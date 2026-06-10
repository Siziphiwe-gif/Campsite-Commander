package com.example.lifestylehackormyth

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //This links the Kotlin code to the XML layout file
        setContentView(R.layout.activity_main)

        val butStart = findViewById<Button>(R.id.butStart)

        butStart.setOnClickListener {
            //Start the new activity
            val intent = Intent (this, QuizActivity::class.java)
        }
    }
}