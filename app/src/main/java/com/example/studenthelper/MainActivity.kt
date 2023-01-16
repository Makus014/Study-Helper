package com.example.studenthelper

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Setting buttons
        val Notebtn = findViewById<Button>(R.id.BTNNotes)
        val Pnbtn = findViewById<Button>(R.id.BTNpronunciation)
        val Calbtn = findViewById<Button>(R.id.BTNCalendar)
        Notebtn.setOnClickListener {
            val intent = Intent(this, Notes::class.java)
            startActivity(intent)
        }
        Pnbtn.setOnClickListener{
            val intent = Intent(this, pronunciation::class.java)
            startActivity(intent)
        }
        Calbtn.setOnClickListener {  val intent = Intent(this, Calendar::class.java)
        startActivity(intent)}
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.aboutUs ->{
                val i = Intent(this, Aboutus::class.java)
                startActivity(i)
                return true
            }
            R.id.helpthis ->{
                val i = Intent(this, helpyes::class.java)
                startActivity(i)
                return true
            }
            else->
                return super.onOptionsItemSelected(item)
        }
    }
}