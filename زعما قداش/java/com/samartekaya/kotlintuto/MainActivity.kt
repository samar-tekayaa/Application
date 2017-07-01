package com.samartekaya.kotlintuto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultat = findViewById(R.id.resultat) as TextView
        val Button_add = findViewById(R.id.button_add) as Button
        val Button_minus = findViewById(R.id.button_minus) as Button
        val Button_multiple=findViewById(R.id.button_multiple) as Button
        val Button_divide = findViewById(R.id.button_divide) as Button


        fun getNum1():Int{
            val input_num1=findViewById(R.id.editText_num1) as EditText
            return Integer.parseInt(input_num1.text.toString())
        }

        fun getNum2():Int{
            val input_num2=findViewById(R.id.editText_num2) as EditText
            return Integer.parseInt(input_num2.text.toString())
        }


        Button_add.setOnClickListener(View.OnClickListener{
        View -> resultat.text =( getNum1()+ getNum2()).toString()

        })

        Button_minus.setOnClickListener(View.OnClickListener{
            View -> resultat.text =( getNum1()- getNum2()).toString()

        })

        Button_multiple.setOnClickListener(View.OnClickListener{
            View -> resultat.text =( getNum1()* getNum2()).toString()

        })


        Button_divide.setOnClickListener(View.OnClickListener{
            View -> resultat.text =( getNum1()/ getNum2()).toString()

        })
    }
}
