package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controllers.adminDao;
import controllers.adminBean;
import controllers.RegistrationDao;
import controllers.RegistrationBean;

public final class ChangePwd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Change password</title>\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("         function validateForm(){\n");
      out.write("                pass=document.getElementById(\"pwd\").value;\n");
      out.write("                cpass =document.getElementById(\"cpwd\").value;\n");
      out.write("               \n");
      out.write("               if(pass!=cpass)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"s1\").innerHTML=\"Password and confirm password doesn't matched\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else{\n");
      out.write("                     \n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("   function myFunction() {\n");
      out.write("  var x = document.getElementById(\"oldpwd\");\n");
      out.write("  if (x.type === \"password\") {\n");
      out.write("    x.type = \"text\";\n");
      out.write("  } else {\n");
      out.write("    x.type = \"password\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("            \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("               \n");
      out.write("        \n");
      out.write("        ");

    
           String temp=null;
          
           RegistrationBean ChangePwdUser= null;
            
               RegistrationBean rb = new RegistrationBean();
               RegistrationDao rd = new RegistrationDao();
               
               adminBean ab = new adminBean();
               adminDao ad = new adminDao();
               
               RequestDispatcher rdd=null;
            
        if(request.getParameter("submit")==null){
           
           String email = request.getParameter("email");
         
            
          System.out.println("getting email in change pwd : " + email);
          
          if(email.equals(temp))
           {
              rdd = request.getRequestDispatcher("index.jsp");
              rdd.forward(request,response);               
           }
           else{
               
               rb=rd.getByEmail(email);
               
               if(rb!=null)
                {
                   ChangePwdUser = rb;  
                   
                   System.out.println("changepwduser email :" + ChangePwdUser.getEmail());
                   System.out.println("changepwduser firstname :" + ChangePwdUser.getFirst_name());
                   System.out.println("changepwduser lastname :" + ChangePwdUser.getLast_name());
                   System.out.println("changepwduser pwd :" + ChangePwdUser.getPwd());
                   System.out.println("changepwduser sec que :" + ChangePwdUser.getSecurityQue());
                   System.out.println("changepwduser sec ans :" + ChangePwdUser.getSecurityAns());
         
                }
                else {
                    System.out.println("for admin entry");
                }
           }
        }
      else if(request.getParameter("submit")!=null)
      {
          try{
     
     String oldpwd,pwd;
     
     oldpwd = request.getParameter("oldpwd");
     pwd = request.getParameter("pwd");
     
     System.out.println("in submit not equal to null");
     
     if( !ChangePwdUser.getPwd().equalsIgnoreCase(oldpwd))
     {
         System.out.println("if chl gye re baba");
              out.println("<script>alert('old password does not matched !!!');</script> ");
    
     }
     else  
     {  
           if(rd.updatepwd(ChangePwdUser)){
                response.sendRedirect("temp.jsp");
               
                System.out.println("pwd changed");
           }
           else  System.out.println("pwd not changed");
         
     }
          }
          catch(Exception e) 
          {
              System.out.println("error in change pwd :" + e.getMessage());
          }
     }
          
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-12\">\n");
      out.write("    <center><h1>Change Password</h1></center>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("<form action=\"ChangePwd.jsp\"  id=\"passwordForm\" onsubmit=\"return validateForm();\"> \n");
      out.write("   Enter Old Password : <input type=\"password\" class=\"input-lg form-control\" required=\"required\" name=\"oldpwd\" id=\"oldpwd\" placeholder=\"Old Password\" autocomplete=\"off\"><br>\n");
      out.write("   \n");
      out.write("   Show Password : <input type=\"checkbox\" onclick=\"myFunction()\"><br/><br/>\n");
      out.write(" \n");
      out.write("   <b>Password must contain atleast one upppercase, one lowercase , one digit   and min 8 character long<br/></b>\n");
      out.write("                       \n");
      out.write(" Enter New Password : <input type=\"text\" class=\"input-lg form-control\" name=\"pwd\" id=\"pwd\" required=\"required\" placeholder=\"New Password\" autocomplete=\"off\" pattern=\"(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\"><br>\n");
      out.write("  \n");
      out.write("  Retype New Password : <input type=\"text\" class=\"input-lg form-control\" name=\"cpwd\" id=\"cpwd\" required=\"required\" placeholder=\"Repeat Password\" autocomplete=\"off\"><br/> \n");
      out.write("  <span id=\"s1\" style=\"color:red\"></span>\n");
      out.write("                 \n");
      out.write("  <input type=\"submit\" name=\"submit\" value=\"submit\" class=\"col-xs-12 btn btn-primary btn-load btn-lg\" data-loading-text=\"Changing Password...\" value=\"Change Password\">\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("       </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
