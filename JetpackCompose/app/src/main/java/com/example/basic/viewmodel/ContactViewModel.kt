package com.example.basic.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ContactViewModel(
    val text: String
): ViewModel() {

    var backgroundColor by mutableStateOf(Color.Yellow)
        private set

    fun changeBackgroundColor() {
        backgroundColor = Color.Red
    }

}