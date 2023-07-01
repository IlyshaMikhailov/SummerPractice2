package com.example.summerpractice

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice.databinding.FragmentSettingsBinding

class SettingFragment : Fragment(R.layout.fragment_settings) {
    private var binding: FragmentSettingsBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)
        binding?.button3?.setOnClickListener {
            findNavController().navigate(
                R.id.action_settingFragment_to_infoFragment,
                InfoFragment.createBundle(SettingFragment().javaClass.name)
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}