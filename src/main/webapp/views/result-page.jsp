<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<p>Username: ${userInformation.getUsername()}</p>
	<p>Crushname: ${userInformation.getCrushname()}</p>
	
	Hi ${userInformation.getUsername()},</br>
	${userInformation.getUsername()} and ${userInformation.getCrushname()} </br>
	are ${userInformation.getResult()} ${result} </br>
		
	<!-- 		<a href="/Spring-love-calculator/sendemail">Send this to email</a> </br>		 -->
		
		
		<a href="<c:url value="/Spring-love-calculator/sendemail"/>">Send this to email</a>
		
		<!-- This is how url looks like when c: tag is used URL ENCODING session id is passed along with url
http://localhost:8080/Spring-love-calculator/sendemail;jsessionid=93F4BC0CEB985F57A1429F137F19E449	-->

 		<a href="#">try with somebody else</a> </br>
		<a href="#">check user history</a>
		
</body>
</html>