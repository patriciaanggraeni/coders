package Course.I_Database.E_UpdatingData;

import java.sql.*;

public class Main {
    
    private static Connection connectDB;
    
    public static void main(String[] args) {
        
        updateQuery();
        
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
    
    private static void updateQuery() {
        
        createConnection();
        String nama = "Cahya Kusuma";
        int id_mhs = 2;
        
        try {
            
            PreparedStatement stmt = connectDB.prepareStatement("UPDATE mahasiswa SET "
                    + "nama = ?" +  " WHERE id_mhs = ?;");
            
            stmt.setString(1, nama);
            stmt.setInt(2, id_mhs);
            stmt.executeUpdate();
            stmt.close();
            
            System.out.println("Update Successfuly!");
            
        } catch (Exception e) { e.printStackTrace(); }
    
    }
}
