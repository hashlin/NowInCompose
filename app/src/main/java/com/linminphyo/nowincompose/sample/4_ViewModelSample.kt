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


@Preview
@Composable
fun LiveDataSampleScreen() {
    // Get View Model Instance
    val viewModel = viewModel(SampleViewModel::class.java)

    // Convert Live Data to State
    val state = viewModel.viewState.observeAsState()

    // UI
    when (state.value) {
        Loading -> CircularProgressIndicator()
        Success -> Text(text = "Success. You got data.")
        Failure -> Button(onClick = { viewModel.retry() }) {
            Text(text = "Retry")
        }
    }
}
