import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kazemi.milad.android.jetpackpractiseinstagramprofileui.R
import kazemi.milad.android.jetpackpractiseinstagramprofileui.dataClasses.LabeledImage
import kazemi.milad.android.jetpackpractiseinstagramprofileui.widgets.ButtonSection
import kazemi.milad.android.jetpackpractiseinstagramprofileui.widgets.HighlightSection
import kazemi.milad.android.jetpackpractiseinstagramprofileui.widgets.PostSection
import kazemi.milad.android.jetpackpractiseinstagramprofileui.widgets.PostTabView

@Composable
fun ProfileScreen() {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                vertical = 24.dp,
                horizontal = 16.dp
            )
    ) {
        TopBar(name = "miladkaze m i748@gmail.com")
        Spacer(4)
        ProfileSection()
        Spacer(24)
        ButtonSection(modifier = Modifier.fillMaxWidth())
        Spacer(24)
        HighLights()
        Spacer(24)
        PostsTabView(selectedTabIndex)
    }
}

@Composable
private fun PostsTabView(selectedTabIndex: Int) {
    var selectedTabIndex1 = selectedTabIndex
    PostTabView(
        labeledImages = listOf(
            LabeledImage(
                image = painterResource(id = R.drawable.grid),
                label = "posts"
            ),
            LabeledImage(
                image = painterResource(id = R.drawable.reels),
                label = "Reels"
            ),
            LabeledImage(
                image = painterResource(id = R.drawable.igtv),
                label = "IGTV"
            ),
            LabeledImage(
                image = painterResource(id = R.drawable.profile),
                label = "Profile"
            ),
        )
    ) {
        selectedTabIndex1 = it
    }
    when (selectedTabIndex1) {
        0 -> PostSection(
            posts = listOf(
                painterResource(id = R.drawable.post_5),
                painterResource(id = R.drawable.post_5),
                painterResource(id = R.drawable.post_5),
                painterResource(id = R.drawable.post_5),
                painterResource(id = R.drawable.post_5),
                painterResource(id = R.drawable.post_5),
                painterResource(id = R.drawable.post_5),
                painterResource(id = R.drawable.post_5),
            ), modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun HighLights() {
    HighlightSection(
        highLights = listOf(
            LabeledImage(
                image = painterResource(id = R.drawable.youtube),
                label = "youtube"
            ),
            LabeledImage(
                image = painterResource(id = R.drawable.discord),
                label = "discord"
            ),
            LabeledImage(
                image = painterResource(id = R.drawable.facebook),
                label = "facebook"
            ),
            LabeledImage(
                image = painterResource(id = R.drawable.stackoverflow),
                label = "stack overflow"
            )

        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
private fun Spacer(height: Int) {
    Spacer(modifier = Modifier.height(height.dp))
}
