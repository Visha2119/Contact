package com.example.weatherchronicle

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitHelper {
// private val client =OkHttpClient.Builder().build()
//
//    private val retrofit =Retrofit.Builder()
//        .baseUrl("https://randomuser.me/api/?results=10")
//        .addConverterFactory(GsonConverterFactory.create())
//        .client(client)
//        .build()
//
//    fun <T> buildService(service:Class<T>): T {
//        return retrofit.create(service)
//    }

    val baseUrl = "https://randomuser.me/api/?results=5000"




    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            // we need to add converter factory to
            // convert JSON object to Java object
            .build()

    }
    }
