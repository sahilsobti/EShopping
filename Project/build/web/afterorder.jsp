<%-- 
    Document   : afterorder
    Created on : 05-Nov-2013, 23:22:33
    Author     : sahil
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>shopping mart</title>
    </head>
    <body>
        

           
            <%    
             String cid=request.getParameter("cid");
             String orderid=request.getParameter("orderid"); 
             response.sendRedirect("loginenter.jsp?success=2&id="+orderid+"&value="+cid);      
        %>
    </body>
</html>
