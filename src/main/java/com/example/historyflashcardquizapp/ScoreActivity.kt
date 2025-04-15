package com.example.historyflashcardquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ScoreActivity : AppCompatActivity() {
    private val questions = arrayOf(
        "Nelson Mandela died in 1990",
        "The Great Wall of China is visible from space",
        "Water boils at 100°C at sea level",
        "Sharks are mammals",
        "Mount Everest is the tallest mountain on Earth"
    )
    private val answers = booleanArrayOf(false, false, true, false, true)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val score = intent.getIntExtra("score", 0)
        val scoreText = findViewById<TextView>(R.id.scoreText)
        val feedbackText = findViewById<TextView>(R.id.feedbackText)
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        scoreText.text = "You scored $score out of 5"

        feedbackText.text = if (score >= 3) "Great job!" else "Keep practicing!"

        reviewButton.setOnClickListener {
            val reviewText = findViewById<TextView>(R.id.reviewText)
            val result = StringBuilder()
            for (i in questions.indices) {
                result.append("${i + 1}. ${questions[i]} - Answer: ${if (answers[i]) "True" else "False"}\n\n")
            }
            reviewText.text = result.toString()
        }

        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}