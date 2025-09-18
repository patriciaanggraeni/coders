package Project.Project4_OnlineShop;

import Project.Project4_OnlineShop.Config.DBConfig;

public class Main {
    
    public static void main(String[] args) {
        
        DBConfig.connectToDatabase();
        DBConfig.selectQueryById(2);
        DBConfig.searchQuery("ds");
        
    }
    
}
