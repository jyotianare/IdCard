
package controllers;

import java.sql.*;

public class DataConnection {

     public static Connection getConnection(){
        Connection con=null;
        try{
          
            Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","");
        }
        catch(Exception e){
            System.out.println("Connection Error " + e.getMessage() );  
        } 
        return con;
    }
       
}
