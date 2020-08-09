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


@Preview
@Preview(widthDp = 500)
@Composable
fun PostsPreview() {
    ThemedPreview {
        PostCardSimple(post = post)
    }
}


@Preview
@Preview(widthDp = 500)
@Composable
fun LightPostsPreview() {
    ThemedPreview(isSystemDarkTheme = false) {
        PostCardSimple(post = post)
    }
}










@Composable
fun ThemedPreview(isSystemDarkTheme : Boolean = true, content: @Composable() () -> Unit) {
    NowInComposeTheme(isSystemDarkTheme) {
        Surface(color = MaterialTheme.colors.surface, modifier = Modifier.fillMaxWidth(), content = content)
    }
}























val publication = Publication(
    "Android Developers",
    "https://cdn-images-1.medium.com/max/258/1*u7oZc2_5mrkcFaxkXEyfYA@2x.png"
)

val manuel = PostAuthor("Manuel Vivo", "https://medium.com/@manuelvicnt")




val post = Post(
    id = "7446d8dfd7dc",
    title = "Dagger in Kotlin: Gotchas and Optimizations",
    subtitle = "Use Dagger in Kotlin! This article includes best practices to optimize your build time and gotchas you might encounter.",
    url = "https://medium.com/androiddevelopers/dagger-in-kotlin-gotchas-and-optimizations-7446d8dfd7dc",
    publication = publication,
    metadata = Metadata(
        author = manuel,
        date = "July 30",
        readTimeMinutes = 3
    )
)




@Composable
fun AuthorAndReadTime(
    post: Post,
    modifier: Modifier = Modifier
) {
    Row(modifier) {
        ProvideEmphasis(EmphasisAmbient.current.medium) {
            val textStyle = MaterialTheme.typography.body2
            Text(
                text = post.metadata.author.name,
                style = textStyle
            )
            Text(
                text = " - ${post.metadata.readTimeMinutes} min read",
                style = textStyle
            )
        }
    }
}

@Composable
fun PostImage(post: Post, modifier: Modifier = Modifier) {
    val image = imageResource(R.drawable.placeholder_1_1)
    Image(
        asset = image,
        modifier = modifier
            .preferredSize(40.dp, 40.dp)
            .clip(MaterialTheme.shapes.small)
    )
}

@Composable
fun PostTitle(post: Post) {
    ProvideEmphasis(EmphasisAmbient.current.high) {
        Text(post.title, style = MaterialTheme.typography.subtitle1)
    }
}

@Composable
fun PostCardSimple(post: Post) {
    Row(
        modifier = Modifier.padding(16.dp).fillMaxWidth()
    ) {
        PostImage(post, Modifier.padding(end = 16.dp))
        Column(modifier = Modifier.weight(1f)) {
            PostTitle(post)
            AuthorAndReadTime(post)
        }
        BookmarkButton()
    }
}


@Composable
fun BookmarkButton(
    isBookmarked: Boolean = false,
    onBookmark: (Boolean) -> Unit = { },
    modifier: Modifier = Modifier
) {
    IconToggleButton(
        checked = isBookmarked,
        onCheckedChange = onBookmark
    ) {
        modifier.fillMaxSize()
        if (isBookmarked) {
            Icon(
                asset = Icons.Filled.Bookmark,
                modifier = modifier
            )
        } else {
            Icon(
                asset = Icons.Filled.BookmarkBorder,
                modifier = modifier
            )
        }
    }
}



data class Post(
    val id: String,
    val title: String,
    val subtitle: String? = null,
    val url: String,
    val publication: Publication? = null,
    val metadata: Metadata
)

data class Metadata(
    val author: PostAuthor,
    val date: String,
    val readTimeMinutes: Int
)

data class PostAuthor(
    val name: String,
    val url: String? = null
)

data class Publication(
    val name: String,
    val logoUrl: String
)

data class Paragraph(
    val type: ParagraphType,
    val text: String,
    val markups: List<Markup> = emptyList()
)

data class Markup(
    val type: MarkupType,
    val start: Int,
    val end: Int,
    val href: String? = null
)

enum class MarkupType {
    Link,
    Code,
    Italic,
    Bold,
}

enum class ParagraphType {
    Title,
    Caption,
    Header,
    Subhead,
    Text,
    CodeBlock,
    Quote,
    Bullet,
}
