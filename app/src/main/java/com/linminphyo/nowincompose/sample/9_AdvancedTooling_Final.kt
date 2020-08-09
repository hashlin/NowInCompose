package com.linminphyo.nowincompose.sample


import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.*
import androidx.ui.graphics.ImageAsset
import androidx.ui.layout.*
import androidx.ui.layout.RowScope.weight
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Bookmark
import androidx.ui.material.icons.filled.BookmarkBorder
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Devices
import androidx.ui.tooling.preview.Preview
import androidx.ui.tooling.preview.PreviewParameter
import androidx.ui.tooling.preview.PreviewParameterProvider
import androidx.ui.tooling.preview.datasource.CollectionPreviewParameterProvider
import androidx.ui.unit.dp
import com.google.android.material.button.MaterialButtonToggleGroup
import com.linminphyo.nowincompose.R
import com.linminphyo.nowincompose.ui.NowInComposeTheme


@Preview( group = "dark")
@Preview(widthDp = 600, group = "dark" )
@Composable
fun PostsPreviewFinal() {
    ThemedPreview {
        PostCardSimple(post = post)
    }
}



@Preview(group = "light")
@Preview(widthDp = 600, group = "light" )
@Composable
fun PostsPreviewDarkFinal(isSystemDarkTheme: Boolean) {
    ThemedPreview(isSystemDarkTheme = isSystemDarkTheme) {
        PostCardSimple(post = post)
    }
}