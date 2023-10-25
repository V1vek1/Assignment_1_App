package com.example.assignment_1app

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

//Yha per niche code me ye likha huaa h ki, ek Class h jiska name h "SecondActivity" jo ki "AppCompactActivity" ko call
//kar rha h phir hum "onCreate function ko override kar rhe h ek bundle ko
//or yeh "SecondActivity.kt" file Design File (activity_second.xml) file se Linked h


//Maine Call Function ke liye ek "uses Permission" add Kiya h "Manifest" me


//NOTE :- kisi bhi "CardView" Or uske undar ka "Intent ka Name same nahi likh sakte ek bar se jada bar
//Like :- Niche wale code me "cardview3" h to "Intent4" h, naki "intent3" Agar hum "intent3" likhenge to
//Error Aayega


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Yha maine 5 variables bnaya h 1-4 taak cardviews hai, joki xml se "cardWebs" ko le rha h Or,
        //number 5 wala variable me ek button bna h joki xml se "button" le rha h

        val cardview1 = findViewById<CardView>(R.id.cardWeb)
        val cardview2= findViewById<CardView>(R.id.cardWeb2)
        val cardview3 = findViewById<CardView>(R.id.cardWeb3)
        val cardview4 = findViewById<CardView>(R.id.cardWeb4)
        val callButton = findViewById<Button>(R.id.button2)


        //Yha maime "cardview1" per yeh set kiya ki isper click karne per kya hoga

        cardview1.setOnClickListener {

            //NOTE :- Iss "CardView" me mai aab Ek New "Activity" ka access de rha hu, Issiliye yeh niche wale code, jisse ki iss "cardView"
            //per click karne se Ek Implicit Screen open hoti thi taki diye gye link open ho sake, to usko maine Comment kar diya h
            //kyuki iss "CardView" se mujhe Ek New Activity Open karni thi issiliye hamne uska code likha or "Link" wala code Comment kar diya

//            val intent = Intent(Intent.ACTION_VIEW)   //ek variable bnaya "intent" jisme "Intent"

             // Method call kiya Or usse ek "Action" call
             //karwaya jo  yeh view karega ki iss "link"
             // ko open karne ke liye iss phone me koun
             //koun se app avialable h, to phir wo hame
             //yeh options Show karega, or Hum uske according
             //Koi app Select karke iss Link ko Open karelenge

//            intent.data = Uri.parse("https://developer.android.com/")    //Or Phir uss Intent me "data" diya
            //ki tumhe iss Link per jana h

//            startActivity(intent)     //Phir iss "Intent" ko start karne ka Command diya



            //Yeh Code h ki iss "CardView" per Click karne se "AndroidActivity" Activity open hogi,
            //Jisko hum "Explicit Intent" bolte h
            intent = Intent(applicationContext, AndroidActivity::class.java)

            startActivity(intent)

        }



        cardview2.setOnClickListener {
            val intent2 = Intent(Intent.ACTION_VIEW)    //ek variable bnaya "intent2" jisme "Intent"
            // Method call kiya Or usse ek "Action" call
            //karwaya jo  yeh view karega ki iss "link"
            // ko open karne ke liye iss phone me koun
            //koun se app avialable h, to phir wo hame
            //yeh options Show karega, or Hum uske according
            //Koi app Select karke iss Link ko Open karelenge


            intent2.data = Uri.parse("https://www.w3schools.com/whatis/")   //Or Phir uss Intent2 me "data" diya
            //ki tumhe iss Link per jana h


            startActivity(intent2)   //Phir iss "Intent2" ko start karne ka Command diya

    }


        //NOTE :- kisi bhi "CardView" Or uske undar ka "Intent ka Name same nahi likh sakte ek bar se jada bar
        //Like :- Niche wale code me "cardview3" h to "Intent4" h, naki "intent3" Agar hum "intent3" likhenge to
        //Error Aayega


        cardview3.setOnClickListener {
            val intent4 = Intent(Intent.ACTION_VIEW)   //ek variable bnaya "intent4" jisme "Intent"
            // Method call kiya Or usse ek "Action" call
            //karwaya jo  yeh view karega ki iss "link"
            // ko open karne ke liye iss phone me koun
            //koun se app avialable h, to phir wo hame
            //yeh options Show karega, or Hum uske according
            //Koi app Select karke iss Link ko Open karelenge


            intent4.data = Uri.parse("https://en.wikipedia.org/wiki/Machine_learning")  //Or Phir uss Intent me "data" diya
            //ki tumhe iss Link per jana h

            startActivity(intent4)    //Phir iss "Intent4" ko start karne ka Command diya


        }



        cardview4.setOnClickListener {
            val intent5 = Intent(Intent.ACTION_VIEW)   //ek variable bnaya "intent5" jisme "Intent"
            // Method call kiya Or usse ek "Action" call
            //karwaya jo  yeh view karega ki iss "link"
            // ko open karne ke liye iss phone me koun
            //koun se app avialable h, to phir wo hame
            //yeh options Show karega, or Hum uske according
            //Koi app Select karke iss Link ko Open karelenge


            intent5.data = Uri.parse("https://en.wikipedia.org/wiki/Hacking")   //Or Phir uss Intent me "data" diya
            //ki tumhe iss Link per jana h

            startActivity(intent5)     //Phir iss "Intent5" ko start karne ka Command diya

        }


        //Yha maine "Contact Us" wale Button keliye deta diya h ki jab Button per click ho to yeh
        //Kaam karo, yani ki Call karo

        callButton.setOnClickListener {
            val call = Intent(Intent.ACTION_DIAL)
            call.data = Uri.parse("tel:" + "87093204645 ")
            startActivity(call)
        }


    }
}