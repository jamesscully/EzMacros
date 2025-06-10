package com.scullyapps.ezmacros.ui.weight

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.scullyapps.ezmacros.databinding.FragmentWeightBinding

class WeightFragment : Fragment() {

    private var _binding: FragmentWeightBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(WeightViewModel::class.java)

        _binding = FragmentWeightBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.button.setOnClickListener {
            val action = WeightFragmentDirections.actionNavigationWeightToEnterWeightFragment()
            this.findNavController().navigate(action)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}