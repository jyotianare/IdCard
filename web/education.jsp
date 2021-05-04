<%-- 
    Document   : education
    Created on : 16 Apr, 2021, 8:59:05 AM
    Author     : hp
--%>

<%@page import="controllers.newIdCardBean"%>
<%@page import="controllers.RegistrationBean"%>
<%@page import="controllers.newIdCardDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="assets/css/profileDetailCss.css">

    </head>
      <%
         
              RegistrationBean user = (RegistrationBean)session.getAttribute("user");
           if(user==null){
            RequestDispatcher rd = request.getRequestDispatcher("signup_signin.jsp");
           rd.forward(request,response);
          }
           
           newIdCardBean nb = new newIdCardBean();  
           newIdCardDao nd = new newIdCardDao();
             
           nb=nd.getByEmail(user.getEmail());
                
                  if(nb!=null){  
       %>
    <body>
        
<div class="card second-card">
  
  <h3>Educational Details</h3>
  
  <div class="containers">
    
    <div class="container cone">
      
         <h4>Department : <%= nb.getDept() %></h4>
         <h4>Degree : <%= nb.getDegree() %></h4>
      
         <h3>Branch<br>
             <%= nb.getBranch() %>
         </h3>
      
    </div>
    <div class="container ctwo">

      <h4><strong>Roll No: <%= nb.getRollno() %></strong></h4><br>
      
      <h4><strong>Date Of Joining : <%= nb.getDateofjoin() %></strong></h4>
      
    </div>
  </div>
</div>
<!-- partial -->
  <% } %>
    </body>
</html>
