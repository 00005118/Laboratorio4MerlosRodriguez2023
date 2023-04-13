package com.example.labo04merlosrodriguez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class shortAcyivity : AppCompatActivity() {

    private lateinit var nameTextView: TextView
    private lateinit var gmailTextView: TextView
    private lateinit var phoneTextView: TextView
    private lateinit var shareButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_short_acyivity)

        nameTextView = findViewById(R.id.name_share_text_view)
        gmailTextView = findViewById(R.id.gmail_share_text_view)
        phoneTextView = findViewById(R.id.num_phone_share_text_view)
        shareButton = findViewById(R.id.share_button)

        val nameShare = intent.getStringExtra("name").toString()
        val gmailShare = intent.getStringExtra("gmail").toString()
        val phoneShare = intent.getStringExtra("phone").toString()

        nameTextView.text = "name is ${nameShare}"
        gmailTextView.text = "gmail is ${gmailShare}"
        phoneTextView.text = "phone number id ${phoneShare}"

        shareButton.setOnClickListener(){
            val intent = Intent().apply{
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, nameShare + ", " +gmailShare+", "+phoneShare)
                type = "text/plain"

            }
            val shareInformation = Intent.createChooser(intent, null)
            startActivity(shareInformation)
        }
    }
}