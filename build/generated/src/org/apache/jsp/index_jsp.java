package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <title>GetYourICard.com</title>\n");
      out.write("    \n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Additional CSS Files -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/templatemo-grad-school.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/lightbox.css\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!--header-->\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "homeHeader.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("  <!-- ***** Main Banner Area Start ***** -->\n");
      out.write("  <section class=\"section main-banner\" id=\"top\" data-section=\"section1\">\n");
      out.write("      <video autoplay muted loop id=\"bg-video\">\n");
      out.write("          <source src=\"assets/images/course-video.mp4\" type=\"video/mp4\" />\n");
      out.write("      </video>\n");
      out.write("\n");
      out.write("      <div class=\"video-overlay header-text\">\n");
      out.write("          <div class=\"caption\">\n");
      out.write("              <h6>Welcome To</h6>\n");
      out.write("              <h2><em>GetYour i Card</em>.COM</h2>\n");
      out.write("              <div class=\"main-button\">\n");
      out.write("                  <div class=\"scroll-to-section\"><a href=\"#section2\">Discover more</a></div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- ***** Main Banner Area End ***** -->\n");
      out.write("\n");
      out.write("<!--  main body content-->\n");
      out.write("\n");
      out.write("  \n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "homeDashboard.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<!--  other section-->\n");
      out.write("\n");
      out.write("<!--contact section-->\n");
      out.write("\n");
      out.write("<!--    footer  -->\n");
      out.write("  \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("  \n");
      out.write("  <!-- Scripts -->\n");
      out.write("  <!-- Bootstrap core JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/isotope.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/owl-carousel.js\"></script>\n");
      out.write("    <script src=\"assets/js/lightbox.js\"></script>\n");
      out.write("    <script src=\"assets/js/tabs.js\"></script>\n");
      out.write("    <script src=\"assets/js/video.js\"></script>\n");
      out.write("    <script src=\"assets/js/slick-slider.js\"></script>\n");
      out.write("    <script src=\"assets/js/custom.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        //according to loftblog tut\n");
      out.write("        $('.nav li:first').addClass('active');\n");
      out.write("\n");
      out.write("        var showSection = function showSection(section, isAnimate) {\n");
      out.write("          var\n");
      out.write("          direction = section.replace(/#/, ''),\n");
      out.write("          reqSection = $('.section').filter('[data-section=\"' + direction + '\"]'),\n");
      out.write("          reqSectionPos = reqSection.offset().top - 0;\n");
      out.write("\n");
      out.write("          if (isAnimate) {\n");
      out.write("            $('body, html').animate({\n");
      out.write("              scrollTop: reqSectionPos },\n");
      out.write("            800);\n");
      out.write("          } else {\n");
      out.write("            $('body, html').scrollTop(reqSectionPos);\n");
      out.write("          }\n");
      out.write("\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        var checkSection = function checkSection() {\n");
      out.write("          $('.section').each(function () {\n");
      out.write("            var\n");
      out.write("            $this = $(this),\n");
      out.write("            topEdge = $this.offset().top - 80,\n");
      out.write("            bottomEdge = topEdge + $this.height(),\n");
      out.write("            wScroll = $(window).scrollTop();\n");
      out.write("            if (topEdge < wScroll && bottomEdge > wScroll) {\n");
      out.write("              var\n");
      out.write("              currentId = $this.data('section'),\n");
      out.write("              reqLink = $('a').filter('[href*=\\#' + currentId + ']');\n");
      out.write("              reqLink.closest('li').addClass('active').\n");
      out.write("              siblings().removeClass('active');\n");
      out.write("            }\n");
      out.write("          });\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        $('.main-menu, .scroll-to-section').on('click', 'a', function (e) {\n");
      out.write("          if($(e.target).hasClass('external')) {\n");
      out.write("            return;\n");
      out.write("          }\n");
      out.write("          e.preventDefault();\n");
      out.write("          $('#menu').removeClass('active');\n");
      out.write("          showSection($(this).attr('href'), true);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(window).scroll(function () {\n");
      out.write("          checkSection();\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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
