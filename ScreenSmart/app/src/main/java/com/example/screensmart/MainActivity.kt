//Student Number : YOUR _ STUDENT_NUMBER
//Name : YOUR_NAME
package com.example.screensmart

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess
import android .content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btnEnter = findViewById<Button>(R.id.btnEnter)
        val btnExit = findViewById<Button>(R.id.bntExit)
         //enter button :Navigates to data entry MainActivity 2
        btnEnter.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
        }

    //Exit button : Safely closes the application
        btnExit.setOnClickListener {
            finishAffinity()
            exitProcess(0)
        }
        }
    }
