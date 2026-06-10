import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.campsitecommander.R

class `display  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //connects the kotlin file to the layout UI
        setContentView(R.layout.display_main_xml)
        //Lnk our  XML element to  kotlin variables
        val btnBack = findViewById<Button>(R.id.btnBack)
        val textDisplay = findViewById<EditText>(R.id.textDisplay)
       val btnDisplay = findViewById<Button>( R.id.btnDisplay)
        //Display the entrie packing list using a loop
        btnDisplay.setOnClickListener {
            if (DataStorage.item ==0)
                textDisplay.text = "Your parking list is currently empty.Go back and add items"

        } else {
            val fullListText = "complete packing list"
            //loop that runs through our arrays from index 0 to our counter
            for (index in 0 until DataStorage.itemCount){
           fullListTextView +="Item:${DataStorage.itemName[index]}/n"
                "Category: ${DataStorage.category[index]}"
                "Quantity:${DataStorage.quantities[index]}/n"
                "Comment: ${DataStorage.comments[index]}/n"
            }
            //push the final built text block to the screen
            textDisplay.text = fullListTextView

        }
        //go back to main screen
        btnBack.setOnClickListener {
            finish()
        }
    }
}