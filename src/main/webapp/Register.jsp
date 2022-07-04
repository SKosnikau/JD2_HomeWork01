<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration page</title>
</head>
<body>
	<form action="Controller" method="get">
		<input type="hidden" name="command01" value="registration"/>
		Enter your name:<br/>
		<input type="text" name="name" value=""/> <br>
		Enter your surname: <br>
		<input type="text" name="surname" value=""/> <br>
		Enter your date of birth:<br>
		<input type="date" name="birthdate" value=""/> <br>
		Enter your login:<br>
		<input type="text" name="login" value=""/><br>
		Enter your password:<br>
		<input type="password" name="password" value=""/><br>
		<input type="submit" value="save"/>
	</form>
</body>
</html>


		







