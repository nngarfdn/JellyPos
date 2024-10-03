package org.jellymobile.jellypos.feat_home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jellymobile.jellypos.feat_home.model.Transaction
import org.jellymobile.jellypos.jellydesign.themes.FontColor
import org.jellymobile.jellypos.jellydesign.themes.MontserratMedium
import org.jellymobile.jellypos.jellydesign.themes.MontserratRegular
import org.jellymobile.jellypos.jellydesign.themes.MontserratSemiBold
import org.jellymobile.jellypos.jellydesign.themes.White
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun LastTransactionComponent(
    modifier: Modifier = Modifier.padding(16.dp),
    transactions: List<Transaction> // Pass the list of transactions dynamically
) {
    Column(modifier = modifier) {
        Text(
            text = "Transaksi Terakhir",
            fontFamily = MontserratSemiBold(),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Transaksi penjualan produk terakhir.",
            fontFamily = MontserratMedium(),
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        )

        Card(
            modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            elevation = 8.dp
        ) {
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                for (item in transactions){
                    TransactionCard(
                        transactionLabel = item.transactionLabel,
                        transactionId = item.transactionId,
                        amount = item.amount,
                        date = item.date,
                        drawableResource = item.drawableResource
                    )
                }
            }
        }
    }
}

@Composable
fun TransactionCard(
    transactionLabel: String,
    transactionId: String,
    amount: String,
    date: String,
    drawableResource: DrawableResource
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = { /* Handle click event */ }),
        shape = RoundedCornerShape(16.dp), // Rounded corners
        elevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF4F5FC)) // Light blue background
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically // Align content vertically in center
        ) {
            // Icon on the left
            Image(
                painter = painterResource(drawableResource), // Placeholder for your icon resource
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp) // Adjust icon size as needed
                    .background(White, shape = RoundedCornerShape(50)), // Circle background
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(16.dp)) // Space between icon and text

            // Column for transaction label and amount
            Column(
                modifier = Modifier.weight(1f), // Take up remaining space
                verticalArrangement = Arrangement.Center
            ) {
                // Transaction Label and ID (QRIS - sa43j12)
                Text(
                    text = "$transactionLabel - $transactionId",
                    fontFamily = MontserratSemiBold(),
                    fontSize = 16.sp,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(4.dp))

                // Transaction Amount (e.g., Rp121.000)
                Text(
                    text = amount,
                    fontFamily = MontserratSemiBold(),
                    fontSize = 16.sp,
                    color = Color(0xFF4CAF50) // Green color
                )
            }

            // Date (12 Sept 2024)
            Text(
                text = date,
                fontFamily = MontserratRegular(),
                fontSize = 14.sp,
                color = FontColor
            )
        }
    }
}