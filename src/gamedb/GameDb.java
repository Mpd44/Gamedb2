/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedb;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author river
 */
public class GameDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        final String QUERY = "Select * from Games";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/s2emp", "river", "mucis");
                PreparedStatement stmt = con.prepareStatement(QUERY)){
            System.out.println(stmt.toString());
            ResultSet rs = stmt.executeQuery(QUERY);
            while (rs.next()){
                System.out.println(
                +rs.getInt("gameid")
                +rs.getString("genre")
                +rs.getString("rating")
                +rs.getString("title")
                );
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(GameDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
