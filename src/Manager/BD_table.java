/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.sql.*;
import javax.sql.*;

/**
 *
 * @author Miguel Martinez
 */
public class BD_table {

    private String dbName; //nombre de base de datos
    private String dbms; //mysql u otro
    private Connection dbConnection;

    public BD_table(Connection conn_, String dbName_, String dbms_) {

        this.dbName = dbName_;
        this.dbms = dbms_;

        this.dbConnection = conn_;
    }

    public static void viewTable(Connection con_) throws SQLException {

        Statement stmt = null;

        //Aqui se hace la consulta
        String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";

        try {
            stmt = con_.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {

                //Aqui se modificaria para agarrar cada dato como se debe
                String coffeeName = rs.getString("COF_NAME");
                int supplierID = rs.getInt("SUP_ID");
                float price = rs.getFloat("PRICE");
                int sales = rs.getInt("SALES");
                int total = rs.getInt("TOTAL");
                System.out.println(coffeeName + ", " + supplierID
                        + ", " + price + ", " + sales + ", " + total);
            }

        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
    }

    public Connection getConnection() throws SQLException {

        Connection conn = null;

        //Aqui se hace la coneccion con la base de datos, hay que investigar como se hace la coneccion segun
        //cada tipo de base de datos que se usara
        conn = DriverManager.getConnection("");

        return conn;
    }
}
