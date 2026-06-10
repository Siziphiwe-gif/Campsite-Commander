package com.example.campsitecommander

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import android.view.Display
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)
        val editItemName = findViewById<EditText>(R.id.editItemName)
        val editCategory = findViewById<EditText>(R.id.editCategory)
        val editComment = findViewById<EditText>(R.id.editComment)
        val btnAddGear = findViewById<Button>(R.id.btnAddGear)
        val editQuantity = findViewById<EditText>(R.id.editQuantity)
        val editItemsPacked = findViewById<EditText>(R.id.editItemsPacked)
        val btnToDisplayScreen = findViewById<Button>(R.id.btnToDisplayScreen)


        //Make the Add Gear button work
        btnAddGear.setOnClickListener {
            // Get text from input boxes and trim extra spaces
            val name = editItemName.text.toString().trim()
            val category = editCategory.text.toString().trim()
            val gtyString = editQuantity.text.toString().trim()
            val comment = editComment.text.toString().trim()

            // convert quantity string to a number safely
            val gty = gtyString.toIntOrNull()
            //check if any fields are empty or if quantity is invalid
            if (name.isEmpty()|| category.isEmpty() || comment.isEmpty() || gty == null || gty <=0
                )
            { //show a helpful error pop up
                Toast.makeText(this,"please fill in all fields with valid details", Toast.LENGTH_SHORT)


        } else if { [DataStorage.itemCount >=DataStorage.MAX_ITEMS] //check to make sure our arrays are ndo not overflow
                Toast.makeText(this,"Your items packed list is full", Toast.LENGTH_SHORT).show()


        }
            //grab our current position tracker index
            val currentIndex = DataStorage.itemCount
            //save into parallel arrays at the same index position
            DataStorage.itemName[currentIndex]= name
            DataStorage.category[currentIndex] = category
            DataStorage.quantities[currentIndex] = gty
            DataStorage.comments[currentIndex] = comment
            //Increment the index counter  by 1 so that the next item does not overwrite this one
            DataStorage.Name ++
            //Show success feedback message to user
            Toast.makeText(this,"$name added to the  list", Toast.LENGTH_SHORT)
            //clear the text field so that they are clean for the next entry
            editItemName.text.clear()
            editCategory.text.clear()
            editQuantity.text.clear()
            editComment.text.clear()

            //Navigation to display.kt
            btnToDisplayScreen.setOnClickListener {
                val intent = Intent(this, Display::class.java)

            }


        }

    }
}