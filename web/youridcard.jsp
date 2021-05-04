<%-- 
    Document   : hello
    Created on : 3 Apr, 2021, 12:04:30 PM
    Author     : hp
--%>

<%@page import="controllers.newIdCardBean"%>
<%@page import="controllers.newIdCardDao"%>
<%@page import="controllers.RegistrationBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js" type="text/javascript"></script>
 <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js" type="text/javascript"></script>
     

<link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" rel="stylesheet">
<link href="assets/css/idcardcss.css" rel="stylesheet">
    </head>
     <script type="text/javascript">
        $(document).ready (function() {
    $('#flip').click(function() {    
        $('#secondpage').show();
         $('#firstpage').hide();
        
    });
});
        </script>
   
    <style>
        body{
            color: #fcf8f8;
        }
        
        .id-card{
            background-color: #004080;
            padding: 4px;
        }
        .id-card img{
            margin: 18px auto;
        }
        .header img{
            width: 290px;
        }
        .photo img{
            width: 130px;
        }
        button, input, optgroup, select, textarea {
    color: darkblue;
    
}
        
    </style>
    <body>
      
          <%
         
              RegistrationBean user = (RegistrationBean)session.getAttribute("user");
           if(user==null){
            RequestDispatcher rd = request.getRequestDispatcher("signup_signin.jsp");
           rd.forward(request,response);
          }
           
           newIdCardBean nb = new newIdCardBean();  
           newIdCardDao nd = new newIdCardDao();
             
           nb=nd.getByEmail(user.getEmail());
                
                  if(nb!=null){  
       %>
       
   <div class="container">
        
       <div id="firstpage">
        <div  class="id-card-tag"></div>
	<div class="id-card-tag-strip"></div>
	<div class="id-card-hook"></div>
	<div class="id-card-holder">
		<div class="id-card">
	
                        <div class="header">
                            <img src="img/manit-full-logo.png" alt="manit logo"  width="100" height="100">
			</div>
	
			
                        <div class="photo">
				<img src="<%= nb.getPic() %>">
			</div>
             
                                <h4><strong><%= nb.getFirst_name() %> <%= nb.getLast_name() %></strong> </h4>
                       <br>
                       <h3>Scholar No: <%= nb.getRollno() %> <br> Dept :<%= nb.getDept() %>  </h3>
                       <br> <h2>Degree : <%= nb.getDegree() %></h2>
                     
                      
                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%">
                            <a href="#" id="flip" style="color:#ffd11a;" onclick="">Back Side</a>
           
                       </div>
		</div>
	</div>
   </div> 
        <div id="secondpage" style="display:none;">               
        
            <div  class="id-card-tag" ></div>
	<div class="id-card-tag-strip"></div>
	<div class="id-card-hook"></div>
	<div class="id-card-holder">
		<div class="id-card">
                        <div class="photo">
				<img src="http://api.qrserver.com/v1/create-qr-code/?data=<%=nb.getFirst_name()%><%= nb.getRollno() %>&size=100x100" alt="QR Code">
			</div>
             
                       <h2>F's Name:<%= nb.getFather_name() %> </h2>
                       
                       <h2>Parent No: <%= nb.getPmobile() %> 
                           <br>
                           Aadhar no :<%= nb.getAadhar_no() %>  </h2>
                        <h2>DOB : <%= nb.getDob() %></h2> <br> <h2>BG : <%= nb.getBloodgroup() %></h2>
                      <p>Email: <%= nb.getEmail() %></p>
                        
                        <p>Contact no.<%= nb.getMobile() %></p>  
                        <p>Add:<%= nb.getAddress() %> </p>
                        <hr>
                  
      <p> Instruction - 
<ul>
    <li>Card Holder will be responsible for the safety of this card.</li>
    <li>This Card should be surrendered at the end of validity/discharge from the institute.</li>
    <li>If the card is lost , duplicate will be issued at RS.200/-</li>
    <li>The Card Holder Should always carry and display the card within the institute.</li>
</ul> </p>
		
                    <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%">
                        <a href="#" id="flip" style="color:#ffd11a;"  onClick="$('#secondpage').hide(); $('#firstpage').show()" >Front Side</a>
                    </div>
</div>
	</div>                
      </div>              
        </div> 
                        
    <center>
       <input type="button" value="print" class="button btn-dark" onclick="window.print();"/>

    </center>
        <% }
else
System.out.println("nb is null");
    %>
    </body>
</html>
