package com.example.coffeeshop

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.coffeeshop.R


class SplashFragment : Fragment(R.layout.fragment_splash) {
    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        Handler().postDelayed({
            goOnboarding()
        }, 3000)
        super.onViewCreated(view, savedInstanceState)

    }

    fun goOnboarding(){
        findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToOnboardingFragment())
    }

}