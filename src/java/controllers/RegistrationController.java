
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistrationController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String op= request.getParameter("op");
         if( op.equals("checkid"))
        {
            
             String email = request.getParameter("email1");
             String pwd = request.getParameter("pwd1");
     
             RegistrationBean rb = new RegistrationBean();
             rb.setEmail(email);
             rb.setPwd(pwd);
             
             RegistrationDao rd = new RegistrationDao();
             
            if(rd.checkid(rb))
               out.println("<font color='red'><b>sorry! this userid has already been registered</b></font>");              
            else
               out.println("<font color='blue'><b>Userid Is Available</b></font>");                
              
        }
            
        }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String op=request.getParameter("op");
       
         if(op.equals("signup"))
         {
            String email = request.getParameter("email1");
            String first_name = request.getParameter("first_name");
            String last_name = request.getParameter("last_name");
            String pwd = request.getParameter("pwd1");
            String securityQue = request.getParameter("securityQue");
            String securityAns = request.getParameter("securityAns");
            
            RegistrationBean r = new RegistrationBean();
              r.setEmail(email);
              r.setFirst_name(first_name);
              r.setLast_name(last_name);
              r.setPwd(pwd);
              r.setSecurityQue(securityQue);
              r.setSecurityAns(securityAns);
              
            RegistrationDao rd = new RegistrationDao();
            
            if(rd.add(r)) response.sendRedirect("signup_signin.jsp");
         }
         
         else if(op.equals("signin"))
         {
             String email = request.getParameter("email");
             String pwd = request.getParameter("pwd");
     
             System.out.println("email:"+email);
             System.out.println("pwd:"+pwd);
             
             RegistrationBean rb = new RegistrationBean();
             rb.setEmail(email);
             rb.setPwd(pwd);
             
             RegistrationDao rd = new RegistrationDao();
              RequestDispatcher rdd =null;
             if(rd.checkuser(rb))
             {
                 RegistrationBean user = rd.getByEmail(rb.getEmail());
                  //session user
                 
                   HttpSession session=request.getSession();
                   session.setAttribute("user", user);
                                 
                   System.out.println("user i n controller:"+user);
                   //cookies
                   
                    String rem = request.getParameter("remember");
                    if(rem!=null && rem.equals("remember")){
                         Cookie c1 = new Cookie("user_email", email);
                         Cookie c2 = new Cookie("user_pwd", pwd);
                         c1.setMaxAge(60*60); //for one hour
                         c2.setMaxAge(60*60); //for one hour
                         response.addCookie(c1);
                         response.addCookie(c2);
                    }
                response.sendRedirect("userDashboard.jsp");
              //      rdd = request.getRequestDispatcher("userDashboard.jsp");
                  
              //     rdd.forward(request, response);
                   
                   
             }
                 
          else{
                out.println("<h2><font color='red'>Sorry! Userid or password is incorrect </font></h2>");
                rdd = request.getRequestDispatcher("signup_signin.jsp");
                rdd.include(request, response);
               }
          
          }
         
         if (op != null && op.equals("updatepwd")) {
            String pwd = request.getParameter("pwd");
            String email = request.getParameter("email");
            
            RegistrationBean rb = new RegistrationBean();
            rb.setEmail(email);
            rb.setPwd(pwd);

            RegistrationDao rd = new RegistrationDao();
           if(rd.updatepwd(rb))
                response.sendRedirect("userDashboard.jsp");
        }
         
         if(op.equals("forgotPwd"))
         {
            String securityQue = request.getParameter("securityQue");
            String email = request.getParameter("email");
            String securityAns = request.getParameter("securityAns");
            
            RegistrationBean rb = new RegistrationBean();
            rb.setEmail(email);
            rb.setSecurityAns(securityAns);
            rb.setSecurityQue(securityQue);
             RegistrationDao rd = new RegistrationDao();
           System.out.println("email in forgot pwd : " + email);
             RequestDispatcher rdd=null;
             if(rd.checkAns(rb))
             {
                 
                   rdd = request.getRequestDispatcher("newPwd.jsp?email="+email);
                  
                   rdd.forward(request, response);
            
                 
              //  response.sendRedirect("newPwd.jsp?email="+email);
                       
             }
             else out.println(" wrong entry ");
             
         }
        
    }
}

  
         
  



