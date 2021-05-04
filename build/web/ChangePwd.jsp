<%-- 
    Document   : ChangePwd
    Created on : 1 Apr, 2021, 11:39:22 PM
    Author     : hp
--%>

<%@page import="controllers.adminDao"%>
<%@page import="controllers.adminBean"%>
<%@page import="controllers.RegistrationDao"%>
<%@page import="controllers.RegistrationBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change password</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
    
         function validateForm(){
                pass=document.getElementById("pwd").value;
                cpass =document.getElementById("cpwd").value;
               
               if(pass!=cpass)
                {
                    document.getElementById("s1").innerHTML="Password and confirm password doesn't matched";
                    return false;
                }
                else{
                     
                }
                
            }
   function myFunction() {
  var x = document.getElementById("oldpwd");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
            
</script>

    </head>
    <body>
        
        <% 

      RegistrationBean user = (RegistrationBean)session.getAttribute("user");
       adminBean admin = (adminBean)session.getAttribute("admin");
      
      if (user==null && admin==null ){
             RequestDispatcher rdd= request.getRequestDispatcher("index.jsp");
             rdd.forward(request, response);
         }
         
         
if(request.getParameter("submit")!=null){
 
    String oldpwd,pwd;
    oldpwd = request.getParameter("oldpwd");
    pwd = request.getParameter("pwd");
        
         if(user != null ){
          
            if(! user.getPwd().equals(oldpwd))
        out.println("<script>alert('old password not matched');</script>");
    
            else{
            
        String email = user.getEmail();
        
            RegistrationBean rb = new RegistrationBean();
            rb.setEmail(email);
            rb.setPwd(pwd);

           RegistrationDao rd = new RegistrationDao();
          
           if(rd.updatepwd(rb))         
           {
               String msg = "Password Changed Succefully !";
                   response.sendRedirect("temp.jsp?msg1="+msg);
       
           }
            
         }
         }
           else if(admin != null)
           {
               
                 if(! admin.getPwd().equals(oldpwd))
        out.println("<script>alert('old password not matched');</script>");
    
                 else{
               
               String email2 = admin.getEmail();
               adminBean ab = new adminBean();
               
               ab.setEmail(email2);
               ab.setPwd(pwd);
               
               adminDao ad = new adminDao();
               
               if(ad.updatepwd(ab))
               {
                    String msg = "Password Changed Succefully !";
                   response.sendRedirect("temp.jsp?msg4="+msg);
       
               }
                
           }
           }
            
         }

        
        %>
        <div class="container">
<div class="row">
<div class="col-sm-12">
    <center><h1>Change Password</h1></center>
</div>
</div>
<div class="row">
<div class="col-sm-6 col-sm-offset-3">
<form action="ChangePwd.jsp"  id="passwordForm" onsubmit="return validateForm();"> 
   Enter Old Password : <input type="password" class="input-lg form-control" required="required" name="oldpwd" id="oldpwd" placeholder="Old Password" autocomplete="off"><br>
   
   Show Password : <input type="checkbox" onclick="myFunction()"><br/><br/>
 
   <b>Password must contain atleast one upppercase, one lowercase , one digit   and min 8 character long<br/></b>
                       
 Enter New Password : <input type="text" class="input-lg form-control" name="pwd" id="pwd" required="required" placeholder="New Password" autocomplete="off" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$"><br>
  
  Retype New Password : <input type="text" class="input-lg form-control" name="cpwd" id="cpwd" required="required" placeholder="Repeat Password" autocomplete="off"><br/> 
  <span id="s1" style="color:red"></span>
                 
  <input type="submit" name="submit" value="submit" class="col-xs-12 btn btn-primary btn-load btn-lg" data-loading-text="Changing Password..." value="Change Password">
</form>
</div>
</div>
       </div>
    </body>
</html>
