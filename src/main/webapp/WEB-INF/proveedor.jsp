<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proveedores</title>
</head>

<body>
    <form action="/proveedor/insertar" method="POST">
		<label for="nombre">Nombre: </label>
		<input type="text" name="nombre" id="nombre"> <br>
		<label for="apellido">Apellido: </label>
		<input type="text" name="apellido" id="apellido"> <br>
		<label for="email">Email: </label>
		<input type="email" name="email" id="email"> <br>
		<label for="edad">Edad: </label>
		<input type="text" name="edad" id="edad"> <br>
		<input type="submit" value="Enviar">
    </form>
</body>

</html>