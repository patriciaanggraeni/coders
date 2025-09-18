#!/bin/bash

# --- Comment in Bash


: '
    ----- Content
    1. Introduction
    2. Single Line Comment
    3. Multi Line Comment
    ------ End
'


# --- 1. Introduction
<<comment
    1. Komentar satu baris diawali dengan simbol pagar/hashtag kecuali shebang 
       yang setelahnya diberi tanda petik (tidak akan dianggap sebagai komentar).
    2. Komentar dengan lebih dari satu baris (multiline comment), ada dua cara 
       untuk mendeklarasikannya, yaitu menggunakan:
           => :' ... '
           => <<comment ... comment
comment


# --- 2. Single Line Comment
# ini adalah komentar satu baris


# --- 3. Multi Line Comment
: '
Ini adalah komentar pada beberapa baris.
Komentar ini dapat terdiri dari beberapa baris teks
dan diakhiri dengan karakter # pada baris terakhir.
'

<<comment
Ini adalah komentar pada beberapa baris. Komentar ini dapat terdiri dari 
beberapa baris teks dan diakhiri dengan karakter # pada baris terakhir.
comment


# -------------------------------------------------------------------------------
# Explaining Code