package org.jellymobile.jellypos.feat_home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bythentest.cloudvideoapp.ui.theme.JellyTypography
import org.jellymobile.jellypos.Res
import org.jellymobile.jellypos.ic_report
import org.jellymobile.jellypos.jellydesign.component.JellyButton
import org.jellymobile.jellypos.jellydesign.themes.FontColor
import org.jellymobile.jellypos.jellydesign.themes.LightGray
import org.jellymobile.jellypos.jellydesign.themes.MontserratBold
import org.jellymobile.jellypos.jellydesign.themes.MontserratSemiBold

@Composable
fun BalanceCard(balanceAmount: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // "Saldo" Text with font size 12 and not italic

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                ,
                backgroundColor = LightGray,
                shape = RoundedCornerShape(10.dp),
                elevation = 2.dp,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Saldo",
                        style = JellyTypography().subtitle2.copy(
                            fontSize = 14.sp,
                            fontStyle = FontStyle.Normal
                        ),
                        color = FontColor,
                        modifier = Modifier.align(Alignment.Start) // Align to the start
                    )
                    Spacer(modifier = Modifier.height(4.dp)) // Space between texts

                    // Balance amount (h4 Bold and aligned to start)
                    Text(
                        text = "Rp $balanceAmount",
                        style = JellyTypography().h4.copy(fontWeight = FontWeight.Bold),
                        color = FontColor,
                        modifier = Modifier.align(Alignment.Start) // Align to the start
                    )
                }

            }


            Spacer(modifier = Modifier.height(16.dp)) // Space before buttons

            // Action Buttons (Laporan and Ringkasan)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                JellyButton(
                    cornerRadius = 80.dp,
                    buttonText = "Laporan",
                    iconResource = Res.drawable.ic_report, // Add an icon if needed
                    modifier = Modifier.weight(1f)
                        .height(35.dp) // Make the button share equal space
                )
                Spacer(modifier = Modifier.width(8.dp)) // Space between buttons
                JellyButton(
                    cornerRadius = 50.dp,
                    buttonText = "Ringkasan",
                    iconResource = Res.drawable.ic_report, // Add an icon if needed
                    modifier = Modifier.weight(1f).height(35.dp) // Make the button share equal space
                )
            }
        }
    }
}