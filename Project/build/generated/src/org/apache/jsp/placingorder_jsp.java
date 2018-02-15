package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class placingorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h1><i>Shopping mart</i></h1>\n");
      out.write("        <BUTTON TYPE=\"button\" ONCLICK=\"index.jsp;\" > log out </button>\n");
      out.write("        <h1>YOUR ORDER :: </h1>\n");
      out.write("        ");

             String orderid = request.getParameter("idd");
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
             PreparedStatement st = con.prepareStatement("select ddate + 4 ,addr,total_cash from orderdetails where order_id = ?");
             st.setString(1,orderid);
             ResultSet rs = st.executeQuery();
             while(rs.next()){
             String s = "" + rs.getString(3);
            
             
      out.write("\n");
      out.write("             <TABLE>        \n");
      out.write("           \n");
      out.write("                     <tr><th>TOTAL AMOUNT TO BE PAID: </th><td>");
 out.println(s);
      out.write("</td></tr> \n");
      out.write("                     <tr><th>DATE OF DELIVERY: </th><td>");
      out.print(rs.getString(1));
      out.write("</td></tr>\n");
      out.write("                     <tr><th>SHIPPING ADDRESS: </th><td>");
      out.print(rs.getString(2));
      out.write("</td></tr>\n");
      out.write("                     <br>\n");
      out.write("             </TABLE>\n");
      out.write("                     <hr size=\"2\">\n");
      out.write("                     <br>\n");
      out.write("                     <br>\n");
      out.write("             ");

             }
             PreparedStatement stt = con.prepareStatement("select c.product_id,p.product_name,p.brand_name,p.price from product p ,contains c where p.product_id =c.product_id");
             ResultSet rr= stt.executeQuery();
             while(rr.next())
             {   
             }
                PreparedStatement stat=con.prepareStatement("select quantity from contains where order_id = ? and product_id = ?");
                 stat.setString(1, orderid);
                 stat.setString(2, rr.getString(1));
                 ResultSet ret = stat.executeQuery();
                 while(ret.next()){
                 }
                 int price =Integer.parseInt(rr.getString(4));
                 int quantity = Integer.parseInt(ret.getString(1));
                 int total =price*quantity;
        
      out.write("\n");
      out.write("     <table>\n");
      out.write("        \n");
      out.write("           <tr>   <th> ORDER-ID: </th> <td>");
      out.print( orderid);
      out.write("</td> </tr>\n");
      out.write("           <tr>   <th>PRODUCT-NAME: </th><td>");
      out.print( rr.getString(2));
      out.write("</td></tr> \n");
      out.write("           <tr>   <th>BRAND-NAME: </th><td>");
      out.print( rr.getString(3));
      out.write(" </td></tr>\n");
      out.write("           <tr>   <th>PRICE: </th><td>");
      out.print(rr.getString(4));
      out.write("</td></tr>\n");
      out.write("           <tr>   <th>QUANTITY: </th><td>");
      out.print( ret.getString(1));
      out.write(" </td></tr>\n");
      out.write("           <tr>   <th>TOTAL: </th> <td> ");
out.println(total);
      out.write(" </td></tr>\n");
      out.write("           <br>\n");
      out.write("           <br>\n");
      out.write("     </table>\n");
      out.write("           \n");
      out.write("               ");

               con.close();
                   
      out.write("\n");
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
