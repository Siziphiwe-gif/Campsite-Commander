package com.example.parkinglistapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Toast
import android.content.Intent



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Link our XML EditText inputs to kotlin variables
        val editItemName = findViewById<EditText>(R.id.editItemName)
        val editCategory = findViewById<EditText>(R.id.editCategory)
        val editQuantity = findViewById<EditText>(R.id.editQuantity)
        val editComment = findViewById<EditText>(R.id.editComment)
        //Link our XML buttons to kotlin variables
        val bntAddToList = findViewById<Button>(R.id.btnAddToList)
        val btnNextScreen = findViewById<Button>(R.id.btnNextScreen)
        val btnExitApp = findViewById<Button>(R.id.btnExitApp)

        //Make the exit button work
        btnExitApp.setOnClickListener {
            finishAffinity() //Closes all screen and exits the app cleanly
        }
        //Make the Add to Packing list  button work
        bntAddToList.setOnClickListener {
            //Get text from the input boxes and trim extra spaces
            val name = editItemName.text.toString().trim()
            val category = editCategory.text.toString().trim()
            val gtyString = editQuantity.text.toString().trim()
            val comment = editComment.text.toString().trim()

            //Convert quantity string to a number safely (error handling)
            val gty = gtyString.toIntOrNull()

            //Check if any fields are empty or if quantity is invalid
            if (name.isEmpty() || category.isEmpty() || gty == null || gty <= 0 || comment.isEmpty()) {
                //Show a helpful error pop up
                Toast.makeText(
                    this,
                    "Please fill in all fields with a valid details .",
                    Toast.LENGTH_SHORT
                ).show()
            } else if {
                (DataStorage.itemCount >= DataStorage.MAX_ITEMS)//Error check to make sure our arrays do not overflow
                Toast.makeText(this, "Your packing list is full!", Toast.LENGTH_SHORT).show()

            }
            //Grab our current position tracker index
            val currentIndex = DataStorage.itemCount
            //save data into parallel arrays at the exact same index positon
            DataStorage.itemName[currentIndex] = name
            DataStorage.category[currentIndex] = category
            DataStorage.quantities[currentIndex] = gty
            DataStorage.comments[currentIndex] = comment

            //Increment the index counter by 1 so that the next item does not overwrite this one
            DataStorage.itemCount++

            //Show success feedback message to the user

            Toast.makeText(this, "$name added to the list!", Toast.LENGTH_SHORT).show()
            //Clear the text fields so that they are clean for the next entry
            editItemName.text.clear()
            editCategory.text.clear()
            editQuantity.text.clear()
            editComment.text.clear()
            //Navigation to screen 2
            btnNextScreen.setOnClickListener {
                val intent = Intent(this, Display::class.java)
            }

        }
    }
}
