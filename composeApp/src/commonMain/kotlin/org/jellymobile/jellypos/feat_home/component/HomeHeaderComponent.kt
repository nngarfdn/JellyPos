package org.jellymobile.jellypos.feat_home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bythentest.cloudvideoapp.ui.theme.JellyTypography
import org.jellymobile.jellypos.Res
import org.jellymobile.jellypos.ic_profile
import org.jellymobile.jellypos.jellydesign.themes.BluePrimary
import org.jellymobile.jellypos.jellydesign.themes.FontColor
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomeHeaderComponent(
    modifier: Modifier = Modifier.padding(16.dp)
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Haloo, selamat datang",
                style = JellyTypography().subtitle2.copy(color = FontColor)
            )
            Text(
                text = "Batagor A’ Udin",
                style = JellyTypography().h6.copy(color = BluePrimary)
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = painterResource(Res.drawable.ic_profile),
            contentDescription = "Profile Picture",
            modifier = Modifier.size(40.dp),
            alignment = Alignment.Center
        )
    }
}