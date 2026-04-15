package com.estudiante.perfilpersonal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.ui.Modifier
import com.estudiante.perfilpersonal.ui.navigation.NavGraph
import com.estudiante.perfilpersonal.ui.theme.PerfilPersonalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PerfilPersonalTheme {
                NavGraph(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding()
                )
            }
        }
    }
}