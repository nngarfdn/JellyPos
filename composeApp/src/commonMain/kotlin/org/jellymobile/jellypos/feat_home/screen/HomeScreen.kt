package org.jellymobile.jellypos.feat_home.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jellymobile.jellypos.Res
import org.jellymobile.jellypos.feat_home.component.BalanceCard
import org.jellymobile.jellypos.feat_home.component.BottomNavigationBar
import org.jellymobile.jellypos.feat_home.component.ChartComponent
import org.jellymobile.jellypos.feat_home.component.HomeHeaderComponent
import org.jellymobile.jellypos.feat_home.component.LastTransactionComponent
import org.jellymobile.jellypos.feat_home.component.MenuComponent
import org.jellymobile.jellypos.feat_home.model.Transaction
import org.jellymobile.jellypos.ic_cash
import org.jellymobile.jellypos.ic_qris
import org.jellymobile.jellypos.ic_transaction_bn
import org.jellymobile.jellypos.jellydesign.themes.BlueLighter
import org.jellymobile.jellypos.jellydesign.themes.LightGray
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar() // Material 2 BottomNavigation
        },
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.size(70.dp),
                onClick = { /* Handle FAB Click */ },
                backgroundColor = BlueLighter,
            ) {
                Image(painter = painterResource(Res.drawable.ic_transaction_bn), contentDescription = "Home")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true // This makes the FAB docked into the BottomNavigation
    ) {
        Column(
            modifier = Modifier
                .background(color = LightGray, shape = MaterialTheme.shapes.small)
                .fillMaxHeight()
                .verticalScroll(rememberScrollState()) // Scrollable content
                .padding(bottom = 56.dp) // Ensure content is above BottomNavigation
        ) {
            HomeHeaderComponent()
            BalanceCard("100.000")
            ChartComponent()
            MenuComponent()
            LastTransactionComponent(transactions = transactions)
        }
    }
}

val transactions = listOf(
    Transaction(
        transactionLabel = "QRIS",
        transactionId = "sa43j12",
        amount = "Rp121.000",
        date = "12 Sept 2024",
        drawableResource = Res.drawable.ic_qris // Replace with your actual drawable resource
    ),
    Transaction(
        transactionLabel = "CASH",
        transactionId = "sa98l12",
        amount = "Rp80.000",
        date = "10 Sept 2024",
        drawableResource = Res.drawable.ic_cash // Replace with your actual drawable resource
    ),
    Transaction(
        transactionLabel = "QRIS",
        transactionId = "sa43j12",
        amount = "Rp121.000",
        date = "12 Sept 2024",
        drawableResource = Res.drawable.ic_qris // Replace with your actual drawable resource
    ),
    Transaction(
        transactionLabel = "CASH",
        transactionId = "sa98l12",
        amount = "Rp80.000",
        date = "10 Sept 2024",
        drawableResource = Res.drawable.ic_cash // Replace with your actual drawable resource
    )
)