package com.linminphyo.nowincompose.sample

import android.graphics.Rect
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.drawLayer
import androidx.ui.core.drawShadow
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.drawBackground
import androidx.ui.foundation.drawBorder
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.RectangleShape
import androidx.ui.layout.height
import androidx.ui.layout.padding
import androidx.ui.layout.width
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.linminphyo.nowincompose.R

@Preview
@Composable
fun ModifierFinal() {
    Image(
        asset = imageResource(id = R.drawable.droidyangon),
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .drawBackground(Color.Yellow)
            .drawBorder(4.dp, Color.Red, RoundedCornerShape(8.dp))
            .padding(10.dp)
            .drawBorder(4.dp, Color.Blue, CircleShape)
            .padding(4.dp)
            .clip(CircleShape)
    )
}