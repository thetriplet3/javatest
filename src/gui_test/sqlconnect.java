/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_test;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class sqlconnect {
    static String db = "jdbc:mysql://localhost:3306/j_test";
    static String usr = "root";
    Connection con = null;
    
    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(db, usr, "");
            JOptionPane.showMessageDialog(null, "Connected to db");
            return con;
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getCause());
            return null;
        }
    }
}
