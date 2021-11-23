<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Usuario::</title>
</head>

<body>
	<div class="container-fluid">
		<form:form method="post" action="/usuario/login" modelAttribute="usuario">
			<form:label path="nombre">Nombre:</form:label>
			<form:input type="text" path="nombre"/>
			<br>
			<form:label path="apellido">Apellido:</form:label>
			<form:input type="text" path="apellido"/>
			<br>
			<form:label path="limite">Limite:</form:label>
			<form:input type="text" path="limite"/>
			<br>
			<form:label path="codigoPostal">C�digo Postal:</form:label>
			<form:input type="text" path="codigoPostal"/>
			<br>
			<input type="button" value="Limpiar">
			<input type="submit" value="Submit">

		</form:form>
	
		<!--<form method="post" action="/usuario/login">
			<label for="nombre">Nombre:</label>
			<input type="text" id="nombre" name="nombre">
			<br>
			<label for="apellido">Apellido:</label>
			<input type="text" id="apellido" name="apellido">
			<br>
			<label for="limite">Limite:</label>
			<input type="text" id="limite" name="limite">
			<br>
			<label for="cp">C�digo Postal:</label>
			<input type="text" id="cp" name="cp">
			<br>
			<input type="button" value="Limpiar">
			<input type="submit" value="Submit">			
		</form>-->
	</div>
</body>

</html>