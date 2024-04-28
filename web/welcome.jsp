<%@page import="com.techsoft.DTO.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% UserDTO user=(UserDTO)request.getSession().getAttribute("login");%>

<html>
<head>
<style type="text/css">
    body{
        background-image: url(B43.jpg);
background-repeat: no-repeat;
 background-size: 1600px 750px;
    }
#home
{
      text-transform: uppercase;
 font-family:     Helvetica;
color:white;
text-align:center;
font-size:2rem;
}
#home ul li
{
display:inline-block;
padding:25px;
}
#home{
   
    background:wheat;

}
.hello{
   text-align:center;
   font-family: Helvetica;
color:white;

font-size:3.5rem;
}
.hello2{
     text-align:center;
   font-family: Helvetica;
color:white;

font-size:2.5rem;
}
.hello3{
    margin-top:150px;
     text-align:center;
   font-family: Helvetica;
color:white;


}
</style>
</head>
<body>

<div id=home>
<ul>
<li><a href="welcome.jsp">Home</a></li>
<li><a href="userlogin.jsp">LogIn</a></li>
<li><a href="userregistration.jsp">Registration</a></li>
<li><a href="userlogin.jsp">LogOut</a></li>
</ul>
</div>
    <div class="hello2">
        <h1 >  Welcome to our Website-<%=user.getName()%> </h1></div>
<div class="hello3">
<p><h1>
   "Unlock your potential with Our Company's dynamic internship programs,
   where students gain hands-on experience and mentorship to thrive in their chosen field.
   </h1>

</p>
</div>
</body>
</html>



