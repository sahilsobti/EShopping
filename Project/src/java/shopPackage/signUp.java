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
//import JOptionPane.showMessageDialog;
/**
 *
 * @author sahil
 */
@WebServlet(name = "signUp", urlPatterns = {"/signUp"})
public class signUp extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String custid=request.getParameter("customerId");
            String username = request.getParameter("user");
            String pass= request.getParameter("pass");
           String fullname = request.getParameter("fullname");
            String ph= request.getParameter("ph");
            String email= request.getParameter("email");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
            PreparedStatement st = con.prepareStatement("insert into eshop.customer values( ? , ? , ? , ? , ? , ? )");
            st.setString(1,custid);
            st.setString(2,username);
            st.setString(3,pass);
            st.setString(4,fullname);
            st.setString(5,ph);
            st.setString(6,email);
          
            int rs = st.executeUpdate();
            
            if(rs == 1)
            {
               con.commit();  
               response.sendRedirect("index2.jsp?fail=3");
               
            }
            else{
                
               response.sendRedirect("index2.jsp?fail=4");
          
            }
            
            con.close(); 
        }catch ( ClassNotFoundException | SQLException y) {
             response.sendRedirect("index2.jsp?fail=4");
        } finally {            
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

    private void setString(int i, String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
