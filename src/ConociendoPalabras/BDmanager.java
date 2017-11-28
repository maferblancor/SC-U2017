package ConociendoPalabras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import java.io.File;



/**
 *
 * @author Miguel Martinez
 */
public class BDmanager {
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            String path = new File("src/resources/db/conociendoPalabras.db").getAbsolutePath();
            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + path);
           // JOptionPane.showMessageDialog(null, "Database connected");
            return conn;
        }catch(Exception e){
           // JOptionPane.showMessageDialog(null, "Database not connected");
            return null;
        }
    }
    
    
}

