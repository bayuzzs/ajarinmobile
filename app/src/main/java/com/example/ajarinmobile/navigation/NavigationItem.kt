package com.example.ajarinmobile.navigation

import androidx.annotation.DrawableRes

data class NavigationItem(
    val title: String,
    @DrawableRes val icon: Int,
    @DrawableRes val selectedIcon: Int,
    val screen: Screen
)
