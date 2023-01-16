package com.example.studenthelper

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.pronunciation_yes.*
import java.util.*

class pronunciation : AppCompatActivity() {

    val ttspeech = arrayOf("US", "UK", "CHINESE", "JAPANESE")


    lateinit var tts:TextToSpeech
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pronunciation_yes)

        val adapter =ArrayAdapter(this, android.R.layout.simple_spinner_item,ttspeech)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        Titem.adapter=adapter


        pnounce.setOnClickListener {
            speakon()
        }

        }

    fun speakon(){
        if(Titem.selectedItemPosition==0){
            tts= TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
                if(it== TextToSpeech.SUCCESS){
                    tts.language = Locale.US
                    tts.speak(gpronunciation.text.toString(), TextToSpeech.QUEUE_ADD, null)
                }
            })
        }
        if(Titem.selectedItemPosition==1){
            tts= TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
                if(it== TextToSpeech.SUCCESS){
                    tts.language = Locale.UK
                    tts.speak(gpronunciation.text.toString(), TextToSpeech.QUEUE_ADD, null)
                }
            })
        }
        if(Titem.selectedItemPosition==2){
            tts= TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
                if(it== TextToSpeech.SUCCESS){
                    tts.language = Locale.CHINESE
                    tts.speak(gpronunciation.text.toString(), TextToSpeech.QUEUE_ADD, null)
                }
            })
        }
        if(Titem.selectedItemPosition==3){
            tts= TextToSpeech(applicationContext, TextToSpeech.OnInitListener {
                if(it== TextToSpeech.SUCCESS){
                    tts.language = Locale.JAPANESE
                    tts.speak(gpronunciation.text.toString(), TextToSpeech.QUEUE_ADD, null)
                }
            })
        }

}

}
