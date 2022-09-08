package com.example.coffeeshop.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeeshop.R.id
import com.example.coffeeshop.R.layout
import com.example.coffeeshop.home.data.HomeItem
import com.example.coffeeshop.home.ui.HomeAdapter.ViewHolder

class HomeAdapter(
  private val list: List<HomeItem>,
  val clickCallBack: (HomeItem) -> Unit = {}
) : RecyclerView.Adapter<ViewHolder>() {
  class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView
    val textView: TextView

    init {
      imageView = itemView.findViewById(id.iv_photo)
      textView = itemView.findViewById(id.tv_product_name)
    }
  }

  override fun onCreateViewHolder(
    parent: ViewGroup,
    viewType: Int
  ): ViewHolder {
    val view = LayoutInflater.from(parent.context).inflate(layout.item, parent, false)
    val vh = ViewHolder(view)
    vh.itemView.setOnClickListener {
      clickCallBack(list[vh.adapterPosition])
    }
    return vh
  }

  override fun onBindViewHolder(
    holder: ViewHolder,
    position: Int
  ) {
    val item = list[position]
    holder.imageView.setImageResource(item.image)
    holder.textView.text = item.name
  }

  override fun getItemCount(): Int {
    return list.size
  }
}