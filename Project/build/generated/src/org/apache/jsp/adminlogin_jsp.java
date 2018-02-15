package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>shopping mart</title>\n");
      out.write("         <style type=\"text/css\">\n");
      out.write("        body{\n");
      out.write("            \n");
      out.write("            background-image: url(\"ucb.jpg\");\n");
      out.write("        }\n");
      out.write("        #but2{\n");
      out.write("            position:absolute;\n");
      out.write("            top:99px;\n");
      out.write("            right:40px;\n");
      out.write("        }\n");
      out.write("        #sub{\n");
      out.write("            position:absolute;\n");
      out.write("            top:99px;\n");
      out.write("            right:150px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        #heading{\n");
      out.write("            margin-top: -7px;\n");
      out.write("            margin-left:-7px;\n");
      out.write("            padding-top: 0px;\n");
      out.write("            top:0px;\n");
      out.write("            height:55px;\n");
      out.write("            left:0px;\n");
      out.write("            background-color:#46e7ff;\n");
      out.write("            font-family:miso;\n");
      out.write("            font-size:40px;\n");
      out.write("            color:#FFF;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        #full2{\n");
      out.write("           box-shadow: 0 0 20px #000;\n");
      out.write("            opacity:0.89;\n");
      out.write("            position:absolute;\n");
      out.write("            top:60px;\n");
      out.write("            right:0px;\n");
      out.write("            width:250px;\n");
      out.write("            line-height:12px;\n");
      out.write("            font-size:14px;\n");
      out.write("            background:#eff0f2;\n");
      out.write("            margin:10px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("    function clearthis(target){\n");
      out.write("        var x = document.getElementById(\"usern\");\n");
      out.write("        x.value= \"\";\n");
      out.write("        var y = document.getElementById(\"passw\");\n");
      out.write("        y.value= \"\";\n");
      out.write("      \n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("        <h1 id=\"heading\">Shopping mart</h1>\n");
      out.write("         <div id=\"full2\">\n");
      out.write("<form action=\"./adminlogin\" method=\"post\">\n");
      out.write("    <br>\n");
      out.write("<div align=\"left\" style=\"font-family:Verdana, Geneva, sans-serif; font-size:16px; font-weight:bold;\">&nbsp;&nbsp;&nbsp;&nbsp;Admin Login Box</div><br clear=\"all\">\n");
      out.write("&nbsp;&nbsp;Username:&nbsp;<input type=\"text\" id=\"usern\" name=\"usern\" value=\"\" ><br clear=\"all\"><br clear=\"all\">\n");
      out.write("&nbsp;&nbsp;Password:&nbsp;&nbsp;<input type=\"password\" id=\"passw\" name=\"passw\" value=\"\" ><br clear=\"all\"><br clear=\"all\">\n");
      out.write("<input type=\"hidden\" name=\"orderId\" id=\"orderId\" value=\"\" /> \n");
      out.write("<input type=\"submit\" id=\"sub\" value=\"submit\" onclick=\"calling();\" />\n");
      out.write("</form>  \n");
      out.write("<button id=\"but2\"  onfocus=\"clearthis(this);\">Cancel</button>\n");
      out.write("<br clear=\"all\"><br clear=\"all\">\n");
      out.write("<br><br>\n");
      out.write("</div>\n");
      out.write("     \n");
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
