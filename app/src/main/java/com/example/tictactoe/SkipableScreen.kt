package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SkipableScreen : AppCompatActivity() {

    private lateinit var btnNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skipable_screen)

        val skip:Button = findViewById(R.id.skip)

        val et1 : EditText = findViewById(R.id.et1)
        val et2: EditText = findViewById(R.id.et2)

        val a = et1.text
        val b = et2.text

        intent.putExtra("et1",a)
        intent.putExtra("et1",b)

        btnNext = findViewById(R.id.next)

        btnNext.setOnClickListener {
            val x = Intent(this,MainActivity::class.java)
            startActivity(x)
            finish()

            val p = intent.getStringExtra("et1")

            Toast.makeText(this, "$a & $b , start the game", Toast.LENGTH_SHORT).show()
        }

        skip.setOnClickListener {
            val x = Intent(this,MainActivity::class.java)
            startActivity(x)
            finish()
        }
    }
}