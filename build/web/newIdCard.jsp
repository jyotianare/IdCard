<%-- 
    Document   : newIdCard
    Created on : 1 Apr, 2021, 12:59:21 AM
    Author     : hp
--%>

<%@page import="controllers.RegistrationBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
 
<script type="text/javascript">
            function validateForm(){
                gender=document.getElementsByName("gender");
              //  alert('ok');
               g = 0;
               for (i=0;i<gender.length;i++){
                   //alert('gender '+gender[i].checked);
                   if(gender[i].checked)
                       g++;
               }
                
                if (g==0)
                {
                   s2.innerHTML="Please Select any Gender";
                   return false;
                }
            }
                
           </script>
    </head>
     <%
         RegistrationBean user = (RegistrationBean)session.getAttribute("user");
           if(user==null){
            RequestDispatcher rd = request.getRequestDispatcher("signup_signin.jsp");
           rd.forward(request,response);
           }
           
        %> 
    <body>
        <div class="container">     
   <div class="row">
    <div class="col-md-8 col-md-offset-1">

        <form action="imageUploading.jsp"  class="form-horizontal"  onsubmit="return validateForm();"> 
      
        <fieldset>
       
          <!-- Form Name -->
          <legend>Personal Information Details</legend>

          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-4">
            First Name: <input type="text" id="first_name" name="first_name" required="required" placeholder="First Name"class="input-lg form-control"  >
            </div>
            <div class="col-sm-4">
            Last Name:  <input type="text" id="last_name" name="last_name" required="required"  placeholder="Last Name"  class="form-control">
            </div>
          </div>
                 
          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-4">
             DOB : <input type="date" id="dob" name="dob" required="required" placeholder="Date Of Birth" class="form-control">
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-4">
             Select Gender : <span style="font-weight: bold;color:red" id="s2"></span>
              <br>
              Female : <input type="radio" name="gender" placeholder="Gender" value="female">
              Male : <input type="radio" name="gender" placeholder="Gender" value="male" >
            </div>
          </div>
          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-4">
           Aadhar No:   <input type="number" id="aadhar_no" name="aadhar_no" required="required"  placeholder="Aadhar No" class="form-control">
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-4">
            Blood Group:  <input type="text" id="bloodgroup" name="bloodgroup" required="required"  placeholder="Blood Group" class="form-control">
            </div>
          </div>

          
          <br>

  <legend>Educational Information Details</legend>

          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-3">
             Dept: <input type="text" id="dept"  name="dept"  required="required" placeholder="Department" class="form-control">
            </div>
            <div class="col-sm-3">
            Degree:  <input type="text" id="degree"  name="degree"  required="required" placeholder="Degree" class="form-control">
            </div> 
            <div class="col-sm-3">
            Branch:  <input type="text" id="branch" name="branch"required="required"  placeholder="Branch" class="form-control">
            </div>
            <div class="col-sm-3">
             Sem: <input type="number" id="sem" name="sem" required="required"  placeholder="Semester" class="form-control">
            </div>  
          </div>
                 
          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-3">
             Date of Join : <input type="date" id="dateofjoin" name="dateofjoin" required="required" placeholder="Date Of Join" class="form-control">
            </div>
             
            <div class="col-sm-3">
            Roll No:  <input type="number" id="rollno" name="rollno" required="required" placeholder="Roll no" class="form-control">
            </div>
        
          </div>
     
          <br>
         
        <!--  Contact Section -->
          <!-- Form Name -->
          <legend>Contact Information</legend>
          <!-- Text input-->
          
          <div class="form-group">
             
            <div class="col-sm-4">
            
            <br>
            Mobile No:<input type="number" id="mobile"  name="mobile"required="required" placeholder="Phone Number" class="form-control " >
            </div>
            <div class="col-sm-4">
             Email:   <input type="email" id="email" readonly="readonly" value="<%= user.getEmail() %>"   name="email"required="required" placeholder="Email" class="form-control">
            </div>
          </div>
          <br>
  
 
<!-- Address Section -->
          <!-- Form Name -->
          <legend>Address Details</legend>
          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-10">
           Address:   <input type="text" id="address" name="address" required="required" placeholder="Address Line 1" class="form-control">
            </div>
          </div>
          
          <!-- 
          <div class="form-group">
            <div class="col-sm-4">
              <input type="text" name="city" placeholder="City" class="form-control">
            </div>
            <div class="col-sm-2">
              <input type="text" name="state" placeholder="State" class="form-control">
            </div>
            <div class="col-sm-4">
              <input type="text" name="postalCode" placeholder="Post Code" class="form-control">
            </div>
          </div>
                   
          -->
          <br>
<!-- Parent/Guadian Contact Section -->
          <!-- Form Name -->
          <legend>Parent/Guadian Information</legend>
          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-4">
             Father Name: <input type="text" id="father_name"  name="father_name" required="required" placeholder="Father Name" class="form-control">
            </div>
            <div class="col-sm-4">
           Mother Name:   <input type="text" id="mother_name"  name="mother_name"required="required" placeholder="Mother Name" class="form-control">
            </div>      
            <div class="col-sm-4">
            Parent Contact No:  <input type="number" id="pmobile" name="pmobile"required="required" placeholder="Phone Number"  class="form-control">
            </div>
         
          </div>
          
          <br>
     
<!-- Command -->
          <div class="form-group">
            <div class="col-sm-5 col-sm-offset-1">
              <div class="pull-right">
                  <input type="submit"  class="btn btn-primary" value="Next" name="submit"/>      
              </div>
            </div>
          </div>
        </fieldset>
      </form>
        
<!--            <center>  <a href="userDashboard.jsp" class="btn btn-primary">Back to Dashboard</a></center> -->
        
    </div>
</div>
        </div>
    </body>
</html>
