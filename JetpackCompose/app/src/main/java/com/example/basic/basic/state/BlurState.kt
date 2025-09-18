package com.example.basic.basic.state

import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basic.R

@Composable
private fun BackgroundBlurEffect() {
    var checked by remember { mutableStateOf(false) }
    val blurEffect by animateDpAsState(
        targetValue = 5.dp,
        animationSpec = tween(
            durationMillis = 200,
            easing = LinearOutSlowInEasing
        ),
        label = ""
    )

    val colors = listOf(Color(0xFFFFB300), Color(0xFF7CB342))
    val gradient = Brush.linearGradient(colors = colors)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(
                    brush = gradient,
                    shape = RoundedCornerShape(5.dp)
                )
                .blur(radius = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier
                    .size((200 * .5f).dp)
                    .clip(shape = RoundedCornerShape((5 * .5).dp)),
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Image Profile"
            )
        }

        Switch(checked = checked, onCheckedChange = { checked = !checked } )
    }
}

@Composable
@Preview(showBackground = true)
private fun BackgroundBlurEffectPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        BackgroundBlurEffect()
    }
}