package com.example.labo04merlosrodriguez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: TextInputEditText
    private lateinit var actionNext: Button
    private lateinit var gmailEditText: TextInputEditText
    private lateinit var phoneNumber: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameEditText = findViewById(R.id.name_value)
        actionNext = findViewById(R.id.action_share)
        gmailEditText = findViewById(R.id.gmail_value)
        phoneNumber = findViewById(R.id.num_phone_value)
        actionNext.setOnClickListener{

            val intent = Intent(this, shortAcyivity::class.java)
            intent.putExtra("name",nameEditText.text.toString())
            intent.putExtra("gmail",gmailEditText.text.toString())
            intent.putExtra("phone", phoneNumber.text.toString())
            startActivity(intent)
        }

    }

}