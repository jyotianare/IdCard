package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write(" <style>\n");
      out.write(".mt-100 {\n");
      out.write("    margin-top: 100px; \n");
      out.write("}\n");
      out.write(".mb-100 {\n");
      out.write("    margin-bottom: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".icon {\n");
      out.write("    width: 32px;\n");
      out.write("    height: 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 7px 8px;\n");
      out.write("    border: 2px solid;\n");
      out.write("    border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header {\n");
      out.write("    padding-top: 50px;\n");
      out.write("    background-color: #eee;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write(".footer {\n");
      out.write("    color: #887;\n");
      out.write("    background-color: #eee;\n");
      out.write("    padding-top: 30px;\n");
      out.write("    padding-bottom: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content {\n");
      out.write("    position: relative;\n");
      out.write("    display: table;\n");
      out.write("    width: 100%;\n");
      out.write("    min-height: 100vh;\n");
      out.write("}\n");
      out.write(".pull-middle {\n");
      out.write("    display: table-cell;\n");
      out.write("    vertical-align: middle;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("    padding-left: 25px;\n");
      out.write("    padding-right: 25px;\n");
      out.write("}\n");
      out.write(".btn-circle {\n");
      out.write("    border-radius: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group input {\n");
      out.write("    border: 0;\n");
      out.write("    box-shadow: none;\n");
      out.write("    padding-right: 30px;\n");
      out.write("}\n");
      out.write(".input-group input:focus,\n");
      out.write(".input-group input:active {\n");
      out.write("    outline: 0;\n");
      out.write("    box-shadow: none;\n");
      out.write("}\n");
      out.write(".input-group-btn:last-child>.btn {\n");
      out.write("    z-index: 2;\n");
      out.write("    margin-left: -18px;   \n");
      out.write("    border-radius: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".phone {\n");
      out.write("    position: relative;\n");
      out.write("    max-width: 263px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("    padding: 65px 15px 55px;\n");
      out.write("    border: 2px solid #ddd;\n");
      out.write("    border-radius: 20px;\n");
      out.write("    background-color: #222;\n");
      out.write("    box-shadow: 20px 20px 40px #887;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("<div class=\"wrapper\">\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navigation\"> </button>\n");
      out.write("          <a class=\"navbar-brand text-uppercase\" href=\"#\">Dashboard <span class=\"label label-success text-capitalize\"></span></a>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navigation\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                <li><a href=\"ChangePwd.jsp\">Change Password</a></li>\n");
      out.write("                <li><a href=\"#\">Logout</a></li>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("           </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <header class=\"header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-5 col-md-offset-1\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                    <div class=\"pull-middle\">\n");
      out.write("                    <h1 class=\"page-header\">Apply for new id card</h1>\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <form action=\"newIdCard.jsp\" role=\"form\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("\n");
      out.write("                                    <span class=\"input-group-btn\">\n");
      out.write("                                        <button class=\"btn btn-success btn-circle\" type=\"submit\"><a href=\"register.jsp\" ><font color=\"white\">Apply Now</font></a></button>\n");
      out.write("                                    </span>                        \n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                    <div class=\"pull-middle\">\n");
      out.write("                    <h1 class=\"page-header\">Apply for duplicate id card</h1>\n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <form action=\"#\" role=\"form\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("\n");
      out.write("                                    <span class=\"input-group-btn\">\n");
      out.write("                                        <button class=\"btn btn-success btn-circle\" type=\"submit\"><a href=\"#\" ><font color=\"white\">Register for Id card</font></a></button>\n");
      out.write("                                    </span>                        \n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>              \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("<!--    <section class=\"section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("               <div class=\"col-md-4 col-md-offset-1 text-center mt-100 mb-100\">\n");
      out.write("                    <div class=\"phone\">\n");
      out.write("                        <img class=\"img-responsive img-rounded\" src=\"http://placemi.com/djlnr/263x480\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-5 col-md-offset-1\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"pull-middle\">\n");
      out.write("                            <h2 class=\"h1 page-header\">Discover more about features.</h2>\n");
      out.write("                            <ul class=\"media-list\">\n");
      out.write("                              <li class=\"media\">\n");
      out.write("                                <a class=\"media-left\" href=\"#\">\n");
      out.write("                                  <span class=\"glyphicon glyphicon-cloud icon text-success\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                  <h3 class=\"media-heading\">Praesent porttitor urna ut enim.</h3>\n");
      out.write("                                  <p>Maecenas vitae ex iaculis, efficitur est eu, fermentum quam.</p>\n");
      out.write("                                </div>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"media\">\n");
      out.write("                                <a class=\"media-left\" href=\"#\">\n");
      out.write("                                  <span class=\"glyphicon glyphicon-lock icon text-success\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                  <h3 class=\"media-heading\">Cras consequat est et elit.</h3>\n");
      out.write("                                  <p>Integer suscipit massa at tellus semper, at aliquam ante bibendum.</p>\n");
      out.write("                                </div>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"media\">\n");
      out.write("                                <a class=\"media-left\" href=\"#\">\n");
      out.write("                                  <span class=\"glyphicon glyphicon-user icon text-success\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                  <h3 class=\"media-heading\">Aenean vel enim quis dui blandit.</h3>\n");
      out.write("                                  <p>Maecenas vitae ex iaculis, efficitur est eu, fermentum quam.</p>\n");
      out.write("                                </div>\n");
      out.write("                              </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>-->\n");
      out.write("<!--    <section class=\"section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 text-right\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"pull-middle\">\n");
      out.write("                            <h4><strong>Describe your product.</strong></h4>\n");
      out.write("                            <p>Proin sapien neque, consequat ac tempus aliquam, gravida in urna. Phasellus et lectus in odio imperdiet tempus. Aenean posuere, nunc a tristique imperdiet, massa dolor dictum eros, sit amet tempor turpis turpis vel tortor.</p>\n");
      out.write("                            <small>Phasellus feugiat at lorem a tincidunt. Nam hendrerit leo vitae orci pellentesque, nec euismod dolor condimentum.</small>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               <div class=\"col-md-4 col-md-offset-1 mt-100 mb-100\">\n");
      out.write("                    <div class=\"phone\">\n");
      out.write("                        <img class=\"img-responsive img-rounded\" src=\"http://placemi.com/djlnr/263x480\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-md-offset-1\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"pull-middle\">\n");
      out.write("                            <h4><strong>Even more stuff.</strong></h4>\n");
      out.write("                            <p>Proin sapien neque, consequat ac tempus aliquam, gravida in urna. Phasellus et lectus in odio imperdiet tempus. Aenean posuere, nunc a tristique imperdiet, massa dolor dictum eros, sit amet tempor turpis turpis vel tortor.</p>\n");
      out.write("                            <a class=\"btn btn-success btn-circle\" href=\"#\">Sign up for free</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>-->\n");
      out.write("    <footer class=\"footer text-center\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <small>© Copyright 2021. Crafted by <a href= \"https://www.linkedin.com/in/jyoti-anare-5133721a4/\">@JyotiAnare</a></small>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</div>\n");
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
