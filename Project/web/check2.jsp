<%--
    Document   : check2
    Created on : 15-Nov-2013, 15:24:35
    Author     : sahil
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="check1.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
         
        <%String name="shampoo";
             Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");  
           PreparedStatement ps=con.prepareStatement("select * from hr.products"); 
ResultSet rs=ps.executeQuery(); 
rs.next(); 
Blob b=rs.getBlob(2);
byte brr[]=new byte[(int)b.length()]; 
brr=b.getBytes(1,(int)b.length()); 
FileOutputStream fs=new FileOutputStream("C:/Users/sahil/Desktop/mypic.jpg");
        %>
<table>
    <th><% response.setContentType("C:/Users/sahil/Desktop/mypic.jpg");
OutputStream o = response.getOutputStream();
o.write(brr); %></th>
</table>
<%
fs.close(); 
%> 

   </body>
</html>
