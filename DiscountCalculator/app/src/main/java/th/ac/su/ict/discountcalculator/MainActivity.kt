package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val OGprice = findViewById<EditText>(R.id.OGprice)
        val DCprice = findViewById<EditText>(R.id.DCprice)
        val Calbutton = findViewById<Button>(R.id.CalButton)
        val Taxcheck = findViewById<CheckBox>(R.id.TaxCheck)
        val Result = findViewById<TextView>(R.id.Result)

        var price:Double = 0.0
        var cost:Double = 0.0
        var Discountrate:Double = 0.0
        var Vatadd:Double= 0.0


        Calbutton.setOnClickListener(){
            var OG:Double = OGprice.text.toString().toDouble()
            var DC:Int = DCprice.text.toString().toInt()


            if (Taxcheck.isChecked){

                Discountrate = OG*DC/100;

                price = OG-Discountrate;

                Vatadd = price*7/100;

                cost = price+Vatadd;

                Result.text= cost.toString()

            } else {

                Discountrate = OG*DC/100;

                price = OG-Discountrate;

                Result.text= price.toString()

            }
        }
    }
}