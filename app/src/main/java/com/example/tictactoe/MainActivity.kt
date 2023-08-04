package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.blue
import androidx.core.graphics.red
import com.example.tictactoe.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {


    var flag = 0
    var count = 0
    private lateinit var btn1 : Button
    private lateinit var btn2 : Button
    private lateinit var btn3 : Button
    private lateinit var btn4 : Button
    private lateinit var btn5 : Button
    private lateinit var btn6 : Button
    private lateinit var btn7 : Button
    private lateinit var btn8 : Button
    private lateinit var btn9 : Button

    private lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)


        val nameTV : TextView = findViewById(R.id.nameTV)

        nameTV.text = intent.getStringExtra("et1")

    }

    fun check(view:View){
        val btncurrent = view as Button

        if (btncurrent.text == ""){

            count++


        if (flag==0){
            btncurrent.text = "x"
            flag = 1
        }
        else{
            btncurrent.text = "0"
            flag = 0
        }

        val b1 = btn1.text.toString()
        val b2 = btn2.text.toString()
        val b3 = btn3.text.toString()
        val b4 = btn4.text.toString()
        val b5 = btn5.text.toString()
        val b6 = btn6.text.toString()
        val b7 = btn7.text.toString()
        val b8 = btn8.text.toString()
        val b9 = btn9.text.toString()

        if (b1.equals(b2) && b2.equals(b3) && b3.isNotEmpty()){
            Toast.makeText(this, "Winner is  $b1", Toast.LENGTH_SHORT).show()
            Handler().postDelayed(Runnable {
                newGame()
            },3000)
        }
        if (b4.equals(b5) && b5.equals(b6) && b5.isNotEmpty()){
            Toast.makeText(this, "Winner is  $b4", Toast.LENGTH_SHORT).show()
            Handler().postDelayed(Runnable {
                newGame()
            },3000)
        }
        if (b7.equals(b8) && b8.equals(b9) && b9.isNotEmpty()){
            Toast.makeText(this, "Winner is  $b7", Toast.LENGTH_SHORT).show()
            Handler().postDelayed(Runnable {
                newGame()
            },3000)
        }
        if (b1.equals(b4) && b4.equals(b7) && b7.isNotEmpty()){
            Toast.makeText(this, "Winner is  $b1", Toast.LENGTH_SHORT).show()
            Handler().postDelayed(Runnable {
                newGame()
            },3000)
        }
        if (b2.equals(b5) && b5.equals(b8) && b8.isNotEmpty()){
            Toast.makeText(this, "Winner is  $b2", Toast.LENGTH_SHORT).show()
            Handler().postDelayed(Runnable {
                newGame()
            },3000)
        }
        if (b3.equals(b6) && b6.equals(b9) && b9.isNotEmpty()){
            Toast.makeText(this, "Winner is  $b3", Toast.LENGTH_SHORT).show()
            Handler().postDelayed(Runnable {
                newGame()
            },3000)
        }
        if (b1.equals(b5) && b5.equals(b9) && b9.isNotEmpty()){
            Toast.makeText(this, "Winner is  $b1", Toast.LENGTH_SHORT).show()
            Handler().postDelayed(Runnable {
                newGame()
            },3000)
        }
        if (b3.equals(b5) && b5.equals(b7) && b7.isNotEmpty()){
            Toast.makeText(this, "Winner is  $b3", Toast.LENGTH_SHORT).show()
            Handler().postDelayed(Runnable {
                newGame()
            },3000)
        }
            else if (count == 9){
            Toast.makeText(this, "Match is Draw..", Toast.LENGTH_SHORT).show()
            Handler().postDelayed(Runnable {
                newGame()
            },3000)
        }

        }

    }

    fun newGame(){
        btn1.text = ""
        btn2.text = ""
        btn3.text = ""
        btn4.text = ""
        btn5.text = ""
        btn6.text = ""
        btn7.text = ""
        btn8.text = ""
        btn9.text = ""

        flag = 0
        count = 0
    }

}