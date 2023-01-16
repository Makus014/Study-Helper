package com.example.studenthelper

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_notes.*

class Notes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val saveString = sharedPreferences.getString("STRING_KEY", "")
        val saveString2 = sharedPreferences.getString("STRING_KEY2", "")

        idEdtNoteTitle.setText(saveString)
        idEdtNoteDescription.setText(saveString2)
        idBtnAddUpdate.setOnClickListener {
            val ETitle = idEdtNoteTitle.text.toString()
            val EDescription = idEdtNoteDescription.text.toString()

            idEdtNoteTitle.setText(ETitle)
            idEdtNoteDescription.setText(EDescription)


            val sharedPreferences = getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putString("STRING_KEY", ETitle)
                putString("STRING_KEY2", EDescription)
            }.apply()

            Toast.makeText(this, "Data Saved", Toast.LENGTH_SHORT).show()
        }
    }
}