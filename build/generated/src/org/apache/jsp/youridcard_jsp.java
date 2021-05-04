package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controllers.newIdCardBean;
import controllers.newIdCardDao;
import controllers.RegistrationBean;

public final class youridcard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write(" <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("     \n");
      out.write("\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"assets/css/idcardcss.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            color: #fcf8f8;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .id-card{\n");
      out.write("            background-color: #004080;\n");
      out.write("            padding: 4px;\n");
      out.write("        }\n");
      out.write("        .id-card img{\n");
      out.write("            margin: 18px auto;\n");
      out.write("        }\n");
      out.write("        .header img{\n");
      out.write("            width: 290px;\n");
      out.write("        }\n");
      out.write("        .photo img{\n");
      out.write("            width: 130px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("          ");

         
              RegistrationBean user = (RegistrationBean)session.getAttribute("user");
           if(user==null){
            RequestDispatcher rd = request.getRequestDispatcher("signup_signin.jsp");
           rd.forward(request,response);
          }
           
           newIdCardBean nb = new newIdCardBean();  
           newIdCardDao nd = new newIdCardDao();
             
           nb=nd.getByEmail(user.getEmail());
                
                  if(nb!=null){  
System.out.println("nb is not null");
        
      out.write("\n");
      out.write("       \n");
      out.write("   <div class=\"container\">\n");
      out.write("            \n");
      out.write("        <div id=\"firstpage\" class=\"id-card-tag\"></div>\n");
      out.write("\t<div class=\"id-card-tag-strip\"></div>\n");
      out.write("\t<div class=\"id-card-hook\"></div>\n");
      out.write("\t<div class=\"id-card-holder\">\n");
      out.write("\t\t<div class=\"id-card\">\n");
      out.write("\t\n");
      out.write("                        <div class=\"header\">\n");
      out.write("                            <img src=\"img/manit-full-logo.png\" alt=\"manit logo\"  width=\"100\" height=\"100\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\n");
      out.write("\t\t\t\n");
      out.write("                        <div class=\"photo\">\n");
      out.write("\t\t\t\t<img src=\"");
      out.print( nb.getPic() );
      out.write("\">\n");
      out.write("\t\t\t</div>\n");
      out.write("             \n");
      out.write("                                <h4><strong>");
      out.print( nb.getFirst_name() );
      out.write(' ');
      out.print( nb.getLast_name() );
      out.write("</strong> </h4>\n");
      out.write("                       <br>\n");
      out.write("                       <h3>Scholar No: ");
      out.print( nb.getRollno() );
      out.write(" <br> Dept :");
      out.print( nb.getDept() );
      out.write("  </h3>\n");
      out.write("                       <br> <h2>Degree : ");
      out.print( nb.getDegree() );
      out.write("</h2>\n");
      out.write("                     \n");
      out.write("                        <hr>\n");
      out.write("\n");
      out.write("                       <h2>valid upto</h2>\n");
      out.write("                      \n");
      out.write("                        <div style=\"border-top: 1px solid#888; padding-top:15px; font-size:85%\">\n");
      out.write("                           <a href=\"#\" onClick=\"$('#firstpage').hide(); $('#secondpage').show()\">Second Page</a>\n");
      out.write("           \n");
      out.write("                       </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("           \n");
      out.write("        <div id=\"secondpage\" class=\"id-card-tag\" >\n");
      out.write("\t<div class=\"id-card-tag-strip\"></div>\n");
      out.write("\t<div class=\"id-card-hook\"></div>\n");
      out.write("\t<div class=\"id-card-holder\">\n");
      out.write("\t\t<div class=\"id-card\">\n");
      out.write("<!--\n");
      out.write("<img src=\"http://api.qrserver.com/v1/create-qr-code/?data=\"+");
      out.print( nb.getFirst_name() );
      out.write("+\"&size=100x100\" alt=\"QR Code\">\n");
      out.write("-->\n");
      out.write("                        <div class=\"photo\">\n");
      out.write("\t\t\t\t<img src=\"http://api.qrserver.com/v1/create-qr-code/?data=HelloWorld!&size=100x100\" alt=\"QR Code\">\n");
      out.write("\t\t\t</div>\n");
      out.write("             \n");
      out.write("                       <h2>F's Name:");
      out.print( nb.getFather_name() );
      out.write(" </h2>\n");
      out.write("                       \n");
      out.write("                       <h2>Parent No: ");
      out.print( nb.getPmobile() );
      out.write(" \n");
      out.write("                           <br>\n");
      out.write("                           Aadhar no :");
      out.print( nb.getAadhar_no() );
      out.write("  </h2>\n");
      out.write("                        <h2>DOB : ");
      out.print( nb.getDob() );
      out.write("</h2> <br> <h2>BG : ");
      out.print( nb.getBloodgroup() );
      out.write("</h2>\n");
      out.write("                      <p>Email: ");
      out.print( nb.getEmail() );
      out.write("</p>\n");
      out.write("                        \n");
      out.write("                        <p>Contact no.");
      out.print( nb.getMobile() );
      out.write("</p>  \n");
      out.write("                        <p>Add:");
      out.print( nb.getAddress() );
      out.write(" </p>\n");
      out.write("                        <hr>\n");
      out.write("                  \n");
      out.write("      <p> Instruction - \n");
      out.write("<ul>\n");
      out.write("    <li>Card Holder will be responsible for the safety of this card.</li>\n");
      out.write("    <li>This Card should be surrendered at the end of validity/discharge from the institute.</li>\n");
      out.write("    <li>If the card is lost , duplicate will be issued at RS.200/-</li>\n");
      out.write("    <li>The Card Holder Should always carry and display the card within the institute.</li>\n");
      out.write("</ul> </p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>                \n");
      out.write("      </div>              \n");
      out.write("                       \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("            <br><br>\n");
      out.write("             <input type=\"button\" value=\"print\" onclick=\"window.print();\"/>\n");
      out.write("          \n");
      out.write("    ");
 }
else
System.out.println("nb is null");
    
      out.write("\n");
      out.write("    \n");
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
