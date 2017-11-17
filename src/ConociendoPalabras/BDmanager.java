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
<<<<<<< HEAD
class BDmanager {
    Connection conn = null;
    
    static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            //JOptionPane.showMessageDialog(null, "Database connected");
            return DriverManager.getConnection("jdbc:sqlite:db/testDB.db");
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, "Database not connected\n" + e.getMessage());
=======
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
>>>>>>> 13a3801f41ef303ecd6f2f6f0e47b4c62ab444b2
            return null;
        }
    }
    
    
}

