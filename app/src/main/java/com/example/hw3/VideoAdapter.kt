package com.example.hw3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
//import com.example.hw3.databinding.YoutubeListItemBinding

class VideoAdapter(val context: Context): BaseAdapter() {
    var Video : List<VideoData> = listOf<VideoData>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
     //   var binding : YoutubeListItemBinding ?= null
     //   var itemView = convertView
     //   if(convertView == null){
      //      binding = DataBindingUtil.inflate(inflater,R.layout.youtube_list_item,parent,false)
       //     itemView = binding.root
        //    itemView.tag = binding
       // }else{
        //    binding = itemView?.tag as YoutubeListItemBinding

        //}
        //binding?.videoData = Video[position]
        val itemView = inflater.inflate(R.layout.youtube_list_item,null)
        val textView = itemView.findViewById<TextView>(R.id.video_title)
        val imageView = itemView.findViewById<ImageView>(R.id.img_thumbnail)
        textView.text = Video.get(position).title
        imageView.setImageBitmap(Video.get(position).thumbnail)

        return itemView
    }

    override fun getItem(position: Int): Any {
        return Video.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return Video.size

    }
}