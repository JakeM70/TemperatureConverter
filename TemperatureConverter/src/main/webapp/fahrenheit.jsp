<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fahrenheit Converter</title>
</head>
<body>
<h1>Fahrenheit to Celsius Converter</h1>
<form action="getFahrenheitServlet"method="post">
Enter the temperature in fahrenheit:
<input type="text"name="userTemp"size="10">
<input type="submit"value="Calculate Celsius"/>
</form>

</body>
</html>