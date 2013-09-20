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
<h3>Alterar Usuario</h3>
<form action="alterarUsuario" method="get">
	<input type="hidden" name="id" value="${usuario.id}" ><br/>
	<input type="hidden" name="login" value="${usuario.login}">
	<table>
		<tr>
			<td>Id:</td>
			<td><input type="text" name="id_disable" value="${usuario.id}" disabled="disabled"></td>
		</tr>
		<tr>
			<td>Login:</td>
			<td><input type="text" name="login_disable" value="${usuario.login}" disabled="disabled"></td>
		</tr>
		<tr>
			<td>Senha:</td>
			<td><input type="text" name="senha" value=""></td>
		</tr>
		<tr>
			<td></td><td><form:errors path="usuario.senha" cssStyle="color:red" /></td>
		</tr>
		<tr>
			<td>Nome:</td>
			<td><input type="text" name="nome" value="${usuario.nome}"></td>
		</tr>
		<tr>
			<td></td><td><form:errors path="usuario.nome" cssStyle="color:red" /></td>
		</tr>
		<tr>
			<td>Fone:</td>
			<td><input type="text" name="fone" value="${usuario.fone}"></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><input type="text" name="email" value="${usuario.email}"></td>
		</tr>
		<tr>
			<td></td><td><form:errors path="usuario.email" cssStyle="color:red" /></td>
		</tr>	
		<tr>
			<td>Empresa:</td>
			<td>
				<select name="idEmpresa">
					<option value="">-</option>
					<c:forEach items="${empresas}" var="empresa">
						<option value="${empresa.id}" ${empresa.id == usuaio.empresa.id ? 'selected=\"selected\"' : '' } >${empresa.nome}</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>Tipo de Usuário:</td>
			<td>
				<select name="idPapelUsuario">
					<option value="">-</option>
					<c:forEach items="${papeisUsuario}" var="papelUsuario">
						<option value="${papelUsuario.id}" ${papelUsuario.id == usuario.papelUsuario.id ? 'selected=\"selected\"' : '' } >${papelUsuario.tipo}</option>
					</c:forEach>
				</select>
			</td>
		</tr>

		<tr>
			<td>Ativo:</td>
			<td><select name="ativo">
				<option value="1" ${usuario.ativo == true ? 'selected="selected"' : '' } >Sim</option>
				<option value="0" ${usuario.ativo == false ? 'selected="selected"' : '' }>Não</option>
			</select></td>
		</tr>
		
		<tr>	
			<td></td><td><input type="submit" value="Salvar"></td>
		</tr>
	</table>
</form>

<c:import url="/util/rodape.jsp" />

</body>
</html>