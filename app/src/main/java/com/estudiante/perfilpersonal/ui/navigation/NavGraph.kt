package com.estudiante.perfilpersonal.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.estudiante.perfilpersonal.ui.screens.PantallaInicioUI
import com.estudiante.perfilpersonal.ui.screens.PantallaPerfilUI
import com.estudiante.perfilpersonal.viewmodel.PerfilViewModel
import androidx.compose.ui.Modifier

@Composable
fun NavGraph(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier,
    viewModel: PerfilViewModel = viewModel()
) {
    NavHost(navController, Screen.Inicio.route, modifier) {
        composable(Screen.Inicio.route) {
            PantallaInicioUI { navController.navigate(Screen.Perfil.route) }
        }
        composable(Screen.Perfil.route) {
            PantallaPerfilUI(viewModel) { navController.popBackStack() }
        }
    }
}