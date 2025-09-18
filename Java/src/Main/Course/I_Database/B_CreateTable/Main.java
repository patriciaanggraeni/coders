package Course.I_Database.B_CreateTable;

import java.sql.*;

public class Main {
    
    private static Connection connectDB;
    
    public static void main(String[] args) {
        
        createTable();
        
    }
    
    private static void createConnection() {
        
        try {
            
            String url = "jdbc:mysql://127.0.0.1:3306/db_mhs";
            String user = "AnggaSusilo";
            String password = "Anggara27042022";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connectDB = DriverManager.getConnection(url, user, password);
            
        } catch (Exception e) {  e.printStackTrace(); }
        
    }
    
    private static void createTable() {
            
        try {
            
            createConnection();
            String tblExists = "DROP TABLE IF EXISTS dosen;";
            String tblDosen = "CREATE TABLE dosen ("
                    + "id_dosen INT AUTO_INCREMENT PRIMARY KEY NOT NULL, "
                    + "nama VARCHAR(50) NOT NULL, "
                    + "nip VARCHAR(11) NOT NULL, "
                    + "umur TINYINT(2) NOT NULL"
                    + ");";
            
            Statement stmt = connectDB.createStatement();
            stmt.execute(tblExists);
            stmt.execute(tblDosen);
            stmt.close();
            
        } catch (Exception e) { e.printStackTrace(); }
    
    }
}
