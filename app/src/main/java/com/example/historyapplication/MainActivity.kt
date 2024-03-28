package com.example.historyapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val age = findViewById<EditText>(R.id.etAge).text
        val generate = findViewById<Button>(R.id.generateBtn)
        val clear = findViewById<Button>(R.id.clearBtn)
        val result = findViewById<TextView>(R.id.tvResult)

        generate.setOnClickListener(){
            val intAge = age.toString().toIntOrNull()


            if ((intAge != null) && (intAge in (20..99))){

                if (intAge < 30){
                    result.text = "You are ${intAge}. You share an approximate age with Tupac Shakur, one of the most influential and successful rappers of all time."
                }
                else if (intAge < 40){
                    result.text = "You are ${intAge}. You share an approximate age with Tupac Shakur, one of the most influential and successful rappers of all time."
                }
                else if (intAge < 50){
                    result.text = "You are ${intAge}. You share an approximate age with Henry VIII of England, the King of England from 1509 until his death."
                }
                else if (intAge < 60){
                    result.text = "You are ${intAge}. You share an approximate age with Galileo Galilei, Italian astronomer, physicist, and engineer."
                }
                else if (intAge < 70){
                    result.text = "You are ${intAge}. You share an approximate age with Leonardo da Vinci, a World-Renowned Inventor from Italy."
                }
                else if (intAge < 80){
                    result.text = "You are ${intAge}. You share an approximate age with Nelson Mandela, South African anti-apartheid revolutionary, political leader, and philanthropist who served as President of South Africa from 1994 to 1999."
                }
                else if (intAge < 90){
                    result.text = "You are ${intAge}. You share an approximate age with Pablo Picasso, a Spanish painter and co-inventor of constructed sculptures."
                }
                else {
                    if(intAge < 100){
                        result.text = "You are ${intAge}. You share an approximate age with Michelangelo, an Italian sculptor, painter, and architect of the High Renaissance."
                    }
                }
            }
            else{
                if (intAge == null){
                    result.text = "Decimals and Letters are not ages. Please enter a whole number."
                }else result.text = "No famous figure of this age is in the archive. Pick between ages 20 - 100."
            }}

        clear.setOnClickListener(){
            result.text = ""
        }
    }
}
