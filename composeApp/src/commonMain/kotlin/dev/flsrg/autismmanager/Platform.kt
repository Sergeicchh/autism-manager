package dev.flsrg.autismmanager

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform