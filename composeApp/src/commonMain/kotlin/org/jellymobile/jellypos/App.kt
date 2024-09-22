package org.jellymobile.jellypos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jellymobile.jellypos.feat_home.component.BalanceCard
import org.jellymobile.jellypos.feat_home.component.ChartComponent
import org.jellymobile.jellypos.feat_home.component.HomeHeaderComponent
import org.jellymobile.jellypos.jellydesign.themes.LightGray
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column(modifier = Modifier
            .background(color = LightGray, shape = MaterialTheme.shapes.small)
            .fillMaxHeight()
        ) {
            HomeHeaderComponent()
            BalanceCard("100.000")
            ChartComponent()
        }
    }
}