package com.estudiante.perfilpersonal.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val Light = lightColorScheme(
    primary = Azul900, onPrimary = Blanco,
    secondary = Azul500, onSecondary = Blanco,
    background = GrisClaro, surface = Blanco,
    onBackground = Negro, onSurface = Negro
)

private val Dark = darkColorScheme(
    primary = Azul500, onPrimary = Blanco,
    secondary = Azul100, onSecondary = Negro,
    background = Negro, surface = Color(0xFF1C2833),
    onBackground = Blanco, onSurface = Blanco
)

@Composable
fun PerfilPersonalTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) Dark else Light,
        content = content
    )
}