package com.example.ajarinmobile.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.ajarinmobile.R
import com.example.ajarinmobile.component.AjarinBottomBar

@Composable
fun ProfileScreen(navController: NavController) {
    Scaffold(
        bottomBar = { AjarinBottomBar(navController = navController) },
        containerColor = Color.White
    ) { innerPadding ->
//        Text("Profile Screen", modifier = Modifier.padding(innerPadding))
        Image(
            painter = painterResource(R.drawable.profile_placeholder),
            contentDescription = "This is only a placeholder to see what the intended screen looks like",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize().padding(innerPadding)
        )
    }
}