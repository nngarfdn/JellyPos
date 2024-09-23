package org.jellymobile.jellypos.feat_home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bythentest.cloudvideoapp.ui.theme.JellyTypography
import ir.ehsannarmani.compose_charts.LineChart
import ir.ehsannarmani.compose_charts.models.DotProperties
import ir.ehsannarmani.compose_charts.models.Line
import org.jellymobile.jellypos.jellydesign.themes.BlueLight
import org.jellymobile.jellypos.jellydesign.themes.FontColor
import org.jellymobile.jellypos.jellydesign.themes.Green
import org.jellymobile.jellypos.jellydesign.themes.MontserratMedium
import org.jellymobile.jellypos.jellydesign.themes.Red

@Composable
fun ChartComponent() {
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
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                elevation = 2.dp
            ) {
                LineChart(
                    data = listOf(
                        Line(
                            label = "CASH",
                            values = listOf(
                                100.0,
                                150.0,
                                300.0,
                                160.0,
                                200.0,
                                400.0,
                                180.0 // Example data for "Windows"
                            ),
                            color = Brush.sweepGradient(
                                colors = listOf(
                                    Color(0xFF8E44AD), // Elegant Purple
                                    Color(0xFFE57373)  // Soft Pink
                                )
                            ),
                            curvedEdges = true,
                            dotProperties = DotProperties(
                                enabled = true,
                                color = SolidColor(Color.White),
                                strokeWidth = 2.dp,
                                radius = 4.dp,
                                strokeColor = SolidColor(Color(0xFFE57373)) // Soft Pink stroke
                            )
                        ),
                        Line(
                            label = "QRIS",
                            values = listOf(
                                280.0,
                                160.0,
                                80.0,
                                140.0,
                                800.0,
                                360.0,
                                270.0
                            ),
                            color = Brush.linearGradient(
                                colors = listOf(
                                    Color(0xFF008080), // Teal
                                    Color(0xFF2ECC71)  // Green
                                )
                            ),
                            curvedEdges = false,
                            dotProperties = DotProperties(
                                enabled = true,
                                color = SolidColor(Color.White),
                                strokeWidth = 2.dp,
                                radius = 4.dp,
                                strokeColor = SolidColor(Color(0xFF2ECC71)) // Green stroke
                            )
                        )
                    ),
                    curvedEdges = false,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .background(BlueLight)
                        .padding(16.dp)
                )
            }


            Spacer(modifier = Modifier.height(16.dp)) // Space between chart and text

            // Row containing two columns
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween // Spread columns apart
            ) {
                // First column, aligned to the start by default
                Column {
                    Text(text = "banyak terjual",
                        style = JellyTypography().subtitle2.copy(
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Normal
                        ),
                         color = FontColor)
                    Text(text = "Batagor Original",
                        style = JellyTypography().h6.copy(
                            fontSize = 16.sp,
                            fontFamily = MontserratMedium(),
                        ),
                        color = Green)
                }

                // Second column, align the text to the end (right side)
                Column(
                    modifier = Modifier
                        .fillMaxWidth(), // Fill the width of the parent Row
                ) {
                    Text(text = "sedikit terjual",
                        style = JellyTypography().subtitle2.copy(
                            fontSize = 12.sp,
                            fontStyle = FontStyle.Normal
                        ),
                        color = FontColor,
                        modifier = Modifier.align(Alignment.End) // Align the text to the end horizontally
                    )
                    Text(text = "Cireng Keju",
                        style = JellyTypography().h6.copy(
                            fontSize = 16.sp,
                            fontFamily = MontserratMedium(),
                        ),
                        color = Red,
                        modifier = Modifier.align(Alignment.End) // Align the text to the end horizontally
                    )
                }
            }
        }
    }
}