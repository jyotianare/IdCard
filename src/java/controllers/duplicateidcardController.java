
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class duplicateidcardController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String op=request.getParameter("op");
       
         if(op.equals("add"))
         {
            String emai = request.getParameter("email");
            String paymentRef = request.getParameter("paymentRef");
            int rollno = Integer.parseInt(request.getParameter("rollno"));
            
            duplicateidcardBean d = new duplicateidcardBean();
            
            d.setEmail(emai);
            d.setPaymentRef(paymentRef);
            d.setRollno(rollno);
            
                  RequestDispatcher rdd =null;
          
            duplicateidcardDao dd = new duplicateidcardDao();
            
            if(dd.add(d))
            {
                String msg = "Submission Succesfull !";
                
              rdd = request.getRequestDispatcher("temp.jsp?msg="+msg);                 
                 
                
             //   rdd = request.getRequestDispatcher("userDashboard.jsp");                 
                   rdd.forward(request, response);
         
            }  
                
            else System.out.println("add duplicateid card failed");
         }
       
    }

}
