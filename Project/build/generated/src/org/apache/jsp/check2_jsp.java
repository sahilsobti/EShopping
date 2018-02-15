package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class check2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/check1.jsp");
  }

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
      out.write("         <style type=\"text/css\">\n");
      out.write("        body{\n");
      out.write("            \n");
      out.write("            background-image: url(\"ucb.jpg\");\n");
      out.write("        }\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <h1 id=\"heading\">Shopping mart</h1> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("        ");
String name="shampoo";
             Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");  
           PreparedStatement ps=con.prepareStatement("select * from hr.products"); 
ResultSet rs=ps.executeQuery(); 
rs.next(); 
Blob b=rs.getBlob(2);
byte brr[]=new byte[(int)b.length()]; 
brr=b.getBytes(1,(int)b.length()); 
FileOutputStream fs=new FileOutputStream("C:/Users/sahil/Desktop/mypic.jpg");
        
      out.write("\n");
      out.write("<table>\n");
      out.write("    <th>");
 response.setContentType("C:/Users/sahil/Desktop/mypic.jpg");
OutputStream o = response.getOutputStream();
o.write(brr); 
      out.write("</th>\n");
      out.write("</table>\n");

fs.close(); 

      out.write(" \n");
      out.write("\n");
      out.write("   </body>\n");
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
