<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>

<style type="text/css">
.cssError {
	color: red;
	position: fixed;
	border-right-width: 60px;
}
</style>

<script type="text/javascript">
	function validate() {

		if (document.getElementById("yn").value.length < 1) {
			alert("please enter minimum 1 character");
			return false;
		} else if (document.getElementById("cn").value.length < 1) {
			alert("please enter minimum 1 character");
			return false;
		} else {
			return true;
		}
	}
</script>

</head>
<body>
	<h2 align="center">Love Calculator</h2>
	<hr />
	<form:form action="process-homepage" modelAttribute="userInformation"
		onsubmit="return validate()">
		<div align="center">
			<p>
				<label for="yn">Your Name:</label>
				<form:input id="yn" path="username" />
				<form:errors path="username" class="cssError">
				</form:errors>

			</p>
			<p>
				<label for="cn">Crush Name:</label>
				<form:input id="cn" path="crushname" />
				<form:errors path="crushname" class="cssError">
				</form:errors>
			</p>

			<p>
			<form:checkbox path="check" />
			<label>I am agreeing to all TC's</label>
			<form:errors path="check" class="cssError"></form:errors>
			</p> 
			
			<input type="submit" value="calculate">



		</div>

	</form:form>

</body>
</html>