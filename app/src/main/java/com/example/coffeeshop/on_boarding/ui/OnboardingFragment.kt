package com.example.coffeeshop.on_boarding.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.coffeeshop.R
import com.example.coffeeshop.SplashFragmentDirections
import com.example.coffeeshop.databinding.FragmentOnboardingBinding

class OnboardingFragment : Fragment() {
  lateinit var binding: FragmentOnboardingBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
  ): View {
    binding=FragmentOnboardingBinding.inflate(inflater)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)

    binding.btnRegister.setOnClickListener{goRegister()}
    binding.btnLogin.setOnClickListener{goLogin()}

  }

  fun goRegister(){
    findNavController().navigate(
      OnboardingFragmentDirections.actionOnboardingFragmentToRegisterFragment())
  }

  fun goLogin(){
    findNavController().navigate(
      OnboardingFragmentDirections.actionOnboardingFragmentToLoginFragment())
  }


}