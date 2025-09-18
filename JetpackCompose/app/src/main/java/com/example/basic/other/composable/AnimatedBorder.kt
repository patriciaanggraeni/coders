package com.example.basic.other.composable

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AnimatedGradient(modifier: Modifier = Modifier) {

    val infiniteTrantision = rememberInfiniteTransition(label = "")
    val degrees by infiniteTrantision.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 10000,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        ),
        label = ""
    )

    Surface(
        modifier = Modifier.clickable {  },
        shape = RectangleShape
    ) {
        Surface(
            shape = RectangleShape,
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .drawWithContent {
                    rotate(degrees = degrees) {
                        drawCircle(
                            brush = Brush.sweepGradient(
                                listOf(
                                    Color.Magenta, Color.Cyan,
                                    Color(0xFFFFB300), Color(0xFFD81B60),
                                    Color(0xFFF4511E), Color(0xFF7CB342)
                                )
                            ),
                            radius = size.width,
                            blendMode = BlendMode.SrcIn
                        )
                    }
                    drawContent()
                },
            color = MaterialTheme.colorScheme.surface
        ) {
            // jika memanggil fungsi drawContent(), Composable Box akan di bentuk
            // menggambar isi konten, dan kontennya adalah box
            Box(
                modifier = Modifier
                    .width(250.dp)
                    .height(250.dp)
                    .background(color = Color(0xFF333333)),
                contentAlignment = Alignment.Center
            ) {}
        }
    }
}

@Composable
@Preview(showBackground = true)
fun AnimatedGradientPreview(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AnimatedGradient()
    }
}