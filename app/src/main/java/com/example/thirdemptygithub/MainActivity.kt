package com.example.thirdemptygithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thirdemptygithub.databinding.ActivityMainBinding
import com.example.thirdemptygithub.utilities.MyClass11
import com.example.thirdemptygithub.utilities.MyClass12

class MainActivity : AppCompatActivity() {
    private lateinit var binding1: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding1 = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding1.root)
        val myClass1 = MyClass11()
        myClass1.saySomething()
        val myClass2 = MyClass12()
        myClass2.saySomething()

//        var myArray1: IntArray
//        var intent1 =  parent


    }
}

