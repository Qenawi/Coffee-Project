package com.example.coffeeshop.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeeshop.Data.Item
import com.example.coffeeshop.ItemAdapter
import com.example.coffeeshop.R

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var recyclerView: RecyclerView
    private lateinit var coffeList: ArrayList<Item>
    private lateinit var adapter: ItemAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager=LinearLayoutManager(context)
        recyclerView= view.findViewById(R.id.productRv)
        recyclerView.layoutManager=layoutManager
        recyclerView.setHasFixedSize(true)
        coffeList=ArrayList<Item>()
        coffeList.add(Item(R.drawable.ic_espresso,"Espresso"))
        coffeList.add(Item(R.drawable.ic_cappuccino,"Cappuccino"))
        coffeList.add(Item(R.drawable.ic_macciato,"Macciato"))
        coffeList.add(Item(R.drawable.ic_mocha,"Mocha"))
        coffeList.add(Item(R.drawable.ic_latte,"Latte"))
        coffeList.add(Item(R.drawable.ic_espresso,"Espresso"))
        coffeList.add(Item(R.drawable.ic_espresso,"Espresso"))
        coffeList.add(Item(R.drawable.ic_espresso,"Espresso"))
        coffeList.add(Item(R.drawable.ic_espresso,"Espresso"))
        coffeList.add(Item(R.drawable.ic_espresso,"Espresso"))
        coffeList.add(Item(R.drawable.ic_espresso,"Espresso"))
        coffeList.add(Item(R.drawable.ic_espresso,"Espresso"))
        Toast.makeText(context,"${coffeList.size}", Toast.LENGTH_LONG).show()
        adapter= ItemAdapter(coffeList)
        recyclerView.adapter=adapter
    }

}