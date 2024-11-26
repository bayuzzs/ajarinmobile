package com.example.ajarinmobile.navigation

sealed class Screen(val route: String) {
    data object Login : Screen(route = "login")
    data object Beranda : Screen(route = "beranda")
    data object BelajarKu : Screen(route = "belajarku")
    data object ForumDiskusi : Screen(route = "forumdiskusi")
    data object PencarianKelas : Screen(route = "pencariankelas")
    data object Profile : Screen(route = "profile")
}