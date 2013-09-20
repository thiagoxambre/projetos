<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelpDesk</title>
</head>
<body>
<c:import url="/util/cabecalho.jsp" />
<h3>Usuarios</h3>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Login</th>
		<th>Nome</th>
		<th>Tipo</th>
		<th>Ativo</th>
	</tr>
	<c:forEach items="${usuarios}" var="usuario">
	<tr>
		<td>${usuario.id}</td>
		<td>${usuario.login}</td>
		<td>${usuario.nome}</td>
		<td>${usuario.papelUsuario.tipo}</td>
		<td>${usuario.ativo}</td>
		<td><a href="mostraUsuario?id=${usuario.id}">Alterar</a></td>
		<td><a href="removerUsuario?id=${usuario.id}">Remover</a></td>
	</tr>
	</c:forEach>
</table> <br/>
<a href="formAdicionarUsuario">Adicionar Usuario</a>
	<br/> <br/>
<a href="home">Início</a> <br/>

<c:import url="/util/rodape.jsp" />
</body>
</html>