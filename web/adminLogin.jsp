<%-- 
    Document   : adminLogin
    Created on : 4 Apr, 2021, 2:55:04 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="assets/css/adminLoginCss.css">


 <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="assets/css/fontawesome.css">
    <link rel="stylesheet" href="assets/css/templatemo-grad-school.css">
    <link rel="stylesheet" href="assets/css/owl.css">
    <link rel="stylesheet" href="assets/css/lightbox.css">
    </head>
    <script type="text/javascript">
           function myFunction() {
  var x = document.getElementById("pwd");
  if (x.type == "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
    </script>
<body>
    
     <%
            String email="";
            String pwd="";
          Cookie cookies[] = request.getCookies();
          for (Cookie c : cookies){
             if(c.getName().equals("email"))
                 email=c.getValue();
             if(c.getName().equals("pwd"))
                 pwd=c.getValue();
          }
            %>
    
    
    <jsp:include page="commonHeader.jsp"></jsp:include>
    
    
  <div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first">
      <img src="img/manit_logo.jpg" id="icon" alt="User Icon" />
    </div>

    <!-- Login Form -->
    <form action="adminController?op=add" method="post">
      <input type="text" id="email" class="fadeIn second" value="<%=email%>" name="email" placeholder="type email">
      <input type="password" id="pwd"  name="pwd" value="<%=pwd%>" placeholder="password">
      <br>
     Show Password  <input type="checkbox" onclick="myFunction()"><br/><br/>
     Remember me <input id="login-remember" type="checkbox" name="remember" value="remember">
                                                                  
      <br>  <input type="submit" name="submit" class="fadeIn fourth" value="Log In">
    </form>

       
  </div>
</div>
    </body>
</html>
