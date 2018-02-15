package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class viewCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Shopping Mart</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #heading{\n");
      out.write("            margin-top: 0px;\n");
      out.write("            margin-left:0px;\n");
      out.write("            padding-top: 0px;\n");
      out.write("            top:0px;\n");
      out.write("            height:55px;\n");
      out.write("            left:0px;\n");
      out.write("            background-color:#46e7ff;\n");
      out.write("            font-family:Arial Rounded MT Bold;\n");
      out.write("            color:#FFF;\n");
      out.write("        }\n");
      out.write("        table{\n");
      out.write("            border-collapse:collapse;\n");
      out.write("            border-spacing: 220px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h1 id=\"heading\">Shopping mart</h1>\n");
      out.write("            <table id=\"tab\">\n");
      out.write("                <tr>\n");
      out.write("                <th>Product Name</th>\n");
      out.write("                <th>Brand name</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Quantity</th>\n");
      out.write("                </tr>\n");
      out.write("        ");

           String orderid = request.getParameter("ooid");
           String cid = request.getParameter("ccid");
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
           PreparedStatement stat=con.prepareStatement("select p.product_name,p.brand_name,p.price,c.quantity from eshop.contains c,eshop.product p where c.order_id=? and c.product_id =p.product_id");
           stat.setString(1, orderid);
           ResultSet rs = stat.executeQuery();
           while(rs.next()){
            
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                   <td class=\"tdd\"> ");
      out.print( rs.getString(1) );
      out.write("</td>\n");
      out.write("                  <td class=\"tdd\"> ");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("                  <td class=\"tdd\"> ");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("                   <td class=\"tdd\">");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("        <form action=\"loginenter.jsp\" method=\"get\">\n");
      out.write("                    <input type=\"hidden\" name=\"success\"  value=\"2\">\n");
      out.write("                    <input type=\"hidden\" name=\"id\" id=\"id\" value=\"");
      out.print( orderid );
      out.write("\" >\n");
      out.write("                    <input type=\"hidden\" name=\"value\"  value=\"");
      out.print( cid );
      out.write("\">\n");
      out.write("                    <input type=\"submit\" value=\"go back\">\n");
      out.write("                </form>              \n");
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
