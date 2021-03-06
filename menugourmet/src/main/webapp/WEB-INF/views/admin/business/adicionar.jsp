<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
    
<c:import url="/util/cabecalho.jsp" />

<div id="page-heading"><h1>Adicionar Empresa</h1></div>

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
		<!--  start content-table-inner -->
		<div id="content-table-inner">
		
		<table border="0" width="100%" cellpadding="0" cellspacing="0">
		<tr valign="top">
		<td>
			<form action="adicionarEmpresa" method="get">
				<table border="0" cellpadding="0" cellspacing="0" id="id-form" >
					<tr>
						<th valign="top">Nome:</th>
						<td><input type="text" name="nome" class="inp-form"></td>
					</tr>
					<tr><td></td><td><form:errors path="empresa.nome" cssStyle="color:red" /></td></tr>
					<tr>
						<th valign="top">Fone:</th>
						<td><input type="text" name="fone" class="inp-form"></td>
					</tr>
					<tr>
						<th valign="top">Endere�o:</th>
						<td><input type="text" name="endereco" class="inp-form"></td>
					</tr>
					<tr>
						<th valign="top">Cidade:</th>
						<td><input type="text" name="cidade" class="inp-form"></td>
					</tr>
					<tr>
						<th valign="top">Respons�vel:</th>
						<td><input type="text" name="responsavel" class="inp-form"></td>
					</tr>
					<tr>
						<th valign="top">Email:</th>
						<td><input type="text" name="email" class="inp-form"></td>
					</tr>
					<tr>
						<td></td><td><form:errors path="empresa.email" cssStyle="color:red" /></td>
					</tr>	
					<tr>
						<th>&nbsp;</th>
						<td valign="top">
							<input type="submit" value="Adicionar" class="form-submit" >
						</td>
					</tr>
				</table>
			</form>
		</td>
		</tr>
		</table>
		</div>
	</td>
	<td id="tbl-border-right"></td>
	</tr>
	<tr>
		<th class="sized bottomleft"></th>
		<td id="tbl-border-bottom">&nbsp;</td>
		<th class="sized bottomright"></th>
	</tr>
</table>

<c:import url="/util/rodape.jsp" />

</body>
</html>