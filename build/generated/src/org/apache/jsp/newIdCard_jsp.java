package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newIdCard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta  charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <link  href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write(" \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("            function validateForm(){\n");
      out.write("                gender=document.getElementsByName(\"gender\");\n");
      out.write("              //  alert('ok');\n");
      out.write("               g = 0;\n");
      out.write("               for (i=0;i<gender.length;i++){\n");
      out.write("                   //alert('gender '+gender[i].checked);\n");
      out.write("                   if(gender[i].checked)\n");
      out.write("                       g++;\n");
      out.write("               }\n");
      out.write("                \n");
      out.write("                if (g==0)\n");
      out.write("                {\n");
      out.write("                   s2.innerHTML=\"Please Select any Gender\";\n");
      out.write("                   return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("                 function readURL(input) {\n");
      out.write("                    if (input.files && input.files[0]) {\n");
      out.write("                        var reader = new FileReader();\n");
      out.write("\n");
      out.write("                        reader.onload = function (e) {\n");
      out.write("                            preview.src = e.target.result;\n");
      out.write("                        };\n");
      out.write("\n");
      out.write("                        reader.readAsDataURL(input.files[0]);\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("              \n");
      out.write("           </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">     \n");
      out.write("   <div class=\"row\">\n");
      out.write("    <div class=\"col-md-8 col-md-offset-1\">\n");
      out.write("\n");
      out.write("        <form action=\"newIdCardController?op=add\" method=\"post\" class=\"form-horizontal\" enctype=\"multipart/form-data\" onsubmit=\"return validateForm();\"> \n");
      out.write("      \n");
      out.write("        <fieldset>\n");
      out.write("       \n");
      out.write("          <!-- Form Name -->\n");
      out.write("          <legend>Personal Information Details</legend>\n");
      out.write("\n");
      out.write("          <!-- Text input-->\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <input type=\"text\" id=\"first_name\" name=\"fist_name\" required=\"required\" placeholder=\"First Name\"  class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("              <input type=\"text\" id=\"last_name\" name=\"last_name\" required=\"required\"  placeholder=\"Last Name\"  class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("                 \n");
      out.write("          <!-- Text input-->\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("             DOB : <input type=\"date\" id=\"dob\" name=\"dob\" required=\"required\" placeholder=\"Date Of Birth\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!-- Text input-->\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("             Select Gender : <span style=\"font-weight: bold;color:red\" id=\"s2\"></span>\n");
      out.write("              <br>\n");
      out.write("              Female : <input type=\"radio\" name=\"gender\" placeholder=\"Gender\" value=\"female\">\n");
      out.write("              Male : <input type=\"radio\" name=\"gender\" placeholder=\"Gender\" value=\"male\" >\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- Text input-->\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("              <input type=\"number\" id=\"aadhar_no\" name=\"aadhar_no\" required=\"required\"  placeholder=\"Aadhar No\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <!-- Text input-->\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("              <input type=\"text\" id=\"bloodgroup\" name=\"bloodgroup\" required=\"required\"  placeholder=\"Blood Group\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("          <br>\n");
      out.write("\n");
      out.write("  <legend>Educational Information Details</legend>\n");
      out.write("\n");
      out.write("          <!-- Text input-->\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("              <input type=\"text\" id=\"dept\"  name=\"dept\"  required=\"required\" placeholder=\"Department\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("              <input type=\"text\" id=\"degree\"  name=\"degree\"  required=\"required\" placeholder=\"Degree\" class=\"form-control\">\n");
      out.write("            </div> \n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("              <input type=\"text\" id=\"branch\" name=\"branch\"required=\"required\"  placeholder=\"Branch\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("              <input type=\"number\" id=\"sem\" name=\"sem\" required=\"required\"  placeholder=\"Semester\" class=\"form-control\">\n");
      out.write("            </div>  \n");
      out.write("          </div>\n");
      out.write("                 \n");
      out.write("          <!-- Text input-->\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("             Date of Join : <input type=\"date\" id=\"dateofjoin\" name=\"dateofjoin\" required=\"required\" placeholder=\"Date Of Join\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("              <input type=\"number\" id=\"rollno\" name=\"rollno\" required=\"required\" placeholder=\"Roll no\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("          </div>\n");
      out.write("     \n");
      out.write("          <br>\n");
      out.write("         \n");
      out.write("        <!--  Contact Section -->\n");
      out.write("          <!-- Form Name -->\n");
      out.write("          <legend>Contact Information</legend>\n");
      out.write("          <!-- Text input-->\n");
      out.write("          \n");
      out.write("          <div class=\"form-group\">\n");
      out.write("             \n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("            <i class=\"far fa-address-book\" aria-hidden=\"true\"></i> \n");
      out.write("            <br><input type=\"number\" id=\"mobile\"  name=\"mobile\"required=\"required\" placeholder=\"Phone Number\" class=\"form-control \" >\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("              <input type=\"email\" id=\"email\"  name=\"email\"required=\"required\" placeholder=\"Email\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <br>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("<!-- Address Section -->\n");
      out.write("          <!-- Form Name -->\n");
      out.write("          <legend>Address Details</legend>\n");
      out.write("          <!-- Text input-->\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("              <input type=\"text\" id=\"address\" name=\"address\" required=\"required\" placeholder=\"Address Line 1\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <!-- \n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("              <input type=\"text\" name=\"city\" placeholder=\"City\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("              <input type=\"text\" name=\"state\" placeholder=\"State\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("              <input type=\"text\" name=\"postalCode\" placeholder=\"Post Code\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("                   \n");
      out.write("          -->\n");
      out.write("          <br>\n");
      out.write("<!-- Parent/Guadian Contact Section -->\n");
      out.write("          <!-- Form Name -->\n");
      out.write("          <legend>Parent/Guadian Information</legend>\n");
      out.write("          <!-- Text input-->\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("              <input type=\"text\" id=\"father_name\"  name=\"father_name\" required=\"required\" placeholder=\"First Name\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("              <input type=\"text\" id=\"mother_name\"  name=\"mother_name\"required=\"required\" placeholder=\"Mother Name\" class=\"form-control\">\n");
      out.write("            </div>      \n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("              <input type=\"number\" id=\"pmobile\" name=\"pmobile\"required=\"required\" placeholder=\"Phone Number\"  class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("         \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <br>\n");
      out.write("     \n");
      out.write("          <div class=\"form-group\">\n");
      out.write("             <div class=\"col-md-4\">\n");
      out.write("                 <img src=\"\" alt=\"img\" width=\"200\" height=\"200\" id=\"preview\" />\n");
      out.write("                    <br/> <br/>\n");
      out.write("<!--             <input type=\"button\" value=\"Upload your Pic\" class=\"btn btn-primary\" onclick=\"pic.click();\"/><br/> -->\n");
      out.write("         <input type=\"file\" name=\"pic\" id=\"pic\" required=\"required\"  onchange=\"readURL(this);\" />\n");
      out.write("                                   \n");
      out.write("                </div>    \n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("<!-- Command -->\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-5 col-sm-offset-1\">\n");
      out.write("              <div class=\"pull-right\">\n");
      out.write("                  <input type=\"submit\" class=\"btn btn-primary form-control\" value=\"Register\" name=\"submit\"/>      \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </fieldset>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
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
