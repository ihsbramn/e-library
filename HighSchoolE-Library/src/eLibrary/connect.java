/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eLibrary;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ikhsan Abdurachman
 */
public class connect {
    public static Connection yey=null;
    public static Connection getCon(){
        if (yey == null) {
            try {
                String url = "jdbc:mysql://localhost/e-library";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                yey = DriverManager.getConnection(url, "root", "");
            } catch (Exception e) {
                System.err.println("Connection Failed" + e.getMessage());
            }
            
        }
        return yey;
    }
    
}
