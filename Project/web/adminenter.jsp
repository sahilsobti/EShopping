<%-- 
    Document   : adminenter
    Created on : 07-Nov-2013, 11:20:40
    Author     : sahil
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>shopping mart</title>
        <style type="text/css">
         #logbox{
            position:absolute;
            top: 13px;
            margin-left: 1230px;
            width:80px;
            height:40px;
            background-color:#46e7ff;
        }
            body{
            
            background-image: url("ucb.jpg");
        }
        #changes{
	background-color:#fdfbc1;
	opacity:0.6;
	}
        th.col{
            background-color:#ffb9ad;
            left:20px;
        }
        
          th{
            font-family: miso;
            width:190px;
            color:#0e94d7; 
            font-size: 28px;
            margin-left:-10px; 
            text-align:center;
            vertical-align:middle;
            
        }
        td{ 
            
            font-family: miso;
            font-size:25px;
            color:#d70e0e;
            text-align:center;
            vertical-align:middle;
            
        }
table{
    border-collapse: collapse;
    margin-top:-150px;
}
.boxx{
     box-shadow: 0 0 10px #37c3f7;
            -moz-box-shadow: 0 0 10px #6AB5FF;
            -webkit-box-shadow: 0 0 10px #6AB5FF; 
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
            font-size:40px;
            color:#FFF;
            
        }
         #rem{
             box-shadow: 0 0 10px #37c3f7;
            -moz-box-shadow: 0 0 10px #6AB5FF;
            -webkit-box-shadow: 0 0 10px #6AB5FF;  
            
        }
    </style>
    </head>
    <body>
        <h1 id="heading">Shopping mart</h1> 
        <form action="adminlogin.jsp" method="post">
             <input type="image" src="logout.jpg" id="logbox" value="Log Out">    
         </form>
        <div id="changes">
    <table cellpadding="15px" cellspacing="15px">
        
        <TR>
           <TH class="col">product ID</TH>
           <TH class="col">product name</TH>
           <TH class="col">Brand name</TH>
           <TH class="col">price</TH>
        </TR>
        
        <%
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String serverName = "localhost";
            String portNumber = "1521";
            String sid = "xe";
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product");
         
            while (rs.next()) {
            %>
           
    <TR>
             <TD> <%= rs.getString(1).toUpperCase() %> </TD>
             <TD> <%= rs.getString(2).toUpperCase() %> </TD>
             <TD> <%= rs.getString(3).toUpperCase() %> </TD>
             <TD> <%= rs.getString(4).toUpperCase() %> </TD>
               <form action="./removeProduct" method="post">
                    <input type="hidden" name="prod_remove" id="prod_remove" value=<%= rs.getString(1)%> />
               <td>     <input type="submit" id="rem" value="remove" /></td>
                </form>
    </TR>
    <BR>
 <% }  %>
 <tr>
 <td>  
 <form action="addProduct.jsp?fail=7" method="post">
<input type="submit" id="rem" value="Add product">
</form>
 </td>
 </tr>
</TABLE>
 <div>
    </body>
</html>
