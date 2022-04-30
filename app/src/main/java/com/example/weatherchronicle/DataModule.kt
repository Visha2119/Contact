package com.example.weatherchronicle

data class WeatherList(
    val gender:String,
    val name:Name,
    val location:Location,

)

data class Name(
    val title:String,
    val first: String,
    val last:String
)

data class Location(
    val street:Street
    )

data class Street(
    val city:String,
    val state:String,
    val country:String
)

data class ResultList(
    val results: List<WeatherList>,
)