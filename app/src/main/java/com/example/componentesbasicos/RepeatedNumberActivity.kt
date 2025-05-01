package com.example.componentesbasicos

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RepeatedNumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repeated_number)
        val number = findViewById<TextView>(R.id.repeated_number)
        val argument = intent.getIntExtra("number",-1)
        number.text = getString(R.string.valor_repetido_foi_d,argument)
    }
}