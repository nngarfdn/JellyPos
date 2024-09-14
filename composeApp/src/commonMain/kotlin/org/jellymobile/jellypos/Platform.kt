package org.jellymobile.jellypos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform