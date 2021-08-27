package com.example.birthdayapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val submitButton : Button = findViewById(R.id.gift)
        val image : ImageView = findViewById(R.id.cake)

        submitButton.setOnClickListener {
            image.visibility = View.VISIBLE
        }


        }

    }
