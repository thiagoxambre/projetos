<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<c:import url="/util/cabecalho.jsp" />

<P> Menu </P>
<a href="listarSistemas">Sistemas</a><br/>
<a href="listarModulos">Módulos</a><br/>
<a href="listarEmpresas">Empresas</a><br/>

<c:import url="/util/rodape.jsp" />
</body>
</html>
