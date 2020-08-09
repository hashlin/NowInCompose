package com.linminphyo.nowincompose.sample

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.foundation.lazy.LazyColumnItems
import androidx.ui.layout.Column
import androidx.ui.tooling.preview.Preview

@Preview
@Composable
fun LoopText() {
    Column {
        (1..5).forEach {
            Text("No. $it")
        }
    }
}

@Preview
@Composable
fun RecyclingViews() {
    LazyColumnItems(items = (1..500).toList()) {
        Text("No. $it")
    }
}