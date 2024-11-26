package com.example.ajarinmobile.Screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.ajarinmobile.component.AjarinBottomBar

@Composable
fun BelajarKuScreen(navController: NavController) {
    Scaffold(
        bottomBar = { AjarinBottomBar(navController = navController) },
        containerColor = Color.White
    ) { innerPadding ->
        Text("BelajarKu Screen", modifier = Modifier.padding(innerPadding))
    }
}