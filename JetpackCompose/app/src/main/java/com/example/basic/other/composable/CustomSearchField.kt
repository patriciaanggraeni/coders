package com.example.basic.other.composable

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FilterList
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
private fun CustomSearchField(modifier: Modifier = Modifier) {
    var query by remember { mutableStateOf(TextFieldValue("")) }
    var keyboardController = LocalSoftwareKeyboardController.current
    var isSearchActive by remember { mutableStateOf(false) }

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 5.dp, end = 5.dp, bottom = 0.dp, start = 5.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 5.dp)
                    .background(
                        color = Color.Transparent,
                        shape = MaterialTheme.shapes.large
                    )
                    .border(
                        width = 1.dp,
                        color = Color.Black,
                        shape = MaterialTheme.shapes.large
                    )
                    .clip(shape = MaterialTheme.shapes.large)
            ) {
                BasicTextField(
                    value = query,
                    onValueChange = { newText -> query = newText },
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 17.sp,
                        color = Color.Black
                    ),
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 5.dp, vertical = 5.dp),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Search
                    ),
                    keyboardActions = KeyboardActions(
                        onSearch = {
                            keyboardController?.hide()
                        }
                    ),
                    decorationBox = { innerTextField ->
                        if (query.text.isEmpty()) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Filled.Search,
                                    contentDescription = "Search Icon",
                                    tint = Color.Black
                                )

                                Text(
                                    text = "Search",
                                    color = Color.Gray,
                                    fontSize = 17.sp
                                )
                            }
                            isSearchActive = false
                        }
                        isSearchActive = true
                        innerTextField()
                    }
                )
            }
            IconButton(onClick = { /* Handle filter action */ }) {
                Icon(
                    imageVector = Icons.Filled.FilterList,
                    contentDescription = "Filter",
                    Modifier.size(30.dp),
                    tint = Color.Black
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        if (isSearchActive && query.text.isNotEmpty()) {
            Text(text = "Items Found!")
        }
    }
}

@Composable
@Preview(showBackground = true)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun SearchFieldPreview() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CustomSearchField()
        }
    }
}