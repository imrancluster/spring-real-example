<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example1 Form Confirmation</title>
</head>
<body>


The result: ${example1.firstName} ${example1.lastName}
<br><br>
Country: ${example1.country}

<br><br>
Favorite Language: ${example1.favoriteLanguage}

<br><br>
Operating Systems:
<br>
<ul>
	<c:forEach var="temp" items="${example1.operatingSystems}">
		<li>${temp}</li>
	</c:forEach>
</ul>

</body>
</html>