package com.strong.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b_help.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("BMI說明")
                .setMessage("體重(kg)/身高的平方(m)")
                .setPositiveButton("OK",null)
                .show()
        }
    }

    fun bmi(view: View){
        val weight = ed_weight.text.toString().toFloat()
        val height = ed_hight.text.toString().toFloat()
        val bmi = weight / (height*height)
        Log.d("BMI",bmi.toString())
        Toast.makeText(this, bmi.toString(), Toast.LENGTH_LONG).show()

        AlertDialog.Builder(this)
            .setMessage(bmi.toString())
            .setTitle("Your BMI")
            .setPositiveButton("OK",null)
            .setNeutralButton("Cancel",null)
            .setNegativeButton("NO",null)
            .show()
    }
}