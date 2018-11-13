<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Employee</title>
</head>
<body>

<!-- Show Static files -->
<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png">

<br>
<br>
The Employee info: ${employee.firstName} ${employee.lastName}

<br><br>
Designation: ${employee.designation}

<br><br>
Postal Code: ${employee.postalCode}

<br><br>
Food Token: ${employee.foodToken}

<br><br>
Employee ID: ${employee.employeeId}

</body>
</html>