package Course.I_Database.C_ReadingData;

import java.sql.*;

public class Main {
    
    private static Connection connect_db;
    
    public static void main(String[] args) {
        
        selectQuery();
        
    }
    
    private static void createConnection() {
        
        try {
            
            String url = "jdbc:mysql://127.0.0.1:3306/db_mhs";
            String user = "AnggaSusilo";
            String password = "Anggara27042022";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connect_db = DriverManager.getConnection(url, user, password);
            
        } catch (Exception e) { e.printStackTrace(); }
    }
    
    private static void selectQuery() {
        
        createConnection();
        ResultSet result = null;
        
        try {
        
            Statement stmt = connect_db.createStatement();
            result = stmt.executeQuery("SELECT * FROM dosen WHERE id_dosen = 1;");
            
            while (result.next()) {
                System.out.println("id_dosen : " + result.getInt("id_dosen"));
                System.out.println("Nama     : " + result.getString("nama"));
                System.out.println("NIP      : " + result.getString("nip"));
                System.out.println("Umur     : " + result.getByte("umur"));
                System.out.println(" ");
            }
            
            result.close();
            
        } catch (Exception e) { e.printStackTrace(); }
    }
}
