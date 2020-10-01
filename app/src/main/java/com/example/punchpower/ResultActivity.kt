package com.example.punchpower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    val power by lazy{
        intent.getDoubleExtra("power", 0.0) *100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        title = "펀치력결과"

        scoreLabel.text = "${String.format("%.0f", power)} 점"

        restartButton.setOnClickListener{
            finish()
        }
    }
}
