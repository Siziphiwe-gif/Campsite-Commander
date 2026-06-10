package com.example.screensmart
import android.widget.Button
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import android.widget.Toast
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() { //Declarations and initialization of parallel arrays ( 7 days from assignment table)
    private val dates = arrayOf("2024-04-02","2024-04-03,'2024-04-04","2024-04-05","2024-04-06","2024-04-07")
    private val morningMinutes = IntArray(7)
    private val afternoonMinutes = IntArray (7)
    private val activityNotes = arrayOf(7){ "" }
    //counter to keep track of which day the user is currently entering the day for
    private var currentDayIndex = 0
 private lateinit var textCurrentDate : TextView

    private lateinit var editMorning  : EditText
    private lateinit var editAfternoon  : EditText
    private lateinit var editNotes
      : EditText
    private lateinit var btnSave  : Button
    private lateinit var btnClear  : Button

    private lateinit var btnDetailedView : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)
        //Initialize UI elements
        textCurrentDate = findViewById<TextView>(R.id.textCurrentDate)
        editMorning = findViewById<EditText>(R.id.editMorning)
        editNotes = findViewById<EditText>(R.id.editNotes)
        btnDetailedView = findViewById<Button>(R.id.btnDetailedView)
        btnSave = findViewById<Button>(R.id.btnSave)
        btnClear = findViewById<Button>(R.id.btnClear)

        //Show the initial entry data target
        updateDateDisplay()
        //Save Button Functionality
        btnSave.setOnClickListener {
            handleDataInput()

        }
        //Clear Button functionality
        btnClear.setOnClickListener {
            clearAllData

        }
        //View detailed  button functionality
        btnDetailedView.setOnClickListener {
            //we will create the detailsActivity screen next
            val intent = Intent(this, DetailsActivty::class.java)

            //pass arrays across the screen using extras
            intent.putExtra("DATES_Arrays", dates)
            intent.putExtra("MORNING_ARRAYS", morningMinutes)
            intent.putExtra("AFTERNOON_ARRAYS", afternoonMinutes)
            intent.putExtra("NOTES_ARRAYS,activityNotes")
            startActivity(intent)


        }
    }
        //Updates the date instruction text dynamically
        private fun updateDateDisplay() {
            if (currentDayIndex < 7) {

                textCurrentDate.text = "Enter data for : $ {dates[currentDayIndex]}"
            } else {
                textCurrentDate.text = "All 7 days recorded !"
                btnSave.isEnabled = false //safely disable input button once arrays are full

            }
        }
            //implements error handling and data capture
            private fun handleDataInput(){
                if (currentDayIndex >=7 )
                    return
                val morningString= editMorning.text.toString().trim()
                val afternoonString= editAfternoon.text.toString().trim()
                val noteString= editNotes.text.toString().trim()
                //validate that fields are not empty
              if (morningString.isEmpty() || afternoonString.isEmpty() || noteString.isEmpty() {
                      Toast.makeText(this,"please fill in all input fields.", Toast.LENGTH_SHORT)
                 return
              }
                  //Save data and  increment index
                  morningMinutes [currentDayIndex] = morningMinutes.toUIntArray() ?:0
                  aft








            }
        }


    }
