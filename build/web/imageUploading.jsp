<%-- 
    Document   : imageUploading
    Created on : 10 Apr, 2021, 10:32:06 AM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

        <link href="assets/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
        <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>

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
    </head>
    <body>
        <!--<input type="button" value="close window" onclick="window.close();"/> -->
        
        <jsp:useBean id="idcard"  class="controllers.newIdCardBean" scope="session"></jsp:useBean>
        <jsp:setProperty name="idcard" property="*" ></jsp:setProperty>
         <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <center> 
                        <form action="newIdCardController?op=add" method="post" class="form_container" onsubmit="return validateForm()" enctype="multipart/form-data"> 
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
    </body>
</html>

