package org.jellymobile.jellypos.jellydesign.themes

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.jellymobile.jellypos.Res
import org.jellymobile.jellypos.montserrat_bold
import org.jellymobile.jellypos.montserrat_italic
import org.jellymobile.jellypos.montserrat_light
import org.jellymobile.jellypos.montserrat_medium
import org.jellymobile.jellypos.montserrat_mediumitalic
import org.jellymobile.jellypos.montserrat_regular
import org.jellymobile.jellypos.montserrat_semibold
import org.jellymobile.jellypos.montserrat_semibolditalic
import org.jetbrains.compose.resources.Font


@Composable
fun MontserratBold() = FontFamily(Font(Res.font.montserrat_bold))

@Composable
fun MontserratItalic() = FontFamily(Font(Res.font.montserrat_italic))

@Composable
fun MontserratLight() = FontFamily(Font(Res.font.montserrat_light))

@Composable
fun MontserratMedium() = FontFamily(Font(Res.font.montserrat_medium))

@Composable
fun MontserratMediumItalic() = FontFamily(Font(Res.font.montserrat_mediumitalic))

@Composable
fun MontserratRegular() = FontFamily(Font(Res.font.montserrat_regular))

@Composable
fun MontserratSemiBold() = FontFamily(Font(Res.font.montserrat_semibold))

@Composable
fun MontserratSemiBoldItalic() = FontFamily(Font(Res.font.montserrat_semibolditalic))

@Composable
fun getMontserratFontFamily(): FontFamily {
    return FontFamily(
        Font(Res.font.montserrat_bold, FontWeight.Bold),
        Font(Res.font.montserrat_italic),
        Font(Res.font.montserrat_light, FontWeight.Light),
        Font(Res.font.montserrat_medium, FontWeight.Medium),
        Font(Res.font.montserrat_regular, FontWeight.Normal),
        Font(Res.font.montserrat_semibold, FontWeight.SemiBold),
        Font(Res.font.montserrat_semibolditalic, FontWeight.SemiBold, FontStyle.Italic)
    )
}