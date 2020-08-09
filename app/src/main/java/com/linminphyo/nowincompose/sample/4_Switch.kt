package com.linminphyo.nowincompose.sample

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.foundation.Text
import androidx.ui.layout.Row
import androidx.ui.material.Switch
import androidx.ui.tooling.preview.Preview








// 1. State
// Value holder
// Recompose on value changes


















@Preview
@Composable
fun SwitchSample() {
    val (isChecked, setChecked) = state { true }

    Row {
        Text(text = if (isChecked) "On" else "Off")
        Switch(checked = isChecked, onCheckedChange = setChecked)
    }
}

