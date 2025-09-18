package TugasKuliah.Semester3.Minggu13.Tugas.Backend;

import java.sql.*;
import java.util.ArrayList;

public class Peminjaman {
    
    private int idPeminjaman;
    private String tglKembalian;
    private String tglPeminjaman;
    
    private Buku buku = new Buku();
    private Anggota anggota = new Anggota();
    
    public Peminjaman() {}
    
    public Peminjaman(Anggota anggota, Buku buku, String tglPeminjaman, String tglKembalian) {
        this.anggota = anggota;
        this.buku = buku;
        this.tglPeminjaman = tglPeminjaman;
        this.tglKembalian = tglKembalian;
        
    }

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public String getTglKembalian() {
        return tglKembalian;
    }

    public String getTglPeminjaman() {
        return tglPeminjaman;
    }

    public Buku getBuku() {
        return buku;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public void setTglKembalian(String tglKembalian) {
        this.tglKembalian = tglKembalian;
    }

    public void setTglPeminjaman(String tglPeminjaman) {
        this.tglPeminjaman = tglPeminjaman;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }
    
    public Peminjaman getById(int id) {
        Peminjaman peminjaman = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT " 
            + "p.idpeminjaman AS idpeminjaman, "
            + "a.idanggota AS idanggota, " 
            + "b.idbuku AS idbuku, "
            + "b.penulis AS penulis, "
            + "p.tanggalpinjam AS tanggalpinjam, " 
            + "p.tanggalkembali AS tanggalkembali "
            + "FROM peminjaman p " 
            + "LEFT JOIN anggota a ON a.idanggota = p.idanggota "
            + "LEFT JOIN buku b ON b.idbuku = p.idbuku "
            + "WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idbuku"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.setTglPeminjaman(rs.getString("tanggalpinjam"));
                peminjaman.setTglKembalian(rs.getString("tanggalkembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return peminjaman;
    }
    
     public ArrayList<Peminjaman> getAll() {
         
        Peminjaman peminjaman = new Peminjaman();
        ArrayList<Peminjaman> listPeminjaman = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery("SELECT " 
            + "p.idpeminjaman AS idpeminjaman, "
            + "a.idanggota AS idanggota, " 
            + "b.idbuku AS idbuku, "
            + "b.penulis AS penulis, "
            + "p.tanggalpinjam AS tanggalpinjam, " 
            + "p.tanggalkembali AS tanggalkembali "
            + "FROM peminjaman p " 
            + "LEFT JOIN anggota a ON a.idanggota = p.idanggota "
            + "LEFT JOIN buku b ON b.idbuku = p.idbuku");

        try {
            while (rs.next()) {
                peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idbuku"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.setTglPeminjaman(rs.getString("tanggalpinjam"));
                peminjaman.setTglKembalian(rs.getString("tanggalkembali"));
                
                listPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listPeminjaman;
    }
    
     public ArrayList<Peminjaman> search(String keyword) {
         
        Peminjaman peminjaman = new Peminjaman();
        ArrayList<Peminjaman> listPeminjaman = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery("SELECT " 
            + "p.idpeminjaman AS idpeminjaman, "
            + "a.idanggota AS idanggota, " 
            + "b.idbuku AS idbuku, "
            + "b.penulis AS penulis, "
            + "p.tanggalpinjam AS tanggalpinjam, " 
            + "p.tanggalkembali AS tanggalkembali "
            + "FROM peminjaman p " 
            + "LEFT JOIN anggota a ON a.idanggota = p.idanggota "
            + "LEFT JOIN buku b ON b.idbuku = p.idbuku " 
            + "WHERE a.idanggota LIKE '%" + keyword + "%' " 
            + "OR b.idbuku LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idbuku"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.setTglPeminjaman(rs.getString("tanggalpinjam"));
                peminjaman.setTglKembalian(rs.getString("tanggalkembali"));
                
                listPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listPeminjaman;
    }
     
    public void save() {
        if (getById(idPeminjaman).getIdPeminjaman() == 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES " +
                    "('" + this.getAnggota().getIdAnggota()+ "', " + 
                    " '" + this.getBuku().getIdBuku() + "', " + 
                    " '" + this.tglPeminjaman + "', " + 
                    " '" + this.tglKembalian + "')";
            this.idPeminjaman = DBHelper.insertQueryGetId(sql);
        } else {
            String sql = "UPDATE peminjaman SET "
                    + "idanggota = '" + this.getAnggota().getIdAnggota() + "', "
                    + "idbuku = '" + this.getBuku().getIdBuku() + "', "
                    + "tanggalpinjam = '" + this.tglPeminjaman + "', "
                    + "tanggalkembali = '" + this.tglKembalian + "' " 
                    + "WHERE idpeminjaman = '" + this.idPeminjaman + "'";
            DBHelper.executeQuery(sql);
        }
    }

    public void delete() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idPeminjaman + "'";
        DBHelper.executeQuery(sql);
    }
 
}