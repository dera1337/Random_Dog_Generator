package com.example.randomdoggenerator.api

import retrofit2.Response
import retrofit2.http.GET

const val BASE_URL = "https://random.dog/"

//const val BASE_URL = "https://meme-api.herokuapp.com/"

interface ApiRequest {
    @GET("woof.json?ref=apilist.fun")
    suspend fun getRandomDog(): ApiData
}

//interface ApiRequest {
//    @GET("gimme")
//    suspend fun getRandomDog(): MemesData
//}

