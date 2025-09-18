package com.example.basic.advances.task.art_app

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basic.R

@Composable
fun SplashScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .paint(
            painter = painterResource(id = R.drawable.bg),
            contentScale = ContentScale.FillBounds,
            alpha = 0.7f
        ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .size(250.dp),
                painter = painterResource(id = R.drawable.splash_image),
                contentDescription = "splas image"
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "YOUR ART IS MINE",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(200.dp))
            SplashButton(text = "REGISTER")
            Spacer(modifier = Modifier.height(20.dp))
            SplashButton(text = "LOGIN")
        }
    }
}

@Composable
fun SplashButton(text: String) {
    Button(
        modifier = Modifier
            .width(250.dp)
            .height(45.dp)
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(10.dp),
                clip = false,
                ambientColor = Color.Black.copy(0.2f),
                spotColor = Color.Black.copy(0.2f)
            ),
        onClick = { /*TODO*/ },
        contentPadding = PaddingValues(0.dp),
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0x85FFFFFF)
        )
    ) {
        Text(
            text = text,
            color = Color.Black,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
@Preview(showBackground = true)
fun SplashScrenPreview(modifier: Modifier = Modifier) {
    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(padding)
        ) {
            SplashScreen()
        }
    }
}