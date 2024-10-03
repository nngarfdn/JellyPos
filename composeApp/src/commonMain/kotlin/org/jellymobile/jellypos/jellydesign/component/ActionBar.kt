package org.jellymobile.jellypos.jellydesign.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import org.jellymobile.jellypos.jellydesign.themes.MontserratSemiBold

@Composable
fun JellyActionBar(title: String) {
    TopAppBar(
        backgroundColor = Color.White,
    ) {
        // Center the title
        Text(
            text = title,
            modifier = Modifier.fillMaxWidth(),
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = MontserratSemiBold(),
            textAlign = TextAlign.Center
        )
    }
}