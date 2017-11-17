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
class BDmanager {
    Connection conn = null;
    
    static Connection ConnectDB(){
        try{
            //test
            Class.forName("org.sqlite.JDBC");
            //JOptionPane.showMessageDialog(null, "Database connected");
            return DriverManager.getConnection("jdbc:sqlite:db/testDB.db");
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, "Database not connected\n" + e.getMessage());
            return null;
        }
    }
    
    
}

