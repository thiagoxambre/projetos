<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelpDesk</title>
</head>
<body>
<c:import url="/util/cabecalho.jsp" />
<h3>Alterar Sistema</h3>
<form action="alterarEmpresa" method="get">
	<input type="hidden" name="id" value="${empresa.id}" ><br/>
	<table>
	<tr>
		<td>Id:</td>
		<td><input type="text" name="id_disable" value="${empresa.id}" disabled="disabled"></td>
	</tr>
	<tr>
		<td>Nome:</td>
		<td><input type="text" name="nome" value="${empresa.nome}"></td>
	</tr>
	<tr>
		<td></td><td><form:errors path="empresa.nome" cssStyle="color:red" /></td>
	</tr>
		<tr>
			<td>Fone:</td>
			<td><input type="text" name="fone" value="${empresa.fone}"></td>
		</tr>
		<tr>
			<td>Endereço:</td>
			<td><input type="text" name="endereco" value="${empresa.endereco}"></td>
		</tr>
		<tr>
			<td>Cidade:</td>
			<td><input type="text" name="cidade" value="${empresa.cidade}"></td>
		</tr>
		<tr>
			<td>Responsável:</td>
			<td><input type="text" name="responsavel" value="${empresa.responsavel}"></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><input type="text" name="email" value="${empresa.email}"></td>
		</tr>
		<tr>
			<td></td><td><form:errors path="empresa.email" cssStyle="color:red" /></td>
		</tr>	
	
	<tr>	
		<td></td><td><input type="submit" value="Salvar"></td>
	</tr>
	</table>
</form>

<c:import url="/util/rodape.jsp" />

</body>
</html>