package com.example.basic.advances.task

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basic.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var query by remember { mutableStateOf("") }
        var active by remember { mutableStateOf(false) }

        SearchBar(
            modifier = Modifier
                .padding(PaddingValues(0.dp)),
            query = query,
            onQueryChange = { query = it },
            onSearch = { /*TODO*/ },
            active = active,
            onActiveChange = { active = it },
            placeholder = { Text(text = "Search Anything...") },
            shape = RoundedCornerShape(15.dp),
            colors = SearchBarDefaults.colors(
                containerColor = Color(0xFFC0CA33)
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search Icon"
                )
            },
            trailingIcon = {
                Image(
                    modifier = Modifier
                        .size(30.dp)
                        .clip(shape = CircleShape),
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Profile Image"
                )
            }
        ) {}
    }
}

@Composable
@Preview(showBackground = true)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun HomeScreenPreview() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            HomeScreen()
        }
    }
}