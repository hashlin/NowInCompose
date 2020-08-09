package com.linminphyo.nowincompose.sample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


sealed class ViewState {
    object Loading : ViewState()
    object Success : ViewState()
    object Failure : ViewState()
}



class SampleViewModel : ViewModel() {

    // Fail state initially
    val viewState = MutableLiveData<ViewState>(ViewState.Failure)

    fun retry() {
        // Loading on retry
        viewState.postValue(ViewState.Loading)

        viewModelScope.launch {
            // Wait for 2 seconds and Success
            delay(2_000)
            viewState.postValue(ViewState.Success)
        }
    }

}
