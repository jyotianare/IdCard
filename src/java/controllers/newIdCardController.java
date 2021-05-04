
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class newIdCardController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String op;
        op = request.getParameter("op");
        
        if( op.equals("delete") )
        {
            
            int rollno = Integer.parseInt(request.getParameter("rollno"));
            newIdCardDao nd = new newIdCardDao();
            
            if(nd.delete(rollno))
                response.sendRedirect("showUsers.jsp");
            else out.println("unable to delete");            
        }
       
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 
        String op = request.getParameter("op");
      
        if(op!=null && op.equals("add"))
        {            
            
            HttpSession session = request.getSession();
            newIdCardBean idcard = (newIdCardBean)session.getAttribute("idcard");
            
            String imagePath = imageUtility.uploadImage(request, getServletConfig(), "uploads");
            
        
           newIdCardDao nd = new newIdCardDao();
          
            if(imagePath!=null)
            {
                idcard.setPic(imagePath);
                nd.add(idcard);
                System.out.println(" record inserted");
            
                //code to add student session in clg
               // nd.addsession(idcard.getDateofjoin());
                
                
                
              out.println("<script>alert('Register Successfully !!!');</script> ");
     
              response.sendRedirect("userDashboard.jsp");
           //     response.sendRedirect("youridcard.jsp?rollno="+idcard.getRollno());
                System.out.println("roll no in add :" + idcard.getRollno());
            }
            else{
                out.println(" error occured");
            }
        }
        
        if( op.equals("update") && op!=null)
        {           
            try{
          
            String roll=request.getParameter("rollno");
            int rollno = roll==null? 0: Integer.parseInt(roll);  
            
            System.out.println("  roll no : " + rollno);
                 
            String first_name = request.getParameter("first_name");
            String last_name = request.getParameter("last_name");
            String father_name = request.getParameter("father_name");
            String mother_name = request.getParameter("mother_name");
            
            String pm = request.getParameter("pmobile");
            int pmobile= pm==null?0:Integer.parseInt(pm);
            
            String email = request.getParameter("email");
          
            String mob = request.getParameter("mobile");
            int mobile = mob==null?0: Integer.parseInt(mob); 
            
            String dept = request.getParameter("dept");
            String branch = request.getParameter("branch");    
           
            String semester = request.getParameter("sem");        
            int sem = semester==null?0: Integer.parseInt(semester);
            
            String dob = request.getParameter("dob");
            String degree = request.getParameter("degree");
            String dateofjoin = request.getParameter("dateofjoin");
            
            String aadhar = request.getParameter("aadhar_no");
            int aadhar_no = aadhar==null?0: Integer.parseInt(aadhar); 
            
            String bloodgroup = request.getParameter("bloodgroup");  
            String gender = request.getParameter("gender");
            String address = request.getParameter("address");
            
            
            newIdCardBean nb = new newIdCardBean();
            
            nb.setFirst_name(first_name);
            nb.setLast_name(last_name);
            nb.setFather_name(father_name);
            nb.setMother_name(mother_name);
            nb.setPmobile(pmobile);
            nb.setGender(gender);
            nb.setEmail(email);
            nb.setAadhar_no(aadhar_no);
            nb.setAddress(address);
            nb.setDegree(degree);
            nb.setDept(dept);
            nb.setBranch(branch);
            nb.setSem(sem);
            nb.setDateofjoin(dateofjoin);
            nb.setDob(dob);
            nb.setBloodgroup(bloodgroup);
            nb.setMobile(mobile);
            nb.setRollno(rollno);
            
            
           newIdCardDao nd = new newIdCardDao();
           if(nd.update(nb))
           {
               String msg2= "Record Updated Succesfully !!";
               response.sendRedirect("temp.jsp?msg2="+msg2);
           }
               
             //   response.sendRedirect("showUsers.jsp");
           else System.out.println(" newidcardDao error  ");
        }
            catch(Exception e){ System.out.println(" update error :" + e.getMessage());}
        }
        
        
      
        if(op!=null && op.equals("changepic"))
        {            
            String email = request.getParameter("email");
                      
            String imagePath = imageUtility.uploadImage(request, getServletConfig(), "uploads");
            
            newIdCardBean nb = new newIdCardBean();
           newIdCardDao nd = new newIdCardDao();
            System.out.println("Email : "+email + " and image  " + imagePath);
            if(imagePath!=null)
            {
                nb.setPic(imagePath);
                if(nd.changepic(email, imagePath))
                {
                 System.out.println(" pic updated succesfully");
             
              response.sendRedirect("profile.jsp");
         
                }
                else System.out.println("pic updation error");
                
              //     response.sendRedirect("youridcard.jsp?rollno="+idcard.getRollno());
            }
            else{
                out.println(" error occured");
            }
        }
 
        
        
    }

    
}
