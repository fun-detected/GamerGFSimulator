// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

val items = listOf(
    "It's not your fault you lost your lane.",
    "That scrub didn't know how to plant bomb.",
    "We're playing a different game, Moot.",
    "Ara Ara~, that guy was definitely hacking.",
    "No, Anon, I'm not a robot why would you ask?",
    "STOP FUCKING CHEATING IN RUST."
)


@Composable
@Preview
fun App() {
    var phrase by remember { mutableStateOf("") }

    MaterialTheme {
        Column {
            Button(onClick = {
                phrase = items.random()
            }) {
                Text("Gamer Gf, pls help.")
            }
            Text(phrase)
        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
