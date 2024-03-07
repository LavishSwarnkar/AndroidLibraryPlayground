package com.lavish.lib3

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
fun SuperComposable() {
    Text("Super")
}

fun main() {
    application {
        Window(onCloseRequest = ::exitApplication) {
            SuperComposable()
        }
    }
}