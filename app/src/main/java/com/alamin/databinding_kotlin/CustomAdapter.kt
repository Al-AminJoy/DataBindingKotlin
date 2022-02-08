package com.alamin.databinding_kotlin

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("loadImageFromUrl","setPercentage")
fun ImageView.loadImageFromUrl(photoUrl:String,percent:Int){
    if (percent>10){
        this.load(photoUrl);
    }
}

@BindingAdapter("setMyViewVisiblity")
fun View.setMyViewVisiblity(points: Int){
    if (points > 10){
        this.visibility = View.INVISIBLE;
    }
}

@BindingAdapter("setMyText")
fun TextView.setMyText(text : String){
    this.text = "First Name : "+text;
}