package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" >\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Forgot Password </title>\n");
      out.write("  <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"> <style>\n");
      out.write("     \n");
      out.write(" <style>\n");
      out.write("     .form-gap {\n");
      out.write("    padding-top: 70px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".row{\n");
      out.write("    margin-left: -50px;\n");
      out.write("}\n");
      out.write(" </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- partial:index.partial.html -->\n");
      out.write("<div class=\"form-gap\"></div>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-4 col-md-offset-4\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("              <div class=\"panel-body\">\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                  <h3><i class=\"fa fa-lock fa-4x\"></i></h3>\n");
      out.write("                  <h2 class=\"text-center\">Forgot Password?</h2>\n");
      out.write("                  <p>To reset your password fill this</p>\n");
      out.write("                  <div class=\"panel-body\">\n");
      out.write("    \n");
      out.write("                      <form action=\"RegistrationController?op=forgotPwd\" id=\"register-form\" role=\"form\" autocomplete=\"off\" class=\"form\" method=\"post\">\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                          <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-envelope color-blue\"></i></span>\n");
      out.write("                          <input id=\"email\" name=\"email\" placeholder=\"email address\" class=\"form-control\"  type=\"email\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                          <span class=\"input-group-addon\"><i class=\"fas fa-question\"></i></span>\n");
      out.write("                          <select name=\"securityQue\">\n");
      out.write("                              <option value=\"nickname\">What was your childhood nickname?</option>\n");
      out.write("                              <option value=\"school\">What school did you attend for sixth grade?</option>\n");
      out.write("                              <option value=\"sport\">What was your favorite sport in high school?</option>\n");
      out.write("                          </select>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                          <span class=\"input-group-addon\"></span>\n");
      out.write("                          <input id=\"securityAns\" name=\"securityAns\" placeholder=\"Write Your Answer in one word\" class=\"form-control\"  type=\"text\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-group\">\n");
      out.write("                        <input name=\"submit\" class=\"btn btn-lg btn-primary btn-block\" value=\"Submit\" type=\"submit\">\n");
      out.write("                      </div>\n");
      out.write("                      \n");
      out.write("                      <input type=\"hidden\" class=\"hide\" name=\"token\" id=\"token\" value=\"\"> \n");
      out.write("                    </form>\n");
      out.write("    \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
