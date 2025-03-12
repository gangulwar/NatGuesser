package com.gangulwar.natguesser

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.gangulwar.natguesser.presentation.ui.NationalityScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        NationalityScreen()
    }
}