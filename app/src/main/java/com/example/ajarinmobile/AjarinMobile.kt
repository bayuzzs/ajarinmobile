package com.example.ajarinmobile

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.ajarinmobile.navigation.Screen

@Composable
fun AjarinMobile() {
    val navController = rememberNavController()
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route

    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Login.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Login.route) {{}}
            composable(Screen.Beranda.route) {{}}
            composable(Screen.BelajarKu.route) {{}}
            composable(Screen.ForumDiskusi.route) {{}}
            composable(Screen.PencarianKelas.route) {{}}
        }
    }
}