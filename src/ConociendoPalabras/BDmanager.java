package ConociendoPalabras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import javax.sql.*;
import javax.swing.*;
import org.sqlite.*;

/**
 *
 * @author Miguel Martinez
 */
public class BDmanager {
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\julio\\ULA\\Servicio Comunitario\\ConociendoPalabras\\db\\testDB.db");
           // JOptionPane.showMessageDialog(null, "Database connected");
            return conn;
        }catch(Exception e){
           // JOptionPane.showMessageDialog(null, "Database not connected");
            return null;
        }
    }
    
    
}
