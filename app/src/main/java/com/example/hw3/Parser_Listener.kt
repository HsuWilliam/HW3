package com.example.hw3

interface Parser_Listener {
    fun start()

    fun finish(video: List<VideoData>) {
    }
}