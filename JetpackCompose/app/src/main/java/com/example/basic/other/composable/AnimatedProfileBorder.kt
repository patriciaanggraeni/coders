package com.example.basic.other.composable

import android.graphics.LinearGradient
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basic.R

@Composable
private fun AnimatedProfileBorder() {
    val animation = rememberInfiniteTransition(label = "")
    val spinAnimation by animation.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 5000,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart,
        ),
        label = ""
    )


    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = null,
        modifier = Modifier
            .drawBehind {
                rotate(spinAnimation) {
                    drawCircle(
                        brush = Brush.sweepGradient(
                            colors = listOf(
                                Color(0xFF59B7FF),
                                Color(0xFF59FF61),
                                Color(0xFFFF5959),
                            ),
                        ),
                        style = Stroke(50f),
                        blendMode = BlendMode.SrcIn
                    )

                    drawRoundRect(
                        brush = Brush.sweepGradient(
                            colors = listOf(
                                Color(0xFF59B7FF),
                                Color(0xFF59FF61),
                                Color(0xFFFF5959),
                            )
                        )
                    )
                        drawArc(
                             brush = Brush.sweepGradient(
                                colors = listOf(
                                    Color(0xFF59B7FF),
                                    Color(0xFF59FF61),
                                    Color(0xFFFF5959),
                                )
                            ),
                            startAngle = 0f,
                            useCenter = true,
                            sweepAngle = 10f
                        )
                    }
                }
            .clip(shape = CircleShape)
    )
}

@Composable
@Preview(showBackground = true)
fun AnimatedProfileBorderPreview(modifier: Modifier = Modifier) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AnimatedProfileBorder()
        }
    }
}