package Project.Project4_OnlineShop.Config;

import java.sql.*;
import java.util.Scanner;

public class DBConfig {
    
    // 1. Buat variabel static final untuk url, user dan password
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/db_onlineshop";
    private static final String DB_USER = "AnggaSusilo";
    private static final String DB_PASSWORD = "Anggara27042022";
    
    // 2. Buat objek dari class Connection
    private static Connection connectDB;
    
    // 3. Buat method untuk menghubungkan java ke database
    public static void connectToDatabase() {
        
        try {
            
            // 4. Regristrasi koneksi menggunakan class DriverManager
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connectDB = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
        } catch (Exception e) { e.printStackTrace(); }
    
    }
    
    // 4. Buat method untuk menampilkan hasil berdasarkan id
    public static void selectQueryById(int id) {
        
        try {
            
            // 1. Buat query-nya
            String query = "SELECT " 
                    + "id_barang, nama_barang, harga_barang, stok_barang, created_at "  
                    + "FROM "
                    + "tbl_barang WHERE id_barang = " + id + ";";
            
            // 2. Buat statement baru digunakan untuk mengeksekusi query nantinya
            Statement statement = connectDB.createStatement();
            
            // 3. Buat objek ResultSet untuk menampung hasil eksekusi query
            ResultSet resultStatement = statement.executeQuery(query);
            
            // 4. Tampilkan hasil execute query menggunakan while loop
            while (resultStatement.next()) {
                
                System.out.println("ID Barang    : " + resultStatement.getInt("id_barang"));
                System.out.println("Nama Barang  : " + resultStatement.getString("nama_barang"));
                System.out.println("Harga Barang : " + resultStatement.getInt("harga_barang"));
                System.out.println("Stok Barang  : " + resultStatement.getInt("stok_barang"));
                System.out.println("Dibuat pada  : " + resultStatement.getDate("created_at"));
            }
        
        } catch (Exception e) { e.printStackTrace(); }
    
    }
    
    // 5. Buat method untuk mencari data berdasarkan kata kunci
    public static void searchQuery(String keyword) {  
        
        try {
            
            String query = "SELECT *"
                    + "FROM tbl_barang "
                    + "WHERE nama_barang LIKE '%" + keyword + "%';";
            
            Statement statement = connectDB.createStatement();
            ResultSet resultStatement = statement.executeQuery(query);

            while (resultStatement.next()) {
                System.out.println("ID Barang    : " + resultStatement.getInt("id_barang"));
                System.out.println("Nama Barang  : " + resultStatement.getString("nama_barang"));
                System.out.println("Harga Barang : " + resultStatement.getInt("harga_barang"));
                System.out.println("Stok Barang  : " + resultStatement.getInt("stok_barang"));
                System.out.println("Dibuat pada  : " + resultStatement.getDate("created_at"));
            } 

        } catch (Exception e) { e.printStackTrace(); }
        
    }
    
}
