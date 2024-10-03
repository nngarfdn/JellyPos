package org.jellymobile.jellypos.feat_choose_menu.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jellymobile.jellypos.Res
import org.jellymobile.jellypos.feat_choose_menu.component.MenuComponent
import org.jellymobile.jellypos.feat_choose_menu.component.SearchComponent
import org.jellymobile.jellypos.ic_report
import org.jellymobile.jellypos.jellydesign.component.JellyActionBar
import org.jetbrains.compose.resources.painterResource

@Composable
fun SearchScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { JellyActionBar(title = "Pilih Menu") },
        content = {
            Column {
                SearchComponent()
                MenuComponent(
                    menuName = "Batagor Original",
                    price = "18K",
                    isSelected = true
                )
//                MenuComponent(
//                    menuName = "Batagor Original",
//                    price = "18K",
//                    isSelected = false
//                )
            }
        }
    )
}