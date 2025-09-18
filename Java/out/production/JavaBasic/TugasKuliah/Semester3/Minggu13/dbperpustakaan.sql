-- Active: 1669166795612@@127.0.0.1@3306@dbperpus
D
ROP DATABASE IF EXISTS dbperpus;
CREATE DATABASE dbperpus;
USE dbperpus; 

DROP TABLE IF EXISTS kategori;
DROP TABLE IF EXISTS buku;
DROP DATABASE IF EXISTS anggota;
DROP TABLE IF EXISTS peminjaman;

CREATE TABLE kategori (
    idkategori INT(11) AUTO_INCREMENT NOT NULL PRIMARY KEY, 
    nama VARCHAR(255) NOT NULL, 
    keterangan VARCHAR(255) NOT NULL
);

CREATE TABLE buku (
    idbuku INT(11) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    idkategori INT(11) NOT NULL, 
    judul VARCHAR(255) NOT NULL, 
    penerbit VARCHAR(255) NOT NULL,
    penulis VARCHAR(255) NOT NULL 
);

CREATE TABLE anggota (
    idanggota INT(11) AUTO_INCREMENT PRIMARY KEY NOT NULL, 
    nama VARCHAR(255) NOT NULL, 
    alamat VARCHAR(255) NOT NULL, 
    telepon VARCHAR(255) NOT NULL 
);

CREATE TABLE peminjaman (
    idpeminjaman INT(11) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    idanggota INT(11) NOT NULL,
    idbuku INT(11) NOT NULL,
    tanggalpinjam DATE NOT NULL,
    tanggalkembali DATE NOT NULL
);

ALTER TABLE buku ADD FOREIGN KEY (idkategori)
    REFERENCES kategori(idkategori);

ALTER TABLE peminjaman ADD FOREIGN KEY (idanggota) 
    REFERENCES anggota(idanggota);

ALTER TABLE peminjaman ADD FOREIGN KEY (idbuku) 
    REFERENCES buku(idbuku);