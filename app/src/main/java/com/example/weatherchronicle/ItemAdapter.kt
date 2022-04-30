package com.example.weatherchronicle

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val itemList: ArrayList<Int>, private val context:Context):
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView:ImageView=itemView.findViewById(R.id.imageView)
        val textView:TextView=itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return ItemViewHolder(view)


    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item =itemList[position]
        holder.imageView.setImageResource(itemList[position])
       // holder.textView.text=item.Name

        holder.imageView.setOnClickListener {
            val intend = Intent(context,UserDetails::class.java)

            intend.putExtra("name","")
            intend.putExtra("gender","")
            intend.putExtra("location","")
            context.startActivity(intend)
        }
    }

    override fun getItemCount(): Int {
     return itemList.size
    }


}