package me.rosuh.filepicker.engine

import android.content.Context
import android.net.Uri
import android.widget.ImageView
import com.squareup.picasso.Picasso

class PicassoEngine : ImageEngine {
    override fun loadImage(context: Context?, imageView: ImageView?, uri: Uri?, placeholder: Int) {
        Picasso.with(context)
            .load(uri)
            .fit()
            .centerCrop()
            .placeholder(placeholder)
            .into(imageView)
    }
}