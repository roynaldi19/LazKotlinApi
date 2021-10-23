package com.roynaldi19.lazkotlinapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.roynaldi19.lazkotlinapi.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var detailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        supportActionBar!!.title = intent.getStringExtra("title")

        Glide.with(this).load(intent.getStringExtra("image")).centerCrop()
            .into(detailBinding.imageView)
    }
}