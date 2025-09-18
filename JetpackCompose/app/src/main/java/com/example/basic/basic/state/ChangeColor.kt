package com.example.basic.basic.state

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun ChangeColorBox(modifier: Modifier = Modifier) {
    val color = remember { mutableStateOf(Color.Red) }

    Box(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .background(color = color.value)
            .clickable {
                color.value = Color(
                    red = Random.nextFloat(),
                    green = Random.nextFloat(),
                    blue = Random.nextFloat(),
                    alpha = 1f
                )
            }
    )
}

@Composable
@Preview(showBackground = true)
fun ChangeColorBoxPreview(modifier: Modifier = Modifier) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ChangeColorBox()
        }
    }
}