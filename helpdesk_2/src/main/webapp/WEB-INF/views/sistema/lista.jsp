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
<h3>Sistemas</h3>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Nome</th>
	</tr>
	<c:forEach items="${sistemas}" var="sistema">
	<tr>
		<td>${sistema.id}</td>
		<td>${sistema.nome}</td>
		<td><a href="mostraSistema?id=${sistema.id}">Alterar</a></td>
		<td><a href="removerSistema?id=${sistema.id}">Remover</a></td>
	</tr>
	</c:forEach>
</table> <br/>
<a href="formAdicionarSistema">Adicionar Sistema</a>
	<br/> <br/>
<a href="home">Início</a> <br/>

<c:import url="/util/rodape.jsp" />
</body>
</html>