package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            Log.i("MainActivity", "btnShowToast Clicked")
            Toast.makeText(this, "btnShowToast Clicked", Toast.LENGTH_SHORT).show()
        }

        btnSendMessageToNextActivity.setOnClickListener {
            var msg: String = etUserMsg.text.toString()
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}