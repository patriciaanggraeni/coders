package Course.I_Database.G_PreparedStement;

import java.sql.*;
import java.util.Scanner;

public class Main {
    
    private static Connection connectDB;
    
    public static void main(String[] args) {
        
        insertQuery();
        selectQuery();
        
    }
    
    private static void createConnection() {
        
        try {
        
            String url = "jdbc:mysql://127.0.0.1:3306/db_mhs";
            String user = "AnggaSusilo";
            String password = "Anggara27042022";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connectDB = DriverManager.getConnection(url, user, password);
            
        } catch (Exception e) { e.printStackTrace(); }
        
    }
    
    private static void insertQuery() {
    
        Scanner scNama = new Scanner(System.in);
        Scanner scNim = new Scanner(System.in);
        Scanner scUmur = new Scanner(System.in);
        
        System.out.print("Nama : ");
        String nama = scNama.nextLine();

        System.out.print("NIM  : ");
        String nim = scNim.nextLine();

        System.out.print("Umur : ");
        byte umur = scUmur.nextByte();
        
        try {
            
            createConnection();
            
            PreparedStatement stmt = connectDB.prepareStatement("INSERT INTO mahasiswa (nama, nim, umur) VALUES (?, ?, ?);");
            stmt.setString(1, nama);
            stmt.setString(2, nim);
            stmt.setByte(3, umur);
            
            stmt.execute();
            stmt.close();
            
            System.out.println("Inertion Successfuly!");
            
        } catch (Exception e) { e.printStackTrace(); }
        
    }
    
    private static void selectQuery() {
        
        try {
            
            createConnection();
        
            Statement stmt = connectDB.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM mahasiswa;");
            System.out.println(" ");
            
            while (result.next()) {
                System.out.println("id_mhs   : " + result.getInt("id_mhs"));
                System.out.println("Nama     : " + result.getString("nama"));
                System.out.println("NIM      : " + result.getString("nim"));
                System.out.println("Umur     : " + result.getByte("umur"));
                System.out.println(" ");
            }
            
        } catch (Exception e) { e.printStackTrace(); }
    }
}
