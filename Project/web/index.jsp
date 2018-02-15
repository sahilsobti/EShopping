<%-- 
    Document   : index
    Created on : 28-Oct-2013, 04:38:44
    Author     : sahil
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShoppingMart</title>
      <link href="../WEB-INF/styling.css" rel="stylesheet" type="text/css">
    
    <style type="text/css">
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
        #fulll{
            box-shadow: 0 0 20px #000;
            position:absolute;
            opacity:0.89;
            top:60px;
            left:5px;
            width:210px;
            line-height:12px;
            font-size:14px;
            background:#eff0f2;
            margin:10px;
            
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
        #but1{
            position:absolute;
            top:330px;
            left:90px;
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
       #adminbox{
           right:30px;
            width:50px;
            height:40px;
            position:absolute;
            top: 13px;
            margin-left: 1140px;
             background-color:#46e7ff;
        }
         .imgWrap:hover .text1{
            visibility: visible;
            opacity: 1;
        }
        .text1{
         position:absolute;
            top: 7px;
            font-size:25px;
            color:#03c0dc;
            margin-left: 1108px;  
            visibility: hidden;
            opacity: 0;
            z-index:9;
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
        <script>
        function idGenerate(){
            var x = Math.floor((Math.random()*1000)+1); 
            
            document.getElementById("customerId").value=x; 
    };
         function inform(){
         var x = document.getElementById("inform");     
         alert("password must be greater than 8");
    };
           
        </script>
        <h1 id="heading">Shopping mart</h1>
         <form action="adminlogin.jsp" method="post">
                <div class="imgWrap">
 <input type="image"  src="admin.jpg" id="adminbox" value="Admin login">
<p class="text1">Admin login</p>
 </div>
 </form>
        <div style="line-height: 5px; ">
            <div id="fulll">
                <br>
               
                
<form  id="form" action="./signUp" method="post">
<div align="left" style="font-family:Verdana, Geneva, sans-serif; font-size:16px; font-weight:bold;">&nbsp;&nbsp;Sign Up Box</div><br clear="all">
<br>
<div style="width:100px; padding-top:10px;margin-right:10px;float:left;" align="left">&nbsp;&nbsp;&nbsp;&nbsp;Fullname:</div>
<div style="width:300px;float:left;" align="left">&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="fullname" name="fullname" value="" ></div><br clear="all"><br clear="all">

<div style="width:100px; padding-top:10px;margin-right:10px;float:left;" align="left">&nbsp;&nbsp;&nbsp;&nbsp;Username:</div>
<div style="width:300px;float:left;" align="left">&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="username" name="user" value=""></div><br clear="all"><br clear="all">

<div style="width:100px; padding-top:10px;margin-right:10px;float:left;" align="left">&nbsp;&nbsp;&nbsp;&nbsp;Password:</div>
<div style="width:300px;float:left;" align="left">&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" onclick="inform();" id="password" name="pass" value="" ></div><br clear="all"><br clear="all">

<div style="width:100px; padding-top:10px;margin-right:10px;float:left;" align="left">&nbsp;&nbsp;&nbsp;&nbsp;Email:</div>
<div style="width:300px;float:left;" align="left">&nbsp;&nbsp;&nbsp;&nbsp;<input type="email" id="email" name="email" ></div><br clear="all"><br clear="all">

<div style="width:100px; padding-top:10px;margin-right:10px;float:left; line-height:14px;" align="left">&nbsp;&nbsp;&nbsp;&nbsp;Phone number:</div>
<div style="width:300px;float:left;" align="left">&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="ph" name="ph"  ></div><br clear="all"><br clear="all">
<input type="hidden" name="customerId" id="customerId" value="" />    
&nbsp;&nbsp;&nbsp;<input type="submit" value="submit" name="submit" onclick="idGenerate();" style="margin-right:80px;" >

</form>
<button id="but1" onfocus="clearthis(this);">Cancel</button>
<br clear="all"><br clear="all">  
</div>
<!--login...................................................................-->
 
     <script>
   
        function calling(){
            
            var x = Math.floor((Math.random()*100000)+1); 
            document.getElementById("orderId").value=x; 
            }
            </script>
            <div id="full2">
<form action="./login" method="post">
    <br>
<div align="left" style="font-family:Verdana, Geneva, sans-serif; font-size:16px; font-weight:bold;">&nbsp;&nbsp;&nbsp;&nbsp;Users Login Box</div><br clear="all">
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
