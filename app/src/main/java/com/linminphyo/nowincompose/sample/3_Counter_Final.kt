package com.linminphyo.nowincompose.sample

import android.text.Layout
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.foundation.Text
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Row
import androidx.ui.material.Button
import androidx.ui.tooling.preview.Preview
import androidx.ui.tooling.preview.PreviewParameter
import androidx.ui.tooling.preview.PreviewParameterProvider



@Composable
fun CounterFinal(initialValue : Int) {
    val (count, setCount) = state { initialValue }

    Row(verticalGravity = Alignment.CenterVertically) {
        Button(onClick = { setCount(count - 1) }) { Text(text = "-") }
        Text(text = "$count")
        Button(onClick = { setCount(count + 1) }) { Text(text = "+") }
    }
}
