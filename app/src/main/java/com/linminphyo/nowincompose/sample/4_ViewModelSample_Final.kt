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
fun LiveDataSampleScreenFinal() {
    val viewModel = viewModel(SampleViewModel::class.java)

    val state = viewModel.viewState.observeAsState()

    when (state.value) {
        Loading -> CircularProgressIndicator()
        Success -> Text(text = "You got data")
        Failure -> Button(onClick = { viewModel.retry() }) {
            Text(text = "Retry")
        }
    }
}
