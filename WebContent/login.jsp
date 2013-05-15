<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.fboy.wisezen.login.Login" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login | Wisezen</title>
</head>
<body>

	<%
		String usename = request.getParameter("username");
		String password = request.getParameter("password");
		boolean validUser = Login.checkCredentials(usename, password);		
		//Logic to check if the usename and passord to 
		
			if(validUser==false) {
				out.write("Invalid username or password");
				
			}
			else {
				//Logic to create session and then redirect
				response.sendRedirect("dasboard.jsp");
			}
	%>
	
	

</body>
</html>