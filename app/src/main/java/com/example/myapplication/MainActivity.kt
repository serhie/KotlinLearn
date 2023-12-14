package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(activitySergo: Bundle?) {
        super.onCreate(activitySergo)
        setContentView(R.layout.activity_main)

        val testId = findViewById<TextView>(R.id.textAnalPortals)

        testId.text = "POMENYAL TEXT EBAAAT'"
    }
}