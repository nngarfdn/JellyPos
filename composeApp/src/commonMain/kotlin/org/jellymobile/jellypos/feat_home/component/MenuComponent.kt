package org.jellymobile.jellypos.feat_home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bythentest.cloudvideoapp.ui.theme.JellyTypography
import org.jellymobile.jellypos.Res
import org.jellymobile.jellypos.ic_expenses
import org.jellymobile.jellypos.ic_stock
import org.jellymobile.jellypos.ic_transaction
import org.jellymobile.jellypos.jellydesign.themes.MontserratRegular
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun MenuComponent() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = 8.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween // Space between the 3 menus
        ) {
            MenuItem(
                imageRes = Res.drawable.ic_stock, // Replace with your image resources
                menuText = "Stok Produk"
            )
            MenuItem(
                imageRes = Res.drawable.ic_transaction, // Replace with your image resources
                menuText = "Transaksi"
            )
            MenuItem(
                imageRes = Res.drawable.ic_expenses, // Replace with your image resources
                menuText = "Pengeluaran"
            )
        }
    }

}

@Composable
fun MenuItem(imageRes: DrawableResource, menuText: String) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .width(100.dp)
            .clickable(onClick = { /* Handle click event */ }),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imageRes),
            contentDescription = menuText,
            modifier = Modifier
                .size(64.dp) // Adjust image size
                .padding(4.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = menuText,
            style = JellyTypography().button.copy(
                fontFamily = MontserratRegular(),
                fontSize = 12.sp
            )
        )
    }
}