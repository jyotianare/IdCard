<%-- 
    Document   : adminsDashboard
    Created on : 11 Apr, 2021, 5:28:59 PM
    Author     : hp
--%>

<%@page import="controllers.adminBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Dashboard</title>
    
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/fontawesome.css">
    <link rel="stylesheet" href="assets/css/templatemo-grad-school.css">
    <link rel="stylesheet" href="assets/css/owl.css">
    <link rel="stylesheet" href="assets/css/lightbox.css">
 
    </head>
     <%
        String op=request.getParameter("op");
        if(op!=null && op.equals("logout")){
            //session.setAttribute("user", null); 
            session.removeAttribute("admin");
         //   response.sendRedirect("adminLogin.jsp");
        }%>
    <body>
       
         <%
         adminBean admin = (adminBean)session.getAttribute("admin");
           if(admin==null){
            RequestDispatcher rd = request.getRequestDispatcher("adminLogin.jsp");
           rd.forward(request,response);
           }
        %>  
        
  <header class="main-header clearfix" role="header">
    <div class="logo">
      <a href="#"><em>Getyour i card</em>.com</a>
    </div>
    <a href="#menu" class="menu-link"><i class="fa fa-bars"></i></a>
    <nav id="menu" class="main-nav" role="navigation">
      
        <ul class="main-menu">
        
           <li><a href="ChangePwd.jsp" class="external">Change Password</a></li>
        <li><a  href="adminsDashboard.jsp?op=logout" >logout</a></li>
      </ul>
    </nav>
  </header>

        
        
  <section class="section why-us" data-section="section2">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="section-heading">
            <h2>Welcome <%= admin.getName() %> </h2>
          </div>
        </div>
        <div class="col-md-12">
          <div id='tabs'>
           
            <section class='tabs-content'>
              <article id='tabs-1'>
                <div class="row">
<!--                  <div class="col-md-6">
                    <img src="assets/images/qrcode.png" alt="">
                  </div>-->
                  <div class="col-md-6">
                      <h4>Show Users -->   <a href="showUsers.jsp">Click here</a></h4> 
                  </div>
                </div>
              </article>
              <article id='tabs-1'>
                <div class="row">
                      <div class="col-md-6">
                   <h5 ><font color='white'>Duplicate Id card Users --> </font>   <a href="duplicateCards.jsp">Click here</a> </h5>
                  </div>
                </div>
              </article>
              <article id='tabs-3'>
               
              </article>
            </section>
          </div>
        </div>
      </div>
    </div>
  </section>
    
    </body>
</html>
