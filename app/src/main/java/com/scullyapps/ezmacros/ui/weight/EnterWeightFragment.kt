package com.scullyapps.ezmacros.ui.weight

import androidx.fragment.app.viewModels
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.scullyapps.ezmacros.databinding.FragmentEnterWeightBinding

val TAG = "EnterWeightFragment"
class EnterWeightFragment : Fragment() {

    companion object {
        fun newInstance() = EnterWeightFragment()
    }

    private val viewModel: EnterWeightViewModel by viewModels()

    private var _binding: FragmentEnterWeightBinding? = null
    private val b get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEnterWeightBinding.inflate(inflater, container, false)
        val view = b.root
        return view
    }

    override fun onStart() {
        super.onStart()

        // Weight limit in KG
        val WEIGHT_LIMIT = 200

        b.lblWeightUnitDisplay.text = "kg"
        b.inputWeightNumber.setText(viewModel.uiState.value.weight.toString())
        b.inputWeightNumber.addTextChangedListener { text ->

            val number : Double = text.toString().toDoubleOrNull() ?: 0.0

            if(number > WEIGHT_LIMIT) {
                b.inputWeightNumber.setText("$WEIGHT_LIMIT")
                b.inputWeightNumber.setSelection(WEIGHT_LIMIT.toString().length)
            }

            viewModel.uiState.value.weight = number

            Log.i(TAG, "onCreateView: Text is now $text")
        }

        b.btnSubmitWeight.setOnClickListener {
            Toast.makeText(context, "Number is: ${viewModel.uiState.value.weight}", Toast.LENGTH_LONG).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}