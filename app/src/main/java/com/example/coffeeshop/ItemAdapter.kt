package com.example.coffeeshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeeshop.Data.Item


class ItemAdapter(val list:ArrayList<Item>) :RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        var imageView:ImageView
        var textView:TextView
        var imageView2:ImageView
        init {
             imageView=itemView.findViewById(R.id.iv_photo)
             textView=itemView.findViewById(R.id.tv_product_name)
             imageView2=itemView.findViewById(R.id.iv_photogo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=list[position]
        holder.imageView.setImageResource(item.image)
        holder.textView.text=item.name
    }

    override fun getItemCount(): Int {
        return list.size
    }
}