<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.cssError {
	color: red;
	position: fixed;
	border-right-width: 60px;
}
</style>
</head>
<body>

	<h1 align="center">Registration Page</h1>

	<form:form action="registration-success" method="GET" align="center"
		modelAttribute="userReg">
		<label>Name</label>
		<form:input path="Name" />

		<br />

		<label>Username</label>
		<form:input path="Username" />

		<br />

		<label>Password</label>
		<form:password path="Password" />

		<br />

		<label>Country</label>
		<form:select path="Country">
			<form:option value="Ind" label="India"></form:option>
			<form:option value="Pak" label="Pakistan"></form:option>
			<form:option value="USA" label="United States"></form:option>
		</form:select>

		<br />

		<label>Hobby :</label>
Cricket:<form:checkbox path="hobbies" value="cricket" />
Programming:<form:checkbox path="hobbies" value="Programming" />

		<br />

		<label>Gender :</label>
Male:<form:radiobutton path="Gender" value="Male" />
Female:<form:radiobutton path="Gender" value="Female" />

		<br />
		
		<label>Age</label>
		<form:input path="age"/>
		<form:errors path="age" class="cssError"/>

		<h2 align="left">Communication</h2>

		<label for="emailid">Email</label>
		<form:input path="communication.email" />

		<label for="phno">Phone</label>
		<form:input path="communication.phone" />
		
		<form:button>Register</form:button>
		<form:errors path="communication.phone" class="cssError"></form:errors>
	</form:form>

</body>
</html>