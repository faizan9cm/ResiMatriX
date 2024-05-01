/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;
//import javax.swing.JOptionPane;

/**
 *
 * @author Faizan Habib
 */
public class ConnectionProvider {

    public static Connection getCon() {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel", "root", "admin");
            return con;
        } 
        catch (Exception e) {
            return null;
        }
    }

}
