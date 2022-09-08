package com.example.coffeeshop.home.view_model

import androidx.lifecycle.ViewModel
import com.example.coffeeshop.R.drawable
import com.example.coffeeshop.home.data.HomeItem

class HomeViewModel : ViewModel() {
  fun getAdapterList(): List<HomeItem> {
    val coffeList = ArrayList<HomeItem>()
    coffeList.add(HomeItem(drawable.ic_espresso, "Espresso"))
    coffeList.add(HomeItem(drawable.ic_cappuccino, "Cappuccino"))
    coffeList.add(HomeItem(drawable.ic_macciato, "Macciato"))
    coffeList.add(HomeItem(drawable.ic_mocha, "Mocha"))
    coffeList.add(HomeItem(drawable.ic_latte, "Latte"))
    coffeList.add(HomeItem(drawable.ic_espresso, "Espresso"))
    coffeList.add(HomeItem(drawable.ic_espresso, "Espresso"))
    coffeList.add(HomeItem(drawable.ic_espresso, "Espresso"))
    coffeList.add(HomeItem(drawable.ic_espresso, "Espresso"))
    coffeList.add(HomeItem(drawable.ic_espresso, "Espresso"))
    coffeList.add(HomeItem(drawable.ic_espresso, "Espresso"))
    coffeList.add(HomeItem(drawable.ic_espresso, "Espresso"))
    return coffeList.toList()
  }
}