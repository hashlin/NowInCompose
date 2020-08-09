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











// 1. What is modifier?
// Elements that decorate or add behavior to Compose UI elements



















// 2. Which kind of decoration, behavior?
// a. Size
// b. Padding
// c. Background
// d. Shadow
// e. Rotations
// f. User Interactions
// and more

















// 3. Multiple modifiers can be applied at the same time.
// They applied in an order way.

















// 3. Makes : R.drawable.sample_modifier
@Preview
@Composable
fun ModifierFinalResultPreview() {
    Image(
        imageResource(id = R.drawable.sample_modifier),
        modifier = Modifier.width(100.dp).height(100.dp)
    )
}















@Preview
@Composable
fun ModifierSample() {
    Image(asset = imageResource(id = R.drawable.droidyangon),
        modifier = Modifier.width(100.dp).height(100.dp)
            .drawBackground(Color.Yellow)
            .drawBorder(4.dp, Color.Red, RoundedCornerShape(8.dp))
            .padding(16.dp)
            .drawBorder(4.dp, Color.Blue, CircleShape)
            .padding(4.dp)
            .clip(CircleShape)
            .drawLayer(rotationZ =  -45f)
    )
}





