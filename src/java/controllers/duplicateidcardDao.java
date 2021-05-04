
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class duplicateidcardDao {
    
    public boolean add(duplicateidcardBean d)
    {
        boolean status=false;
        try{
            Connection con = DataConnection.getConnection();
            if(con!=null)
            {
                
              String sql = "INSERT INTO `duplicateidcard`(`email`, `rollno`, `PaymentRef`) VALUES (?,?,?)";
               
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, d.getEmail());
                smt.setInt(2, d.getRollno());
                smt.setString(3, d.getPaymentRef());
                
                
                int n= smt.executeUpdate();
                if(n!=0) status=true;
                con.close();
            }
            
        }catch(Exception e)
        {
            System.out.println("insertion error:" + e.getMessage());
        }
        return status;
    }
      public ArrayList<duplicateidcardBean> getAllRecords()
    {
        ArrayList<duplicateidcardBean> studentlist = new ArrayList();
        try{
            Connection con = DataConnection.getConnection();
            if(con!=null)
            {
                String sql = "select * from duplicateidcard";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while(rs.next())
                {
                    duplicateidcardBean ni= new duplicateidcardBean();
                    
                    ni.setRollno(rs.getInt("rollno"));
                    ni.setEmail(rs.getString("email"));
                    ni.setPaymentRef(rs.getString("paymentRef"));
                    
                    
                    studentlist.add(ni);           
                }
                con.close();
            }
        }
        catch(Exception e)
        {
            System.out.println("getallrecords error : " +e.getMessage());
        }
        return studentlist;
    }
   
    
}
