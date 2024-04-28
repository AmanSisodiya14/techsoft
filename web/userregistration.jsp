
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration form </title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
 
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="wrapper" style="background-image: url(B46.jpg)">
<div class="inner">
<div class="image-holder">
    <img src="P1.jpg" alt="image"  height="90%">
</div>
<form action="UserregisterServlet" method="Post">
<h3>Registration Form</h3>
<div class="form-wrapper">
<input type="text" placeholder=" Name" class="form-control" name="name" id="name"required>

</div>
<div class="form-wrapper">
<input type="text" placeholder="Address" class="form-control" name="address" id="address" required>
 
</div>
<div class="form-wrapper">
<input type="text" placeholder="Email " class="form-control" name="email" id="email"required>
 
</div>
<div class="form-wrapper">
<input type="text" placeholder="Qualification" class="form-control" name="qualification" id="qualification"required>
 
</div>
<div class="form-wrapper">
<input type="text" placeholder="Phone number " class="form-control" name="phone" id="phone" required>
 
</div>
<div class="form-wrapper">
<select name="gender"  class="form-control" id="dender"required>
<option hidden>Gender</option>
<option value="male">male</option>
<option value="femal">female</option>
<option value="other">other</option>
</select>
</div>
<div class="form-wrapper">
<select  class="form-control" name="domain" id="domain" required >
<option hidden >Domain</option>
<option value="male">Java developer</option>
<option value="femal">Web developer</option>
<option value="femal">Python developer</option>
<option value="femal">Flutter developer</option>
<option value="femal">Django developer</option>
<option value="femal">Data Science </option>
<option value="other">Android developer</option>
</select>
</div>
<div class="form-wrapper">
<input type="date" placeholder="Date" class="form-control" name="date" id="date" required>
 
</div>
<div class="form-wrapper">
<input type="password" placeholder="Password" class="form-control" name="password" id="password" minlength="8" required>
 
</div>

<input type="submit" value="Register">

</form>
</div>
</div>
</body>
</html>