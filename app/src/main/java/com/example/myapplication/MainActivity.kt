package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val a = 150
    val b = 150

    lateinit var BindingClass : ActivityMainBinding // наследуемся от нового класса

    override fun onCreate(activitySergo: Bundle?) {
        BindingClass = ActivityMainBinding.inflate(layoutInflater) // заполняем класс всем необходимым
        super.onCreate(activitySergo)
        setContentView(BindingClass.root) // показываем, чем хотим управлять - а именно всем activity_main

        BindingClass.sum.setOnClickListener {
            val result = a + b
            BindingClass.resultView.text = "$result - Отсоси у тракториста"
        }
        BindingClass.minus.setOnClickListener {
            val result = a - b
            BindingClass.resultView.text = result.toString()
        }
        BindingClass.ymnojenie.setOnClickListener {
            val result = a * b
            BindingClass.resultView.text = result.toString()
        }

    }

    }
