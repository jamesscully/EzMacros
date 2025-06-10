package com.scullyapps.ezmacros.ui.weight

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.scullyapps.ezmacros.R
import com.scullyapps.ezmacros.databinding.FragmentEnterWeightBinding

class EnterWeightFragment : Fragment() {

    companion object {
        fun newInstance() = EnterWeightFragment()
    }

    private val viewModel: EnterWeightViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = FragmentEnterWeightBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_enter_weight, container, false)
    }
}