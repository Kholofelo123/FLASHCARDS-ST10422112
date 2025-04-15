package com.example.historyflashcardquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    private val questions = arrayOf(
        "Nelson Mandela died in 1990",
        "The Great Wall of China is visible from space",
        "Water boils at 100°C at sea level",
        "Sharks are mammals",
        "Mount Everest is the tallest mountain on Earth"
    )
    private val answers = booleanArrayOf(false, false, true, false, true)

    private var index = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val questionText: TextView = findViewById(R.id.questionText)
        val trueButton: Button = findViewById(R.id.trueButton)
        val falseButton: Button = findViewById(R.id.falseButton)

        questionText.text = questions[index]

        trueButton.setOnClickListener { checkAnswer(true) }
        falseButton.setOnClickListener { checkAnswer(false) }
    }

    private fun checkAnswer(userAnswer: Boolean) {
        if (userAnswer == answers[index]) {
            score++
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show()
        }
        index++
        if (index < questions.size) {
            findViewById<TextView>(R.id.questionText).text = questions[index]
        } else {
            val intent = Intent(this, ScoreActivity::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
            finish()
        }
    }
}