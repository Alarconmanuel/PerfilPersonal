package com.estudiante.perfilpersonal.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Inicio : Screen("inicio", "Inicio", Icons.Default.Home)
    object Perfil : Screen("perfil", "Perfil", Icons.Default.Person)
}