package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var binding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding?.button5?.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainFragment_to_infoFragment,
                InfoFragment.createBundle(MainFragment().javaClass.name)
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}