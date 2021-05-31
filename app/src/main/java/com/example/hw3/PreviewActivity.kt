package com.example.hw3

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.hw3.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {
    private var title: String?= null
    private var description:String?=null
    private var image: Bitmap?=null
    private lateinit var binding: ActivityPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_preview)
        val intent = getIntent()
        title = intent.getStringExtra("title")
        description = intent.getStringExtra("description")
        val byteArray = getIntent().getByteArrayExtra("image")
        //image = intent.getParcelableExtra("image")
        //val textView = findViewById<TextView>(R.id.textView_title)
        binding.title= title
        //val description_str = findViewById<TextView>(R.id.textView_description)
        binding.description = description
        if (byteArray != null) {
            image = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
        };
        binding.thumbnail = image
    }
}