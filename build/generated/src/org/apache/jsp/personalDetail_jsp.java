package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controllers.newIdCardBean;
import controllers.newIdCardDao;
import controllers.RegistrationBean;

public final class personalDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/profileDetailCss.css\">\n");
      out.write("    </head>\n");
      out.write("     ");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"card first-card\">\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <h3>Do you want to provide other information?</h3>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <div class=\"chips\">\n");
      out.write("    \n");
      out.write("    <div class=\"chip-card\">\n");
      out.write("      <label>Fund account</label>\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("    <div class=\"chip-card\">\n");
      out.write("      <label>Cash</label>\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("    <div class=\"chip-card\">\n");
      out.write("      <label>Customer dividend</label>\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("    <div class=\"chip-card\">\n");
      out.write("      <label>Life insurance</label>\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("    <div class=\"chip-card\">\n");
      out.write("      <label>Private debt</label>\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("    <div class=\"chip-card\">\n");
      out.write("      <label>Fund account</label>\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("    <div class=\"chip-card\">\n");
      out.write("      <label>Other capital costs</label>\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <span class=\"link\">See more topics</span>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"card second-card\">\n");
      out.write("  \n");
      out.write("  <h3>Address and contact information</h3>\n");
      out.write("  \n");
      out.write("  <div class=\"containers\">\n");
      out.write("    \n");
      out.write("    <div class=\"container cone\">\n");
      out.write("      \n");
      out.write("      <div class=\"icon\">\n");
      out.write("        <svg width=\"34\" height=\"34\" viewBox=\"0 0 34 34\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("<path d=\"M7.08333 17H4.25L17 4.25L29.75 17H26.9167\" stroke=\"#232532\" stroke-width=\"2.125\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\n");
      out.write("<path d=\"M7.08337 17V26.9167C7.08337 28.4815 8.3519 29.75 9.91671 29.75H24.0834C25.6482 29.75 26.9167 28.4815 26.9167 26.9167V17\" stroke=\"#232532\" stroke-width=\"2.125\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\n");
      out.write("<path d=\"M12.75 29.75V21.25C12.75 19.6852 14.0185 18.4167 15.5833 18.4167H18.4167C19.9815 18.4167 21.25 19.6852 21.25 21.25V29.75\" stroke=\"#232532\" stroke-width=\"2.125\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\n");
      out.write("</svg>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("         <h4>Residential address</h4>\n");
      out.write("      \n");
      out.write("      <p>\n");
      out.write("        12 Navoc Way\n");
      out.write("44756 Cioseega\n");
      out.write("      </p>\n");
      out.write("      \n");
      out.write("      <div class=\"btn\">Report relocation</div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("    <div class=\"container ctwo\">\n");
      out.write("      <div class=\"icon\">\n");
      out.write("        <svg width=\"34\" height=\"34\" viewBox=\"0 0 34 34\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("<path d=\"M14.1667 29.75V20.5416C14.1667 17.8032 11.9467 15.5833 9.20833 15.5833C6.46992 15.5833 4.25 17.8032 4.25 20.5416V29.75H29.75V21.25C29.75 18.1204 27.2129 15.5833 24.0833 15.5833H9.20833\" stroke=\"#232532\" stroke-width=\"2.125\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\n");
      out.write("<path d=\"M17 15.5833V4.25H22.6667L25.5 7.08333L22.6667 9.91667H17\" stroke=\"#232532\" stroke-width=\"2.125\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\n");
      out.write("<path d=\"M8.5 21.25H9.91667\" stroke=\"#232532\" stroke-width=\"2.125\" stroke-linecap=\"round\" stroke-linejoin=\"round\"/>\n");
      out.write("</svg>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <h4>Postal address</h4>\n");
      out.write("      \n");
      out.write("      <div class=\"chip\">No address provided</div>\n");
      out.write("      \n");
      out.write("      <div class=\"btn active\"> Add postal address</div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
