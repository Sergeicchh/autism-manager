package dev.flsrg.autismmanager

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Autism Manager",
    ) {
        App()
    }
}