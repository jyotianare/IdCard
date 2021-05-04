package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controllers.RegistrationBean;

public final class userDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>User Dashboard</title>\n");
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
            session.removeAttribute("user");
        }
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("              ");

         RegistrationBean user = (RegistrationBean)session.getAttribute("user");
           if(user==null){
            RequestDispatcher rd = request.getRequestDispatcher("signup_signin.jsp");
           rd.forward(request,response);
           }
        
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("   <header class=\"main-header clearfix\" role=\"header\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("      <a href=\"#\"><em>Getyour i card</em>.com</a>\n");
      out.write("    </div>\n");
      out.write("    <a href=\"#menu\" class=\"menu-link\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("    <nav id=\"menu\" class=\"main-nav\" role=\"navigation\">\n");
      out.write("      \n");
      out.write("        <ul class=\"main-menu\">\n");
      out.write("        <li><a href=\"#\"class=\"external\">Profile</a></li>\n");
      out.write("       \n");
      out.write("        <li><a href=\"ChangePwd.jsp\" class=\"external\">Change Password</a></li>\n");
      out.write("        <li><a  href=\"userDashboard.jsp?op=logout\" >logout</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("         \n");
      out.write("  <section class=\"section why-us\" data-section=\"section2\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"section-heading\">\n");
      out.write("            <h2>Welcome ");
      out.print(user.getFirst_name());
      out.write("</h2>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div id='tabs'>\n");
      out.write("           \n");
      out.write("            <section class='tabs-content'>\n");
      out.write("              <article id='tabs-1'>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-6\">\n");
      out.write("                      <h4>Apply for New Id Card <a href=\"newIdCard.jsp\">Click here</a></h4> \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("              <article id='tabs-2'>\n");
      out.write("                <div class=\"row\">\n");
      out.write("<!--                  <div class=\"col-md-6\">\n");
      out.write("                    <img src=\"assets/images/printidacrd.jpg\" alt=\"\">\n");
      out.write("                  </div>-->\n");
      out.write("                  <div class=\"col-md-6\">\n");
      out.write("                      <h4>Apply for Duplicate Id Card<a href=\"#\"> Click here</a></h4>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("              <article id='tabs-3'>\n");
      out.write("                <div class=\"row\">\n");
      out.write("<!--                  <div class=\"col-md-6\">\n");
      out.write("                    <img src=\"assets/images/highqualityicard.jpg\" alt=\"\">\n");
      out.write("                  </div>-->\n");
      out.write("                  <div class=\"col-md-6\">\n");
      out.write("                    <h4>  <a href=\"#\">Your Digital Id Card</a></h4>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </article>\n");
      out.write("            </section>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("      \n");
      out.write("       \n");
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
