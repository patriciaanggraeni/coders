package com.example.basic.other.hacks

// membuat typealias untuk return type fungsi
typealias PhotoUrlOne = String

// atau lebih kompleks sedikit
typealias PhotoUrlTwo = Result<String>

interface PhotoUploader {

    // membuat fungsi upload foto dengan return Result<String>
    suspend fun uploadPhoto1(bytes: ByteArray): Result<String>

    // jika bingung dengan tipe returnnya, bisa menggunakan typealias
    suspend fun upoadPhoto2(bytes: ByteArray): Result<PhotoUrlOne>

    // atau bisa begini...
    suspend fun uploadPhoto3(bytes: ByteArray): PhotoUrlTwo

    // bisa digunakan jika tipe sudah sangat kompleks (bersarang)

}