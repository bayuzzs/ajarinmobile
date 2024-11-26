package com.example.ajarinmobile.data

import com.example.ajarinmobile.R
import com.example.ajarinmobile.navigation.NavigationItem
import com.example.ajarinmobile.navigation.Screen

object DataSource {
    val bottomBarIconList: List<NavigationItem> = listOf(
        NavigationItem("Beranda", R.drawable.ic_home, R.drawable.ic_home_filled, Screen.Beranda),
        NavigationItem("BelajarKu", R.drawable.ic_book, R.drawable.ic_book_filled, Screen.BelajarKu),
        NavigationItem("Quiz Champion", R.drawable.ic_achievement, R.drawable.ic_achievement_filled, Screen.QuizChampion),
        NavigationItem("Profile", R.drawable.ic_profile, R.drawable.ic_profile_filled, Screen.Profile)
    )
}