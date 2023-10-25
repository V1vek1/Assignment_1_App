package com.example.assignment_1app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AndroidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        //Maine "AndroidActivity" New Activity issiliye bnaya h taki mai ek Emplicit Intent ki help se
        //aapne "SecondActivity" se "Android" wale "CardView" ko Open karna chahta tha
    }
}