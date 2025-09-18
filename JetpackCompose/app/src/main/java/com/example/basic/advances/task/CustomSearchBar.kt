package com.example.basic.advances.task

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
fun CustomSearchBar() {
    Surface(modifier = Modifier.fillMaxWidth()) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp)
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = MaterialTheme.shapes.extraLarge
            )
            .clip(shape = MaterialTheme.shapes.extraLarge)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .clip(shape = MaterialTheme.shapes.extraLarge),
                verticalAlignment = Alignment.CenterVertically
            ) {
                var text by remember { mutableStateOf(TextFieldValue("")) }
                val interactionSource = remember { MutableInteractionSource() }

                BasicTextField(
                    value = text,
                    onValueChange = { newText -> text = newText },
                    modifier = Modifier
                        .weight(2f)
                        .padding(horizontal = 10.dp),
                    singleLine = true,
                    maxLines = 1,
                ) { innerTextField ->
                    TextFieldDefaults.DecorationBox(
                        value = text.text,
                        innerTextField = innerTextField,
                        enabled = true,
                        singleLine = true,
                        visualTransformation = VisualTransformation.None,
                        interactionSource = interactionSource,
                        contentPadding = PaddingValues(0.dp),
                        placeholder = {
                            Text(
                                text = "Search...",
                                fontSize = 17.sp
                            )
                        },
                        colors = TextFieldDefaults.colors(
                            disabledContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            disabledIndicatorColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        )
                    )
                }

                Box(modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp)
                    .height(35.dp)
                    .background(
                        color = Color(0xFF00897B),
                        shape = MaterialTheme.shapes.extraLarge
                    )
                    .clip(shape = MaterialTheme.shapes.extraLarge),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Search",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }
    }
}