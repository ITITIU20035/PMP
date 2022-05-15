package pmp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author datnsh
 */
public class Database {
    Connection conn=null;
    public static Connection java_db(){
        
        try{
            Connection conn =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=PMSP;username=sa;password=sa\"");
            JOptionPane.showMessageDialog(null, "Connection to database is successful");
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
