<%-- 
    Document   : dupPay
    Created on : 15 Apr, 2021, 4:37:19 PM
    Author     : hp
--%>

<%@page import="controllers.newIdCardBean"%>
<%@page import="controllers.RegistrationBean"%>
<%@page import="controllers.newIdCardDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Payement Page</title>
  <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    </head>
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
        %>
        
<div class="container">
    
    <form action="duplicateidcardController?op=add" method="post" class="form-control">
        
      <input type="hidden" name="paymentRef" value="notset"/>
     
        
     Your Email id: <input readonly="readonly" type="email" value="<%= nb.getEmail() %>" name="email" class="input-group">
     
     Enter Your Rollno: <input readonly="readonly" type="number" name="rollno" value="<%= nb.getRollno()  %>">
     <br>
     For Duplicate Id Card tap here : 
       
<div class="razorpay-embed-btn" data-url="https://pages.razorpay.com/pl_GzAoDzEyf5kXcP/view" data-text="Pay Now" data-color="#528FF0" data-size="large">
  <script>
    (function(){
      var d=document; var x=!d.getElementById('razorpay-embed-btn-js')
      if(x){ var s=d.createElement('script'); s.defer=!0;s.id='razorpay-embed-btn-js';
      s.src='https://cdn.razorpay.com/static/embed_btn/bundle.js';d.body.appendChild(s);} else{var rzp=window['__rzp__'];
      rzp && rzp.init && rzp.init()}})();
  </script>
</div>
     <button type="button" class="btn btn-success"><input class="form-control"   type="submit" name="submit" value="submit"></button>
       
    </form>
    
</div>
        <% } %>
    </body>
</html>  