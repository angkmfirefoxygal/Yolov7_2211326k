package com.example.pratice

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pratice.databinding.ActivityMainBinding
import com.example.pratice.databinding.ActivitySongBinding


class SongActivity : AppCompatActivity(){

    lateinit var binding : ActivitySongBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}