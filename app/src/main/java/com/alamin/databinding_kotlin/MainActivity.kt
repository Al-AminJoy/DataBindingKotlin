package com.alamin.databinding_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.ViewModelProvider
import com.alamin.databinding_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var myViewModel : MyViewModel;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);

       /* myViewModel = ViewModelProvider(this).get(MyViewModel::class.java);
        binding.viewModel = myViewModel;
        binding.lifecycleOwner = this;*/

        val myUser = User("Al-Amin",
            "Joy",
            25,
            true,
            "https://i.postimg.cc/nr0fMmS3/Logo.png");
        binding.user = myUser

     /*   binding.editText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) {
                myViewModel.setMessage(char.toString());
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })*/




    }
}