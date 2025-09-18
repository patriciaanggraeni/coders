package com.example.basic.other.composable

import android.view.RoundedCorner
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basic.R

@Composable
private fun ExpandedContent(modifier: Modifier = Modifier) {

    // membuat state, ini berguna untuk mengecek apakah komponen diperluas atau tidak
    var expanded by remember { mutableStateOf(false) }

    // membuat border rgb
    val infiniteTransition = rememberInfiniteTransition(label = "")
    val rotationAnimation = infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 3000,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart,
        ),
        label = ""
    )

    Surface(
        modifier = Modifier
            .padding(20.dp)
            .clip(shape = RoundedCornerShape(10.dp))
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Image(
                modifier = Modifier.clip(shape = RoundedCornerShape(10.dp)),
                painter = painterResource(id = R.drawable.leaf),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    modifier = Modifier
                        .drawBehind {
                            rotate(degrees = rotationAnimation.value) {
                                drawCircle(
                                    brush = Brush.sweepGradient(
                                        colors = listOf(
                                            Color(0xFF00ACC1),
                                            Color(0xFFFF4CC3),
                                            Color(0xFF7CB342),
                                            Color(0xFFC336FF),
                                        )
                                    ),
                                    style = Stroke(15f),
                                    blendMode = BlendMode.SrcIn
                                )
                            }
                        }
                        .size(35.dp)
                        .clip(shape = CircleShape),
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Patria Anggara")
            }
            Spacer(
                modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier.width(200.dp),
                   text = "Learn Android Basic Using Kotlin",
                   fontSize = MaterialTheme.typography.titleLarge.fontSize
                )
                Icon(
                    modifier = Modifier.size(24.dp),
                    imageVector = Icons.Outlined.BookmarkBorder,
                    contentDescription = null,
                    tint = Color(0xFF333333)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "May 7, 2024",
                fontSize = 12.sp,
                color = Color.Black.copy(alpha = .5f)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = stringResource(id = R.string.dummy_text),
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .clickable { expanded = !expanded }
                    .animateContentSize(
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioLowBouncy,
                            stiffness = Spring.StiffnessLow
                        )
                    ),
                maxLines = if (!expanded) 3 else 9
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ExpandedContentPreview(modifier: Modifier = Modifier) {

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFFFB300)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ExpandedContent()
        }
    }

}