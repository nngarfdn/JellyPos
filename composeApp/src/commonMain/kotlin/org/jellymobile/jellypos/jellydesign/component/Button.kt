package org.jellymobile.jellypos.jellydesign.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jellymobile.jellypos.jellydesign.themes.BlueDark
import org.jellymobile.jellypos.jellydesign.themes.BluePrimary
import org.jellymobile.jellypos.jellydesign.themes.MontserratMedium
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun JellyButton(
    buttonText: String,
    iconResource: DrawableResource? = null,  // Icon can be null
    modifier: Modifier = Modifier,           // Allow passing custom modifier
    onClick: () -> Unit = {},                // Click action
    cornerRadius: Dp = 12.dp                 // Custom corner radius with a default value
) {
    var isPressed by remember { mutableStateOf(false) }

    // Choose button color based on the click state
    val backgroundColor = if (isPressed) BlueDark else BluePrimary

    Button(
        onClick = {
            isPressed = !isPressed
            onClick() // Trigger passed click action
        },
        colors = ButtonDefaults.buttonColors(backgroundColor),
        shape = RoundedCornerShape(cornerRadius), // Use shape to set custom corner radius
        modifier = modifier
            .height(40.dp) // Default button height
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically, // Vertically align items in the center
            horizontalArrangement = Arrangement.Start, // Align horizontally to the start
            modifier = Modifier.fillMaxWidth() // Make the row fill the width of the button
        ) {
            // Only show the icon if iconResource is not null
            if (iconResource != null) {
                Icon(
                    painter = painterResource(iconResource),
                    contentDescription = null,
                    modifier = Modifier.size(16.dp), // Increased size for better visibility
                    tint = Color.White // Customize icon color
                )
                Spacer(modifier = Modifier.width(8.dp)) // Space between icon and text
            }
            Text(
                text = buttonText,
                fontFamily = MontserratMedium(),
                color = Color.White,
                fontSize = 14.sp // Adjusted font size for better readability
            )
        }
    }
}