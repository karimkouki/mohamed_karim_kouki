package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Toast



class MainActivity : AppCompatActivity() {

    //PDFView signIn ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        val button = findViewById<Button>(R.id.button)

        if (intent.getStringExtra("login") != null){
    val intent = Intent(this, Home::class.java)
            Log.d("TAG", "message")
            startActivity(intent)



        }

        button?.setOnClickListener()
        {





            val login = findViewById<EditText>(R.id.editTextTextPersonName).getText().toString();
if (login =="") {
    val toast = Toast.makeText(applicationContext, "You must enter your name", Toast.LENGTH_LONG)
    toast.show()
}
            else{
            val intent = Intent(this, Home::class.java)

            intent.putExtra("login",login)







            startActivity(intent)
}
        }

}
}