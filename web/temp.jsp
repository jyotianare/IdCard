<%-- 
    Document   : temp
    Created on : 10 Apr, 2021, 10:34:45 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    </head>
    <style>
        
        a {
    color: #f0f3f6;
   
}
     
    </style>
    <body>
        
        <% 
            String msg= request.getParameter("msg");
            if(msg!=null){
        %>
        
        <script>
            alert('<%=msg%>');
        </script>
        
          <div class="container" style="display: blcok; text-align: center;">
            <center>
                <button type="button" class="btn btn-success"><a href="userDashboard.jsp">Go To Dashboard</a></button>
            </center>
        </div>
        
        <% } %>
        
        
        <%  
            String msg1=request.getParameter("msg1");
            if(msg1!=null){
         %>   
          <script>
            alert('<%=msg1%>');
        </script>
        
          <div class="container" style="display: blcok; text-align: center;">
            <center>
                <button type="button" class="btn btn-success"><a href="userDashboard.jsp">Go To Dashboard</a></button>
            </center>
        </div>
       
         
         <% } %>
         
           <%  
            String msg2=request.getParameter("msg2");
            if(msg2!=null){
         %>   
          <script>
            alert('<%=msg2%>');
        </script>
        
          <div class="container" style="display: blcok; text-align: center;">
            <center>
                <button type="button" class="btn btn-success"><a href="showUsers.jsp">Go To ShowUsers</a></button>
            </center>
        </div>
       
         
         <% } %>
         
          <%  
            String msg4=request.getParameter("msg4");
            if(msg4!=null){
         %>   
          <script>
            alert('<%=msg4%>');
        </script>
        
          <div class="container" style="display: blcok; text-align: center;">
            <center>
                <button type="button" class="btn btn-success"><a href="adminsDashboard.jsp">Go To Dashboard</a></button>
            </center>
        </div>
       
         
         <% } %>
         
      
        
    </body>
</html>

