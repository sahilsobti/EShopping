<%-- 
    Document   : profile
    Created on : 05-Nov-2013, 21:13:19
    Author     : sahil
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Mart</title>
        <style type="text/css">
             #heading{
            margin-top: -7px;
            margin-left:-7px;
            padding-top: 0px;
            top:0px;
            height:55px;
            left:0px;
            background-color:#46e7ff;
            font-family:miso;
            font-size:40px;
            color:#FFF;
            
        }
        table{
            border-collapse:collapse;
            width:100%;
            margin-top:40px;
            margin-left: 10px;
        }
        body{
            background-image:url("pback2.png");
        }
        th{
            width:330px;
            color:#0e94d7; 
            font-size: 28px;
        }
        td{
            font-size:25px;
            color:#d70e0e;
            text-align:center;
            vertical-align:middle;
        }
      
        #sub{
            opacity:1;
            margin-left: 650px;
            padding:8px;
            width:100px;
            box-shadow: 0 0 10px #6AB5FF;
            -moz-box-shadow: 0 0 10px #6AB5FF;
            -webkit-box-shadow: 0 0 10px #6AB5FF;  
            
        }
        #train{
            background-color:#ffcae3;
            opacity:0.7;
        }
    </style>
        </head>
   
    <body>
        <h1 id="heading">Shopping mart</h1>
        <div id="train">
        <%
             String orderid = request.getParameter("oId");
             String cid = request.getParameter("cicid");
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
             PreparedStatement st = con.prepareStatement("select * from eshop.customer where customer_id = ?");
             st.setString(1,cid);
             ResultSet rs = st.executeQuery();
             if(rs.next()){
               %>
         <table cellpadding="15px" cellspacing="15px">
          <TR>
           <TH>Customer ID</TH>
           <TH>UserName</TH>
           <TH>Full Name</TH>
           <TH>Phone Number</TH>
           <TH>Email Address</TH>
        </TR>
        <tr>
            <td><%= rs.getString(1)%></td>
            <td><%= rs.getString(2)%></td>
            <td><%= rs.getString(4)%></td>
            <td><%= rs.getString(5)%></td>
            <td><%= rs.getString(6)%></td>
        </tr>
         </table>
       <%
                 
             con.close();
             }
        %>
    
             <form action="loginenter.jsp" method="get">
                    <input type="hidden" name="success"  value="2">
                    <input type="hidden" name="id" id="id" value="<%= orderid %>" >
                    <input type="hidden" name="value"  value="<%= cid %>">
                    <input type="submit" id="sub" value="Go Back">
                </form> 
        </div>
    </body>
</html>
