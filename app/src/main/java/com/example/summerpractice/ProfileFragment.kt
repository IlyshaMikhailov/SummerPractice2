package com.example.summerpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentProfile2Binding

class ProfileFragment : Fragment(R.layout.fragment_profile2) {
    private var binding: FragmentProfile2Binding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfile2Binding.bind(view)
        binding?.button?.setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_infoFragment,InfoFragment.createBundle(ProfileFragment().javaClass.name))
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}