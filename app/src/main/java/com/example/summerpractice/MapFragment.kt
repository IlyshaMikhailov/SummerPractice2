package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentMapBinding

class MapFragment : Fragment(R.layout.fragment_map) {
    private var binding: FragmentMapBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMapBinding.bind(view)
        binding?.button4?.setOnClickListener {
            findNavController().navigate(
                R.id.action_mapFragment_to_infoFragment,
                InfoFragment.createBundle(MapFragment().javaClass.name)
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}