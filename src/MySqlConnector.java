
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dcL
 */
public class MySqlConnector {
    
       public static Connection getConnection()
   {
       Connection con;
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itassetmanagement", "root","root");
           return con;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }

    
}
