package com.example.thirdemptygithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thirdemptygithub.databinding.ActivityMainBinding
import com.example.thirdemptygithub.utilities.MyClass1
import com.example.thirdemptygithub.utilities.MyClass2

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val myClass1 = MyClass1()
        val myClass2 = MyClass2()
        myClass1.saySomething()
        myClass2.saySomething()

    }
}