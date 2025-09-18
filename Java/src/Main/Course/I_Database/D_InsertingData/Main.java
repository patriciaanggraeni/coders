package Course.I_Database.D_InsertingData;

import java.sql.*;
import java.util.Scanner;

public class Main {
    
    private static byte umur;
    private static String nama, nip;
    private static Connection connectDB;
    
    public static void main(String[] args) {
        
        createConnection();
        insertQuery();
        
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
    
    private static void inputData() {
        
        Scanner inputNama = new Scanner(System.in);
        Scanner inputNip  = new Scanner(System.in);
        Scanner inputUmur = new Scanner(System.in);
    
        System.out.print("Nama : ");
        nama = inputNama.nextLine();
        System.out.print("NIP  : ");
        nip = inputNip.nextLine();
        System.out.print("Umur : ");
        umur = inputUmur.nextByte();
    }
    
    private static void insertQuery() {
        
        inputData();
        
        try {
            
            String dosen = "INSERT INTO dosen (nama, nip, umur) VALUES (" 
                + "'" + nama + "', " + "'" + nip + "', " + "'" + umur + "');";
            
            Statement stmt = connectDB.createStatement();
            stmt.execute(dosen);
            stmt.close();
            
            System.out.println("Insertion Successfuly!");
            
        } catch (Exception e) { e.printStackTrace(); }
    }    
    
}
