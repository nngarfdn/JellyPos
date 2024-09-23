package org.jellymobile.jellypos.feat_home.component

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jellymobile.jellypos.Res
import org.jellymobile.jellypos.ic_expenses_bn
import org.jellymobile.jellypos.ic_stock_bn
import org.jellymobile.jellypos.ic_wallet_bn
import org.jellymobile.jellypos.jellydesign.themes.BlueLighter
import org.jetbrains.compose.resources.painterResource

@Composable
fun BottomNavigationBar() {
    var selectedIndex by remember { mutableStateOf(0) } // Track selected index

    BottomNavigation(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp), // Adjust height if needed
        backgroundColor = Color.White
    ) {
        BottomNavigationItem(
            icon = { Icon(Icons.Outlined.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = selectedIndex == 0, // Check if this item is selected
            selectedContentColor = BlueLighter, // Color for selected item
            unselectedContentColor = Color.Gray, // Color for unselected item
            onClick = { selectedIndex = 0 } // Change selection on click
        )

        BottomNavigationItem(
            icon = { Icon(painterResource(Res.drawable.ic_stock_bn), contentDescription = "Stok") },
            label = { Text("Stok") },
            selected = selectedIndex == 1, // Check if this item is selected
            selectedContentColor = BlueLighter, // Color for selected item
            unselectedContentColor = Color.Gray, // Color for unselected item
            onClick = { selectedIndex = 1 } // Change selection on click
        )

        Spacer(modifier = Modifier.width(56.dp)) // Leave space for the floating action button

        BottomNavigationItem(
            icon = { Icon(painterResource(Res.drawable.ic_wallet_bn), contentDescription = "Transaksi") },
            label = { Text("Transaksi") },
            selected = selectedIndex == 2, // Check if this item is selected
            selectedContentColor = BlueLighter, // Color for selected item
            unselectedContentColor = Color.Gray, // Color for unselected item
            onClick = { selectedIndex = 2 } // Change selection on click
        )

        BottomNavigationItem(
            icon = { Icon(painterResource(Res.drawable.ic_expenses_bn), contentDescription = "Pengeluaran") },
            label = { Text("Pengeluaran") },
            selected = selectedIndex == 3, // Check if this item is selected
            selectedContentColor = BlueLighter, // Color for selected item
            unselectedContentColor = Color.Gray, // Color for unselected item
            onClick = { selectedIndex = 3 } // Change selection on click
        )
    }
}