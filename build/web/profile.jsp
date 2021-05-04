<%@page import="controllers.RegistrationDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controllers.newIdCardBean"%>
<%@page import="controllers.newIdCardDao"%>
<%@page import="controllers.RegistrationBean"%>
<html ng-app="myApp">
  <head>
    <script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://use.fontawesome.com/d550ee0e45.js"></script>
  </head>
  
  <style>
      .navbar-inverse {
    background-color: #089f98;
    border-color: #000000;
}

body{
    font-size: 20px;
}
  </style>
  
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
        %>   
    <body>
        
    <div class="fixedheader">
      
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      
      <a class="navbar-brand" href="#"></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar"  style="background-color:">
      <ul class="nav navbar-nav">

<li><img src="img/manit-full-logo.png" alt="img" class="img-responsive"></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><i class="fa fa-weixin" aria-hidden="true"></i> </a></li>
        <li><a href="#"><i class="fa fa-bell" aria-hidden="true"></i> </a></li>
      </ul>
    </div>
  </div>
</nav>
        
    </div>
    <div class="container" style="margin-left: 15%;margin-right: 15%;">
      <div class="row">
        <div class="col-md-12">
          <div class="row">
            <div class="col-md-2" >
                <img src="<%= nb.getPic() %>" style="width:150px;height: 150;" border="1px solid" class="rounded-circle"/>
<!--              <img  src="" height="150" border="1px solid">-->
              <p><i class="fa fa-pencil" aria-hidden="true"> <a href="changePic.jsp">Change Pic</a></i></p> <br />
            </div> 
            <div class="col-md-10">
              <p><b><%= nb.getFirst_name() %> </b> <b><%= nb.getLast_name() %> </b></p>
              <p><i class="fa fa-envelope" aria-hidden="true"> <%= nb.getEmail() %>  </i></p> 
              <i class="fa fa-university" aria-hidden="true"></i><span style="color:blue"> Maulana Azad National Institute Of Technology</span>
              <i class="fa fa-graduation-cap" aria-hidden="true"></i>  <span><%= nb.getDegree()  %> </span> <br /><br />
<!--              <i class="fa fa-download" aria-hidden="true"></i> Resume-->
            </div>
          </div>
        </div>
      </div>
      <div class="tabs">
      
       <div class="col-md-12">
            <ul class="nav nav-tabs">
             <li><a href="education.jsp" target="f1">Educational Detail</a></li>               
       
                
                <li ><a href="personalDetail.jsp" target="f1">Personal Info</a>
           </li>
                      
                  <li><a href="contactDetail.jsp" target="f1">Contact details</a>
           </li>
                        
            </ul>
            
            <br/>
            
            <iframe name="f1" width="100%" height="500">\</iframe>
            
       </div>
        
      </div>
    </div>
    <% }
else System.out.println("nb is null in profile");
    %>
         
  </body>
</html>