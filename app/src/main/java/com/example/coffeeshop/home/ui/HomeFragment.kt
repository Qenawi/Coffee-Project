package com.example.coffeeshop.home.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coffeeshop.home.data.HomeItem
import com.example.coffeeshop.R
import com.example.coffeeshop.R.drawable
import com.example.coffeeshop.home.view_model.HomeViewModel

class HomeFragment : Fragment(R.layout.fragment_home) {
  private val homeViewModel: HomeViewModel by viewModels()
  private lateinit var adapter: HomeAdapter
  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)
    val layoutManager = LinearLayoutManager(context)
    val recyclerView = view.findViewById<RecyclerView>(R.id.productRv)
    recyclerView.layoutManager = layoutManager
    recyclerView.setHasFixedSize(true)
    adapter = HomeAdapter(homeViewModel.getAdapterList()){
      onItemClicked(it)
    }
    recyclerView.adapter = adapter
  }


  private fun onItemClicked(item:HomeItem)
  {

    Toast.makeText(requireContext(), item.toString(), Toast.LENGTH_SHORT).show()

  }
}