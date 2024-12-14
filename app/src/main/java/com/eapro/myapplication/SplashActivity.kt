package com.eapro.myapplication

import android.content.Intent


import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val headingTextView: TextView = findViewById(R.id.headings_main)
        val textToAnimate = "Welcome To Rms ::The Power House That Keeps Your  World Running"

        // Start typing animation and transition to MainActivity on completion
        startTypingAnimation(headingTextView, textToAnimate) {
            navigateToMainActivity() // Move to the next activity
        }
    }

    private fun startTypingAnimation(textView: TextView, text: String, delay: Long = 150L, onComplete: () -> Unit) {
        val handler = Handler(Looper.getMainLooper())
        var index = 0

        val typingRunnable = object : Runnable {
            override fun run() {
                if (index <= text.length) { // 30
                    textView.text = text.substring(0, index)
                    index++
                    handler.postDelayed(this, delay)
                }


                else {
                    onComplete()
                }
            }
        }

        handler.post(typingRunnable) // Start typing
    }

    private fun navigateToMainActivity() {
        overridePendingTransition(R.anim.fade_in, R.anim.fade_in)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish() // Finish SplashActivity to remove it from the back stack
    }
}



