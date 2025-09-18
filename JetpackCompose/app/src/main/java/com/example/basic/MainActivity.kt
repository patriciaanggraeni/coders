package com.example.basic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.basic.ui.theme.BasicTheme
import com.example.basic.viewmodel.ContactViewModel

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<ContactViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel.backgroundColor
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Button(
                            onClick = { viewModel.changeBackgroundColor() }
                        ) {
                            Text(text = "Ubah warna background")
                        }
                    }
                }
            }
        }
    }
}