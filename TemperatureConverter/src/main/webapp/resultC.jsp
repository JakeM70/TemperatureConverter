<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversion</title>
</head>
<body>
<p>
Conversion of ${userTemperature.getCelsius() } celsius to ${userTemperature.ConversionFormula() } fahrenheit.
</p>
<a href="index.jsp">Convert another temperature</a>
</body>
</html>