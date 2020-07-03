package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "йойойо", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
        var count: Int
        try {
            val countString = textView4.text.toString()
            count = Integer.parseInt(countString)
        } catch (e: Exception) {
            count = 0
        }
        count++
        textView4.text = count.toString()
    }

    fun randomMe (view: View) {

        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        var count: Int
        try {
            val countString = textView4.text.toString()
            count = Integer.parseInt(countString)
        } catch (e: Exception) {
            count = 22
        }

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)
    }
}
