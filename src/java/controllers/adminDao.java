package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class adminDao {
    
    public boolean checkuser(adminBean ab)
    {
        boolean status = false;
        try{
        Connection con = DataConnection.getConnection();
        if(con!=null)
        {
            String sql =" select * from admin where email=? and pwd =?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, ab.getEmail());
            smt.setString(2, ab.getPwd());
            
            ResultSet rs = smt.executeQuery();
            if(rs.next())
            {
                status=true;
            }
            
            con.close();
        }
        }catch(Exception e)
        {
            System.out.println("getby email and pwd error :" + e.getMessage());
        }
           System.out.println("status in admin dao add :" + status);
        
        return status;
    }
     public adminBean getByEmail(String email)
    {
        adminBean rb=null;
        try{
            
        Connection con = DataConnection.getConnection();
        if(con!=null)
        {
            String sql =" select * from admin where email=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, email);
            ResultSet rs = smt.executeQuery();
            if(rs.next())
            {
                    rb= new adminBean();
                    
                    rb.setEmail(rs.getString("email"));
                    rb.setName(rs.getString("name"));
                    rb.setPwd(rs.getString("pwd"));
                    
                    System.out.println(" in getbyemail  , email : " + email);
            }
            con.close();
        }
        }catch(Exception e)
        {
            System.out.println("getby email error :" + e.getMessage());
        }
        return rb;
    }
    public boolean updatepwd(adminBean rb)
    {
        boolean status = false;
        try{
            Connection con = DataConnection.getConnection();
            if(con!=null)
            {
                String sql ="update admin set pwd=? where email=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, rb.getPwd());
                smt.setString(2, rb.getEmail());
                
                int n= smt.executeUpdate();
                if(n!=0) status=true;
                con.close();
            }
        }
        catch(Exception e)
        {
            System.out.println(" update pwd error :" + e.getMessage());
        }
        return status;
    }
    
    
    
}
