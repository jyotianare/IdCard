<%-- 
    Document   : duplicateCards
    Created on : 16 Apr, 2021, 9:47:43 AM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="controllers.duplicateidcardBean"%>
<%@page import="controllers.duplicateidcardDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link href="assets/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
        <script src="assets/js/bootstrap.min.js" type="text/js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> <style>
      .sliderImg{
          width:100%;
          height:200px;
          
          
      }
      body{
          color: #ffffff;
      }
  </style>
    
    </head>
    <body>
        <div class="container">
        
            <div class="row">
                <div class="col-md-12">
                     <h1>List of Students Who Have Applied For Duplicate Id Card</h1>
               
                    <table class="table table-hover table-striped table-bordered">
            <tr>
                
                <th>Rollno</th>
                <th>Email</th>
                <th>Payment Reference</th>
                
            </tr>
            <%                
                    duplicateidcardDao nd = new duplicateidcardDao();
                    ArrayList<duplicateidcardBean> slist = nd.getAllRecords();         
                    for(duplicateidcardBean ss : slist){         
            %>
            <tr>
                <td><%=ss.getRollno()%></td>
                <td><%= ss.getEmail()  %></td>
                <td><%= ss.getPaymentRef() %></td> 
                              
            </tr>
               
                    <%}%>
        </table>
           
                </div>
            </div>
        
          <div class="container" style="display: blcok; text-align: center;">
            <center>
                <button type="button" class="btn btn-success"><a href="adminsDashboard.jsp">Go To Dashboard</a></button>
            </center>
        </div>
       
        
        </div>
  
    </body>
</html>
