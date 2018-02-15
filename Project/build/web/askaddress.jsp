<%-- 
    Document   : askaddress
    Created on : 05-Nov-2013, 18:35:15
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
        #boxx{
            box-shadow: 0 0 10px #37c3f7;
            -moz-box-shadow: 0 0 10px #6AB5FF;
            -webkit-box-shadow: 0 0 10px #6AB5FF; 
            width:240px;
            height:40px;
            font-size:20px;
            
        }
        body{
            
            background-image: url("ucb22.jpg");
           
        }
        table{
            background-color: #dff7a7;
            opacity:0.7;
        }
        #tex{
            width:400px;
            height:100px;
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
        </style>
    </head>
    <body>
          <h1 id="heading">Shopping mart</h1>
        <% String orderid = request.getParameter("oid");
             String cid=request.getParameter("cid");
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "eshop","eshop");
             PreparedStatement st = con.prepareStatement("insert into eshop.connection values( ? , ? )");
             st.setString(1,orderid);
             st.setString(2,cid);
             int m=st.executeUpdate();
             if(m == 1)
             {%>
            
              <FORM action="./placeOrder" METHOD="post"> 
             <TABLE>
             <tr>
             <TD>Enter your shipping address: &nbsp;</TD>
             <TD><input type=text id="tex" name=addr></TD>
             </TR>
             <BR>
             <TR>
              <INPUT TYPE="HIDDEN" name="cid" id="cid" VALUE=<%=cid%>>    
             <INPUT TYPE="HIDDEN" name="idd" id="idd" VALUE=<%=orderid%>>
             <TD><input type="submit" id="boxx" value="submit your address" ></TD>
            </TR>
            </TABLE>
              </FORM>
             
           <%}
           con.close();
           %>
 </body>
             </html>