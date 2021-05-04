<%-- 
    Document   : userDashboard
    Created on : 12 Apr, 2021, 2:07:51 PM
    Author     : hp
--%>

<%@page import="controllers.newIdCardBean"%>
<%@page import="controllers.newIdCardDao"%>
<%@page import="controllers.RegistrationBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Dashboard</title>
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
            session.removeAttribute("user");
        }%>
    <body>
       
        
         <%
         RegistrationBean user = (RegistrationBean)session.getAttribute("user");
           if(user==null){
            RequestDispatcher rd = request.getRequestDispatcher("signup_signin.jsp");
           rd.forward(request,response);
           }
           System.out.println("user in dashboard:"+user);
           System.out.println("user email :" + user.getEmail());
           
           newIdCardDao nd = new newIdCardDao();
           newIdCardBean nb = nd.getByEmail(user.getEmail());
           
System.out.println("nb email:"+nb);
        %> 
       
        
        
   <header class="main-header clearfix" role="header">
    <div class="logo">
      <a href="#"><em>Getyour i card</em>.com</a>
    </div>
    <a href="#menu" class="menu-link"><i class="fa fa-bars"></i></a>
    <nav id="menu" class="main-nav" role="navigation">
      
        <ul class="main-menu">
            <% if(nb!=null) {%>   <li><a target="_blank" href="profile.jsp?email="<%= user.getEmail() %>  class="external">Profile</a></li>  <% } %>
       
        <li><a href="ChangePwd.jsp" class="external">Change Password</a></li>
        <li><a  href="userDashboard.jsp?op=logout" >logout</a></li>
      </ul>
    </nav>
  </header>

         
  <section class="section why-us" data-section="section2">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="section-heading">
            <h2>Welcome <%=user.getFirst_name()%> </h2>
          </div>
        </div>
        <div class="col-md-12">
          <div id='tabs'>
           
            <section class='tabs-content'>
              <article id='tabs-1'>
                <div class="row">
                  <div class="col-md-6">
             <% if(nb==null) {%>  <h4>Apply for New Id Card <a href="newIdCard.jsp">Click here</a></h4> <%}%>
                  </div>
                </div>
              </article>
              <article id='tabs-2'>
                <div class="row">
<!--                  <div class="col-md-6">
                    <img src="assets/images/printidacrd.jpg" alt="">
                  </div>-->
       <%  if(nb!=null) { %>            <div class="col-md-6">
                      <h4>Apply for Duplicate Id Card<a href="dupPay.jsp"> Click here</a></h4>
                  </div>  <% } %>
                </div>
              </article>
              <article id='tabs-3'>
                <div class="row">
<!--                  <div class="col-md-6">
                    <img src="assets/images/highqualityicard.jpg" alt="">
                  </div>-->
               
   <%  if(nb!=null) { %>   <div class="col-md-6">
                      <h4>  <a target="_blank" href="youridcard.jsp?email="<%= user.getEmail()%>>Your Digital Id Card</a></h4>
                  </div>  <% } %>
                </div>
              </article>
            </section>
          </div>
        </div>
      </div>
    </div>
  </section>
      
       
    </body>
</html>
