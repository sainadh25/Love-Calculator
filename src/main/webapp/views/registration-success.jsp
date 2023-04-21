<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Your Registration is Success</h1>
	<hr />
	<h2>The details entered by you are:</h2>
	<form:form align="center">
	
	Name : ${userReg.getName()}</br>
	Username : ${userReg.getUsername()}</br>
	Country : ${userReg.getCountry()}</br>
	Hobbies : <c:forEach var="i" items="${userReg.getHobbies()}">
		${i}
	 </c:forEach>
		</br>
	Gender : ${userReg.getGender()} </br>
	Age:   ${userReg.getAge()}</br>
	Email : ${userReg.getCommunication().getEmail()}</br>
	Phone : ${userReg.getCommunication().getPhone() }
	</form:form>
</body>
</html>