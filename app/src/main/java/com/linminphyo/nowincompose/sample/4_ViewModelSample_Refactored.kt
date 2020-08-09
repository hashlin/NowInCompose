package com.linminphyo.nowincompose.sample

import androidx.compose.Composable
import androidx.compose.State
import androidx.compose.state
import androidx.ui.foundation.Text
import androidx.ui.layout.Row
import androidx.ui.livedata.observeAsState
import androidx.ui.material.Button
import androidx.ui.material.CircularProgressIndicator
import androidx.ui.material.Switch
import androidx.ui.tooling.preview.Preview
import androidx.ui.viewmodel.viewModel
import com.linminphyo.nowincompose.sample.ViewState.*

@Composable
fun LiveDataSampleScreenRefactored() {
    val viewModel = viewModel(SampleViewModel::class.java)

    val state = viewModel.viewState.observeAsState()

    LiveDataSampleUI(state = state.value, onRetry = { viewModel.retry() } )
}

@Composable
fun LiveDataSampleUI(state : ViewState?, onRetry : () -> Unit){
    when (state) {
        Loading -> CircularProgressIndicator()
        Success -> Text(text = "You got data")
        Failure -> Button(onClick = { onRetry() }) {
            Text(text = "Retry")
        }
    }
}


@Preview
@Composable
fun LoadingPreview() {
    LiveDataSampleUI(state = ViewState.Loading, onRetry = { })
}



@Preview
@Composable
fun SuccessPreview() {
    LiveDataSampleUI(state = ViewState.Success, onRetry = { })
}


@Preview
@Composable
fun FailurePreview() {
    LiveDataSampleUI(state = ViewState.Failure, onRetry = { })
}