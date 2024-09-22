package com.bythentest.cloudvideoapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jellymobile.jellypos.jellydesign.themes.getMontserratFontFamily

@Composable
fun JellyTypography(): Typography {
    val montserratFontFamily = getMontserratFontFamily()

    return Typography(
        defaultFontFamily = montserratFontFamily,
        h1 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Light,
            fontSize = 96.sp,
            lineHeight = 112.sp,
            letterSpacing = (-1.5).sp
        ),
        h2 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Light,
            fontSize = 60.sp,
            lineHeight = 72.sp,
            letterSpacing = (-0.5).sp
        ),
        h3 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 48.sp,
            lineHeight = 56.sp,
            letterSpacing = 0.sp
        ),
        h4 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 34.sp,
            lineHeight = 36.sp,
            letterSpacing = 0.25.sp
        ),
        h5 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 24.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.sp
        ),
        h6 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.15.sp
        ),
        subtitle1 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.15.sp
        ),
        subtitle2 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.1.sp
        ),
        body1 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.5.sp
        ),
        body2 = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            lineHeight = 20.sp,
            letterSpacing = 0.25.sp
        ),
        button = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 16.sp,
            letterSpacing = 1.25.sp
        ),
        caption = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.4.sp
        ),
        overline = TextStyle(
            fontFamily = montserratFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 10.sp,
            lineHeight = 16.sp,
            letterSpacing = 1.5.sp
        )
    )
}