package org.jellymobile.jellypos.feat_choose_menu.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jellymobile.jellypos.Res
import org.jellymobile.jellypos.ic_selected
import org.jellymobile.jellypos.ic_stock
import org.jetbrains.compose.resources.painterResource

@Composable
fun MenuComponent(
    modifier: Modifier = Modifier,
    menuName: String,
    price: String,
    isSelected: Boolean = false,
    onItemSelected: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(100.dp) // Adjust height as needed
            .background(
                color = Color(0xFFFFF8E1), // Light yellow background color
                shape = RoundedCornerShape(16.dp) // Rounded corners
            )
    ) {
        Image(
            painter = painterResource(Res.drawable.ic_selected), // Replace with your drawable resource
            contentDescription = "Selected",
            modifier = Modifier
                .size(16.dp) // Adjust the size of the icon as needed
                .align(Alignment.Center) // Centers the drawable inside the circle
        )
       
    }
}

