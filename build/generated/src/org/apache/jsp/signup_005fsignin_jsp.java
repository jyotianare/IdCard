package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_005fsignin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>signUp</title>\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("     \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validateForm(){\n");
      out.write("                pwd=document.getElementById(\"pwd1\").value;\n");
      out.write("                cpwd =document.getElementById(\"cpwd\").value;\n");
      out.write("                \n");
      out.write("//                out.println(\" pwd :\" +pwd);\n");
      out.write("//                out.println(\" cpwd :\" +cpwd);\n");
      out.write("                \n");
      out.write("               if(pwd != cpwd)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"s1\").innerHTML=\"Password and confirm password doesn't matched\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("    function myFunction() {\n");
      out.write("  var x = document.getElementById(\"pwd\");\n");
      out.write("  if (x.type == \"password\") {\n");
      out.write("    x.type = \"text\";\n");
      out.write("  } else {\n");
      out.write("    x.type = \"password\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write(" function myFunction1() {\n");
      out.write("  var x = document.getElementById(\"pwd1\");\n");
      out.write("  if (x.type == \"password\") {\n");
      out.write("    x.type = \"text\";\n");
      out.write("  } else {\n");
      out.write("    x.type = \"password\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("           \n");
      out.write("           </script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String email="";
            String pwd="";
          Cookie cookies[] = request.getCookies();
          for (Cookie c : cookies){
             if(c.getName().equals("user_email"))
                 email=c.getValue();
             if(c.getName().equals("user_pwd"))
                 pwd=c.getValue();
          }
            
      out.write("\n");
      out.write("         \n");
      out.write("         \n");
      out.write("            \n");
      out.write("            <div class=\"container\">    \n");
      out.write("        <div id=\"loginbox\" style=\"margin-top:50px;\" class=\"mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">                    \n");
      out.write("           <div class=\"panel panel-info\" >\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <div class=\"panel-title\">Sign In</div>\n");
      out.write("                        <div style=\"float:right; font-size: 80%; position: relative; top:-10px\"><a href=\"forgotPassword.jsp\">Forgot password?</a></div>\n");
      out.write("                    </div>     \n");
      out.write("\n");
      out.write("                    <div style=\"padding-top:30px\" class=\"panel-body\" >\n");
      out.write("\n");
      out.write("                        <div style=\"display:none\" id=\"login-alert\" class=\"alert alert-danger col-sm-12\"></div>\n");
      out.write("                            \n");
      out.write("                        <form action=\"RegistrationController?op=signin\" method=\"post\" autocomplete=\"off\" id=\"loginform\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("                                    \n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                        <input id=\"login-username\" type=\"email\" class=\"form-control\" name=\"email\" value=\"");
      out.print(email);
      out.write("\" placeholder=\"email\">                                        \n");
      out.write("                                    </div>\n");
      out.write("                                \n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span>\n");
      out.write("                                        <input  type=\"password\" id=\"pwd\" class=\"form-control\" name=\"pwd\" value=\"");
      out.print(pwd );
      out.write("\"  placeholder=\"password\">\n");
      out.write("                                   \n");
      out.write("                            </div>\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"checkbox\">\n");
      out.write("                                                <label>\n");
      out.write("                                                    Show Password  <input type=\"checkbox\" onclick=\"myFunction()\"><br/><br/>\n");
      out.write("                                                </label>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                \n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                      <div class=\"checkbox\">\n");
      out.write("                                        <label>\n");
      out.write("                                          <input id=\"login-remember\" type=\"checkbox\" name=\"remember\" value=\"remember\"> Remember me\n");
      out.write("                                        </label>\n");
      out.write("                                      </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                        \n");
      out.write("\n");
      out.write("                                <div style=\"margin-top:10px\" class=\"form-group\">\n");
      out.write("                                    <!-- Button -->\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-12 controls\">\n");
      out.write("                                        <input type=\"submit\" value=\"log in\" id=\"btn-login\"  class=\"btn btn-success\">\n");
      out.write("                                  \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12 control\">\n");
      out.write("                                        <div style=\"border-top: 1px solid#888; padding-top:15px; font-size:85%\" >\n");
      out.write("                                            Don't have an account! \n");
      out.write("                                        <a href=\"#\" onClick=\"$('#loginbox').hide(); $('#signupbox').show()\">\n");
      out.write("                                            Sign Up Here\n");
      out.write("                                        </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>    \n");
      out.write("                            </form>     \n");
      out.write("\n");
      out.write("                        </div>                     \n");
      out.write("                    </div>  \n");
      out.write("        </div>\n");
      out.write("        <div id=\"signupbox\" style=\"display:none; margin-top:50px\" class=\"mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">\n");
      out.write("                    <div class=\"panel panel-info\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"panel-title\">Sign Up</div>\n");
      out.write("                            <div style=\"float:right; font-size: 85%; position: relative; top:-10px\"><a id=\"signinlink\" href=\"#\" onclick=\"$('#signupbox').hide(); $('#loginbox').show()\">Sign In</a></div>\n");
      out.write("                        </div>  \n");
      out.write("                        <div class=\"panel-body\" >\n");
      out.write("                            <form action=\"RegistrationController?op=signup\" method=\"post\" autocomplete=\"off\" id=\"signupform\" onsubmit=\"return validateForm()\"  class=\"form-horizontal\" role=\"form\">\n");
      out.write("                                \n");
      out.write("                                <div id=\"signupalert\" style=\"display:none\" class=\"alert alert-danger\">\n");
      out.write("                                    <p>Error:</p>\n");
      out.write("                                    <span></span>\n");
      out.write("                                </div>\n");
      out.write("                                    \n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"email\" class=\"col-md-3 control-label\">Email</label>\n");
      out.write("                                    <div class=\"col-md-9\">\n");
      out.write("                                        <input type=\"email\" id=\"email1\" required=\"required\" class=\"form-control\" name=\"email1\"  placeholder=\"Email Address\">\n");
      out.write("                                        <br><span id=\"s2\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                    \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"first_name\" class=\"col-md-3 control-label\">First Name</label>\n");
      out.write("                                    <div class=\"col-md-9\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" id=\"first_name\" required=\"required\" name=\"first_name\" placeholder=\"First Name\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"last_name\" class=\"col-md-3 control-label\">Last Name</label>\n");
      out.write("                                    <div class=\"col-md-9\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"last_name\" id=\"last_name\" required=\"required\" placeholder=\"Last Name\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                   \n");
      out.write("                                     <label for=\"pwd\" class=\"col-md-3 control-label\">Password</label>\n");
      out.write("                                    <div class=\"col-md-9\">\n");
      out.write("                                        <input type=\"password\" id=\"pwd1\" class=\"form-control\" required=\"required\" name=\"pwd1\" placeholder=\"Password\" onfocus=\"s1.innerHTML='';\" pattern=\"(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                         <div class=\"input-group\">\n");
      out.write("                                            <div class=\"checkbox\">\n");
      out.write("                                                <label>\n");
      out.write("                                                    Show Password  <input type=\"checkbox\" onclick=\"myFunction1()\"><br/><br/>\n");
      out.write("                                                </label>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                     <label for=\"cpwd\" class=\"col-md-3 control-label\">Confirm Password</label>\n");
      out.write("                                    <div class=\"col-md-9\">\n");
      out.write("                                        <input type=\"password\" id=\"cpwd\" class=\"form-control\" name=\"cpwd\" required=\"required\" placeholder=\"Confirm Password\" onfocus=\"s1.innerHTML='';\" >\n");
      out.write("                                       <br/> <span id=\"s1\" style=\"color:red\"></span>\n");
      out.write("                                    </div> \n");
      out.write("                                </div>\n");
      out.write("                               \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                     <label for=\"\" class=\"col-md-3 control-label\">Security Question..</label>\n");
      out.write("                                    <div class=\"col-md-9\">\n");
      out.write("                                        <select name=\"securityQue\">\n");
      out.write("                                            <option value=\"nickname\">What was your childhood nickname?</option>\n");
      out.write("                                            <option value=\"school\">What school did you attend for sixth grade?</option>\n");
      out.write("                                            <option value=\"sport\">What was your favorite sport in high school?</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        </div> \n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                     <label for=\"\" class=\"col-md-3 control-label\">Your Answer</label>\n");
      out.write("                                    <div class=\"col-md-9\">\n");
      out.write("                                        <input type=\"text\" id=\"securityAns\" class=\"form-control\" name=\"securityAns\" required=\"required\" placeholder=\"Write your answer in one word\"  >\n");
      out.write("                                       \n");
      out.write("                                    </div> \n");
      out.write("                                </div>\n");
      out.write("                               \n");
      out.write("                          \n");
      out.write("                               <div class=\"form-group\">\n");
      out.write("                                                                            \n");
      out.write("                                    <div class=\"col-md-offset-3 col-md-9\">\n");
      out.write("                                      <input type=\"submit\" value=\"signup\"   id=\"btn-signup\"  class=\"btn btn-info\" >\n");
      out.write("                                         \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <b>*Password must contain atleast one upppercase, one lowercase , one digit   and min 8 character long<br/></b>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                            </form>\n");
      out.write("                         </div>\n");
      out.write("                    </div>\n");
      out.write("  \n");
      out.write("         </div> \n");
      out.write("    </div>\n");
      out.write("    <center> <a href=\"index.jsp\">Back to Home Page</a> </center>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(\"#email1\").blur(function(){\n");
      out.write("           \n");
      out.write("            xml = new XMLHttpRequest();\n");
      out.write("            xml.open(\"GET\", \"RegistrationController?op=checkid&email=\"+$(this).val(),true);\n");
      out.write("            xml.send();\n");
      out.write("            \n");
      out.write("            xml.onreadystatechange = function(){\n");
      out.write("                if(this.readyState==4 && this.status==200){\n");
      out.write("                    result = this.responseText;\n");
      out.write("                    $(\"#s2\").html(result);\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("        });\n");
      out.write("        </script>\n");
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
