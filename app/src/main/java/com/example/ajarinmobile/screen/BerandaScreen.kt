package com.example.ajarinmobile.screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ajarinmobile.R
import com.example.ajarinmobile.component.AjarinBottomBar
import com.example.ajarinmobile.component.TugasCard
import com.example.ajarinmobile.data.DataSource
import com.example.ajarinmobile.model.Tugas

@Composable
fun BerandaScreen(modifier: Modifier = Modifier, navController: NavController) {
    Scaffold(
        containerColor = Color.White,
        bottomBar = { AjarinBottomBar(navController = navController) }
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            BerandaTopBar(
                profileImage = R.drawable.profileimage,
                name = "Anon"
            )
            Box(modifier = Modifier.background(Color(0xFFBFDBFE))) {
                Surface(
                    shape = RoundedCornerShape(
                        topStart = 16.dp, topEnd = 16.dp
                    ),
                    color = Color.White,
                    modifier = Modifier.fillMaxSize()
                ) {
                    TugasSection(tugasList = DataSource.dummyTugasList)
                }
            }
        }
    }
}


@Composable
fun TugasSection(modifier: Modifier = Modifier, tugasList: List<Tugas>) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "Tugas Kamu",
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        LazyColumn {
            items(tugasList) { tugas ->
                TugasCard(tugas = tugas, modifier = Modifier.padding(vertical = 8.dp))
            }
        }
    }
}

@Composable
fun LanjutinKelasSection(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "Lanjutin Kelas Yuk?!",
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}

@Composable
fun KategoriSection(modifier: Modifier = Modifier) {

}

@Composable
fun MateriSection(modifier: Modifier = Modifier) {

}

@Composable
fun BerandaTopBar(
    modifier: Modifier = Modifier,
    @DrawableRes profileImage: Int,
    name: String
) {
    Surface(modifier = modifier.fillMaxWidth(), color = Color(0xFFBFDBFE)) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(profileImage),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
            Column {
                Text(
                    text = "Aloha, $name!",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color(0xFF1D4ED8)
                )
                Text(
                    text = "Apa yang ingin kamu pelajari hari ini?",
                    fontSize = 12.sp,
                    color = Color.Black
                )
            }
            IconButton(onClick = {}) {
                Icon(
                    painter = painterResource(R.drawable.ic_bell_filled),
                    contentDescription = null,
                    tint = Color(0xFF1D4ED8)
                )
            }
        }
    }
}