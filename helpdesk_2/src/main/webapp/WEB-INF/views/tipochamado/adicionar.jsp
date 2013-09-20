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
<h3>Adicionar Tipo de Chamado</h3>
<form action="adicionarTipoChamado" method="get">
	<table>
		<tr>
			<td>Nome:</td>
			<td><input type="text" name="nome"></td>
		</tr>
		<tr><td></td><td><form:errors path="tipoChamado.nome" cssStyle="color:red" /></td></tr>
		<tr><td></td><td><input type="submit" value="Adicionar"></td></tr>
	</table>
</form>

<c:import url="/util/rodape.jsp" />

</body>
</html>