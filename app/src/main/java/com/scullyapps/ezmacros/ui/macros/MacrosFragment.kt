package com.scullyapps.ezmacros.ui.macros

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.scullyapps.ezmacros.databinding.FragmentMacrosBinding

class MacrosFragment : Fragment() {

    private var _binding: FragmentMacrosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(MacrosViewModel::class.java)

        _binding = FragmentMacrosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.button2.setOnClickListener { b ->
            val action = MacrosFragmentDirections.actionNavigationMacrosToEnterMacrosFragment()
            b.findNavController().navigate(action)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}