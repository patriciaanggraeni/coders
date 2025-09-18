package com.example.basic.other.composable

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun AnimatedSelectable(
    modifier: Modifier = Modifier,
    selected: Boolean,
    title: String,
    titleColor: Color =
        if (selected) MaterialTheme.colorScheme.primary
        else MaterialTheme.colorScheme.onSurface.copy(alpha = .5f),
    titleSize: TextUnit = MaterialTheme.typography.titleLarge.fontSize,
    titleWeight: FontWeight = FontWeight.Medium,
    subtitle: String? = null,
    subtitleColor: Color =
        if (selected) MaterialTheme.colorScheme.primary
        else MaterialTheme.colorScheme.onSurface.copy(alpha = .5f),
    borderWidth: Dp = 1.dp,
    borderColor: Color =
        if (selected) MaterialTheme.colorScheme.primary
        else MaterialTheme.colorScheme.onSurface.copy(alpha = .5f),
    borderShape: Shape = RoundedCornerShape(10.dp),
    icon: ImageVector = Icons.Default.CheckCircle,
    iconColor: Color =
        if (selected) MaterialTheme.colorScheme.primary
        else MaterialTheme.colorScheme.onSurface.copy(alpha = .5f),
    onClick: () -> Unit
) {
    val scaleA = remember { Animatable(initialValue = 1f) }
    val scaleB = remember { Animatable(initialValue = 1f) }

    LaunchedEffect(key1 = selected) {
        if (selected) {
            launch {
                scaleA.animateTo(
                    targetValue = 0.3f,
                    animationSpec = tween(
                        durationMillis = 300
                    )
                )
                scaleA.animateTo(
                    targetValue = 1f,
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
            }
             launch {
                scaleB.animateTo(
                    targetValue = 0.3f,
                    animationSpec = tween(
                        durationMillis = 300
                    )
                )
                scaleB.animateTo(
                    targetValue = 1f,
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
            }
        }
    }

    Column(
        modifier = modifier
            .scale(scale = scaleB.value)
            .border(
                width = borderWidth,
                color = borderColor,
                shape = borderShape
            )
            .clip(shape = borderShape)
            .clickable { onClick() }
    ) {
        Row(
            modifier = Modifier.padding(start = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.weight(8f),
                text = title,
                style = TextStyle(
                    color = titleColor,
                    fontSize = titleSize,
                    fontWeight = titleWeight
                ),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            IconButton(
                modifier = Modifier
                    .weight(2f)
                    .scale(scale = scaleA.value),
                onClick = onClick
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = "",
                    tint = iconColor
                )
            }
        }

        if (subtitle != null) {
            Text(
                modifier = Modifier
                    .padding(horizontal = 12.dp)
                    .padding(bottom = 10.dp),
                text = subtitle,
                style = TextStyle(
                    color = subtitleColor
                ),
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun AnimatedSelectedPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 50.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var selected by remember { mutableStateOf(false) }
            var selected2 by remember { mutableStateOf(false) }

            AnimatedSelectable(
                selected = selected,
                title = "Lorem Ipsum",
                onClick = { selected = !selected }
            )
            Spacer(modifier = Modifier.height(30.dp))
            AnimatedSelectable(
                selected = selected2,
                title = "Lorem Ipsum",
                subtitle = "Merancang dan mengembangkan antarmuka pengguna (UI) dan pengalaman pengguna (UX) untuk aplikasi web dan mobile menggunakan software Figma. Melakukan white framing dan prototyping untuk memvalidasi desain UI/UX sebelum pengembangan.",
                onClick = { selected2 = !selected2 }
            )
        }
    }
}