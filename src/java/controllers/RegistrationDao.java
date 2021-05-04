
package controllers;

import java.sql.*;


public class RegistrationDao {
 
     public boolean add(RegistrationBean r)
    {
        boolean status=false;
        try{
            Connection con = DataConnection.getConnection();
            if(con!=null)
            {
                String sql="INSERT INTO `registration`(`email`,`first_name`,`last_name`,`pwd`,`securityQue`,`securityAns`) VALUES (?,?,?,?,?,?)";
               
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, r.getEmail());
                smt.setString(2, r.getFirst_name());
                smt.setString(3, r.getLast_name());
                smt.setString(4, r.getPwd());
                smt.setString(5, r.getSecurityQue());
                smt.setString(6, r.getSecurityAns());
                
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
     
     public boolean checkid(RegistrationBean rb)
    {
        boolean status = false;
        try{
        Connection con = DataConnection.getConnection();
        if(con!=null)
        {
            String sql =" select * from registration where email=? ";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, rb.getEmail());
            
            ResultSet rs = smt.executeQuery();
            if(rs.next())
            {
                status=true;
            }
            
            con.close();
        }
        }catch(Exception e)
        {
            System.out.println("getby email error :" + e.getMessage());
        }
        return status;
    }
  
   public boolean checkuser(RegistrationBean rb)
    {
        boolean status = false;
        try{
        Connection con = DataConnection.getConnection();
        if(con!=null)
        {
            String sql =" select * from registration where email=? and pwd =?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, rb.getEmail());
            smt.setString(2, rb.getPwd());
            
            ResultSet rs = smt.executeQuery();
            if(rs.next())
            {
                status=true;
            }
            
            con.close();
        }
        }catch(Exception e)
        {
            System.out.println("checkuser error :" + e.getMessage());
        }
        return status;
    }

     public boolean updatepwd(RegistrationBean rb)
    {
        boolean status = false;
        try{
            Connection con = DataConnection.getConnection();
            if(con!=null)
            {
                String sql ="update registration set pwd=? where email=?";
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
     
     
       public RegistrationBean getByEmail(String email)
    {
        RegistrationBean rb=null;
        try{
            
        Connection con = DataConnection.getConnection();
        if(con!=null)
        {
            String sql =" select * from registration where email=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, email);
            ResultSet rs = smt.executeQuery();
            if(rs.next())
            {
                    rb= new RegistrationBean();
                    
                    rb.setEmail(rs.getString("email"));
                    rb.setFirst_name(rs.getString("first_name"));
                    rb.setLast_name(rs.getString("last_name"));
                    rb.setPwd(rs.getString("pwd"));
                    rb.setSecurityQue(rs.getString("securityQue"));
                    rb.setSecurityAns(rs.getString("securityAns"));
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
       public boolean checkAns(RegistrationBean rb)
    {
        boolean status = false;
        try{
        Connection con = DataConnection.getConnection();
        if(con!=null)
        {
            String sql =" select * from registration where email=? and securityQue=? and securityAns =?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, rb.getEmail());
            smt.setString(2, rb.getSecurityQue());
            smt.setString(3, rb.getSecurityAns());
            
            ResultSet rs = smt.executeQuery();
            if(rs.next())
            {
                status=true;
            }
            
            con.close();
        }
        }catch(Exception e)
        {
            System.out.println("check security question and answer:" + e.getMessage());
        }
        return status;
    }

     public String checkByEmail(String email)
    {
       String sendemail=null;
        try{
        Connection con = DataConnection.getConnection();
        if(con!=null)
        {
            String sql =" select * from registration where email=? ";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, email);
            
            ResultSet rs = smt.executeQuery();
            if(rs.next())
            {
                sendemail = email;
            }          
            con.close();
        }
        }catch(Exception e)
        {
            System.out.println("check by email error :" + e.getMessage());
        }
        System.out.println("email in chekbyemail : " + sendemail);
        return sendemail;
    }

      public boolean updatepwdByEmail(String email, String pwd)
    {
        boolean status = false;
        try{
            Connection con = DataConnection.getConnection();
            if(con!=null)
            {
                String sql ="update registration set pwd=? where email=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, pwd);
                smt.setString(2, email);
                
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
