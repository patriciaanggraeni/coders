package com.example.basic.basic

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun BlurComposablePreview(modifier: Modifier = Modifier) {

    // menggunakan mutableStateOf untuk membuat sebuah keadaan yang dapat dirubah
    var checked by remember { mutableStateOf(false) }

    // jika ingin memberi effet blur pada sebuah composable, bisa menggunakan animateDpAsState
    val blurEffect by animateDpAsState(
        targetValue = if (checked) 10.dp else 0.dp,
        label = "Blured Teks Animation"
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            // panggil modifier blur dan taruh nilai blur di sini
            modifier = Modifier.blur(blurEffect),

            // teks yang ingin diberi effect blur
            text = "Hello World",

            // memberi gaya pada teks menggunakan TextStyle
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )

        // memberi jarak secara vertikal antar composable sebanyak 20dp
        Spacer(modifier = Modifier.height(20.dp))

        // mennggunakan composable switch untuk menjadikan teks di atas blur atau tidak
        Switch(
            // nilai ketika switch ditekan
            checked = checked,

            // ganti nilai checked ke true jika switch ditekan
            // dan nilai false jika switch ditekan kembali
            onCheckedChange = { checked = !checked }
        )
    }
}