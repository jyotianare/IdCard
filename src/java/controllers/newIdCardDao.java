
package controllers;

import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
public class newIdCardDao {
 
    public boolean add(newIdCardBean ni)
    {
        boolean status=false;
        try{
            Connection con = DataConnection.getConnection();
            if(con!=null)
            {
               
                String sql="INSERT INTO `newidcard`(`rollno`, `first_name`, `last_name`, `father_name`, `mother_name`, `pmobile`, `email`, `mobile`, `dept`, `branch`, `sem`, `dob`, `degree`, `dateofjoin`, `aadhar_no`, `bloodgroup`, `gender`, `address`, `pic`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                PreparedStatement smt = con.prepareStatement(sql);
                
                  smt.setInt(1, ni.getRollno());
                smt.setString(2, ni.getFirst_name());
                smt.setString(3, ni.getLast_name());
                smt.setString(4, ni.getFather_name());
                smt.setString(5, ni.getMother_name());
                smt.setInt(6, ni.getPmobile());
                smt.setString(7, ni.getEmail());
                smt.setInt(8, ni.getMobile());
                smt.setString(9, ni.getDept());
                smt.setString(10, ni.getBranch());
                smt.setInt(11, ni.getSem());
                smt.setString(12, ni.getDob());
                smt.setString(13, ni.getDegree());
                smt.setString(14, ni.getDateofjoin());
                smt.setInt(15, ni.getAadhar_no());
                smt.setString(16, ni.getBloodgroup());
                smt.setString(17, ni.getGender());
                smt.setString(18, ni.getAddress());
                smt.setString(19,ni.getPic());
              
                
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
    public boolean delete(int rollno)
    {
        boolean status = false;
        try{
            Connection con = DataConnection.getConnection();
            if(con!=null)
            {
                String sql ="delete from newidcard where rollno=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1,rollno);
                int n = smt.executeUpdate();
                if(n!=0) status = true;
                con.close();
            }
        }
        catch(Exception e)
        {
            System.out.println(" deletion error : " + e.getMessage());
        }
        return status;
    }
    
    public boolean update(newIdCardBean nb)
    {
        boolean status = false;
        
        try{
            Connection con = DataConnection.getConnection();
            if(con!=null)
            {
               String sql= "UPDATE `newidcard` SET first_name=?, last_name=?, father_name=?, mother_name=?, pmobile=?, email=?, mobile =?, dept=?, branch=?, sem=?, dob=?, degree=?, dateofjoin=?, aadhar_no=?, bloodgroup=?, gender =?, address=? WHERE rollno=?";            
              
               PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, nb.getFirst_name());
                smt.setString(2, nb.getLast_name());
                smt.setString(3, nb.getFather_name());
                smt.setString(4, nb.getMother_name());
                smt.setInt(5, nb.getPmobile());
                smt.setString(6, nb.getEmail());
                smt.setInt(7, nb.getMobile());
                smt.setString(8, nb.getDept());
                smt.setString(9, nb.getBranch());
                smt.setInt(10, nb.getSem());
                smt.setString(11, nb.getDob());
                smt.setString(12, nb.getDegree());
                smt.setString(13, nb.getDateofjoin());
                smt.setInt(14, nb.getAadhar_no());
                smt.setString(15, nb.getBloodgroup());
                smt.setString(16, nb.getGender());
                smt.setString(17, nb.getAddress());
                smt.setInt(18, nb.getRollno());
                
                int n= smt.executeUpdate();
                if(n!=0) status=true;
                
                con.close();
                
            }
           
        }
        catch(Exception e)
        {
            System.out.println(" updation error :" + e.getMessage());
        }
        
        System.out.println(" status  = " + status);
        return status;
    }
    
     public ArrayList<newIdCardBean> getAllRecords()
    {
        ArrayList<newIdCardBean> studentlist = new ArrayList();
        try{
            Connection con = DataConnection.getConnection();
            if(con!=null)
            {
                String sql = "select * from newidcard";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while(rs.next())
                {
                    newIdCardBean ni= new newIdCardBean();
                    
                    ni.setRollno(rs.getInt("rollno"));
                    ni.setFirst_name(rs.getString("first_name"));
                    ni.setLast_name(rs.getString("last_name"));
                    ni.setFather_name(rs.getString("father_name"));
                    ni.setMother_name(rs.getString("mother_name"));
                    ni.setEmail(rs.getString("email"));
                    ni.setMobile(rs.getInt("mobile"));
                    ni.setPmobile(rs.getInt("pmobile"));
                    ni.setDept(rs.getString("dept"));
                    ni.setBranch(rs.getString("branch"));
                    ni.setSem(rs.getInt("sem"));
                    ni.setDob(rs.getString("dob"));
                    ni.setDegree(rs.getString("degree"));
                    ni.setDateofjoin(rs.getString("dateofjoin"));
                    ni.setAadhar_no(rs.getInt("aadhar_no"));
                    ni.setBloodgroup(rs.getString("bloodgroup"));
                    ni.setGender(rs.getString("gender"));
                    ni.setAddress(rs.getString("address"));
                    ni.setPic(rs.getString("pic"));
                    
                    
                    
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
     
      public newIdCardBean getByRollno(int rollno)
    {
        System.out.println("roll no in getby rol no :"  + rollno);
        
        newIdCardBean ni=null;
        try{
            
        Connection con = DataConnection.getConnection();
        if(con!=null)
        {
            String sql =" select * from newidcard where rollno=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, rollno);
            ResultSet rs = smt.executeQuery();
            if(rs.next())
            {
                    ni= new newIdCardBean();
                    
                    ni.setRollno(rs.getInt("rollno"));
                    ni.setFirst_name(rs.getString("first_name"));
                    ni.setLast_name(rs.getString("last_name"));
                    ni.setFather_name(rs.getString("father_name"));
                    ni.setMother_name(rs.getString("mother_name"));
                    ni.setEmail(rs.getString("email"));
                    ni.setMobile(rs.getInt("mobile"));
                    ni.setPmobile(rs.getInt("pmobile"));
                    ni.setDept(rs.getString("dept"));
                    ni.setBranch(rs.getString("branch"));
                    ni.setSem(rs.getInt("sem"));
                    ni.setDob(rs.getString("dob"));
                    ni.setDegree(rs.getString("degree"));
                    ni.setDateofjoin(rs.getString("dateofjoin"));
                    ni.setAadhar_no(rs.getInt("aadhar_no"));
                    ni.setBloodgroup(rs.getString("bloodgroup"));
                    ni.setGender(rs.getString("gender"));
                    ni.setAddress(rs.getString("address"));
                    ni.setPic(rs.getString("pic"));
                    
                    
                    System.out.println(" in getbyroll no , rollno : " + rollno);
            }
            con.close();
        }
        }catch(Exception e)
        {
            System.out.println("getby rollno error :" + e.getMessage());
        }
        return ni;
    }

    
       public newIdCardBean getByEmail(String email)
    {
        newIdCardBean ni=null;
        try{
            
        Connection con = DataConnection.getConnection();
        if(con!=null)
        {
            String sql =" select * from newidcard where email=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, email);
            ResultSet rs = smt.executeQuery();
            if(rs.next())
            {
                    ni= new newIdCardBean();
                    
                    ni.setRollno(rs.getInt("rollno"));
                    ni.setFirst_name(rs.getString("first_name"));
                    ni.setLast_name(rs.getString("last_name"));
                    ni.setFather_name(rs.getString("father_name"));
                    ni.setMother_name(rs.getString("mother_name"));
                    ni.setEmail(rs.getString("email"));
                    ni.setMobile(rs.getInt("mobile"));
                    ni.setPmobile(rs.getInt("pmobile"));
                    ni.setDept(rs.getString("dept"));
                    ni.setBranch(rs.getString("branch"));
                    ni.setSem(rs.getInt("sem"));
                    ni.setDob(rs.getString("dob"));
                    ni.setDegree(rs.getString("degree"));
                    ni.setDateofjoin(rs.getString("dateofjoin"));
                    ni.setAadhar_no(rs.getInt("aadhar_no"));
                    ni.setBloodgroup(rs.getString("bloodgroup"));
                    ni.setGender(rs.getString("gender"));
                    ni.setAddress(rs.getString("address"));
                    ni.setPic(rs.getString("pic"));
                    
                    
                    System.out.println(" in getbyemail  , email : " + email);
            }
            con.close();
        }
        }catch(Exception e)
        {
            System.out.println("getby email error :" + e.getMessage());
        }
        return ni;
    }
       public boolean changepic(String email , String imagePath)
    {
        boolean status = false;
        
        try{
            Connection con = DataConnection.getConnection();
            if(con!=null)
            {
               String sql= "UPDATE newidcard SET pic=? WHERE email=?";            
              
               PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, imagePath);
                smt.setString(2, email);
                 
                int n= smt.executeUpdate();
                if(n!=0) 
                {
                    status=true;
                
                }
                    
                con.close();
                
            }
           
        }
        catch(Exception e)
        {
            System.out.println(" updation error :" + e.getMessage());
        }
        
        System.out.println(" status in changepic = " + status);
        return status;
    }
    
}
