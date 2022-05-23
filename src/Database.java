/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author datnsh
 */
public class Database {
    /**
     * @param args the command line arguments
     */
    public static Connection getConnection(){
        try{
            String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=PMSP;username=sa;password=sa";
            Connection conn = DriverManager.getConnection(connectionURL);
            //JOptionPane.showMessageDialog(null, "Connection Successful");
            return conn;
            }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        }
    }
    
