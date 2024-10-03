package org.jellymobile.jellypos.feat_choose_menu.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jellymobile.jellypos.Res
import org.jellymobile.jellypos.ic_search
import org.jellymobile.jellypos.jellydesign.themes.BluePrimary
import org.jellymobile.jellypos.jellydesign.themes.MontserratRegular
import org.jetbrains.compose.resources.painterResource

@Composable
fun SearchComponent(
    modifier: Modifier = Modifier,
    placeholder: String = "Cari Menu"
) {
    var text by remember { mutableStateOf(TextFieldValue("")) }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp),
        placeholder = {
            Text(
                text = placeholder,
                fontSize = 12.sp,
                fontFamily = MontserratRegular()
            )
        },
        trailingIcon = {
            Image(
                painter = painterResource(Res.drawable.ic_search),
                contentDescription = "Search Icon",
                modifier = Modifier.size(16.dp) // Adjust size as needed
            )
        },
        shape = RoundedCornerShape(16.dp), // Apply rounded corners to the outline
        colors = TextFieldDefaults.outlinedTextFieldColors(
            cursorColor = BluePrimary,
            backgroundColor = Color.Transparent, // Transparent background
            focusedBorderColor = Color(0xFF5F8EF2), // Border color when focused
            unfocusedBorderColor = Color(0xFF5F8EF2) // Border color when not focused
        ),
        singleLine = true
    )
}