package com.example.labo04merlosrodriguez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class shortAcyivity : AppCompatActivity() {

    private lateinit var nameTextView: TextView
    private lateinit var gmailTextView: TextView
    private lateinit var phoneTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_short_acyivity)

        nameTextView = findViewById(R.id.name_share_text_view)
        gmailTextView = findViewById(R.id.gmail_share_text_view)
        phoneTextView = findViewById(R.id.num_phone_share_text_view)

        val nameShare = intent.getStringExtra("name").toString()
        val gmailShare = intent.getStringExtra("gmail").toString()
        val phoneShare = intent.getStringExtra("phone").toString()

        nameTextView.text = "name is ${nameShare}"
        gmailTextView.text = "gmail is ${gmailShare}"
        phoneTextView.text = "phone number id ${phoneShare}"
    }
}