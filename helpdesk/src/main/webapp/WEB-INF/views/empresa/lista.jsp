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
<h3>Empresas</h3>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Nome</th>
		<th>Fone</th>
		<th>Cidade</th>
	</tr>
	<c:forEach items="${empresas}" var="empresa">
	<tr>
		<td>${empresa.id}</td>
		<td>${empresa.nome}</td>
		<td>${empresa.fone}</td>
		<td>${empresa.cidade}</td>
		<td><a href="mostraEmpresa?id=${empresa.id}">Alterar</a></td>
		<td><a href="removerEmpresa?id=${empresa.id}">Remover</a></td>
		<td><a href="formVinculaModuloEmpresa?id=${empresa.id}">Vincular Módulos</a></td>
	</tr>
	</c:forEach>
</table> <br/>
<a href="formAdicionarEmpresa">Adicionar Empresa</a>
	<br/> <br/>
<a href="home">Início</a> <br/>

<c:import url="/util/rodape.jsp" />
</body>
</html>