package com.example.ajarinmobile.data

import androidx.compose.ui.graphics.Color
import com.example.ajarinmobile.R
import com.example.ajarinmobile.model.KelasLanjutan
import com.example.ajarinmobile.model.Tugas
import com.example.ajarinmobile.navigation.NavigationItem
import com.example.ajarinmobile.navigation.Screen

object DataSource {
    val bottomBarIconList: List<NavigationItem> = listOf(
        NavigationItem("Beranda", R.drawable.ic_home, R.drawable.ic_home_filled, Screen.Beranda),
        NavigationItem(
            "BelajarKu",
            R.drawable.ic_book,
            R.drawable.ic_book_filled,
            Screen.BelajarKu
        ),
        NavigationItem(
            "Quiz Champion",
            R.drawable.ic_achievement,
            R.drawable.ic_achievement_filled,
            Screen.QuizChampion
        ),
        NavigationItem(
            "Profile",
            R.drawable.ic_profile,
            R.drawable.ic_profile_filled,
            Screen.Profile
        )
    )

    val dummyTugasList: List<Tugas> = listOf(
        Tugas(
            1,
            "?",
            Color(0xFF14B8A6),
            Color(0xFF99F6E4),
            "QUIZ 1: Pengenalan UI/UX dan Figma",
            "Belajar Dasar Figma",
            "UI/UX Design",
            Color(0xFF0D9488)
        ),
        Tugas(
            2,
            "!",
            Color(0xFFA855F7),
            Color(0xFFE9D5FF),
            "TUGAS 2: Sintaks Kotlin",
            "Android Studio dengan Jetpack Compose",
            "Pengembangan Mobile",
            Color(0xFFE11D48)
        ),
        Tugas(
            3,
            "?",
            Color(0xFF14B8A6),
            Color(0xFF99F6E4),
            "QUIZ 1: Seputar Basis Data",
            "Mengenal Teknik Enkripsi dan Keamanan Data",
            "Cyber Security",
            Color(0xFFA855F7)
        )
    )

    val dummyKelasLanjutanList: List<KelasLanjutan> = listOf(
        KelasLanjutan(
            id = 1,
            picture = R.drawable.kelaslanjutan1,
            title = "Belajar Tailwind CSS untuk Pemula",
            categoryName = "Website",
            categoryColor = Color(0xFFD97706),
            completion = 75
        ),
        KelasLanjutan(
            id = 2,
            picture = R.drawable.kelaslanjutan2,
            title = "Android Studio dengan Jetpack Compose",
            categoryName = "Mobile",
            categoryColor = Color(0xFFE11D48),
            completion = 30
        ),
        KelasLanjutan(
            id = 3,
            picture = R.drawable.kelaslanjutan3,
            title = "Belajar Teknik Pengembangan Scrum",
            categoryName = "Manajemen Proyek",
            categoryColor = Color(0xFF2563EB),
            completion = 5
        )
    )
}