@file:OptIn(ExperimentalMaterial3Api::class)

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ajarinmobile.Component.GradientBox
import com.example.ajarinmobile.R
import com.example.ajarinmobile.navigation.Screen


@Composable
fun LoginScreen(navController: NavController) {

    GradientBox(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
        ) {


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.55f)
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                    .background(color = Color(0xFFCCE5FF))
                    .align(Alignment.BottomCenter)
            ) {
               
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp, end = 30.dp, top = 46.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Welcome text
                    Text(
                        text = "Mulai BelajarMu,",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF008FFF)
                        ),
                        modifier = Modifier.align(Alignment.Start)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = "Masuk Ke Ajarin",
                        style = TextStyle(
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF1A2744),
                        ),
                        modifier = Modifier.align(Alignment.Start)
                    )

                    Spacer(modifier = Modifier.height(38.dp))

                    TextField(
                        value = "",
                        onValueChange = { },
                        placeholder = { Text("E-mail Kamu") },
                        shape = RoundedCornerShape(11.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp)
                            .background(Color(0xFD9BAFF))
                            .padding(horizontal = 8.dp),
                        textStyle = TextStyle(
                            fontSize = 18.sp,
                            color = Color(0xF7C19B9)
                        ),
                        colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = Color(0xFFD9BAFF),
                            unfocusedIndicatorColor = Color.Transparent,
                        ),
                        keyboardOptions = KeyboardOptions.Default,
                        keyboardActions = KeyboardActions.Default
                    )

                    Spacer(modifier = Modifier.height(18.dp))

                    TextField(
                        value = "",
                        onValueChange = { /* Handle password input */ },
                        placeholder = { Text("Kata Sandi") },
                        shape = RoundedCornerShape(11.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp)
                            .padding(horizontal = 8.dp),
                        textStyle = TextStyle(
                            fontSize = 18.sp,
                            color = Color(0xF7C19B9)
                        ),
                        colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = Color(0xFFD9BAFF),
                            unfocusedIndicatorColor = Color.Transparent,
                        ),
                        keyboardOptions = KeyboardOptions.Default,
                        keyboardActions = KeyboardActions.Default,
                        trailingIcon = {
//                            Icon(
////                                imageVector = Icons.Default,
//                                contentDescription = "",
//                                tint = Color(0xF661599)
//                            )
                        }
                    )
                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = "Lupa Password?",
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF008FFF)
                        ),
                        modifier = Modifier.align(Alignment.End)
                            .padding(end = 15.dp)
                    )

                    Spacer(modifier = Modifier.height(44.dp))

                    Button(
                        onClick = {navController.navigate(Screen.Beranda.route)},
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2563EB)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(57.dp),
                        shape = RoundedCornerShape(50.dp)
                    ) {
                        Text(
                            text = "Masuk",
                            style = TextStyle(
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Belum punya akun?",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black
                            )
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Daftar Sekarang",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF008FFF)
                            )
                        )
                    }
                }
            }

            Image(
                painter = painterResource(id = R.drawable.ic_splash),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(400.dp)
                    .align(Alignment.Center)
                    .offset(y = -142.dp)
            )
        }
    }
}