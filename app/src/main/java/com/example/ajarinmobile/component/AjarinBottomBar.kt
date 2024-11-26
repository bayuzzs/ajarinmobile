package com.example.ajarinmobile.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.ajarinmobile.data.DataSource
import com.example.ajarinmobile.navigation.NavigationItem
import com.example.ajarinmobile.navigation.Screen

@Composable
fun AjarinBottomBar(
    modifier: Modifier = Modifier,
    navController: NavController,
    navBarItem: List<NavigationItem> = DataSource.bottomBarIconList
) {
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route

    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Card(
            modifier = modifier
                .fillMaxWidth(0.8f)
                .padding(bottom = 64.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF4EFF8)
            ),
            shape = RoundedCornerShape(40.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                NavigationSection(
                    navController = navController,
                    navDest = navBarItem[0].screen.route,
                    navIcon = navBarItem[0].icon,
                    selectedIcon = navBarItem[0].selectedIcon,
                    selected = Screen.Beranda.route == navController.currentDestination?.route
                )
                NavigationSection(
                    navController = navController,
                    navDest = navBarItem[1].screen.route,
                    navIcon = navBarItem[1].icon,
                    selectedIcon = navBarItem[1].selectedIcon,
                    selected = Screen.BelajarKu.route == navController.currentDestination?.route
                )
                NavigationSection(
                    navController = navController,
                    navDest = navBarItem[2].screen.route,
                    navIcon = navBarItem[2].icon,
                    selectedIcon = navBarItem[2].selectedIcon,
                    selected = Screen.QuizChampion.route == navController.currentDestination?.route
                )
                NavigationSection(
                    navController = navController,
                    navDest = navBarItem[3].screen.route,
                    navIcon = navBarItem[3].icon,
                    selectedIcon = navBarItem[3].selectedIcon,
                    selected = Screen.Profile.route == navController.currentDestination?.route
                )
            }
        }
    }
}

@Composable
fun NavigationSection(
    modifier: Modifier = Modifier,
    navController: NavController,
    navDest: String,
    @DrawableRes navIcon: Int,
    @DrawableRes selectedIcon: Int,
    selected: Boolean,
    iconTint: Color = Color.Black,
    selectedTint: Color = Color(0xFF1D4ED8),
) {
    IconButton(modifier = modifier, onClick = {
        navController.navigate(navDest) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            restoreState = true
            launchSingleTop = true
        }
    }) {
        Icon(
            painter = if (selected) painterResource(selectedIcon) else painterResource(navIcon),
            contentDescription = null,
            tint = if (selected) selectedTint else iconTint
        )
    }
}