#!/bin/bash

# --- Variables in Bash


: '
    ----- Content
    1. Introduction
    2. Data Types
    3. Scope
    4. Subsitution
    5. Special Variables
    ------ End
'


# --- 1. Introduction
<<comment
Variabel di bash cukup didefinisikan namanya saja, karena sifatnya dinamis jadi 
tidak perlu menuliskan tipe datanya secara eksplisit. Disarankan penulisan nama 
variabel menggunakan huruf besar semua. kenapa? karena jika menggunakan huruf 
kecil semua akan mengakibatkan bentrok nama dengan keyword bawaan bash.
comment

name="Nox Von Reinhafer" # tidak direkomendasikan
NAME="Nox Von Reinhafer" # direkomendasikan


# --- 2. Data Types
<<comment 
Ada tiga jenis tipe dasar di bash, yaitu String, Integer, dan Boolean
    1. String: kumpulan karakter, menggunakan tanda kutip ganda "..."
        => Contoh: "I use arch btw"
    2. Integer: angka, semua angka masuk (positif, negatif, natural, dll)
        => Contoh: 0, 10, 3.14159265358979323
    3. Boolean: hanya berisi dua nilai dan biasa digunakan untuk logika atau work-flow script.
        => Contoh: true, false
comment

STRING="Hello World!"
INTEGER=3.14
BOOLEAN=true

echo "Tipe data string: $STRING"
echo "Tipe data integer: $INTEGER"
echo "Tipe data boolean: $BOOLEAN"


# --- 3. Scope Variables
<<comment
Scope istilah dari lingkup dari variabel tersebut dapat diakses atau digunakan. Di bash 
terdapat dua jenis scope, yaitu lokal dan global:
    1. Local Scope: hanya bisa diakses secara lokal. Contoh:
        => menempatkan variabel di dalam sebuah fungsi
        => menambahkan keyword local sebelum nama variabel.
    2. Global Scope: bisa diakses secara global dalam program bash. Contoh: 
        => menempatkan variabel di luar block atau fungsi
        => menambahkan keyword export sebeklum nama variabel.
comment

function local_variable() { 
    local LOCAL_VAR="chelsea is my waifu" 
    eecho "Local variable: $LOCAL_VAR"
}

export GLOBAL_VAR="chelsea is my waifu"
echo "Global variable: $GLOBAL_VAR"


# --- 4. Subtitution
<<comment
Perintah subtitution memungkinkan untuk menyimpan hasil perintah ke dalam variabel. Formatnya 
dengan mengapit variabel menggunakan tanda kurung buka/tutup. Ada kurung buka/tutup tunggal dan 
ganda. Tunggal untuk perintah dan ganda untuk melakukan operasi artimatika. Contoh: 
    => COMMAND=$(command)   -> dijalankan sebagai perintah
    => AREA=$((SIDE * SIDE)) -> dijalankan sebagai ouput

Hasil perintah akan disimpan di dalam variabel tersebut.
comment

DATE=$(date +%Y-%m-%d)
echo "Tanggal: $DATE"


# --- 5. Special Variables
<<comment
Special variable adalah variabel yang sudah di definisan oleh bash sebelumnya, gampang 
udah builtin jadi tinggal pakai. Daftar spesial variabel:
    => $0 : Nama file Bash script yang sedang dijalankan.
    => $1, $2, $3, ... : Argumen yang dilewatkan pada Bash script, dimulai dari 
       $1 untuk argumen pertama, $2 untuk argumen kedua, dan seterusnya.
    => $# : Jumlah argumen yang dilewatkan pada Bash script.
    => $? : Kode keluaran dari perintah Bash yang terakhir dieksekusi.
    => $$ : Nomor proses (PID) dari proses Bash yang sedang berjalan.
    => $! : Nomor proses (PID) dari proses latar belakang terakhir yang dijalankan.
    => $* : Semua argumen yang dilewatkan pada Bash script, dalam bentuk satu string.
    => $@ : Semua argumen yang dilewatkan pada Bash script, dalam bentuk array.
    => $- : Menampilkan opsi-opsi yang dinyalakan pada Bash ketika menjalankan script.
    => $IFS : Menampilkan Internal Field Separator yang digunakan untuk memisahkan argumen pada Bash script.
    => $OLDPWD : Menampilkan direktori kerja sebelumnya (previous working directory) sebelum pindah ke direktori saat ini.
    => $PWD : Menampilkan direktori kerja saat ini (present working directory).
    => $RANDOM : Menampilkan angka acak antara 0 dan 32767.
    => $SECONDS : Menampilkan jumlah detik sejak script Bash dijalankan.
    => $SHELL : Menampilkan shell yang digunakan saat ini.
    => $USER : Menampilkan nama pengguna yang sedang login ke sistem.
    => $BASH : Menampilkan path dari shell Bash yang sedang digunakan.
    => $BASH_VERSION : Menampilkan versi dari shell Bash yang sedang digunakan.
    => $HOME : Menampilkan path dari direktori home (rumah) pengguna saat ini.
    => $HOSTNAME : Menampilkan nama host (mesin) dari sistem komputer saat ini.
    => $LINENO : Menampilkan nomor baris dimana special variable ini digunakan pada script Bash.
    => $PATH : Menampilkan path yang digunakan untuk mencari perintah (command) pada sistem komputer.
    => $PS1 : Menampilkan prompt string pertama yang digunakan dalam shell interaktif.
    => $PS2 : Menampilkan prompt string kedua yang digunakan dalam shell interaktif.

    sumber: https://kitaadmin.com/bash-variables-atau-variabel-pada-bash/#special-variable-pada-bash
comment