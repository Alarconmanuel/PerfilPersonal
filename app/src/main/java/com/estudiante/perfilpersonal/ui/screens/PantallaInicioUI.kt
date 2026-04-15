package com.estudiante.perfilpersonal.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.estudiante.perfilpersonal.R
import com.estudiante.perfilpersonal.ui.theme.Azul500
import com.estudiante.perfilpersonal.ui.theme.Azul900

@Composable
fun PantallaInicioUI(onNavigateToPerfil: () -> Unit) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(Azul900, Azul500))),
        Alignment.Center
    ) {
        Card(
            Modifier.fillMaxWidth(0.9f).padding(24.dp),
            shape = RoundedCornerShape(24.dp),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(
                Modifier.fillMaxWidth().padding(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.foto_perfil),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Spacer(Modifier.height(24.dp))
                Text(
                    "¡Bienvenido a Mi Perfil!",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    textAlign = TextAlign.Center
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    "Explora mi experiencia y habilidades",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center
                )
                Spacer(Modifier.height(32.dp))
                Button(
                    onNavigateToPerfil,
                    Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(Azul900)
                ) {
                    Text("👤 Ver Mi Perfil", style = MaterialTheme.typography.titleMedium)
                }
            }
        }
    }
}
