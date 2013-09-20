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

<!--  start page-heading -->
<div id="page-heading">
	<h1>Empresas</h1>
</div>
<!-- end page-heading -->

<table border="0" width="100%" cellpadding="0" cellspacing="0" id="content-table">
<tr>
	<th rowspan="3" class="sized"><img src="<c:url value="/resources/images/shared/side_shadowleft.jpg"/>" width="20" height="300" alt="" /></th>
	<th class="topleft"></th>
	<td id="tbl-border-top">&nbsp;</td>
	<th class="topright"></th>
	<th rowspan="3" class="sized"><img src="<c:url value="/resources/images/shared/side_shadowright.jpg"/>" width="20" height="300" alt="" /></th>
</tr>
<tr>
		<td id="tbl-border-left"></td>
		<td>
		<!--  start content-table-inner ...................................................................... START -->
		<div id="content-table-inner">
		
			<!--  start table-content  -->
			<div id="table-content">
				<form id="mainform" action="">
				<table border="0" width="100%" cellpadding="0" cellspacing="0" id="product-table">
					<tr>
						<th class="table-header-check"><a id="toggle-all" ></a> </th>
						<th class="table-header-repeat line-left"><a href="">Id</a></th>
						<th class="table-header-repeat line-left"><a href="">Nome</a></th>
						<th class="table-header-repeat line-left"><a href="">Fone</a></th>
						<th class="table-header-repeat line-left"><a href="">Cidade</a></th>
						<th class="table-header-options line-left"><a href="">Opções</a></th>
					</tr>
					<c:forEach items="${empresas}" var="empresa" varStatus="id">
					<tr ${id.count % 2 == 0 ? 'class="alternate-row"' : '' }>
						<td><input  type="checkbox"/></td>
						<td>${empresa.id}</td>
						<td>${empresa.nome}</td>
						<td>${empresa.fone}</td>
						<td>${empresa.cidade}</td>
						<td><a href="mostraEmpresa?id=${empresa.id}"  title="Alterar" class="icon-1 info-tooltip"></a>
							<a href="removerEmpresa?id=${empresa.id}" title="Remover" class="icon-2 info-tooltip"></a>
							<a href="formVinculaModuloEmpresa?id=${empresa.id}" title="Vincular Módulo" class="icon-4 info-tooltip"></a></td>
					</tr>
					</c:forEach>
				</table>
				<!--  end product-table................................... --> 
				</form>
			</div>
			<!--  end content-table  -->
		
			<!--  start actions-box ............................................... -->
			<div id="actions-box">
				<a href="" class="action-slider"></a>
				<div id="actions-box-slider">
					<a href="" class="action-edit">Alterar</a>
					<a href="" class="action-delete">Remover</a>
				</div>
				<div class="clear"></div>
			</div>
			<!-- end actions-box........... -->
			
			<!--  start paging..................................................... -->
			<table border="0" cellpadding="0" cellspacing="0" id="paging-table">
			<tr>
			<td>
				<a href="" class="page-far-left"></a>
				<a href="" class="page-left"></a>
				<div id="page-info">Página <strong>1</strong> / 15</div>
				<a href="" class="page-right"></a>
				<a href="" class="page-far-right"></a>
			</td>
			<td>
			<select  class="styledselect_pages">
				<option value="">Número de Linhas</option>
				<option value="">1</option>
				<option value="">2</option>
				<option value="">3</option>
			</select>
			</td>
			</tr>
			</table>
			<!--  end paging................ -->
			
			<div class="clear"></div>
		 
		</div>
		<!--  end content-table-inner ............................................END  -->
		</td>
		<td id="tbl-border-right"></td>
	</tr>
	<tr>
		<th class="sized bottomleft"></th>
		<td id="tbl-border-bottom">&nbsp;</td>
		<th class="sized bottomright"></th>
	</tr>
	</table>
	<div class="clear">&nbsp;</div>
				

<c:import url="/util/rodape.jsp" />
</body>
</html>