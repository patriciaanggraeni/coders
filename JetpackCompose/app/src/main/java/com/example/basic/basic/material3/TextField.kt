package com.example.basic.basic.material3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Password
import androidx.compose.material.icons.outlined.RemoveRedEye
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
private fun TextField() {
    var text by remember { mutableStateOf(TextFieldValue("")) }

    TextField(
        /**
         * Parameter value: menerima inputan dari pengguna dan menyimpannya di dalam variabel value.
         * Nilai yang diterima bisa [String] atau [TextFieldValue].
         */
        value = text,

        /**
         * Parameter onValueChange: mengupdate nilai sebelumnya dengan nilai yang baru dari inputan
         * pengguna. Nilai yang diterima bisa [String] atau [TextFieldValue].
         */
        onValueChange = { newText -> text = newText },

        /**
         * Parameter modifier: berfungsi untuk mengubah struktur kompoenen seperti lebar dan tinggi
         * komponen dan masih banyak lagi.
         */
        modifier = Modifier.width(300.dp),

        /**
         * Parameter enabled: mengatur ada tidaknya sebuah komponen. Jika nilai false maka komponen
         * dianggap mati/tidak bisa diapa-apain.
         */
        enabled = true,

        /**
         * Parameter readOnly: mengatur value dari [TextField] agar hanya bisa dibaca (tidak bisa diedit) akan
         * tetapi pengguna bisa memfokuskan dan menyalin teks. Fungsi sebenarnya adalah untuk data yang telah
         * disiapkan dan tidak dapat dirubah.
         */
        readOnly = false,

        /**
         * Parameter textStyle: memberikan gaya pada teks yang dimasukkan oleh pengguna (bukan untuk placeholder).
         */
        textStyle = TextStyle(
            fontSize = 17.sp,
            fontWeight = FontWeight.SemiBold,
        ),

        /**
         * Parameter label: memberikan label pada TextField. Label digunakan untuk menandakan [TextField] itu hanya
         * bisa diisi oleh nilai tertentu. Fungsi lain untuk membedakan [TextField] misal digunakan untuk input username
         * atau password. Jika difokus kan, label akan bergeser ke atas dan ukurannya akan mengecil dan tidak menghilang.
         */
        label = { Text(text = "Password") },

        /**
         * Parameter placeholder: hapir sama seperti label, tapi placeholder akan ditampilkan jika value masih kosong, dalam
         * artian pengguna belum menginputkan teks ke [TextField] dan akan hilang jika terdapat teks yang diinputkan.
         */
        placeholder = { Text(text = "Password") },

        /**
         * Parameter leadingIcon: menampilkan dan menempatkan [Icon] pada sisi paling kiri [TextField] (depan).
         */
        leadingIcon = {
            Icon(
                imageVector = Icons.Outlined.Password,
                contentDescription = null
            )
        },

        /**
         * Parameer trailingIcon: menampilkan dan menempatkan [Icon] pada sisi paling kanan [TextField] (belakang).
         */
        trailingIcon = {
            Icon(
                imageVector = Icons.Outlined.RemoveRedEye,
                contentDescription = null
            )
        },

        /**
         * Parameter supportingText: digunakan untuk menampilkan informasi tambahan di bawah
         * [TextField] seperti 'Password minimal memiliki 8 karakter'.
         */
        supportingText = { Text(text = "*Password must have last 8 character") },

        /**
         * Parameter isError: sebagai penanda bahwa teks yang diinputkan saat ini error dan akan
         * merubah warna indikator dan [Icon] mejadi merah. Error akan terdeteksi setelah pengguna
         * menekan tombol aksi.
         */
        isError = false,

        /**
         * Parameter visualTransformation: mentransformasikan teks yang diinputkan oleh pengguna menjadi
         * karakter lain seoerti toggle show/hide password yang merubah karakter normal menjadi bintang/
         * titik semua.
         */
        visualTransformation = PasswordVisualTransformation(),

        /**
         * Parameter singleLine: menjadikan [TextField] hanya memiliki satu baris teks saja. Biarpun
         * pengguna memasukkan banyak seklai teks, teks akan terus memanjang secara horizontal dan bisa
         * discroll. Jika parameter ini diberi nilai true, otomatis nilai parameter maxLine diset
         * menjadi satu.
         */
        singleLine = false,

        /**
         * Parameter maxLines: mengatur maksimal baris yang dapat diterima oleh [TextField]. Jika nilai
         * parameter singleLines diset ke true, parameter ini secara otomatis diset ke satu.
         */
        maxLines = 2,

        /**
         * Parameter minLines: mengatur minimal baris teks yang diinputkan ke [TextField]. Nilai harus
         * sama dengan satu atau lebih kecil dari nilai parameter maxLines.
         */
        minLines = 1,

        /**
         * Parameter shape: mendefinisikan bentuk dari komponen.
         */
        shape = RoundedCornerShape(10.dp),

        /**
         * Parameter colors: digunakan untuk mengubah warna TextField seperti container TextField
         * diubah menjadi warna transparan. Diisi dengan TextFieldDefautls dan memanggil fungsi statis
         * colors(...).
         */
        colors = TextFieldDefaults.colors(
            disabledContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent
        )
    )
}