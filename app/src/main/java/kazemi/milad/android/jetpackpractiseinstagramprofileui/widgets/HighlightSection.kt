package kazemi.milad.android.jetpackpractiseinstagramprofileui.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import kazemi.milad.android.jetpackpractiseinstagramprofileui.dataClasses.LabeledImage


@Composable
fun HighlightSection(
    modifier: Modifier = Modifier,
    highLights: List<LabeledImage>
) {
    LazyRow(modifier = modifier) {
        items(highLights.size) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(15.dp)
            ) {
                RoundImage(
                    image = highLights[it].image,
                    modifier = Modifier.size(70.dp)
                )
                Text(
                    modifier = Modifier.padding(vertical = 8.dp), text = highLights[it].label,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}