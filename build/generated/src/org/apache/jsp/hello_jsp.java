package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controllers.newIdCardBean;
import controllers.newIdCardDao;
import controllers.RegistrationBean;

public final class hello_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("          ");

          RegistrationBean user = (RegistrationBean)session.getAttribute("user");
           if(user==null){
            RequestDispatcher rd = request.getRequestDispatcher("signup_signin.jsp");
           rd.forward(request,response);
           }
             int rollno = Integer.parseInt(request.getParameter("rollno"));
        
             
           newIdCardBean nb = new newIdCardBean();  
           newIdCardDao nd = new newIdCardDao();
                    nb = nd.getByRollno(rollno);      
                    
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-offset-2 col-md-8 col-lg-offset-3 col-lg-6\">\n");
      out.write("    \t <div class=\"well profile\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-8\">\n");
      out.write("                    <h2>");
      out.print( nb.getFirst_name());
      out.write(" &nbsp; ");
      out.print( nb.getLast_name() );
      out.write("</h2>\n");
      out.write("                    <p><strong>About:</strong> Web Designer / UI. </p>\n");
      out.write("                    <p><strong>Hobbies: </strong> Read, out with friends, listen to music, draw and learn new things. </p>\n");
      out.write("                    <p><strong>Skills: </strong>\n");
      out.write("                        <span class=\"tags\">html5</span> \n");
      out.write("                        <span class=\"tags\">css3</span>\n");
      out.write("                        <span class=\"tags\">jquery</span>\n");
      out.write("                        <span class=\"tags\">bootstrap3</span>\n");
      out.write("                    </p>\n");
      out.write("                </div>             \n");
      out.write("                <div class=\"col-xs-12 col-sm-4 text-center\">\n");
      out.write("                    <figure>\n");
      out.write("                        <img src=\"http://www.localcrimenews.com/wp-content/uploads/2013/07/default-user-icon-profile.png\" alt=\"\" class=\"img-circle img-responsive\">\n");
      out.write("                        <figcaption class=\"ratings\">\n");
      out.write("                            <p>Ratings\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <span class=\"fa fa-star\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <span class=\"fa fa-star\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <span class=\"fa fa-star\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <span class=\"fa fa-star\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                 <span class=\"fa fa-star-o\"></span>\n");
      out.write("                            </a> \n");
      out.write("                            </p>\n");
      out.write("                        </figcaption>\n");
      out.write("                    </figure>\n");
      out.write("                </div>\n");
      out.write("            </div>            \n");
      out.write("            <div class=\"col-xs-12 divider text-center\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-4 emphasis\">\n");
      out.write("                    <h2><strong> 20,7K </strong></h2>                    \n");
      out.write("                    <p><small>Followers</small></p>\n");
      out.write("                    <button class=\"btn btn-success btn-block\"><span class=\"fa fa-plus-circle\"></span> Follow </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-4 emphasis\">\n");
      out.write("                    <h2><strong>245</strong></h2>                    \n");
      out.write("                    <p><small>Following</small></p>\n");
      out.write("                    <button class=\"btn btn-info btn-block\"><span class=\"fa fa-user\"></span> View Profile </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-4 emphasis\">\n");
      out.write("                    <h2><strong>43</strong></h2>                    \n");
      out.write("                    <p><small>Snippets</small></p>\n");
      out.write("                    <div class=\"btn-group dropup btn-block\">\n");
      out.write("                      <button type=\"button\" class=\"btn btn-primary\"><span class=\"fa fa-gear\"></span> Options </button>\n");
      out.write("                      <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                        <span class=\"caret\"></span>\n");
      out.write("                        <span class=\"sr-only\">Toggle Dropdown</span>\n");
      out.write("                      </button>\n");
      out.write("                      <ul class=\"dropdown-menu text-left\" role=\"menu\">\n");
      out.write("                        <li><a href=\"#\"><span class=\"fa fa-envelope pull-right\"></span> Send an email </a></li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"fa fa-list pull-right\"></span> Add or remove from a list  </a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"fa fa-warning pull-right\"></span>Report this user for spam</a></li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li><a href=\"#\" class=\"btn disabled\" role=\"button\"> Unfollow </a></li>\n");
      out.write("                      </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    \t </div>                 \n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
