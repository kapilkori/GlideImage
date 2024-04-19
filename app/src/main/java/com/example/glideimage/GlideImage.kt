package com.example.glideimage

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

object GlideImage {
    fun loadImage(context: Context, url: String, iv: ImageView) =
        Glide.with(context)
            .load(url)
            .into(iv)
}