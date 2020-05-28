package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        function1()
    }
    private fun function1()
    {
        val lallo : List<View> = listOf(textView,textView2,textView3,textView4,textView5,textView6,textView7,lallo)
        for ( item in lallo ) { item.setOnClickListener {function2(it)} }
    }
    private fun function2(view: View)
    {
        when(view.id)
        {
            R.id.textView -> view.setBackgroundColor(Color.DKGRAY)
            R.id.textView2 -> view.setBackgroundColor(Color.GRAY)
            R.id.textView3 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.textView4 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.textView5 -> view.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.textView6 -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            else -> view.setBackgroundResource(android.R.color.holo_red_dark)
        }
    }
}
