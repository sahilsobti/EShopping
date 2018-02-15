<%-- 
    Document   : details
    Created on : 06-Nov-2013, 01:07:20
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
        <title>shopping mart</title>
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
            background-image:url("ucb2.jpg");
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
        .tr1{
            background-color:#f5e9c9;
            opacity:0.77;
        }
        #tr2{
            font-size:15px;
            font-family:miso;
            color:#d70e0e;
            background-color:#f7e1ce;
            opacity: 0.77;
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
        </style>
    </head>
    <body>
          <h1 id="heading">Shopping mart</h1>
          <div id="tr2">  
        
             
        <%
           String orderid = request.getParameter("ooid");
           String cid = request.getParameter("ccid");
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
           PreparedStatement stat=con.prepareStatement("select co.order_id,p.product_name,p.brand_name,p.price,c.quantity from eshop.connection co,eshop.contains c,eshop.product p where co.customer_id = ? and co.order_id=c.order_id and c.product_id=p.product_id");
           stat.setString(1,cid);
           ResultSet rs = stat.executeQuery();
           %>
            
         <table cellpadding="15px" cellspacing="15px" >
             
             <tr class="tr1">
                 <th>Order Id</th>
                <th>Product Name</th>
                <th>Brand name</th>
                <th>Price</th>
                <th>Quantity</th>
                 
            
           <%
           while(rs.next()){
            %>
         </tr>        
            <tr class="ttrr2">
                   <td> <%= rs.getString(1).toUpperCase() %></td>
                  <td> <%= rs.getString(2).toUpperCase() %></td>
                  <td> <%= rs.getString(3).toUpperCase() %></td>
                   <td><%= rs.getString(4).toUpperCase() %></td>
                   <td><%= rs.getString(5).toUpperCase() %></td>
             </tr>   
            <% }
            con.close();%>
                 </table>
      <form action="loginenter.jsp" method="get">
                    <input type="hidden" name="success"  value="2">
                    <input type="hidden" name="id" id="id" value="<%= orderid %>" >
                    <input type="hidden" name="value"  value="<%= cid %>">
                    <input type="submit" id="sub" value="Go Back">
                </form> 
                </div>
    </body>
</html>
