import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.parkinglistapp.R

class Display : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.display) //Links to XML

        //Link our XML elements to Kotlin variables
        val textDisplay = findViewById<TextView>(R.id.textDisplay)
        val btnShowAllList = findViewById<Button>(R.id.btnShowAllList)
        val btnShowFilteredList = findViewById<Button>(R.id.btnShowFilteredList)
        val btnBack = findViewById<Button>(R.id.btnBack)
        //Display the entire packing list using a loop
        btnShowAllList.setOnClickListener {
            if (DataStorage.itemCount == 0) {
                textDisplay.text = "Your packing list is currently empty. Good back and add items"
            } else {
                val fullListTextView = "Complete packing list --/n/n"
                //A loop that runs through our arrays from index 0 to our count
                for (index in 0 until DataStorage.itemCount) {
                    fullListTextView += "Item :${DataStorage.itemName[index]} /n"
                    "Category : $ {DataStorage.categories[index]}/n" +
                            "Quantity : $ {DataStorage.quantities[index]/n" +
                            "Comment : $ {DataStorage.comments[index]/n" +
                            "------------------------------------/n"
                }
                //push the final built text block to the screen
                textDisplay.text = fullListTextView
            }

        }
        //Filter and display items with a quantity of 2 or more
        btnShowFilteredList.setOnClickListener {
            if (DataStorage.itemCount == 0) {
                textDisplay.text = "Your packing list is empty."

            } else {

                var filteredTextView = "--ITEMS WITH 2 QTY OR MORE --/n/n"
                var foundAnyItems = false

                //a loop that checks every items quantity value
                for (index in 0 until DataStorage.itemCount) {
                    if (DataStorage.quantities[index] >= 2) {

                        filteredTextView += ".${DataStorage.itemName[index]}"
                        (Qty:${ DataStorage.quantities[index] })/n+
                        "Note : $ {DataStorage.comments [index]}/n/n"
                        foundAnyItems = true
                    }
                }
                if (!foundAnyItems) {
                    textDisplay.text = "no items found in your list with a quantity of 2 or more"
                } else {
                    textDisplay.text = filteredTextView
                }


            }
        }
        //go back to screen one
        btnBack.setOnClickListener {
            finish()
        }
    }
}








