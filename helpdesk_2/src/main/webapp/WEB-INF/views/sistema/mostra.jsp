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
<form action="alterarSistema" method="get">
	<input type="hidden" name="id" value="${sistema.id}" ><br/>
	Id:<input type="text" name="id_disable" value="${sistema.id}" disabled="disabled"><br/>
	Nome:<input type="text" name="nome" value="${sistema.nome}"><br/>
	<form:errors path="sistema.nome" cssStyle="color:red" /> <br/>	
	<input type="submit" value="Salvar">
</form>

<c:import url="/util/rodape.jsp" />

</body>
</html>