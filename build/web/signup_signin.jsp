<%-- 
    Document   : signup_signin
    Created on : 31 Mar, 2021, 10:25:02 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>signUp</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js" type="text/javascript"></script>
     
        <style>
            body{
                font-size: 17px;
            }
            </style>
        
        <script type="text/javascript">
            function validateForm(){
                pwd=document.getElementById("pwd1").value;
                cpwd =document.getElementById("cpwd").value;
               if(pwd != cpwd)
                {
                    document.getElementById("s1").innerHTML="Password and confirm password doesn't matched";
                    return false;
                }
                
            }
    function myFunction() {
  var x = document.getElementById("pwd");
  if (x.type == "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
 function myFunction1() {
  var x = document.getElementById("pwd1");
  if (x.type == "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
           
           </script>

        
    </head>
    <body>
        <%
            String email="";
            String pwd="";
          Cookie cookies[] = request.getCookies();
          for (Cookie c : cookies){
             if(c.getName().equals("user_email"))
                 email=c.getValue();
             if(c.getName().equals("user_pwd"))
                 pwd=c.getValue();
          }
            %>
         
         
            
            <div class="container">    
        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
           <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Sign In</div>
                        <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="forgotPassword.jsp">Forgot password?</a></div>
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        <form action="RegistrationController?op=signin" method="post" autocomplete="off" id="loginform" class="form-horizontal" role="form">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="email" class="form-control" name="email" value="<%=email%>" placeholder="email">                                        
                            </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input  type="password" id="pwd" class="form-control" name="pwd" value="<%= pwd %>"  placeholder="password">
                                   
                            </div>
                                        <div class="input-group">
                                            <div class="checkbox">
                                                <label>
                                                    Show Password  <input type="checkbox" onclick="myFunction()"><br/><br/>
                                                </label>
                                            </div>
                                            
                                        </div>
                                
                            <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="remember"> Remember me
                                        </label>
                                      </div>
                                    </div>

                                        

                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                        <input type="submit" value="log in" id="btn-login"  class="btn btn-success">
                                  
                                    </div>
                                </div>


                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                            Don't have an account! 
                                        <a href="#" onClick="$('#loginbox').hide(); $('#signupbox').show()">
                                            Sign Up Here
                                        </a>
                                        </div>
                                    </div>
                                </div>    
                            </form>     

                        </div>                     
                    </div>  
        </div>
        <div id="signupbox" style="display:none; margin-top:50px" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                    <div class="panel panel-info">
                        <div class="panel-heading">
                            <div class="panel-title">Sign Up</div>
                            <div style="float:right; font-size: 85%; position: relative; top:-10px"><a id="signinlink" href="#" onclick="$('#signupbox').hide(); $('#loginbox').show()">Sign In</a></div>
                        </div>  
                        <div class="panel-body" >
                            <form action="RegistrationController?op=signup" method="post" autocomplete="off" id="signupform" onsubmit="return validateForm()"  class="form-horizontal" role="form">
                                
                                <div id="signupalert" style="display:none" class="alert alert-danger">
                                    <p>Error:</p>
                                    <span></span>
                                </div>
                                    
                                
                                <div class="form-group">
                                    <label for="email" class="col-md-3 control-label">Email</label>
                                    <div class="col-md-9">
                                        <input type="email" id="email1" required="required" class="form-control" name="email1"  placeholder="Email Address">
                                        <br><span id="s2"></span>
                                    </div>
                                </div>
                                    
                                <div class="form-group">
                                    <label for="first_name" class="col-md-3 control-label">First Name</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" id="first_name" required="required" name="first_name" placeholder="First Name">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="last_name" class="col-md-3 control-label">Last Name</label>
                                    <div class="col-md-9">
                                        <input type="text" class="form-control" name="last_name" id="last_name" required="required" placeholder="Last Name">
                                    </div>
                                </div>
                                <div class="form-group">
                                   
                                     <label for="pwd" class="col-md-3 control-label">Password</label>
                                    <div class="col-md-9">
                                        <input type="password" id="pwd1" class="form-control" required="required" name="pwd1" placeholder="Password" onfocus="s1.innerHTML='';" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$">
                                    </div>
                                </div>
                                         <div class="input-group">
                                            <div class="checkbox">
                                                <label>
                                                    Show Password  <input type="checkbox" onclick="myFunction1()"><br/><br/>
                                                </label>
                                            </div>
                                            
                                        </div>
                                
                                
                                <div class="form-group">
                                     <label for="cpwd" class="col-md-3 control-label">Confirm Password</label>
                                    <div class="col-md-9">
                                        <input type="password" id="cpwd" class="form-control" name="cpwd" required="required" placeholder="Confirm Password" onfocus="s1.innerHTML='';" >
                                       <br/> <span id="s1" style="color:red"></span>
                                    </div> 
                                </div>
                               
                                <div class="form-group">
                                     <label for="" class="col-md-3 control-label">Security Question..</label>
                                    <div class="col-md-9">
                                        <select name="securityQue">
                                            <option value="nickname">What was your childhood nickname?</option>
                                            <option value="school">What school did you attend for sixth grade?</option>
                                            <option value="sport">What was your favorite sport in high school?</option>
                                        </select>
                                        </div> 
                                </div>
                                
                                <div class="form-group">
                                     <label for="" class="col-md-3 control-label">Your Answer</label>
                                    <div class="col-md-9">
                                        <input type="text" id="securityAns" class="form-control" name="securityAns" required="required" placeholder="Write your answer in one word"  >
                                       
                                    </div> 
                                </div>
                               
                          
                               <div class="form-group">
                                                                            
                                    <div class="col-md-offset-3 col-md-9">
                                      <input type="submit" value="signup"   id="btn-signup"  class="btn btn-info" >
                                         
                                    </div>
                                </div>
                                <div class="form-group">
                                    <b>*Password must contain atleast one upppercase, one lowercase , one digit   and min 8 character long<br/></b>
                                </div>
                                
                            </form>
                         </div>
                    </div>
  
         </div> 
    </div>
    <center> <a href="index.jsp">Back to Home Page</a> </center>
    
    <script type="text/javascript">
        $("#email1").blur(function(){
           
            xml = new XMLHttpRequest();
            xml.open("GET", "RegistrationController?op=checkid&email="+$(this).val(),true);
            xml.send();
            
            xml.onreadystatechange = function(){
                if(this.readyState==4 && this.status==200){
                    result = this.responseText;
                    $("#s2").html(result);
                }
            };
        });
        </script>
    
    </body>
</html>
