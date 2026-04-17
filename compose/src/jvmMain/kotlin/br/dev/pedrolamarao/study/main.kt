package br.dev.pedrolamarao.study

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "demo1",
    ) {
        _root_ide_package_.br.dev.pedrolamarao.study.App()
    }
}