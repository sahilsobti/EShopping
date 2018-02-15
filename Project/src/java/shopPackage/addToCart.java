/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shopPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sahil
 */
@WebServlet(name = "addToCart", urlPatterns = {"/addToCart"})
public class addToCart extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String orderid = request.getParameter("athree");
        try {
          
           int quantity = 0;
           String id=request.getParameter("orderId");
           String pid = request.getParameter("aone");
           String quantityy = request.getParameter("atwo");
          
           String cid=request.getParameter("cidd");
           out.println("value of order id is" + orderid);
           out.println("value of pid is " + pid);
           out.println("value of quantityy is " + quantityy);
           out.println("just passed parameter values\n");
          if(quantityy.equals("1"))
           {
                quantity = 1;
           }
             
           if(quantityy.equals("2"))
           {
                 quantity = 2;
           }
           if(quantityy.equals("3"))
           {
                quantity = 3;
           }
           if(quantityy.equals("4"))
           {
               quantity = 4;
           }
           if(quantityy.equals("5"))
           {
                 quantity = 5;
           }
          
           out.println("just passed if  with quantity \n"+quantity);
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
           PreparedStatement stat=con.prepareStatement("insert into eshop.contains values( ? , ? , ? )");
           stat.setString(1, orderid);
           stat.setString(2, pid);
           stat.setInt(3,quantity);
           int  rose =stat.executeUpdate();
           if(rose == 1)
           { 
               
              con.commit();   
              con.close();
              response.sendRedirect("loginenter.jsp?success=23&id=" +id +"&value=" +cid);
           }
           else{
           
              response.sendRedirect("loginenter.jsp?success=20");
            }
           
           } catch (ClassNotFoundException | SQLException ex) {
            response.sendRedirect("loginenter.jsp?success=20&id="+orderid);
        }
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
