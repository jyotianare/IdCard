package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controllers.adminBean;

public final class adminsDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Dashboard</title>\n");
      out.write("    \n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo-grad-school.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/lightbox.css\">\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("     ");

        String op=request.getParameter("op");
        if(op!=null && op.equals("logout")){
            //session.setAttribute("user", null); 
            session.removeAttribute("admin");
            response.sendRedirect("adminLogin.jsp");
        }
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("       ");
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("  <section class=\"section why-us\" data-section=\"section2\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"section-heading\">\n");
      out.write("            <h2>Welcome</h2>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div id='tabs'>\n");
      out.write("            <ul>\n");
      out.write("              <li><a href='#tabs-1'>Show Users</a></li>\n");
      out.write("              <li><a href='#tabs-2'>Printing feature</a></li>\n");
      out.write("              <li><a href='#tabs-3'>High quality ID Cards</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <section class='tabs-content'>\n");
      out.write("              <article id='tabs-1'>\n");
      out.write("                <div class=\"row\">\n");
      out.write("<!--                  <div class=\"col-md-6\">\n");
      out.write("                    <img src=\"assets/images/qrcode.png\" alt=\"\">\n");
      out.write("                  </div>-->\n");
      out.write("                  <div class=\"col-md-6\">\n");
      out.write("                      <a href=\"showUsers.jsp\">Show users</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("              <article id='tabs-2'>\n");
      out.write("                <div class=\"row\">\n");
      out.write("<!--                  <div class=\"col-md-6\">\n");
      out.write("                    <img src=\"assets/images/printidacrd.jpg\" alt=\"\">\n");
      out.write("                  </div>-->\n");
      out.write("                  <div class=\"col-md-6\">\n");
      out.write("                    <h4>Printing Feature</h4>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("              <article id='tabs-3'>\n");
      out.write("                <div class=\"row\">\n");
      out.write("<!--                  <div class=\"col-md-6\">\n");
      out.write("                    <img src=\"assets/images/highqualityicard.jpg\" alt=\"\">\n");
      out.write("                  </div>-->\n");
      out.write("                  <div class=\"col-md-6\">\n");
      out.write("                    <h4>High quality ID Cards</h4>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </section>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("        \n");
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
