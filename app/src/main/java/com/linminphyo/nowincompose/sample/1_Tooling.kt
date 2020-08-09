package com.linminphyo.nowincompose.sample


import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.layout.InnerPadding
import androidx.ui.material.Button
import androidx.ui.material.Checkbox
import androidx.ui.tooling.preview.Preview
import com.google.android.material.button.MaterialButtonToggleGroup












// 1. Preview

@Composable
fun GreetingView() {
    Text("Hello Compose")
}

















// 2. Interactive Mode
// 3. Instant Run Component
@Preview
@Composable
fun GreetingView2() {
    Button(onClick = { /* Action here */ }){
        Text(text = "Click Me")
    }
}