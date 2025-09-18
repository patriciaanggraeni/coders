package com.example.basic.basic.material3

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.CopyAll
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
private fun AppBar(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomAppBar(
                containerColor = Color(0xFFCACACA),
                actions = {
                    IconButton(
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Share,
                            contentDescription ="Share"
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Edit,
                            contentDescription = "Edit"
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ }
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.CopyAll,
                            contentDescription ="Copy All"
                        )
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { /*TODO*/ },
                        containerColor = Color(0xFF1CE6E6)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Add,
                            contentDescription = "Add"
                        )
                    }
                }
            )
        }
    ) {}
}