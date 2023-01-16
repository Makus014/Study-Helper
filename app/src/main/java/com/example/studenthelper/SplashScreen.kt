package com.example.studenthelper

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splash1 : ImageView =findViewById(R.id.Slogo)
        val splash2 : TextView = findViewById(R.id.STextView)

        val sideAnimation = AnimationUtils.loadAnimation(this, R.anim.anim)
        splash1.startAnimation(sideAnimation)
        splash2.startAnimation(sideAnimation)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java ))
            finish()
        }, 3000)
    }
}