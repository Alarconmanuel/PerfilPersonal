package com.estudiante.perfilpersonal.viewmodel

import androidx.lifecycle.ViewModel
import com.estudiante.perfilpersonal.model.Perfil
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PerfilViewModel : ViewModel() {
    private val _perfil = MutableStateFlow(getPerfilData())
    val perfil: StateFlow<Perfil> = _perfil.asStateFlow()

    private val _mostrarInfoAdicional = MutableStateFlow(false)
    val mostrarInfoAdicional: StateFlow<Boolean> = _mostrarInfoAdicional.asStateFlow()

    fun alternarInfoAdicional() {
        _mostrarInfoAdicional.value = !_mostrarInfoAdicional.value
    }

    private fun getPerfilData() = Perfil(
        nombre = "Manuel Eduardo Alarcon Aza",
        fotografia = "https://google.com",
        programaAcademico = "Ingeniería de Sistemas y Computación",
        semestre = 5,
        descripcion = "Estudiante de la Universidad de Cundinamarca con gusto por el desarrollo de software y el analisis de datos.",
        edad = 19,
        ciudad = "Tenjo, Cundinamarca",
        correo = "manuel@gmail.com",
        hobbies = listOf("Programar", "Leer tech", "Música", "Frameworks"),
        pasatiempos = listOf("Videojuegos", "Series", "Dibujo", "Cocina"),
        deportes = listOf("Fútbol", "Ciclismo"),
        intereses = listOf("IA/ML", "Analitica de Datos", "Startups")
    )
}
