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
<h3>Adicionar Usuario</h3>
<form action="adicionarUsuario" method="get">
	<table>
		<tr>
			<td>Login:</td>
			<td><input type="text" name="login"></td>
		</tr>
		<tr><td></td><td><form:errors path="usuario.login" cssStyle="color:red" /></td></tr>
		<tr>
			<td>Senha:</td>
			<td><input type="text" name="senha"></td>
		</tr>
		<tr><td></td><td><form:errors path="usuario.senha" cssStyle="color:red" /></td></tr>
		<tr>
			<td>Nome:</td>
			<td><input type="text" name="nome"></td>
		</tr>
		<tr><td></td><td><form:errors path="usuario.nome" cssStyle="color:red" /></td></tr>
		<tr>
			<td>Email:</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td></td><td><form:errors path="usuario.email" cssStyle="color:red" /></td>
		</tr>	
		<tr>
			<td>Fone:</td>
			<td><input type="text" name="fone"></td>
		</tr>
		<tr>
			<td>Empresa:</td>
			<td><select name="idEmpresa">
				<option value="">-</option>
				<c:forEach items="${empresas}" var="empresa">
					<option value="${empresa.id}">${empresa.nome}</option>
				</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td>Tipo:</td>
			<td><select name="idPapelUsuario">
				<option value="">-</option>
				<c:forEach items="${papeisUsuarios}" var="papelUsuario">
					<option value="${papelUsuario.id}">${papelUsuario.tipo}</option>
				</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td>Ativo:</td>
			<td><select name="ativo">
				<option value="1" selected="selected">Sim</option>
				<option value="0">Não</option>
			</select></td>
		</tr>

		<tr><td></td><td><input type="submit" value="Adicionar"></td></tr>
	</table>
</form>

<c:import url="/util/rodape.jsp" />

</body>
</html>