package com.example.ajarinmobile.model

import androidx.compose.ui.graphics.Color

data class Tugas(
    val id: Int,
    val iconText: String,
    val iconTextColor: Color,
    val iconTextContainerColor: Color,
    val title: String,
    val courseName: String,
    val category: String,
    val categoryColor: Color
)
