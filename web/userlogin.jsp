
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<html>
    <head>
        <title>
            login form
              
        </title>
        <style>
            body{
                background-image:url(B14.jpg);
                background-repeat: no-repeat;
 background-size: 1600px 750px;
            }
        </style>
        <link rel="stylesheet" href="style.css" >
    </head>
    <body>
       <div class="wrapper" style="background-image: url(h2.jpeg)">
              <div class="inner">
                  <div class="image-holder">
    <img src="P1.jpg" alt="image"  height="90%">
</div>
              <form action="UserloginServlet" method="post"  >
                  <h3>LogIn Form</h3>
                  <div class="form-wrapper">
                <input type="text" placeholder=" Name" class="form-control" name="name" id="name"required>
                  </div>

                 <div class="form-wrapper">
         <input type="text" placeholder="Email " class="form-control" name="email" id="email" required>
          </div>
                  <div class="form-wrapper">
          <input type="password" placeholder="Password" class="form-control" name="password" id="password" minlength="8" required>
           </div>
           
                <%String error=(String)session.getAttribute("error");
                session.removeAttribute("error");
                if(error!=null){
                %>
                <div> <p><%=error%></p></div>
                <%}%>
                
                <input type="Submit" value="LogIn">
         
   
</form>
              </div>
       </div>
    </body>
</html>
