package com.example.basic.basic.animation

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@Composable
@Preview(showBackground = true)
fun RotatingCubePreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            RotatingCube()
        }
    }
}

@Composable
fun RotatingCube(modifier: Modifier = Modifier) {
    val coroutineScope = rememberCoroutineScope()
    val rotation = remember { Animatable(initialValue = 0f) }

    LaunchedEffect(key1 = true) {
        coroutineScope.launch {
            rotation.animateTo(
                targetValue = 360f,
                animationSpec = infiniteRepeatable(
                    animation = tween(
                        durationMillis = 2000,
                        easing = FastOutLinearInEasing
                    ),
                    repeatMode = RepeatMode.Restart
                )
            )
        }
    }

    Canvas(modifier = Modifier.fillMaxSize()) {
        val cubeSize = Size(500f, 500f)
        val cubePosition = Offset(
            x = (size.width - cubeSize.width) / 2,
            y = (size.height - cubeSize.height) / 2
        )

        val colors = listOf(
            Color.Red, Color.Blue,
            Color.Yellow, Color.Green,
            Color.Gray, Color.Magenta
        )

        val gradient = Brush.linearGradient(colors = colors)

        rotate(degrees = rotation.value) {
            drawRect(
                brush = gradient,
                topLeft = cubePosition,
                size = cubeSize
            )
        }
    }
}