<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="process-email" modelAttribute="emailDto">

<h1>
Hi ${userInformation.username},
 Send result to ur email
</h1>
	Enter your email : <form:input path="emailId"/>
	<input type="submit" value="send">
</form:form>
	
</body>
</html>