package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity()
{
    lateinit var y:ImageView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        y=findViewById(R.id.dice_image)
        val x:Button = findViewById(R.id.roll_button)
        x.setOnClickListener{ rolldice() }
    }

    private fun rolldice()
    {
        val randomnumber = Random.nextInt(6)+1
        val z = when(randomnumber)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        y.setImageResource(z)
        Toast.makeText(this,randomnumber.toString(),Toast.LENGTH_SHORT).show()

    }
}
