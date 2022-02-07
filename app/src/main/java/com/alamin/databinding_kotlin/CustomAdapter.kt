package com.alamin.databinding_kotlin

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("loadImageFromUrl","setPercentage")
fun ImageView.loadImageFromUrl(photoUrl:String,percent:Int){
    if (percent>10){
        this.load(photoUrl);
    }
}