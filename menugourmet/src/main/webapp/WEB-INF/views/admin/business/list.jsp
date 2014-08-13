<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:import url="/WEB-INF/views/util/cabecalho.jsp" />

<!--  start page-heading -->
<div id="page-heading">
	<h1><spring:message code="label.businesses"/></h1>
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
				<table border="0" width="100%" cellpadding="0" cellspacing="0" class="product-table">
					<tr>
						<th class="table-header-check"><a id="toggle-all" ></a> </th>
						<th class="table-header-repeat line-left"><a href=""><spring:message code="label.business.id"/></a></th>
						<th class="table-header-repeat line-left"><a href=""><spring:message code="label.business.name"/></a></th>
						<th class="table-header-repeat line-left"><a href=""><spring:message code="label.business.phone"/></a></th>
						<th class="table-header-repeat line-left"><a href=""><spring:message code="label.business.city"/></a></th>
						<th class="table-header-options line-left"><a href=""><spring:message code="label.options"/></a></th>
					</tr>
					<c:forEach items="${businesses}" var="business" varStatus="id">
					<tr ${id.count % 2 == 0 ? 'class="alternate-row"' : '' }>
						<td><input  type="checkbox"/></td>
						<td>${business.id}</td>
						<td>${business.name}</td>
						<td>${business.phone}</td>
						<td>${business.city}</td>
						<td><a href="mostraEmpresa?id=${business.id}"  title='<spring:message code="label.alter"/>' class="icon-1 info-tooltip"></a>
							<a href="removerEmpresa?id=${business.id}" title='<spring:message code="label.delete"/>' class="icon-2 info-tooltip"></a>
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
					<a href="" class="action-edit"><spring:message code="label.alter"/></a>
					<a href="" class="action-delete"><spring:message code="label.delete"/></a>
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
				<div id="page-info"><spring:message code="label.pages"/> <strong>1</strong> / 15</div>
				<a href="" class="page-right"></a>
				<a href="" class="page-far-right"></a>
			</td>
			<td>
			<select  class="styledselect_pages">
				<option value=""><spring:message code="label.rows"/></option>
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
				

<c:import url="/WEB-INF/views/util/rodape.jsp" />
</body>
</html>