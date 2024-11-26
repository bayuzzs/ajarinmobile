package com.example.ajarinmobile.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ajarinmobile.R
import com.example.ajarinmobile.data.DataSource
import com.example.ajarinmobile.model.Tugas

@Composable
fun TugasCard(modifier: Modifier = Modifier, tugas: Tugas) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = tugas.iconTextContainerColor,
                    contentColor = tugas.iconTextColor
                ),
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1 / 1f)
                    .padding(8.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Text(
                        text = tugas.iconText,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(8.dp)
                            .align(Alignment.Center)
                    )
                }
            }
            Column(modifier = Modifier.weight(3f)) {
                Text(
                    text = tugas.title,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = tugas.courseName,
                    fontSize = 8.sp,
                    color = Color(0xFF9696BB)
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.ic_category),
                        contentDescription = null,
                        tint = tugas.categoryColor
                    )
                    Text(
                        text = tugas.category,
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Bold,
                        color = tugas.categoryColor,
                        modifier = Modifier.padding(start = 4.dp)
                    )
                }
            }
            IconButton(onClick = {}, modifier = Modifier.weight(1f)) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFF2563EB),
                        contentColor = Color.White,
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .aspectRatio(1/1f)
                ) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Icon(
                            painter = painterResource(R.drawable.ic_next_white),
                            contentDescription = null,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
        }
    }
}