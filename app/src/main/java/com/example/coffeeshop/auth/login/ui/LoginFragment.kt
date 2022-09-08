package com.example.coffeeshop.auth.login.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.coffeeshop.R

class LoginFragment : Fragment(R.layout.fragment_login) {

  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)
    //val loginBtn = view.findViewById<Button>(R.id.btn_login)
    /*loginBtn.setOnClickListener {
      findNavController().navigate(
        LoginFragmentDirections.actionLoginFragmentToHomeFragment()
      )
    }*/
  }
}