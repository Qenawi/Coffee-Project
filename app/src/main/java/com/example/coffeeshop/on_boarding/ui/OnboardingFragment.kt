package com.example.coffeeshop.on_boarding.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.coffeeshop.R
import com.example.coffeeshop.SplashFragmentDirections

class OnboardingFragment : Fragment(R.layout.fragment_onboarding) {

  override fun onViewCreated(
    view: View,
    savedInstanceState: Bundle?
  ) {
    super.onViewCreated(view, savedInstanceState)
    findNavController().navigate(
      OnboardingFragmentDirections.actionOnboardingFragmentToLoginFragment()
    )
  }
}