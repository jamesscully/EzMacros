package com.scullyapps.ezmacros.ui.weight

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class EnterWeightFragmentUiState(
    var weight : Double = 0.0,
    var unitType : Boolean = false
)

class EnterWeightViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private val _uiState = MutableStateFlow(EnterWeightFragmentUiState())
    val uiState : StateFlow<EnterWeightFragmentUiState> = _uiState.asStateFlow()

}