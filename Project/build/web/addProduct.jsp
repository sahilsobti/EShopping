<%-- 
    Document   : addProduct
    Created on : 07-Nov-2013, 11:38:37
    Author     : sahil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>shopping mart </title>
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
        #ful{
            box-shadow: 0 0 20px #000;
            position:relative;
            opacity:0.89;
            top:120px;
            left:100px;
            width:1100px;
            height: 400px;
            font-size:14px;
            background-color:#eff0f2;
            margin:10px;
            
        }
        tr{
            line-height:30px;
            position:relative;
            top:200px;
        }
        
                 th{
            font-family: miso;
            width:190px;
            color:#0e94d7; 
            font-size: 28px;
            margin-left:-10px; 
            text-align:center;
            vertical-align:middle;
            position: relative;
            top:300px;
            line-height:25px;
            
        }
        td{ font-family: miso;
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
#pid,#pname,#brand,#price{
   position:relative;
    width:650px;
    left:200px;
    top:34px;
    line-height: 30px;
}
#add{
    font-size:45px;
    box-shadow: 0 0 10px #37c3f7;
            -moz-box-shadow: 0 0 10px #6AB5FF;
            -webkit-box-shadow: 0 0 10px #6AB5FF;  
    
}
#but1{
    width:150px;
    height:40px;
     box-shadow: 0 0 10px #37c3f7;
            -moz-box-shadow: 0 0 10px #6AB5FF;
            -webkit-box-shadow: 0 0 10px #6AB5FF;  
}
#im{
    opacity:0.29;
    position:absolute;
    left:130px;
    top:218px;
    z-index:9;
}
#sub{
            opacity:1;
            margin-left: 450px;
            margin-top:12px;
            padding:8px;
            width:100px;
            box-shadow: 0 0 10px #6AB5FF;
            -moz-box-shadow: 0 0 10px #6AB5FF;
            -webkit-box-shadow: 0 0 10px #6AB5FF;  
            
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
        var m= document.getElementById("fullname");
        m.value= "";
        var n = document.getElementById("username");
        n.value= "";
        var z = document.getElementById("password");
        z.value= "";
          var w = document.getElementById("email");
        w.value= "";
          var k = document.getElementById("ph");
        k.value= "";
    }
</script> 
 <form action="adminlogin.jsp" method="post">
             <input type="image" src="logout.jpg" id="logbox" value="Log Out">    
         </form>        
<h1 id="heading">Shopping mart</h1>
        
         <div id='im'>
         <img src='addproducts.jpg' width='100' height='350'>
         </div>
         <div id="ful">
             <br><br><br><br><br><br>
              
      <form  action="./addp" method="post">
          <table>
             
          <br><b>
          
          <tr><th><div style="width:190px; padding-top:10px;margin-right:10px;position:absolute; top:8px;left:150px;">Product Id:</div></th><td><input type="text" id="pid" name="pid" value="" ><br><br></td></tr>
 <tr><th><div style="width:190px; padding-top:10px;margin-right:10px;position:absolute; top:70px;left:150px;">Product Name:</div></th><td><input type="text" id="pname" name="pname" value=""><br><br></td></tr>
 <tr><th><div style="width:190px; padding-top:10px;margin-right:10px;position:absolute; top:134px;left:150px;">Brand Name :</div></th><td><input type="text" id="brand" name="brand" value="" ><br><br></td></tr>
 <tr><th><div style="width:190px; padding-top:10px;margin-right:10px;position:absolute; top:195px;left:150px;">Price of the Product:</div></th><td><input type="text" id="price" name="price" value="" ><br><br></td></tr>
 <tr><td><div style="width:190px; padding-top:10px;margin-right:10px;position:absolute; top:300px;right:150px;"><input type="submit" id="but1" value="submit" ></div></td></tr>
          </table>
      </form>
             <br>
             <br>
<div style="width:190px; padding-top:10px;margin-right:10px;position:absolute; top:300px;left:150px;"><button id="but1" onclick="clearthis(this);">Cancel</button></div>
<br clear="all"><br clear="all">  
<form action="adminenter.jsp" method="get">
    <input type="submit" id="sub" style='width:150px;height:40px;' value="Go Back">
</form> 
         
         </div>
          <%
    if (request.getParameter("fail").equals ("1"))
    {%>
    <script>
                alert("product is not added...try again");
</script>
<%}
    if (request.getParameter("fail").equals ("0"))
    {%>
    <script>
                alert("product is successfully added");
</script>

    <%} else{
%>

<%
}
%>  
         </body>
</html>
