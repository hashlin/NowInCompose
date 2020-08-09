package com.linminphyo.nowincompose.sample

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.foundation.lazy.LazyColumnItems
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.google.android.material.dialog.MaterialAlertDialogBuilder








// 1. Columns
@Composable
fun SampleColumns() {
    Column {
        Text("Hello Compose")
        Text("From Myanmar")
    }
}













// 2. Columns + Kotlin codes inside

@Composable
fun ColumnWithLoop() {
    Column {
        (1..5).forEach {
            Text("No. $it")
        }
    }
}




















// 3. Columns + Lazy Mode
@Preview
@Composable
fun LazyColumnSample() {
    LazyColumnItems(items = (1..100).toList()) {
        Text("No. $it")
    }
}