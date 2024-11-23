import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kazemi.milad.android.jetpackpractiseinstagramprofileui.R
import kazemi.milad.android.jetpackpractiseinstagramprofileui.widgets.profile.Description
import kazemi.milad.android.jetpackpractiseinstagramprofileui.widgets.RoundImage
import kazemi.milad.android.jetpackpractiseinstagramprofileui.widgets.profile.StatSection

@Composable
fun ProfileSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        ) {
            RoundImage(
                image = painterResource(R.drawable.milad),
                modifier = Modifier
                    .size(100.dp)
                    .weight(3f)
            )
            Spacer(modifier = Modifier.width(16.dp))
            StatSection(modifier = Modifier.weight(7f))
        }
        Description(
            displayName = "programming mentor",
            description = "10 years of coding experience \n" +
            "Want me to make yout app? send me an email!",
            url = "miladkazemi748@gmail.com",
            flowedBy = listOf("codingflow", "miakhalifa"),
            otherCount = 17
        )
    }
}


