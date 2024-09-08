/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author names
 */
public class DbConnect {
    public static Connection con;
    public static Statement s;
    static {
    try{
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb","root","admin");
        s = con.createStatement();
    }catch(Exception ex){
        
            JOptionPane.showMessageDialog( null, ex);
                       
        }
    }
    
    
    
    
}
