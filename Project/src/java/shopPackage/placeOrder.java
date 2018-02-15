/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shopPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sahil
 */
@WebServlet(name = "placeOrder", urlPatterns = {"/placeOrder"})
public class placeOrder extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         try{ 
               java.util.Date datee = new java.util.Date();
               Calendar c = Calendar.getInstance(); 
               c.setTime(datee); 
               c.add(Calendar.DATE, 4);
               long t = datee.getTime();
               java.sql.Date date = new java.sql.Date(t);
             int total=0;
             int finaltotal=0;        
             String orderid = request.getParameter("idd");
             String cid = request.getParameter("cid");
             String addr = request.getParameter("addr");
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
             PreparedStatement st = con.prepareStatement("select p.product_id , p.price from eshop.product p ,eshop.contains c where p.product_id = c.product_id and c.order_id = ? ");
             st.setString(1,orderid);
             ResultSet rs = st.executeQuery();
             while(rs.next()){
             String product_id =rs.getString(1);
             String pric = rs.getString(2);
             int price =Integer.parseInt(pric);
             PreparedStatement stat=con.prepareStatement("select quantity from eshop.contains where product_id = ? and order_id = ? ");
             stat.setString(1,product_id);
             stat.setString(2,orderid);
             ResultSet r = stat.executeQuery();
             while(r.next()){
               String quant=r.getString(1);
               int quantity=Integer.parseInt(quant);
               total = price*quantity;
               finaltotal=finaltotal+total;
             }
             }
              Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
              PreparedStatement stt = conn.prepareStatement("insert into eshop.orderdetails values( ? , ? , ? , ? )");
              stt.setString(1,orderid);
              stt.setDate(2, date);
              stt.setString(3,addr);
              stt.setInt(4,finaltotal);
              int val = stt.executeUpdate();
              if(val == 1){
               con.commit();
              conn.commit();
              response.sendRedirect("placingorder.jsp?idd="+orderid+"&great=44&cid="+cid);
             }
              else{
              response.sendRedirect("placingorder.jsp?great=33");
              }
           
              con.close();
              conn.close();
        } catch (SQLException | ClassNotFoundException ex) {
            response.sendRedirect("placingorder.jsp?great=33");
        }
        }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(placeOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(placeOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
