<%-- 
    Document   : loginenter
    Created on : 20-Oct-2013, 00:54:59
    Author     : sahil
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.io.IOException"%>
<%@page import=" java.io.PrintWriter"%>
<%@page import=" java.sql.Connection"%>
<%@page import ="java.sql.DriverManager"%>
<%@page import ="java.sql.PreparedStatement"%>
<%@page import ="java.sql.ResultSet"%>
<%@page import ="java.sql.SQLException"%>
<%@page import ="java.sql.Statement"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShoppingMart</title>
        <link href=stylo.css rel="stylesheet" type="text/css">
    </head>
    <body> 
  <h1 id="heading">Shopping mart</h1> 
  <form action="viewCart.jsp" method="post">
     <script>
         function orderr(){
             var k=document.getElementById("ooid");
             var p=document.getElementById("orderId");    
             k.value=p.value;
         }
     </script> 
 <input type="hidden" name="ooid" id="ooid" value="" />
 <input type="hidden" name="ccid" id="ccid" value="<%= request.getParameter("value")%>" />
 <div class="imgWrap">
 <input type="image"  src="cart2.png" id="cartbox" onclick="orderr();" value="view cart">
<p class="text1">cart details</p>
 </div>
 </form>
 <form action="details.jsp" method="post">
     <script>
         function orderrr(){
             var k=document.getElementById("kid");
             var p=document.getElementById("orderId");    
             k.value=p.value;
         }
     </script> 
 <input type="hidden" name="ooid" id="kid" value="" />
 <input type="hidden" name="ccid" id="mid" value="<%= request.getParameter("value")%>" />
<div class="imgWrapp">
<input type="image" src="details.jpg" id="detailbox" onclick="orderrr();" >
<p class="text2">Your Order Details</p>
</div>
 </form>
 <form action="profile.jsp" method="post">
     <script>
         function orderl(){
             var k=document.getElementById("orderId");
             var p=document.getElementById("oId");    
             p.value=k.value;
         }
     </script> 
 <input type="hidden" name="oId" id="oId" value="" />
 <input type="hidden" name="cicid" id="cicid" value="<%= request.getParameter("value")%>" />
 <div class="imgWrapp2">
 <input type="image"  src="profile.jpg" id="profilebox" onclick="orderl();"value="profile">
  <p class="text3">Profile</p>
</div>
 </form>
 <%
 if (request.getParameter("success").equals("23")){
     out.println("<script type='text/javascript'>");
     out.println("alert('added to the cart');</script>");
 }
 else if (request.getParameter("success").equals("20")){
           out.println("<script type='text/javascript'>");
         out.println("<script type='text/javascript'>");
     out.println("alert('try again...item not added to the cart');</script>");
 }
 else{
   
}
%> 

<form action="index.jsp" method="post">
             <input type="image" src="logout.jpg" id="logbox" value="Log Out">    
         </form>

  <form id="formss" action="./addToCart" method="post">   
    <input type="hidden" name="orderId" id="orderId" value= "<%= request.getParameter("id") %>" />   
    <br>
    <br>
    <div id="changes">
    <table cellpadding="15px" cellspacing="15px">
        <TR><div id="col">
           <TH>product ID</TH>
           <TH>product name</TH>
           <TH>Brand name</TH>
           <TH>price</TH>
           <TH>Quantity</TH>
         </div>
        </TR>
        <%
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String serverName = "localhost";
            String portNumber = "1521";
            String sid = "xe";
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product");
            int j = 1;
            while (rs.next()) {
            %>
           
    <TR>
             <TD> <%= rs.getString(1).toUpperCase() %> </TD>
             <TD> <%= rs.getString(2).toUpperCase() %> </TD>
             <TD> <%= rs.getString(3).toUpperCase() %> </TD>
             <TD> <%= rs.getString(4).toUpperCase() %> </TD>
             <td><select id="my" onchange="aadd(this);" >
  <option   value="zero" >
  0</option>
  <option   value="one" >
  1</option>
  <option   value="two" >
  2</option>
  <option  value="three" >
  3</option>
  <option  value="four">
  4</option>
  <option value="five">
  5</option>
  </select> </td>
  <td> <button id="butt"  value="<%= rs.getString(1)%>" class="boxx" onclick="call(this);">Add to Cart</button></td>
  </tr>           <script>
                 function aadd(element){
               var a = element.options[ element.selectedIndex].text;
               var y =document.getElementById("atwo");
               y.value=a;
    }
                 
                 
                 function call(obj){
                      
                  var ob=obj;
                 var p =document.getElementById("orderId");
                 var x =document.getElementById("aone");
                 x.value=ob.value;
                 var w = document.getElementById("athree");
                 w.value=p.value;
                 document.getElementById("formss").submit();
    }
                 
             </script>
   
    <BR>
    <% j = j + 1; %>
 <% }  
 con.close();
 %>
</TABLE>
 
   <input type="hidden" name="aone" id="aone" value="" />
    <input type="hidden" name="atwo" id="atwo" value="" />
     <input type="hidden" name="athree" id="athree" value="" />
  <input type="hidden" name="cidd" id="cidd" value="<%= request.getParameter("value")%>"/>
</form>
<br><br>
 <form action="./askaddress" method="post">
     <script>
         function order(){
             var k=document.getElementById("oid");
             var p=document.getElementById("orderId");    
             k.value=p.value;
         }
     </script> 
 <input type="hidden" name="oid" id="oid" value="" />
 <input type="hidden" name="cid" id="cid" value="<%= request.getParameter("value")%>"/>
 <input type="submit" onclick="order();" class="boxx" id="placeorder" value="place order">
 </form>
</div>
    </body>
</html>