/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Willy
 */
public class Database {
    public Database(){
        
    }
    
    private String host = "localhost";
    private String port = "5432";
    private String db_name = "stockdb";
    private String username = "postgres";
    private String password = "root";
    
    public Connection useDbConnection(){
        String url = "jdbc:postgresql://"+host+":"+port+"/"+db_name;
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "root");
        
        Connection connexion = null;
        try {
            connexion = DriverManager.getConnection(url, props);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connexion;
    }
    
    public ResultSet findAllProducts() {
        ResultSet res = null;
        try {
            Connection connexion = useDbConnection();
            String query = "SELECT * FROM product";
            Statement stm = connexion.createStatement();
            res = stm.executeQuery(query);
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
