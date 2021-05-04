<%-- 
    Document   : forgotPassword
    Created on : 13 Apr, 2021, 9:51:15 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Forgot Password </title>
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> <style>
     
 <style>
     .form-gap {
    padding-top: 70px;
    
}

.row{
    margin-left: -50px;
}
 </style>
</head>
<body>
<!-- partial:index.partial.html -->
<div class="form-gap"></div>
<div class="container">
	<div class="row">
		<div class="col-md-4 col-md-offset-4">
            <div class="panel panel-default">
              <div class="panel-body">
                <div class="text-center">
                  <h3><i class="fa fa-lock fa-4x"></i></h3>
                  <h2 class="text-center">Forgot Password?</h2>
                  <p>To reset your password fill this</p>
                  <div class="panel-body">
    
                      <form action="RegistrationController?op=forgotPwd" id="register-form" role="form" autocomplete="off" class="form" method="post">
                         <div class="form-group">
                        <div class="input-group">
                          <span class="input-group-addon"><i class="glyphicon glyphicon-envelope color-blue"></i></span>
                          <input id="email" name="email" placeholder="email address" class="form-control"  type="email">
                        </div>
                      </div>
                         <div class="form-group">
                        <div class="input-group">
                          <span class="input-group-addon"><i class="fas fa-question"></i></span>
                          <select name="securityQue">
                              <option value="nickname">What was your childhood nickname?</option>
                              <option value="school">What school did you attend for sixth grade?</option>
                              <option value="sport">What was your favorite sport in high school?</option>
                          </select>
                        
                        </div>
                      </div>
                         <div class="form-group">
                        <div class="input-group">
                          <span class="input-group-addon"></span>
                          <input id="securityAns" name="securityAns" placeholder="Write Your Answer in one word" class="form-control"  type="text">
                        </div>
                      </div>
                      <div class="form-group">
                        <input name="submit" class="btn btn-lg btn-primary btn-block" value="Submit" type="submit">
                      </div>
                      
                      <input type="hidden" class="hide" name="token" id="token" value=""> 
                    </form>
    
                  </div>
                </div>
              </div>
            </div>
          </div>
	</div>
</div>
</body>
</html>
