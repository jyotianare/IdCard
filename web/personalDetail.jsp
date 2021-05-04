<%@page import="controllers.newIdCardDao"%>
<%@page import="controllers.newIdCardBean"%>
<%@page import="controllers.RegistrationBean"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>CodePen - Profile Settings</title>
  <link rel="stylesheet" href="assets/css/profileDetailCss.css">

</head>
<body>
    
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
<!-- partial:index.partial.html -->


<div class="card second-card">
  
  <h3>Personal Details</h3>
  
  <div class="containers">
    
    <div class="container cone">
      
<!--      <div class="icon">
        <svg width="34" height="34" viewBox="0 0 34 34" fill="none" xmlns="http://www.w3.org/2000/svg">
<path d="M7.08333 17H4.25L17 4.25L29.75 17H26.9167" stroke="#232532" stroke-width="2.125" stroke-linecap="round" stroke-linejoin="round"/>
<path d="M7.08337 17V26.9167C7.08337 28.4815 8.3519 29.75 9.91671 29.75H24.0834C25.6482 29.75 26.9167 28.4815 26.9167 26.9167V17" stroke="#232532" stroke-width="2.125" stroke-linecap="round" stroke-linejoin="round"/>
<path d="M12.75 29.75V21.25C12.75 19.6852 14.0185 18.4167 15.5833 18.4167H18.4167C19.9815 18.4167 21.25 19.6852 21.25 21.25V29.75" stroke="#232532" stroke-width="2.125" stroke-linecap="round" stroke-linejoin="round"/>
</svg>

      </div>-->
         <h2>Parent's Info</h2>
         <h4>Father Name : <%= nb.getFather_name() %></h4>
         <h4>Mother Name : <%= nb.getMother_name() %></h4>
      
         <h3>Parent Contact no.<br>
             <%= nb.getPmobile() %>
         </h3>
      
    </div>
    <div class="container ctwo">

      <h4><strong>Date Of Birth <%= nb.getDob() %></strong></h4><br>
      
      <h4><strong> Blood Group : <%= nb.getBloodgroup() %></strong></h4>
      
    </div>
  </div>
</div>
<!-- partial -->
  <% } %>
</body>
</html>
