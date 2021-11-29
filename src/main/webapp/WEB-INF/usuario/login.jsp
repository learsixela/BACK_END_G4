<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:include page='../template/header.jsp'/>

<body>
	<jsp:include page='../template/navbar.jsp'/>
	<div class="container">
	<h1>Login</h1>
			<hr>
	<h2>Ingreso al sistema</h2>
	
		<form action="" method="post">
			<label for="email">Email:</label>
			<input type="text" name="email">
			<br>
			<label for="password">Password:</label>
			<input type="password" name="password" placeholder="ingresa tu password">
			<br>
			<input type="submit" value= "Ingresar">
		</form>
	</div>
	<jsp:include page='../template/footer.jsp'/>
</body>

</html>