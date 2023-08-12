package com.example.listviewprojtwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

//        Toast.makeText(this, "userActivity", Toast.LENGTH_SHORT).show()

        val name = intent.getStringExtra("name")
        val phoneNumber = intent.getStringExtra("phone")
        val imageId = intent.getIntExtra("imageId",R.drawable.girl1_pic2)

        val nameTv = findViewById<TextView>(R.id.nameTv)
        val phoneTv = findViewById<TextView>(R.id.phoneTv)
        val image = findViewById<CircleImageView>(R.id.profile_image)

        nameTv.text = "Name: $name"
        phoneTv.text = "Phone Number: $phoneNumber"
        image.setImageResource(imageId)
    }
}