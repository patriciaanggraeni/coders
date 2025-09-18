package Course.I_Database.F_DeletingData;

import java.sql.*;

public class Main {
    
    private static Connection connectDB;
    
    public static void main(String[] args) {
        
        deleteQuery();
        
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
    
    private static void deleteQuery() {
        
        createConnection();
        int id_dosen = 1;
        
        try {
        
            PreparedStatement stmt = connectDB.prepareStatement("DELETE FROM dosen WHERE id_dosen = ?");
            stmt.setInt(1, id_dosen);
            stmt.executeUpdate();
            stmt.close();
            
            System.out.println("Delete Successfuly!");
            
        } catch (Exception e) { e.printStackTrace(); }
        
    }
    
}
