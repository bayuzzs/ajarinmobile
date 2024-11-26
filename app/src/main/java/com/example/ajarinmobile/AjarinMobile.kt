package com.example.ajarinmobile

import LoginScreen
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.ajarinmobile.Screen.BelajarKuScreen
import com.example.ajarinmobile.Screen.ProfileScreen
import com.example.ajarinmobile.Screen.QuizChampionScreen
import com.example.ajarinmobile.component.AjarinBottomBar
import com.example.ajarinmobile.navigation.Screen
import com.example.ajarinmobile.screen.BerandaScreen

@Composable
fun AjarinMobile() {
    val navController = rememberNavController()
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route,
        modifier = Modifier
    ) {
        composable(Screen.Login.route) { LoginScreen(navController = navController) }
        composable(Screen.Beranda.route) { BerandaScreen(navController = navController) }
        composable(Screen.BelajarKu.route) { BelajarKuScreen(navController = navController) }
        composable(Screen.QuizChampion.route) { QuizChampionScreen(navController = navController) }
        composable(Screen.Profile.route) { ProfileScreen(navController = navController) }
        composable(Screen.ForumDiskusi.route) { {} }
        composable(Screen.PencarianKelas.route) { {} }
    }
}