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
	<table>
	<tr>
		<td>Id:</td>
		<td><input type="text" name="id_disable" value="${empresa.id}" disabled="disabled"></td>
	</tr>
	<tr>
		<td>Nome:</td>
		<td><input type="text" name="nome_disable" value="${empresa.nome}" disabled="disabled"></td>
	</tr>
	</table>
	<h4>Modulos</h4>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Nome</th>
		</tr>
		<c:forEach items="${empresa.modulos}" var="modulo">
		<tr>
			<td>${modulo.id}</td>
			<td>${modulo.nome}</td>
			<td><a href="removerModuloEmpresa?idEmpresa=${empresa.id}&idModulo=${modulo.id}">Remover</a></td>
		</tr>
		</c:forEach>
	</table>
	<form action="adicionarModuloEmpresa">
	<input type="hidden" name="idEmpresa" value="${empresa.id}" ><br/>
	<table>
		<tr>
			<td>Modulo:</td>
			<td>
				<select name="idModulo">
					<c:forEach items="${sistemas}" var="sistema">
						<optgroup label="${sistema.nome}">
						<c:forEach items="${sistema.modulos}" var="modulo">
							<option value="${modulo.id}">${modulo.nome}</option>
						</c:forEach>
						</optgroup>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr><td></td><td><input type="submit" value="Vincular"></td></tr>
	</table>
	</form>
	<a href="listarEmpresas">Empresas</a><br/>
<c:import url="/util/rodape.jsp" />
</body>
</html>