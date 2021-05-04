package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controllers.RegistrationDao;
import java.util.ArrayList;
import controllers.newIdCardBean;
import controllers.newIdCardDao;
import controllers.RegistrationBean;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html ng-app=\"myApp\">\n");
      out.write("  <head>\n");
      out.write("    <script src = \"https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://use.fontawesome.com/d550ee0e45.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("      .navbar-inverse {\n");
      out.write("    background-color: #089f98;\n");
      out.write("    border-color: #000000;\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("  \n");
      out.write("\n");
      out.write("        \n");
      out.write("      ");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <div class=\"fixedheader\">\n");
      out.write("      \n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      \n");
      out.write("      <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\"  style=\"background-color:\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("<!--        <li><a href=\"#\">Maulana Azad National Institute Of Technology</a></li>-->\n");
      out.write("<li><img src=\"img/manit-full-logo.png\" alt=\"img\" class=\"img-responsive\"></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#\"><i class=\"fa fa-weixin\" aria-hidden=\"true\"></i> </a></li>\n");
      out.write("        <li><a href=\"#\"><i class=\"fa fa-bell\" aria-hidden=\"true\"></i> </a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\" style=\"margin-left: 15%;margin-right: 15%;\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-2\" >\n");
      out.write("                <img src=\"\" style=\"width:50px;height: 150;\" border=\"1px solid\" class=\"rounded-circle\"/>\n");
      out.write("<!--              <img  src=\"\" height=\"150\" border=\"1px solid\">-->\n");
      out.write("              <p><i class=\"fa fa-pencil\" aria-hidden=\"true\"> <a href=\"\">Change Pic</a></i></p> <br />\n");
      out.write("            </div> \n");
      out.write("            <div class=\"col-md-10\">\n");
      out.write("              <p><b>name</b></p>\n");
      out.write("              <p><i class=\"fa fa-envelope\" aria-hidden=\"true\">email  </i></p> \n");
      out.write("              <i class=\"fa fa-university\" aria-hidden=\"true\"></i><span style=\"color:blue\"> Maulana Azad National Institute Of Technology</span>\n");
      out.write("              <i class=\"fa fa-graduation-cap\" aria-hidden=\"true\"></i>  <span>degree </span> <br /><br />\n");
      out.write("              <i class=\"fa fa-download\" aria-hidden=\"true\"></i> Resume\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"tabs\">\n");
      out.write("      \n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("                    <ul class=\"nav nav-tabs\">\n");
      out.write("                      <li class=\"active\">Personal Info\n");
      out.write("                          <iframe src=\"personalDetail.jsp\" width=\"300%\" height=\"500\" ></iframe>       \n");
      out.write("                      </li>\n");
      out.write("                      \n");
      out.write("                      <li>Contact details\n");
      out.write("                          <iframe src=\"contactDetail.jsp\" width=\"300%\" height=\"500\"></iframe>\n");
      out.write("                      </li>\n");
      out.write("                      \n");
      out.write("                      <li><a href=\"#\">Interest and Achievements</a></li>\n");
      out.write("                     \n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("         \n");
      out.write("  </body>\n");
      out.write("</html>");
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
