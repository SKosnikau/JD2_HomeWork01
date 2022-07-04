<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authentication page</title>
</head>
<body>
	<form action="Controller" method="get">
		<input type="hidden" name="command01" value="authentification" /> 
		Login:<br />
		<input type="text" name="login" value="" /><br /> 
		Password:<br />
		<input type="password" name="password" value="" /><br /> 
		<input type="submit" value="Enter" /><br />
	</form>
</body>
</html>