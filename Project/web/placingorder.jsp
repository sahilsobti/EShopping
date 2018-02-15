<%-- 
    Document   : placingorder
    Created on : 26-Oct-2013, 23:08:36
    Author     : sahil
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    
    <style type='text/css'>
        body{
            
            background-image: url("ucb22.jpg");
           
        }
        #heading{
            
            margin-top: -7px;
            margin-left:-7px;
            padding-top: 0px;
            top:0px;
            height:55px;
            left:0px;
            background-color:#46e7ff;
            font-family:miso;
            color:#FFF;
            font-size:40px ;
        }
        #logbox{
            position:absolute;
            top: 13px;
            margin-left: 1230px;
            width:80px;
            height:40px;
            background-color:#46e7ff;
        }
table{
            border-collapse:collapse;
            width:100%;
            margin-top:40px;
            margin-left: 10px;
        }
        th{
            width:330px;
            color:#0e94d7; 
            font-size: 30px;
        }
        td{
            height:40px;
            font-size:30px;
            color:#d70e0e;
            text-align:center;
            vertical-align:middle;
        }
         #sub{
            opacity:1;
            margin-left:0px;
            margin-top:40px;
            padding:8px;
            width:150px;
            box-shadow: 0 0 10px #6AB5FF;
            -moz-box-shadow: 0 0 10px #6AB5FF;
            -webkit-box-shadow: 0 0 10px #6AB5FF;  
            
        }
        #cent{
            font-size:15px;
            font-family:miso;
            color:#d70e0e;
            background-color:#ffd3fc;
            opacity: 0.77;
            text-align: center;
        }
        #tab2{
            margin-top:-10px;
        }
        #hcent{
            font-size: 40px;
            color:#344c52;
        }
    </style>
    </head>
    <body>
 
        <h1 id="heading">Shopping mart</h1> 
         <form action="index.jsp" method="post">
             <input type="image" class=" boxx " src="logout.jpg" id="logbox" value="Log Out">    
         </form>
                 <%
    if (request.getParameter("great").equals("33"))
    {%>
 <script>
 alert("Some problem has occurred..try again");
</script>

<%}else if(request.getParameter("great").equals("44"))
{
}
%>
<div id='cent'>
        <h1 id="hcent">YOUR ORDER HAS BEEN PLACED </h1>
         
        <% String orderid = request.getParameter("idd");
           String cid = request.getParameter("cid");
        try{
            
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
             PreparedStatement st = con.prepareStatement("select ddate + 4 ,addr,total_cash from orderdetails where order_id = ?");
             st.setString(1,orderid);
             ResultSet rs = st.executeQuery();
             if(rs.next()){
             String s = "" + rs.getString(3);
             %>
            <TABLE>        
           
                <tr><th>&nbsp;TOTAL AMOUNT TO BE PAID: </th><td><% out.println(s);%></td></tr> 
                     <tr><th>DATE OF DELIVERY: </th><td><%=rs.getString(1)%></td></tr>
                     <tr><th>SHIPPING ADDRESS: </th><td><%=rs.getString(2)%></td></tr>
                     <br>
             </TABLE>
                     <hr size="2">
                     <br>
                     <br>
             <%
             }
             PreparedStatement stt = con.prepareStatement("select c.product_id,p.product_name,p.brand_name,p.price from product p ,contains c where p.product_id =c.product_id and c.order_id = ?");
             stt.setString(1,orderid);
             ResultSet rr= stt.executeQuery();
             %>
             <table id='tab2'>
        
           <tr> 
              <th> ORDER-ID: </th> 
              <th>PRODUCT-NAME: </th>
              <th>BRAND-NAME: </th>
              <th>PRICE: </th>
              <th>QUANTITY: </th>
              <th>TOTAL: </th> 
           </tr>
             <%
             while(rr.next())
             {   
             PreparedStatement stat=con.prepareStatement("select quantity from contains where order_id = ? and product_id = ?");
                 stat.setString(1, orderid);
                 stat.setString(2, rr.getString(1));
                 ResultSet ret = stat.executeQuery();
                 %>
                 
                 <%
                 if(ret.next()){
                 int price =Integer.parseInt(rr.getString(4));
                 int quantity = Integer.parseInt(ret.getString(1));
                 int total =price*quantity;
        %>
        <tr>
              <td><%= orderid%></td> 
              <td><%= rr.getString(2)%></td> 
              <td><%= rr.getString(3)%> </td>
              <td><%=rr.getString(4)%></td>
              <td><%= ret.getString(1)%> </td>
              <td><%out.println(total);%> </td>
        </tr>
           <br>
           <br>
     
           
               <%
             }}
               con.close();
                  
           }catch(SQLException ex){
               response.sendRedirect("loginenter.jsp?success=20&id="+orderid);
           }
     %> 

             
             </table>
<form action="afterorder.jsp" method="get">
     <script>
   
        function calling(){
            
            var x = Math.floor((Math.random()*100000)+1); 
            document.getElementById("orderid").value=x; 
            }
            </script>
                    
                    <input type="hidden" name="orderid" id="orderid" value="">
                    <input type="hidden" name="cid"  value="<%= cid %>">
                    <input type="submit" id="sub" onclick="calling();" value="Continue Shopping">
</form>      
</div>
     
    </body>
</html>
