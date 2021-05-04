<%-- 
    Document   : changePic
    Created on : 15 Apr, 2021, 3:40:13 PM
    Author     : hp
--%>

<%@page import="controllers.RegistrationBean"%>
<%@page import="controllers.newIdCardBean"%>
<%@page import="controllers.newIdCardDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

        <link href="assets/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
        <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>

    </head>
     <script type="text/javascript">

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
    <body>
        <%
         RegistrationBean user = (RegistrationBean)session.getAttribute("user");
           if(user==null){
            RequestDispatcher rd = request.getRequestDispatcher("signup_signin.jsp");
           rd.forward(request,response);
           }
           
           newIdCardDao nd = new newIdCardDao();
           newIdCardBean nb = nd.getByEmail(user.getEmail());
          
         if(nb!=null)
          {
              System.out.println("email in changepic : " + nb.getEmail());
        %>
         <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <center> 
                        <form action="newIdCardController?op=changepic&email=<%= nb.getEmail() %>" method="post" class="form_container" onsubmit="return validateForm()" enctype="multipart/form-data"> 
                            <table class ="table">
                                <tr>
                                    <th>
                          
                                        <img src=""  id="preview" class="rounded" style="width: 200px;height: 200px"/>
                                        <br/> <br/>
                                        <input type="button" value="Upload your Pic" class="btn btn-primary" onclick="pic.click();"/><br/>
                                        <input type="file" name="pic" id="pic" onchange="readURL(this)" required="required" style="display: none;"/>

                                    </th>
                                </tr>

                                <tr>
                                    <td><input type="submit" class="btn btn-primary form-control" value="Next" name="submit"/></td>
                                </tr>
                            </table>
                        </form> 
                    </center>
                </div> 

            </div>
        </div>
         <% } %>
    </body>
</html>
