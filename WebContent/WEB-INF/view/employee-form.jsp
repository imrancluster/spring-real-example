<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Employee Form</title>
	
	<style>
		.error {color: red;}
	</style>
</head>

<body>

	<i>Fill out the form. Asterisk (*) means required.</i>
	<br><br>

	<form:form action="process-form" modelAttribute="employee">
	
		First name : <form:input path="firstName"/>
		<br><br>
	
		Last name (*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		
		Designation : <form:input path="designation"/>
		<br><br>
		
		Postal Code: <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error" />
		<br><br>
		
		Food Token: <form:input path="foodToken"/>
		<form:errors path="foodToken" cssClass="error" />
		<br><br>
		
		Employee ID: <form:input path="employeeId"/>
		<form:errors path="employeeId" cssClass="error" />
		<br><br>
	
		<input type="submit" value="Submit">
	
	</form:form>


</body>

</html>












