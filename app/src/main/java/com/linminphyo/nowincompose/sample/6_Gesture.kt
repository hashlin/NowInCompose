package com.linminphyo.nowincompose.sample

import android.util.Log
import androidx.animation.Spring
import androidx.animation.spring
import androidx.animation.tween
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.animation.animate
import androidx.ui.core.Direction
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.drawLayer
import androidx.ui.core.drawShadow
import androidx.ui.core.gesture.DragObserver
import androidx.ui.core.gesture.dragGestureFilter
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.geometry.Offset
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.linminphyo.nowincompose.R











@Preview
@Composable
fun GestureSample() {

    Box(gravity = ContentGravity.Center,
        modifier = Modifier.fillMaxSize()){
        Image(
            asset = imageResource(id = R.drawable.droidyangon),
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .clip(CircleShape)
        )
    }
}









//
//val dragObserver = object : DragObserver {
//    override fun onDrag(dragDistance: Offset): Offset {
//        return super.onDrag(dragDistance)
//    }
//
//    override fun onStop(velocity: Offset) {
//        super.onStop(velocity)
//    }
//}







// .drawLayer(rotationY = rotateState)



//.dragGestureFilter(
//dragObserver = dragObserver,
//canDrag = { direction -> direction == Direction.LEFT || direction == Direction.RIGHT }
//)