package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var BindingClass : ActivityMainBinding // наследуемся от нового класса

    override fun onCreate(activitySergo: Bundle?) {
        BindingClass = ActivityMainBinding.inflate(layoutInflater) // заполняем класс всем необходимым
        super.onCreate(activitySergo)
        setContentView(BindingClass.root) // показываем, чем хотим управлять - а именно всем activity_main
        BindingClass.buttonSwitch.setOnClickListener { // тест кнопки
            BindingClass.textAnalPortals.text = "Mama Rodnaya Che tVORY"
        }
    }

    }
