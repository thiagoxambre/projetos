<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Help Desk</title>
<link rel="stylesheet" href="<c:url value="/resources/css/screen.css" />" type="text/css" media="screen" title="default" />
<!--  jquery core -->
<script src="<c:url value="/resources/js/jquery/jquery-1.4.1.min.js" />" type="text/javascript"></script>

<!-- Custom jquery scripts -->
<script src="<c:url value="/resources/js/jquery/custom_jquery.js" />" type="text/javascript"></script>

<!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->
<script src="<c:url value="/resources/js/jquery/jquery.pngFix.pack.js" />" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
$(document).pngFix( );
});
</script>
</head>
<body id="login-bg">

<div id="login-holder">

	<!-- start logo -->
	<div id="logo-login">
		<a href="index.html"><img src="<c:url value="/resources/images/shared/logo.png" />" width="156" height="40" alt="" /></a>
	</div>
	<!-- end logo -->
	
	<div class="clear"></div>
	
	<!--  start loginbox ................................................................................. -->
	<div id="loginbox">
	
	<!--  start login-inner -->
	<div id="login-inner">
	<form action="<c:url value='j_spring_security_check' />" method='POST'>
		<table border="0" cellpadding="0" cellspacing="0">
		<tr>
			<th>Login</th>
			<td><input type="text"  class="login-inp" name="j_username" /></td>
		</tr>
		<tr>
			<th>Senha</th>
			<td><input type="password" value=""  onfocus="this.value=''" class="login-inp" name="j_password" /></td>
		</tr>
		<tr><td></td></tr>
		<tr>
			<th></th>
			<td><input type="submit" class="submit-login"  /></td>
		</tr>
		</table>
	</form>
	</div>
	<c:if test="${not empty error}">
		<div id="message-red">
			<table border="0" width="100%" cellpadding="0" cellspacing="0">
				<tr>
					<td class="red-left">
						Não foi possível efetuar login. Tente novamente.<br /> Motivo :
						${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}					
					</td>
					<td class="red-right"><a class="close-red"><img src="images/table/icon_close_red.gif"   alt="" /></a></td>
				</tr>
			</table>
		</div>
	</c:if>	
 	<!--  end login-inner -->
	<div class="clear"></div>
 </div>
 <!--  end loginbox -->
</div>
<!-- End: login-holder -->

</body>
</html>