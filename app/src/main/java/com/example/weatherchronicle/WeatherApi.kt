package com.example.weatherchronicle

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET


interface WeatherApi {
    @GET("/api ")
    fun getWeather() : Call<MutableList<ResultList>>
}

