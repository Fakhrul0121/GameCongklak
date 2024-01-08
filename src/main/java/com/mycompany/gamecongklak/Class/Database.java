/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamecongklak.Class;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Database {
    static final String DB_URL = "jdbc:mysql://localhost/congklak";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public Database() throws SQLException{
        try{
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            stmt = conn.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"ConnectionError",JOptionPane.WARNING_MESSAGE);
        }
    }
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null,"Error:"+e.getMessage(),"Communication Error",
           JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    public void query (String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error:"+e.getMessage(),"Communication Error",
            JOptionPane.WARNING_MESSAGE);
        }
    }
}
