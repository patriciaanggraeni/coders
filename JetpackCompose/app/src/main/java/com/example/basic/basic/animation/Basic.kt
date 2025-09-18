package com.example.basic.basic.animation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BasicAnimation(modifier: Modifier = Modifier) {
    var isVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { isVisible = !isVisible }
        ) {
            Text(text = "Toggle")
        }

        // membuat animasi menggunakan AnimatedVisibility
        AnimatedVisibility(
            visible = isVisible,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(modifier = Modifier.background(color = Color.Red))
        }
    }
}

@Composable
@Preview(showBackground = true)
fun BasicAnimationPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        BasicAnimation()
    }
}