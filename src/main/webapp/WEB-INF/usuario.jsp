<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clientes</title>
</head>

<body>
	<div class="container">
		<form method="post" action="/usuario/login">
			<label for="nombre">Nombre:</label>
			<input type="text" id="nombre" name="nombre">
			<br>
			<label for="apellido">Apellido:</label>
			<input type="text" id="apellido" name="apellido">
			<br>
			<label for="limite">Limite:</label>
			<input type="text" id="limite" name="limite">
			<br>
			<label for="cp">Código Postal:</label>
			<input type="text" id="cp" name="cp">
			<br>
			<input type="button" value="Limpiar">
			<input type="submit" value="Submit">			
		</form>
	</div>
</body>

</html>