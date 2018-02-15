<%-- 
    Document   : adminlogin
    Created on : 07-Nov-2013, 11:13:16
    Author     : sahil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>shopping mart</title>
         <style type="text/css">
        body{
            
            background-image: url("ucb.jpg");
        }
        #but2{
            position:absolute;
            top:99px;
            right:40px;
        }
        #sub{
            position:absolute;
            top:99px;
            right:150px;
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
        #adminbox{
           right:30px;
            width:50px;
            height:40px;
            position:absolute;
            top: 13px;
            margin-left: 1140px;
             background-color:#46e7ff;
        }
        #full2{
           box-shadow: 0 0 20px #000;
            opacity:0.89;
            position:absolute;
            top:60px;
            right:0px;
            width:250px;
            line-height:12px;
            font-size:14px;
            background:#eff0f2;
            margin:10px;
            
        }
        </style>
    </head>
    <body>
        <script type="text/javascript">
    function clearthis(target){
        var x = document.getElementById("usern");
        x.value= "";
        var y = document.getElementById("passw");
        y.value= "";
      
    }
    </script>
        <h1 id="heading">Shopping mart</h1>
        <form action="index.jsp" method="post">
 <input type="image"  src="home.jpg" id="adminbox" value="Admin login">
        </form>
         <div id="full2">
<form action="./adminlogin" method="post">
    <br>
<div align="left" style="font-family:Verdana, Geneva, sans-serif; font-size:16px; font-weight:bold;">&nbsp;&nbsp;&nbsp;&nbsp;Admin Login Box</div><br clear="all">
&nbsp;&nbsp;Username:&nbsp;<input type="text" id="usern" name="usern" value="" ><br clear="all"><br clear="all">
&nbsp;&nbsp;Password:&nbsp;&nbsp;<input type="password" id="passw" name="passw" value="" ><br clear="all"><br clear="all">
<input type="hidden" name="orderId" id="orderId" value="" /> 
<input type="submit" id="sub" value="submit" onclick="calling();" />
</form>  
<button id="but2"  onfocus="clearthis(this);">Cancel</button>
<br clear="all"><br clear="all">
<br><br>
</div>
     
    </body>
</html>
