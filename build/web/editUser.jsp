<%-- 
    Document   : editUser
    Created on : 4 Apr, 2021, 11:37:34 PM
    Author     : hp
--%>

<%@page import="controllers.newIdCardBean"%>
<%@page import="controllers.newIdCardDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>edit User Page</title>
        
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
                 function readURL(input) {
                    if (input.files && input.files[0]) {
                        var reader = new FileReader();

                        reader.onload = function (e) {
                            preview.src = e.target.result;
                        };

                        reader.readAsDataURL(input.files[0]);
                    }
                }
              
           </script>
        
        
    </head>
    <body>
        
          <%
          int rollno = Integer.parseInt(request.getParameter("rollno"));
          newIdCardDao nd = new newIdCardDao();
          newIdCardBean nb = nd.getByRollno(rollno);
         
          if(nb!=null)
          {
        %>
       
           <div class="container">     
   <div class="row">
    <div class="col-md-8 col-md-offset-1">

        <form action="newIdCardController?op=update" method="post" class="form-horizontal"  > 
      
        <fieldset>
       
          <!-- Form Name -->
          <legend>Personal Information Details</legend>

          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-4">
                
                <input type="text" value="<%= nb.getFirst_name() %>" id="first_name" name="first_name" required="required" placeholder="First Name"  class="form-control">
            </div>
            <div class="col-sm-4">
                <input type="text" id="last_name" value="<%= nb.getLast_name()  %>" name="last_name" required="required"  placeholder="Last Name"  class="form-control">
            </div>
          </div>
                 
          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-4">
                DOB : <input type="date" id="dob" value="<%= nb.getDob() %>" name="dob" required="required" placeholder="Date Of Birth" class="form-control">
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-4">
             Select Gender : <span style="font-weight: bold;color:red" id="s2"></span>
              <br>
              Female : <input type="radio" name="gender" placeholder="Gender" value="female" <%if (nb.getGender().equalsIgnoreCase("female")) out.println("checked"); %> />
              Male : <input type="radio" name="gender" placeholder="Gender" value="male" <%if (nb.getGender().equalsIgnoreCase("male")) out.println("checked"); %> />
            </div>
          </div>
          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-4">
                <input type="number" id="aadhar_no" value="<%= nb.getAadhar_no()  %>" name="aadhar_no" required="required"  placeholder="Aadhar No" class="form-control">
            </div>
          </div>

          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-4">
                <input type="text" id="bloodgroup" value="<%= nb.getBloodgroup() %>" name="bloodgroup" required="required"  placeholder="Blood Group" class="form-control">
            </div>
          </div>

          
          <br>

  <legend>Educational Information Details</legend>

          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-3">
                <input type="text" id="dept" value="<%= nb.getDept() %>"  name="dept"  required="required" placeholder="Department" class="form-control">
            </div>
            <div class="col-sm-3">
                <input type="text" id="degree"  name="degree" value="<%= nb.getDegree() %>"  required="required" placeholder="Degree" class="form-control">
            </div> 
            <div class="col-sm-3">
                <input type="text" id="branch" name="branch"required="required" value="<%= nb.getBranch() %>"  placeholder="Branch" class="form-control">
            </div>
            <div class="col-sm-3">
                <input type="number"  id="sem" value="<%= nb.getSem() %>" name="sem" required="required"  placeholder="Semester" class="form-control">
            </div>  
          </div>
                 
          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-3">
                Date of Join : <input type="date" value="<%= nb.getDateofjoin() %>" id="dateofjoin" name="dateofjoin" required="required" placeholder="Date Of Join" class="form-control">
            </div>
          </div>
        <input  type="hidden" readonly="readonly" id="rollno" value="<%=request.getParameter("rollno")%>" name="rollno" required="required"  placeholder="Roll no" class="form-control">
           
          <br>
         
        <!--  Contact Section -->
          <!-- Form Name -->
          <legend>Contact Information</legend>
          <!-- Text input-->
          
          <div class="form-group">
             
            <div class="col-sm-4">
            
                <br><input type="number"  id="mobile" value="<%= nb.getMobile() %>"  name="mobile"required="required" placeholder="Phone Number" class="form-control " >
            </div>
            <div class="col-sm-4">
                <input type="email" id="email" readonly="readonly"  value="<%= nb.getEmail() %>"  name="email"required="required" placeholder="Email" class="form-control">
            </div>
          </div>
          <br>
  
 
<!-- Address Section -->
          <!-- Form Name -->
          <legend>Address Details</legend>
          <!-- Text input-->
          <div class="form-group">
            <div class="col-sm-10">
                <input type="text" id="address" value="<%= nb.getAddress() %>" name="address" required="required" placeholder="Address Line 1" class="form-control">
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
                <input type="text" id="father_name" value="<%= nb.getFather_name() %>"  name="father_name" required="required" placeholder="First Name" class="form-control">
            </div>
            <div class="col-sm-4">
                <input type="text" id="mother_name" value="<%= nb.getMother_name() %>"  name="mother_name"required="required" placeholder="Mother Name" class="form-control">
            </div>      
            <div class="col-sm-4">
                <input type="number"  id="pmobile" value="<%= nb.getPmobile() %>" name="pmobile"required="required" placeholder="Phone Number"  class="form-control">
            </div>
         
          </div>
          
          <br>
     
          
<!-- Command -->
          <div class="form-group">
            <div class="col-sm-5 col-sm-offset-1">
              <div class="pull-right">
                  <input type="submit" class="btn btn-primary form-control" value="Update" name="submit"/>      
              </div>
            </div>
          </div>
        </fieldset>
            
           
      </form>
    </div>
</div>
        </div>
        
        <% } %>
    </body>
</html>
