package com.example.ajarinmobile.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class KelasLanjutan(
    val id: Int,
    @DrawableRes val picture: Int,
    val title: String,
    val categoryName: String,
    val categoryColor: Color,
    val completion: Int
)
