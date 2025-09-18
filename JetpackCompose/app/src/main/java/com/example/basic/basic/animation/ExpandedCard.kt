package com.example.basic.basic.animation

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExpandableCard() {
    var expandedState by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(
        targetValue = if (expandedState) 180f else 0f,
        animationSpec = tween(
            durationMillis = 200,
            easing = LinearEasing
        )
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 200,
                    easing = LinearOutSlowInEasing
                )
            ),
        shape = MaterialTheme.shapes.small,
        onClick = { expandedState = !expandedState }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Expanded Card",
                    color = Color.Black,
                    fontSize = MaterialTheme.typography.titleMedium.fontSize,
                    fontWeight = FontWeight.Bold
                )
                IconButton(
                    modifier = Modifier
                        .alpha(.6f)
                        .rotate(rotationState),
                    onClick = { expandedState = !expandedState }
                ) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowDown,
                        contentDescription = "Arrow Down"
                    )
                }
            }

            if (expandedState) {
                Text(
                    text = "Click Insert and then choose the elements you want from the different galleries. Themes and styles also help keep your document coordinated.",
                    fontSize = MaterialTheme.typography.titleSmall.fontSize,
                    color = Color.Black.copy(alpha = .5f),
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ExpandableCardPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(15.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ExpandableCard()
        }
    }
}