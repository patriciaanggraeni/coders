package TugasKuliah.Semester3.Minggu13.Tugas.Backend;

import java.sql.*;
import java.util.ArrayList;

public class Kategori {

    private int idKategori;
    private String nama;
    private String keterangan;

    public Kategori() {}

    public Kategori(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    public String toString() {
        return nama;
    }

    public Kategori getById(int id) {
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kat;
    }

    public ArrayList<Kategori> getAll() {
        ArrayList<Kategori> listKategori = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori");

        try {

            while(rs.next()) {
                Kategori kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                listKategori.add(kat);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listKategori;
    }

    public ArrayList<Kategori> search(String keyword) {
        ArrayList<Kategori> listKategori = new ArrayList<>();

        String sql = "SELECT * FROM kategori WHERE nama LIKE '%" + keyword + "%' OR keterangan LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);

        try {

            while (rs.next()) {
                Kategori kat = new Kategori();
                kat.setIdKategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                listKategori.add(kat);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listKategori;
    }

    public void save() {
        if (getById(idKategori).getIdKategori() == 0) {
            String sql = "INSERT INTO kategori (nama, keterangan) VALUES " +
                    "('" + this.nama + "', " + " '" + this.keterangan + "')";
            this.idKategori = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE kategori SET "
                    + "nama = '" + this.nama + "', "
                    + "keterangan = '" + this.keterangan + "' "
                    + "WHERE idKategori = '" + this.idKategori + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "DELETE FROM kategori WHERE idkategori = '" + this.idKategori + "'";
        DBHelper.executeQuery(sql);
    }
}