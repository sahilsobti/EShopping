package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class loginenter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>ShoppingMart</title>\n");
      out.write("        <link href=stylo.css rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("  <h1 id=\"heading\">Shopping mart</h1> \n");
      out.write("  <form action=\"viewCart.jsp\" method=\"post\">\n");
      out.write("     <script>\n");
      out.write("         function orderr(){\n");
      out.write("             var k=document.getElementById(\"ooid\");\n");
      out.write("             var p=document.getElementById(\"orderId\");    \n");
      out.write("             k.value=p.value;\n");
      out.write("         }\n");
      out.write("     </script> \n");
      out.write(" <input type=\"hidden\" name=\"ooid\" id=\"ooid\" value=\"\" />\n");
      out.write(" <input type=\"hidden\" name=\"ccid\" id=\"ccid\" value=\"");
      out.print( request.getParameter("value"));
      out.write("\" />\n");
      out.write(" <input type=\"image\"  src=\"cart2.png\" id=\"cartbox\" onclick=\"orderr();\"value=\"view cart\">\n");
      out.write(" </form>\n");
      out.write(" <form action=\"profile.jsp\" method=\"post\">\n");
      out.write("     <script>\n");
      out.write("         function orderl(){\n");
      out.write("             var k=document.getElementById(\"orderId\");\n");
      out.write("             var p=document.getElementById(\"oId\");    \n");
      out.write("             p.value=k.value;\n");
      out.write("         }\n");
      out.write("     </script> \n");
      out.write(" <input type=\"hidden\" name=\"oId\" id=\"oId\" value=\"\" />\n");
      out.write(" <input type=\"hidden\" name=\"cicid\" id=\"cicid\" value=\"");
      out.print( request.getParameter("value"));
      out.write("\" />\n");
      out.write(" <input type=\"image\"  src=\"profile.jpg\" id=\"profilebox\" onclick=\"orderl();\"value=\"profile\">\n");
      out.write(" </form>\n");
      out.write(" ");

 if (request.getParameter("success").equals("23")){
     out.println("<script type='text/javascript'>");
     out.println("alert('added to the cart');</script>");
 }
 else if (request.getParameter("success").equals("20")){
           out.println("<script type='text/javascript'>");
         out.println("<script type='text/javascript'>");
     out.println("alert('try again...item not added to the cart');</script>");
 }
 else{
   
}

      out.write(" \n");
      out.write("\n");
      out.write("<form action=\"index.jsp\" method=\"post\">\n");
      out.write("             <input type=\"image\" src=\"logout.jpg\" id=\"logbox\" value=\"Log Out\">    \n");
      out.write("         </form>\n");
      out.write("\n");
      out.write("  <form id=\"formss\" action=\"./addToCart\" method=\"post\">   \n");
      out.write("    <input type=\"hidden\" name=\"orderId\" id=\"orderId\" value= \"");
      out.print( request.getParameter("id") );
      out.write("\" />   \n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <div id=\"changes\">\n");
      out.write("    <table cellpadding=\"15px\" cellspacing=\"15px\">\n");
      out.write("        <TR><div id=\"col\">\n");
      out.write("           <TH>product ID</TH>\n");
      out.write("           <TH>product name</TH>\n");
      out.write("           <TH>Brand name</TH>\n");
      out.write("           <TH>price</TH>\n");
      out.write("           <TH>Quantity</TH>\n");
      out.write("         </div>\n");
      out.write("        </TR>\n");
      out.write("        ");

            Class.forName("oracle.jdbc.driver.OracleDriver");
            String serverName = "localhost";
            String portNumber = "1521";
            String sid = "xe";
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product");
            int j = 1;
            while (rs.next()) {
            
      out.write("\n");
      out.write("           \n");
      out.write("    <TR>\n");
      out.write("             <TD> ");
      out.print( rs.getString(1).toUpperCase() );
      out.write(" </TD>\n");
      out.write("             <TD> ");
      out.print( rs.getString(2).toUpperCase() );
      out.write(" </TD>\n");
      out.write("             <TD> ");
      out.print( rs.getString(3).toUpperCase() );
      out.write(" </TD>\n");
      out.write("             <TD> ");
      out.print( rs.getString(4).toUpperCase() );
      out.write(" </TD>\n");
      out.write("             <td><select id=\"my\" onchange=\"aadd(this);\" >\n");
      out.write("  <option   value=\"zero\" >\n");
      out.write("  0</option>\n");
      out.write("  <option   value=\"one\" >\n");
      out.write("  1</option>\n");
      out.write("  <option   value=\"two\" >\n");
      out.write("  2</option>\n");
      out.write("  <option  value=\"three\" >\n");
      out.write("  3</option>\n");
      out.write("  <option  value=\"four\">\n");
      out.write("  4</option>\n");
      out.write("  <option value=\"five\">\n");
      out.write("  5</option>\n");
      out.write("  </select> </td>\n");
      out.write("  <td> <button id=\"butt\"  value=\"");
      out.print( rs.getString(1));
      out.write("\" class=\"boxx\" onclick=\"call(this);\">Add to Cart</button></td>\n");
      out.write("  </tr>           <script>\n");
      out.write("                 function aadd(element){\n");
      out.write("               var a = element.options[ element.selectedIndex].text;\n");
      out.write("               var y =document.getElementById(\"atwo\");\n");
      out.write("               y.value=a;\n");
      out.write("    }\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                 function call(obj){\n");
      out.write("                      \n");
      out.write("                  var ob=obj;\n");
      out.write("                 var p =document.getElementById(\"orderId\");\n");
      out.write("                 var x =document.getElementById(\"aone\");\n");
      out.write("                 x.value=ob.value;\n");
      out.write("                 var w = document.getElementById(\"athree\");\n");
      out.write("                 w.value=p.value;\n");
      out.write("                 document.getElementById(\"formss\").submit();\n");
      out.write("    }\n");
      out.write("                 \n");
      out.write("             </script>\n");
      out.write("   \n");
      out.write("    <BR>\n");
      out.write("    ");
 j = j + 1; 
      out.write('\n');
      out.write(' ');
 }  
      out.write("\n");
      out.write("</TABLE>\n");
      out.write(" \n");
      out.write("   <input type=\"hidden\" name=\"aone\" id=\"aone\" value=\"\" />\n");
      out.write("    <input type=\"hidden\" name=\"atwo\" id=\"atwo\" value=\"\" />\n");
      out.write("     <input type=\"hidden\" name=\"athree\" id=\"athree\" value=\"\" />\n");
      out.write("  <input type=\"hidden\" name=\"cidd\" id=\"cidd\" value=\"");
      out.print( request.getParameter("value"));
      out.write("\"/>\n");
      out.write("</form>\n");
      out.write("<br><br>\n");
      out.write(" <form action=\"./askaddress\" method=\"post\">\n");
      out.write("     <script>\n");
      out.write("         function order(){\n");
      out.write("             var k=document.getElementById(\"oid\");\n");
      out.write("             var p=document.getElementById(\"orderId\");    \n");
      out.write("             k.value=p.value;\n");
      out.write("         }\n");
      out.write("     </script> \n");
      out.write(" <input type=\"hidden\" name=\"oid\" id=\"oid\" value=\"\" />\n");
      out.write(" <input type=\"hidden\" name=\"cid\" id=\"cid\" value=\"");
      out.print( request.getParameter("value"));
      out.write("\"/>\n");
      out.write(" <input type=\"submit\" onclick=\"order();\" class=\"boxx\" id=\"placeorder\" value=\"place order\">\n");
      out.write(" </form>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
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
