package com.example.weatherchronicle

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserDetails:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_details)

        val name=findViewById<TextView>(R.id.name)
        val gender =findViewById<TextView>(R.id.gender)
        val location=findViewById<TextView>(R.id.location)

        val extract = intent.extras
        val namevalue = extract?.get("name")
        val gendervalue = extract?.get("gender")
        val locationvalue=extract?.get("location")

        name.text = namevalue.toString()
        gender.text = gendervalue.toString()

        location.text=locationvalue.toString()


    }
}