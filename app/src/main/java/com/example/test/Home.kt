package com.example.test
import java.time.LocalDateTime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if (intent != null){

            var login=intent.getStringExtra("login")

            val textView = findViewById<TextView>(R.id.textLogin)
            textView.setText("Welcome "+login).toString()
            val textViewValue = textView.text






            val current = LocalDateTime.now()

            val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
            val formatted = current.format(formatter)


            val date = findViewById<TextView>(R.id.textView7)
             date.setText(formatted)
           // val textViewValue = date.text




            // val textViewValue = textView.text





        }
    }
}