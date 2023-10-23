package com.example.assignment_1app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Maine yha ek variable bnaya jiska name h "bynIntent" or isme maine "Button" Design wale
        //section se isko attach kar diya
        val btnIntent= findViewById<Button>(R.id.button)


        //Yha per maine yeh code likha ki iss button per jab koi click karega to wo iss App ke dusre
        //Screen(Activity) per kaise jayega

        btnIntent.setOnClickListener {   //maine yha button ko action provide kiya ki,isko clickable bnao

            intent= Intent(applicationContext, SecondActivity::class.java)  //Phir maine isme ek "intent" bnaya Or usme
            //"intent" method call kiya Or Phir uss
            //"Intent" me two "parameter" Pass kiya,
            //Or phir isko ek "context" diya Jiska name
            //tha "applicationContext" and 2nd Parameter
            //ha aapne "new Activity" ka name jisper hame
            //jana h click karne ke baad Or jo last me "Java"
            //wo rule h likhne ka

            startActivity(intent)    //Or yha maine "startActivity" Function call karke, "intent ki Help se
                                     //maine Second Activity ko call kiya h
        }
    }
}