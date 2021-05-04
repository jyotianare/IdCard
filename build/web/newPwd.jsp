<%-- 
    Document   : newPwd
    Created on : 14 Apr, 2021, 10:19:00 PM
    Author     : hp
--%>

<%@page import="controllers.adminDao"%>
<%@page import="controllers.RegistrationDao"%>
<%@page import="controllers.adminBean"%>
<%@page import="controllers.RegistrationBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
         <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
         <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

    </head>
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
  var x = document.getElementById("pwd");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
            
</script>

   <%
         String email = request.getParameter("email");
          System.out.println("email in newpwd :" + email);
      
      RegistrationBean rb = new RegistrationBean();
      RegistrationDao rd = new RegistrationDao();
     
      if(request.getParameter("submit")!=null){

        
          String pwd;
          pwd = request.getParameter("pwd");
    
          
         if(email.equals(rd.checkByEmail(email)))
         {
             if(rd.updatepwdByEmail(email, pwd))
             {
                 response.sendRedirect("signup_signin.jsp");
             }
         }
         
      }
   
        %>
     

    <body>
      <div class="container">
<div class="row">
<div class="col-sm-12">
    <center><h1>Create Password</h1></center>
</div>
</div>
<div class="row">
<div class="col-sm-6 col-sm-offset-3">
<form action="newPwd.jsp"  id="passwordForm" onsubmit="return validateForm();"> 
   
    <input type="hidden" name="email" value="<%=email%>"/>
   <b>* Password must contain atleast one upppercase, one lowercase , one digit   and min 8 character long<br/></b>
                       
   Enter New Password : <input type="password" class="input-lg form-control" name="pwd" id="pwd" required="required" placeholder="New Password" autocomplete="off" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$"><br>
   Show Password : <input type="checkbox" onclick="myFunction()"><br/><br/>
 
   Retype New Password : <input type="password" class="input-lg form-control" name="cpwd" id="cpwd" required="required" placeholder="Repeat Password" autocomplete="off"><br/> 
  <span id="s1" style="color:red"></span>
                 
  <input type="submit" name="submit" value="submit" class="col-xs-12 btn btn-primary btn-load btn-lg" data-loading-text="Changing Password..." >
</form>
</div>
</div>
       </div>
    </body>
</html>
