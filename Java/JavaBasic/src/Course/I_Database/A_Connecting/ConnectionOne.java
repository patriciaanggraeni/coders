package Course.I_Database.A_Connecting;

import java.sql.*;
public class ConnectionOne {
    
    public static void createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "AnggaSusilo", "Anggara27042022");
            System.out.println("Connection Successfuly!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        
        ConnectionOne.createConnection();
        
    }
}
