package Course.I_Database.A_Connecting;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTwo {
    
    private static Connection connection;
    
    public static void createConnection() {
        
        try {
            
            String url = "jdbc:mysql://127.0.0.1:3306/test";
            String user = "AnggaSusilo";
            String password = "Anggara27042022";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connection = DriverManager.getConnection(url, user, password);
            
        } catch (Exception e) { e.printStackTrace(); } 
    }
    
    public static void main(String[] args) {
        
        ConnectionTwo.createConnection();
        
    }
    
}
