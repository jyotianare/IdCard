<%-- 
    Document   : showUsers
    Created on : 4 Apr, 2021, 7:46:03 PM
    Author     : hp
--%>

<%@page import="controllers.newIdCardBean"%>
<%@page import="controllers.newIdCardDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controllers.adminBean"%>
<%@page import="controllers.adminDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>show users </title>
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
      <script type="text/javascript">
      function confirmDelete(){
          if (!confirm("The Record will be Deleted Permanently  Want to Proceed ?"))
                return false;
      }
      </script>
   
    </head>
    <body>
        <div class="container">
        
            <div class="row">
                <div class="col-md-12">
                     <h1>List of Students</h1>
                </div>
            </div>
            
              <div class="row">
                <div class="col-md-12">
                    <table class="table table-hover table-striped table-bordered">
            <tr>
                
                <th>Rollno</th>
                <th>photo</th>
                <th>First Name</th>
                <th>last name</th>
                <th>Gender</th>
                <th>DOB</th>               
                <th>Email</th>
                <th>Mobile no.</th>               
                <th>Father Name</th>
                <th>Mother Name</th>
                <th>Parent contact</th>
                <th>Degree</th>
                <th>Dept.</th>
                <th>Branch</th>
                <th>Semester</th>
                <th>Date of Join</th>
                <th>blood group</th>
                <th>Aadhar no</th>
                <th>Address</th>
                <th>Operations</th>
                
            </tr>
            <%                
                    newIdCardDao nd = new newIdCardDao();
                    ArrayList<newIdCardBean> slist = nd.getAllRecords();         
                    for(newIdCardBean ss : slist){         
            %>
            <tr>
                <td><%=ss.getRollno()%></td>
                <td><img src="<%=ss.getPic()%>" style="width:50px;height: 50px;" class="rounded-circle"/></td>
                <td><%=ss.getFirst_name()%></td>
                <td><%=ss.getLast_name()%></td>
                <td><%=ss.getGender()%></td>
                <td><%=ss.getDob()%></td>
                <td><%= ss.getEmail()  %></td>
                <td><%= ss.getMobile() %></td>
                <td><%= ss.getFather_name() %></td>
                <td><%= ss.getMother_name() %></td>
                <td><%= ss.getPmobile() %></td>
                <td><%= ss.getDegree() %></td>
                <td><%= ss.getDept() %></td>
                <td><%= ss.getBranch() %></td>
                <td><%= ss.getSem() %></td>
                <td><%= ss.getDateofjoin() %></td>
                <td><%= ss.getBloodgroup() %></td>
                <td><%= ss.getAadhar_no() %></td>
                <td><%= ss.getAddress() %></td>
                
                <td> <a href="editUser.jsp?rollno=<%=ss.getRollno()%>" class="btn btn-success">  <i class="fa fa-pencil" aria-hidden="true"></i> </a> 
                   | <a href="newIdCardController?op=delete&rollno=<%=ss.getRollno()%>" class="btn btn-dark" onclick="return confirmDelete();"> <i class="fa fa-trash" aria-hidden="true"></i></a> 
                </td>
                              
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
