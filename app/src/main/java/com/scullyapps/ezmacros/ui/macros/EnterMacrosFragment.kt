package com.scullyapps.ezmacros.ui.macros

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.scullyapps.ezmacros.R
import com.scullyapps.ezmacros.databinding.FragmentEnterMacrosBinding

class EnterMacrosFragment : Fragment() {

    private lateinit var viewModel: EnterMacrosViewModel

    private var _binding: FragmentEnterMacrosBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEnterMacrosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}