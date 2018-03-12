<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<title>Spring 4 MVC| Ahana Software Technologies</title>
</head>
<body>
<div class="container">
<c:if test="${not empty param.personName}">
	<h1>Welcome ${param.personName}</h2>
</c:if>
</div>

<div class="container">
<c:if test="${not empty personName}">
	<h2>Welcome ${personName}</h2>
</c:if>
</div>

</body>
</html>