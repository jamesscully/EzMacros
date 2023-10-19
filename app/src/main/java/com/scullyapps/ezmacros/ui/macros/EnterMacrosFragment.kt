package com.scullyapps.ezmacros.ui.macros

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.scullyapps.ezmacros.R

class EnterMacrosFragment : Fragment() {

    companion object {
        fun newInstance() = EnterMacrosFragment()
    }

    private lateinit var viewModel: EnterMacrosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_enter_macros, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EnterMacrosViewModel::class.java)
        // TODO: Use the ViewModel
    }

}