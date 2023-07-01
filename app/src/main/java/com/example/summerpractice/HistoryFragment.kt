package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment(R.layout.fragment_history) {
    private var binding: FragmentHistoryBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHistoryBinding.bind(view)
        binding?.button6?.setOnClickListener {
            findNavController().navigate(
                R.id.action_historyFragment_to_infoFragment,
                InfoFragment.createBundle(HistoryFragment().javaClass.name)
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}