package com.example.expressyourselfdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val name = "Felix Njuguna"
        val yearOfBirth = 2003
        var currentYear = 2023
        val age:Int


        age = currentYear - yearOfBirth
        Log.i("Age:" , "$age")

        currentYear ++
        Log.i("info " , "$name was born in $yearOfBirth and is $age years old. " +
                "Next year he will be ${currentYear - yearOfBirth} years old")

        fun btnClick(v: View) {
            Toast.makeText(
                this,
                "$name was born in $yearOfBirth and is $age years old. \" +\n" +
                        "\"Next year he will be ${currentYear - yearOfBirth} years old",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}