package com.example.summerpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentInfoBinding
import com.example.summerpractice.databinding.FragmentProfile2Binding
import com.google.android.material.snackbar.Snackbar

class InfoFragment : Fragment(R.layout.fragment_info) {
    private var binding: FragmentInfoBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInfoBinding.bind(view)
        val name = arguments?.getString(ARG_NAME)
        if (name != null) {
            Snackbar.make(binding!!.root, name, Snackbar.LENGTH_LONG).show()
        }
        binding?.button2?.setOnClickListener {
            findNavController().navigateUp()
        }


    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    companion object {
        private const val ARG_NAME = "ARG_NAME"
        fun createBundle(name: String): Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_NAME, name)
            return bundle
        }
    }
}