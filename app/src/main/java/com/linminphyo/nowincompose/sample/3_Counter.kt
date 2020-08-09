package com.linminphyo.nowincompose.sample

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.foundation.Text
import androidx.ui.layout.Row
import androidx.ui.layout.Spacer
import androidx.ui.material.Button
import androidx.ui.tooling.preview.Preview








// 1. State
// Value holder
// Recompose on value changes



















@Preview
@Composable
fun Counter() {
    val count = state { 0 }
    Row(verticalGravity = Alignment.CenterVertically) {
        Button(onClick = { --count.value }) { Text(text = "-") }
        Text(text = "${count.value}")
        Button(onClick = { ++count.value  }) { Text(text = "+") }
    }
}










