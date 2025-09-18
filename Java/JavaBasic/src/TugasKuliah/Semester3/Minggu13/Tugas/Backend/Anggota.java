package TugasKuliah.Semester3.Minggu13.Tugas.Backend;

import java.sql.*;
import java.util.ArrayList;

public class Anggota {

    private int idAnggota;
    private String nama;
    private String alamat;
    private String telephone;

    public Anggota() {}

    public Anggota(String nama, String alamat, String telephone) {
        this.nama = nama;
        this.alamat = alamat;
        this.telephone = telephone;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Anggota getById(int id) {
        Anggota anggota = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idAnggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelephone(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return anggota;
    }

    public ArrayList<Anggota> getAll() {
        ArrayList<Anggota> listAnggota = new ArrayList<>();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");

        try {

            while(rs.next()) {
                Anggota anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idAnggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelephone(rs.getString("telepon"));

                listAnggota.add(anggota);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listAnggota;
    }

    public ArrayList<Anggota> search(String keyword) {
        ArrayList<Anggota> listAnggota = new ArrayList<>();

        String sql = "SELECT * FROM anggota WHERE nama LIKE '%" + keyword + "%' OR telepon LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(sql);

        try {

            while (rs.next()) {
                Anggota anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idAnggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelephone(rs.getString("telepon"));

                listAnggota.add(anggota);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listAnggota;
    }

    public void save() {
        if (getById(idAnggota).getIdAnggota() == 0) {
            String sql = "INSERT INTO anggota (nama, alamat, telepon) VALUES " +
                    "('" + this.nama + "', " + "'" + this.alamat + "', " + 
                    " '" + this.telephone + "')";
            this.idAnggota = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE anggota SET "
                    + "nama = '" + this.nama + "', "
                    + "alamat = '" + this.alamat + "', "
                    + "telepon = '" + this.telephone + "' "
                    + "WHERE idanggota = '" + this.idAnggota + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "DELETE FROM anggota WHERE idanggota = '" + this.idAnggota + "'";
        DBHelper.executeQuery(sql);
    }
}