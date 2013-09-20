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
<h3>Tipos de Chamado</h3>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Nome</th>
	</tr>
	<c:forEach items="${tipoChamados}" var="tipoChamado">
	<tr>
		<td>${tipoChamado.id}</td>
		<td>${tipoChamado.nome}</td>
		<td><a href="mostraTipoChamado?id=${tipoChamado.id}">Alterar</a></td>
		<td><a href="removerTipoChamado?id=${tipoChamado.id}">Remover</a></td>
	</tr>
	</c:forEach>
</table> <br/>
<a href="formAdicionarTipoChamado">Adicionar Tipo de Chamado</a>
	<br/> <br/>
<a href="home">In�cio</a> <br/>

<c:import url="/util/rodape.jsp" />
</body>
</html>