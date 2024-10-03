package org.jellymobile.jellypos.feat_home.model

import org.jetbrains.compose.resources.DrawableResource

data class Transaction(
    val transactionLabel: String,
    val transactionId: String,
    val amount: String,
    val date: String,
    val drawableResource: DrawableResource
)


