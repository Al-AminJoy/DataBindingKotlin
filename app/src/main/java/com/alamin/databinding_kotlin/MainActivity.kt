package com.alamin.databinding_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alamin.databinding_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);

        val myUser = User("Al-Amin","Joy",25,true);
        binding.user = myUser
    }
}