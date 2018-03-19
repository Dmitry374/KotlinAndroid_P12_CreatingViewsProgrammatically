package com.example.kotlinandroid_p12_creatingviewsprogrammatically

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var linearLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayout = findViewById(R.id.linearLayout)

    }

    @SuppressLint("SetTextI18n")
    fun createAndAddView(view: View){

        val textView = TextView(this)

        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)

        params.setMargins(0, 10, 0, 0)

        textView.layoutParams = params

        textView.text = "Generated programmatically"

        textView.textSize = 18F

        linearLayout.addView(textView)

    }

}
