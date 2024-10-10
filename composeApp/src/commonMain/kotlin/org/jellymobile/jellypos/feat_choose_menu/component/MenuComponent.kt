package org.jellymobile.jellypos.feat_choose_menu.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jellymobile.jellypos.Res
import org.jellymobile.jellypos.bg_price_label
import org.jellymobile.jellypos.btgr
import org.jellymobile.jellypos.ic_selected
import org.jellymobile.jellypos.jellydesign.themes.MontserratSemiBold
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

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 4.dp, start = 4.dp)
                .height(90.dp)
                .align(Alignment.BottomCenter)
                .background(
                    color = Color(0xFFFFF8E1), // Light yellow background color
                    shape = RoundedCornerShape(16.dp) // Rounded corners
                )
        ){
            Box(
                modifier = Modifier.fillMaxHeight().fillMaxWidth()
            ){
                Row(
                    modifier = Modifier.fillMaxHeight()
                ){
                    Image(
                        painter = painterResource(Res.drawable.btgr),
                        contentDescription = "Menu",
                        modifier = Modifier
                            .size(90.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Text(
                        text = menuName,
                        fontFamily = MontserratSemiBold(),
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .align(Alignment.CenterVertically),
                        color = Color.Black
                    )
                }
                Image(
                    painter = painterResource(Res.drawable.bg_price_label),
                    contentDescription = "Report",
                    modifier = Modifier
                        .size(40.dp)
                        .align(Alignment.CenterEnd)
                )
                Text(
                    text = price,
                    fontFamily = MontserratSemiBold(),
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .align(Alignment.CenterEnd),
                    color = Color.Black
                )
            }

        }
        Image(
            painter = painterResource(Res.drawable.ic_selected),
            contentDescription = "Selected",
            modifier = Modifier
                .size(24.dp)
                .align(Alignment.TopEnd)
        )
       
    }
}

