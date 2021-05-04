package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controllers.newIdCardBean;
import controllers.newIdCardDao;
import java.util.ArrayList;
import controllers.adminBean;
import controllers.adminDao;

public final class showUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>show users </title>\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\" type=\"text/js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"> <style>\n");
      out.write("      .sliderImg{\n");
      out.write("          width:100%;\n");
      out.write("          height:200px;\n");
      out.write("      }\n");
      out.write("  </style>\n");
      out.write("      <script type=\"text/javascript\">\n");
      out.write("      function confirmDelete(){\n");
      out.write("          if (!confirm(\"The Record will be Deleted Permanently  Want to Proceed ?\"))\n");
      out.write("                return false;\n");
      out.write("      }\n");
      out.write("      </script>\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                     <h1>List of Students</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <table class=\"table table-hover table-striped table-bordered\">\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <th>Rollno</th>\n");
      out.write("                <th>photo</th>\n");
      out.write("                <th>First Name</th>\n");
      out.write("                <th>last name</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>DOB</th>               \n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Mobile no.</th>               \n");
      out.write("                <th>Father Name</th>\n");
      out.write("                <th>Mother Name</th>\n");
      out.write("                <th>Parent contact</th>\n");
      out.write("                <th>Degree</th>\n");
      out.write("                <th>Dept.</th>\n");
      out.write("                <th>Branch</th>\n");
      out.write("                <th>Semester</th>\n");
      out.write("                <th>Date of Join</th>\n");
      out.write("                <th>blood group</th>\n");
      out.write("                <th>Aadhar no</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Operations</th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");
                
                    newIdCardDao nd = new newIdCardDao();
                    ArrayList<newIdCardBean> slist = nd.getAllRecords();         
                    for(newIdCardBean ss : slist){         
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(ss.getRollno());
      out.write("</td>\n");
      out.write("                <td><img src=\"");
      out.print(ss.getPic());
      out.write("\" style=\"width:50px;height: 50px;\" class=\"rounded-circle\"/></td>\n");
      out.write("                <td>");
      out.print(ss.getFirst_name());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(ss.getLast_name());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(ss.getGender());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(ss.getDob());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getEmail()  );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getMobile() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getFather_name() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getMother_name() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getPmobile() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getDegree() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getDept() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getBranch() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getSem() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getDateofjoin() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getBloodgroup() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getAadhar_no() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( ss.getAddress() );
      out.write("</td>\n");
      out.write("                \n");
      out.write("                <td> <a href=\"editUser.jsp?rollno=");
      out.print(ss.getRollno());
      out.write("\" class=\"btn btn-success\">  <i class=\"fa fa-pencil\" aria-hidden=\"true\"></i> </a> \n");
      out.write("                   | <a href=\"newIdCardController?op=delete&rollno=");
      out.print(ss.getRollno());
      out.write("\" class=\"btn btn-dark\" onclick=\"return confirmDelete();\"> <i class=\"fa fa-trash\" aria-hidden=\"true\"></i></a> \n");
      out.write("                </td>\n");
      out.write("                              \n");
      out.write("            </tr>\n");
      out.write("               \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <a href=\"register.jsp\" class=\"btn btn-primary\"> Add More records <i class=\"fa fa-plus-square-o\" aria-hidden=\"true\"></i></a> \n");
      out.write("           \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("  \n");
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
