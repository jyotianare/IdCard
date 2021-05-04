
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


public class adminController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String op = request.getParameter("op");
      
        if(op!=null && op.equals("add"))
        {
                      
             String email = request.getParameter("email");
             String pwd = request.getParameter("pwd");
             
             adminBean ab = new adminBean();
         
             ab.setEmail(email);
             ab.setPwd(pwd);
             
              adminDao rd = new adminDao();
              RequestDispatcher rdd =null;
            
              if(rd.checkuser(ab))
             {
                  adminBean admin = rd.getByEmail(ab.getEmail());
                 
                  //session admin
                  
                HttpSession session=request.getSession();
                session.setAttribute("admin", admin);
                                 
                   rdd = request.getRequestDispatcher("adminsDashboard.jsp");
                  //cookies                  
                    String rem = request.getParameter("remember");
                    if(rem!=null && rem.equals("remember")){
                         Cookie c1 = new Cookie("email", email);
                         Cookie c2 = new Cookie("pwd", pwd);
                         c1.setMaxAge(60*60); //for one hour
                         c2.setMaxAge(60*60); //for one hour
                         response.addCookie(c1);
                         response.addCookie(c2);
               }
                   
                   rdd.forward(request, response);                   
             
          //   response.sendRedirect("adminsDashboard.jsp");
                 
             }
                 
          else{
                out.println("<h2><font color='red'>Sorry! Userid or password is incorrect </font></h2>");
      //       response.sendRedirect("adminLogin.jsp");
             
                rdd = request.getRequestDispatcher("adminLogin.jsp");
                rdd.include(request, response);
              }   
        }
        if (op != null && op.equals("updatepwd")) {
            String pwd = request.getParameter("pwd");
            String email = request.getParameter("email");
            
            adminBean rb = new adminBean();
            rb.setEmail(email);
            rb.setPwd(pwd);

            adminDao rd = new adminDao();
           if(rd.updatepwd(rb))
                response.sendRedirect("adminsDashboard.jsp");
        }
        
     }
   
}
