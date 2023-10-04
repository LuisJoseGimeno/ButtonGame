package com.example.p1

import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private  var num = 0
    private var maxScore = 0;
    private lateinit var score: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        score = findViewById(R.id.textView)

        button.setOnClickListener {

            val random = Random.nextInt(0,101)

            if(random<=num){
                if(num > maxScore){
                    maxScore = num
                    ShowMaxScore();
                }
                num = 0;
            }

            num++
            score.text = "MaxScore: $maxScore"
            button.text = num.toString()
        }
    }

    private fun ShowMaxScore() {
        val toastText = "¡¡New Max Score!!"
        val toast = Toast.makeText(applicationContext, toastText, Toast.LENGTH_SHORT)
        toast.show()
    }
}