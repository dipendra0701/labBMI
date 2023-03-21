package com.example.bmicalc

import android.content.ContentValues.TAG
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RatingBar
import com.example.bmicalc.databinding.ActivityRatingBinding

class Rating_activity : AppCompatActivity(), RatingBar.OnRatingBarChangeListener {
    private lateinit var binding: ActivityRatingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRatingBinding.inflate(layoutInflater)
        setContentView(binding.ratingbar)
        binding.ratingbar.setOnRatingBarChangeListener(this)
    }

    override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
        Log.d(TAG, "onRatingChanged: "+ ratingBar?.rating)
    }
}