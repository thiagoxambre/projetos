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
<h3>Adicionar Empresa</h3>
<form action="adicionarEmpresa" method="get">
	<table>
		<tr>
			<td>Nome:</td>
			<td><input type="text" name="nome"></td>
		</tr>
		<tr><td></td><td><form:errors path="empresa.nome" cssStyle="color:red" /></td></tr>
		<tr>
			<td>Fone:</td>
			<td><input type="text" name="fone"></td>
		</tr>
		<tr>
			<td>Endere�o:</td>
			<td><input type="text" name="endereco"></td>
		</tr>
		<tr>
			<td>Cidade:</td>
			<td><input type="text" name="cidade"></td>
		</tr>
		<tr>
			<td>Respons�vel:</td>
			<td><input type="text" name="responsavel"></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td></td><td><form:errors path="empresa.email" cssStyle="color:red" /></td>
		</tr>	
		<tr>
			<td>Modulos:</td>
			<td><select multiple name="modulos">
				<c:forEach items="${sistemas}" var="sistema">
					<optgroup label="${sistema.nome}">
					<c:forEach items="${sistema.modulos}" var="modulo">
						<option value="${modulo.id}">${modulo.nome}</option>
					</c:forEach>
	  				</optgroup>
				</c:forEach>
				</select></td>
		</tr>
		<tr><td></td><td><input type="submit" value="Adicionar"></td></tr>
	</table>
</form>

<c:import url="/util/rodape.jsp" />

</body>
</html>