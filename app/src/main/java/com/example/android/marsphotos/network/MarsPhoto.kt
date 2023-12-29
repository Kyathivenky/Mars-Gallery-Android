package com.example.android.marsphotos.network

data class MarsPhoto(val id: String, @json(name = "img_src") val imgSrcUrl : String)