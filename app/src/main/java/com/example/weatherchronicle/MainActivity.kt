package com.example.weatherchronicle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.weatherchronicle.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    //lateinit var  binding: ActivityMainBinding

    private lateinit var recyclerView: RecyclerView

    private lateinit var itemList: ArrayList<Int>



    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val weatherApi = RetrofitHelper.getInstance().create(WeatherApi::class.java)
        val call =weatherApi.getWeather()

        call.enqueue(object : retrofit2.Callback<MutableList<ResultList>>{
            override fun onResponse(
                call: Call<MutableList<ResultList>>,
                response: Response<MutableList<ResultList>>
            ) {
                if(response.isSuccessful){

                }
            }

            override fun onFailure(call: Call<MutableList<ResultList>>, t: Throwable) {

            }

        })




        // launching a new coroutine
//        GlobalScope.launch {
//            val result = weatherApi.getWeather()
//            if (result.isSuccessful)
//            // Checking the results
//                Log.d("ali: ", result.body().toString())
//            else
//                Log.d("ali not succ: ", result.body().toString())
//        }

        init()
    }

    private fun init() {
        itemList = ArrayList()

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        addToList()
        itemAdapter = ItemAdapter(itemList,this)



        recyclerView.adapter = itemAdapter
    }


    private fun addToList() {
        itemList.add(R.drawable.img1)
        itemList.add(R.drawable.img5)
        itemList.add(R.drawable.img2)
        itemList.add(R.drawable.img6)
        itemList.add(R.drawable.img3)
        itemList.add(R.drawable.img7)
        itemList.add(R.drawable.img4)
        itemList.add(R.drawable.img8)
        itemList.add(R.drawable.img6)
        itemList.add(R.drawable.img3)
        itemList.add(R.drawable.img7)
        itemList.add(R.drawable.img4)
        itemList.add(R.drawable.img8)
        itemList.add(R.drawable.img6)
        itemList.add(R.drawable.img3)
    }


}