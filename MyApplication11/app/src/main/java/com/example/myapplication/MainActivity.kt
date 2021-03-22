package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var n = 0
        seven.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("7")
            }else{
                var n7 = show.text.toString().plus(7)
                show.setText(n7)
            }
        }
        eight.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("8")
            }else{
                var n8 = show.text.toString().plus(8)
                show.setText(n8)
            }
        }
        nine.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("9")
            }else{
                var n9 = show.text.toString().plus(9)
                show.setText(n9)
            }
        }
        four.setOnClickListener {
            var str = show.text.toString().plus(4)
            show.setText(str)
        }
        five.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("5")
            }else{
                var n5 = show.text.toString().plus(5)
                show.setText(n5)
            }
        }
        six.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("6")
            }else{
                var n6 = show.text.toString().plus(6)
                show.setText(n6)
            }
        }
        one.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("1")
            }else{
                var n1 = show.text.toString().plus(1)
                show.setText(n1)
            }
        }
        two.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("2")
            }else{
                var n2 = show.text.toString().plus(2)
                show.setText(n2)
            }
        }
        three.setOnClickListener {
            if (show.text.toString()== "0"){
                show.setText("3")
            }else{
                var n3 = show.text.toString().plus(3)
                show.setText(n3)
            }
        }

            zero.setOnClickListener {
                if (show.text.toString()== "0"){
                    show.setText("0")
                }else{
                    var n0 = show.text.toString().plus(0)
                    show.setText(n0)
                }

        }

       del.setOnClickListener{
           var text =
               show.text.toString()
           if (text.isNotEmpty()) {
               show.text=text.dropLast(1)
           }
       }
        C.setOnClickListener{
                show.setText("0")

        }



    }


}
