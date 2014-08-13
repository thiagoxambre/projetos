<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Help Desk</title>
<link rel="stylesheet" href="<c:url value="/resources/css/screen.css"/>" type="text/css" media="screen" title="default" />
<!--[if IE]>
<link rel="stylesheet" media="all" type="text/css" href="css/pro_dropline_ie.css" />
<![endif]-->

<!--  jquery core -->
<script src="<c:url value="/resources/js/jquery/jquery-1.4.1.min.js"/>" type="text/javascript"></script>

<!--  checkbox styling script -->
<script src="<c:url value="/resources/js/jquery/ui.core.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/jquery/ui.checkbox.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/jquery/jquery.bind.js"/>" type="text/javascript"></script>

<script type="text/javascript">
$(function(){
	$('input').checkBox();
	$('#toggle-all').click(function(){
 	$('#toggle-all').toggleClass('toggle-checked');
	$('#mainform input[type=checkbox]').checkBox('toggle');
	return false;
	});
});
</script>  

<![if !IE 7]>

<!--  styled select box script version 1 -->
<script src="<c:url value="/resources/js/jquery/jquery.selectbox-0.5.js"/>" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('.styledselect').selectbox({ inputClass: "selectbox_styled" });
});
</script>
 

<![endif]>

<!--  styled select box script version 2 --> 
<script src="<c:url value="/resources/js/jquery/jquery.selectbox-0.5_style_2.js"/>" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('.styledselect_form_1').selectbox({ inputClass: "styledselect_form_1" });
	$('.styledselect_form_2').selectbox({ inputClass: "styledselect_form_2" });
});
</script>

<!--  styled select box script version 3 --> 
<script src="<c:url value="/resources/js/jquery/jquery.selectbox-0.5_style_2.js"/>" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function() {
	$('.styledselect_pages').selectbox({ inputClass: "styledselect_pages" });
});
</script>

<!--  styled file upload script --> 
<script src="<c:url value="/resources/js/jquery/jquery.filestyle.js"/>" type="text/javascript"></script>
<script type="text/javascript" charset="utf-8">
  $(function() {
      $("input.file_1").filestyle({ 
          image: "images/forms/choose-file.gif",
          imageheight : 21,
          imagewidth : 78,
          width : 310
      });
  });
</script>

<!-- Custom jquery scripts -->
<script src="<c:url value="/resources/js/jquery/custom_jquery.js"/>" type="text/javascript"></script>
 
<!-- Tooltips -->
<script src="<c:url value="/resources/js/jquery/jquery.tooltip.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/jquery/jquery.dimensions.js"/>" type="text/javascript"></script>
<script type="text/javascript">
$(function() {
	$('a.info-tooltip ').tooltip({
		track: true,
		delay: 0,
		fixPNG: true, 
		showURL: false,
		showBody: " - ",
		top: -35,
		left: 5
	});
});
</script> 


<!--  date picker script -->
<link rel="stylesheet" href="<c:url value="/resources/css/datePicker.css"/>" type="text/css" />
<script src="<c:url value="/resources/js/jquery/date.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/jquery/jquery.datePicker.js"/>" type="text/javascript"></script>
<script type="text/javascript" charset="utf-8">
        $(function()
{

// initialise the "Select date" link
$('#date-pick')
	.datePicker(
		// associate the link with a date picker
		{
			createButton:false,
			startDate:'01/01/2005',
			endDate:'31/12/2020'
		}
	).bind(
		// when the link is clicked display the date picker
		'click',
		function()
		{
			updateSelects($(this).dpGetSelected()[0]);
			$(this).dpDisplay();
			return false;
		}
	).bind(
		// when a date is selected update the SELECTs
		'dateSelected',
		function(e, selectedDate, $td, state)
		{
			updateSelects(selectedDate);
		}
	).bind(
		'dpClosed',
		function(e, selected)
		{
			updateSelects(selected[0]);
		}
	);
	
var updateSelects = function (selectedDate)
{
	var selectedDate = new Date(selectedDate);
	$('#d option[value=' + selectedDate.getDate() + ']').attr('selected', 'selected');
	$('#m option[value=' + (selectedDate.getMonth()+1) + ']').attr('selected', 'selected');
	$('#y option[value=' + (selectedDate.getFullYear()) + ']').attr('selected', 'selected');
}
// listen for when the selects are changed and update the picker
$('#d, #m, #y')
	.bind(
		'change',
		function()
		{
			var d = new Date(
						$('#y').val(),
						$('#m').val()-1,
						$('#d').val()
					);
			$('#date-pick').dpSetSelected(d.asString());
		}
	);

// default the position of the selects to today
var today = new Date();
updateSelects(today.getTime());

// and update the datePicker to reflect it...
$('#d').trigger('change');
});
</script>

<!-- MUST BE THE LAST SCRIPT IN <HEAD></HEAD></HEAD> png fix -->
<script src="<c:url value="/resources/js/jquery/jquery.pngFix.pack.js"/>" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function(){
$(document).pngFix( );
});
</script>
</head>


<body> 
<!-- Start: page-top-outer -->
<div id="page-top-outer">    

<!-- Start: page-top -->
<div id="page-top">


	<!-- start logo -->
	<div id="logo">
	<a href=""><img src="<c:url value="/resources/images/shared/logo.png"/>" width="156" height="40" alt="" /></a>

	</div>
	<!-- end logo -->
	
 	<div class="clear"></div>

</div>
<!-- End: page-top -->

</div>
<!-- End: page-top-outer -->
	
<div class="clear">&nbsp;</div>
 
<!--  start nav-outer-repeat................................................................................................. START -->
<div class="nav-outer-repeat"> 
<!--  start nav-outer -->
<div class="nav-outer"> 

		<!-- start nav-right -->
		<div id="nav-right">
		
			<div class="nav-divider">&nbsp;</div>
			<div class="showhide-account"><img src="<c:url value="/resources/images/shared/nav/nav_myaccount.gif"/>" width="93" height="14" alt="" /></div>
			<div class="nav-divider">&nbsp;</div>
			<a href="<c:url value="/j_spring_security_logout" />" id="logout"><img src="<c:url value="/resources/images/shared/nav/nav_logout.gif"/>" width="64" height="14" alt="" /></a>
			<div class="clear">&nbsp;</div>
		
			<!--  start account-content -->	
			<div class="account-content">
			<div class="account-drop-inner">
				<a href="" id="acc-settings">Configurações</a>
				<div class="clear">&nbsp;</div>
				<div class="acc-line">&nbsp;</div>
				<a href="" id="acc-details">Detalhes </a>
			</div>
			</div>
			<!--  end account-content -->
		
		</div>
		<!-- end nav-right -->


		<!--  start nav -->
		<div class="nav">
		<div class="table">
		
		<ul class="${menu == 1 ? 'current' : 'select'}"><li><a href="<c:url value="/listarChamados"/>"><b>Chamados</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub ${menu == 1 ? 'show' : ''}">
			<ul class="sub">
				<li ${menu == 1 && submenu == 1 ? 'class="sub_show"' : ''}><a href="<c:url value="/listarChamados"/>">Listar Chamados</a></li>
				<c:if test="${userLogon.role.role == 'ROLE_CLIENTE'}">
					<li ${menu == 1 && submenu == 2 ? 'class="sub_show"' : ''}><a href="<c:url value="/formAbrirChamado"/>">Abrir novo Chamado</a></li>
					<li ${menu == 1 && submenu == 3 ? 'class="sub_show"' : ''}><a href="<c:url value="/meusChamados"/>">Meus Chamados</a></li>
				</c:if>		
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		
		<c:if test="${userLogon.role.role == 'ROLE_ADMIN'}">
		<div class="nav-divider">&nbsp;</div>
		                    
		<ul class="${menu == 2 ? 'current' : 'select'}"><li><a href="<c:url value="/admin/listarSistemas"/>"><b>Sistemas</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub ${menu == 2 ? 'show' : ''}">
			<ul class="sub">
				<li ${menu == 2 && submenu == 1 ? 'class="sub_show"' : ''}><a href="<c:url value="/admin/listarSistemas"/>">Listar Sistemas</a></li>
				<li ${menu == 2 && submenu == 2 ? 'class="sub_show"' : ''}><a href="<c:url value="/admin/formAdicionarSistema"/>">Adicionar Sistema</a></li>
				<li ${menu == 2 && submenu == 3 ? 'class="sub_show"' : ''}><a href="#nogo">Deletar Sistemas</a></li>
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		
		<div class="nav-divider">&nbsp;</div>
		
		<ul class="${menu == 3 ? 'current' : 'select'}"><li><a href="<c:url value="/admin/listarModulos"/>"><b>Módulos</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub ${menu == 3 ? 'show' : ''}">
			<ul class="sub">
				<li ${menu == 3 && submenu == 1 ? 'class="sub_show"' : ''}><a href="<c:url value="/admin/listarModulos"/>">Listar Módulos</a></li>
				<li ${menu == 3 && submenu == 2 ? 'class="sub_show"' : ''}><a href="<c:url value="/admin/formAdicionarModulo"/>">Adicionar Módulo</a></li>
				<li ${menu == 3 && submenu == 3 ? 'class="sub_show"' : ''}><a href="#nogo">Deletar Módulos</a></li>
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		
		<div class="nav-divider">&nbsp;</div>
		
		<ul class="${menu == 4 ? 'current' : 'select'}"><li><a href="<c:url value="/admin/listarEmpresas"/>"><b>Empresas</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub ${menu == 4 ? 'show' : ''}">
			<ul class="sub">
				<li ${menu == 4 && submenu == 1 ? 'class="sub_show"' : ''}><a href="<c:url value="/admin/listarEmpresas"/>">Listar Empresas</a></li>
				<li ${menu == 4 && submenu == 2 ? 'class="sub_show"' : ''}><a href="<c:url value="/admin/formAdicionarEmpresa"/>">Adicionar Empresa</a></li>
				<li ${menu == 4 && submenu == 3 ? 'class="sub_show"' : ''}><a href="#nogo">Deletar Empresas</a></li>
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		
		<div class="nav-divider">&nbsp;</div>
		
		<ul class="${menu == 5 ? 'current' : 'select'}"><li><a href="<c:url value="/admin/listarTipoChamados"/>"><b>Tipos de Chamados</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub ${menu == 5 ? 'show' : ''}">
			<ul class="sub">
				<li ${menu == 5 && submenu == 1 ? 'class="sub_show"' : ''}><a href="<c:url value="/admin/listarTipoChamados"/>">Listar Tipos de Chamado</a></li>
				<li ${menu == 5 && submenu == 2 ? 'class="sub_show"' : ''}><a href="<c:url value="/admin/formAdicionarTipoChamado"/>">Adicionar Tipo de Chamado</a></li>
				<li ${menu == 5 && submenu == 3 ? 'class="sub_show"' : ''}><a href="#nogo">Deletar Tipos de Chamado</a></li>
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>

		<div class="nav-divider">&nbsp;</div>
		
		<ul class="${menu == 6 ? 'current' : 'select'}"><li><a href="<c:url value="/admin/listarUsuarios"/>"><b>Usuários</b><!--[if IE 7]><!--></a><!--<![endif]-->
		<!--[if lte IE 6]><table><tr><td><![endif]-->
		<div class="select_sub ${menu == 6 ? 'show' : ''}">
			<ul class="sub">
				<li ${menu == 6 && submenu == 1 ? 'class="sub_show"' : ''}><a href="<c:url value="/admin/listarUsuarios"/>">Listar Usuários</a></li>
				<li ${menu == 6 && submenu == 2 ? 'class="sub_show"' : ''}><a href="<c:url value="/admin/formAdicionarUsuario"/>">Adicionar Usuário</a></li>
				<li ${menu == 6 && submenu == 3 ? 'class="sub_show"' : ''}><a href="#nogo">Deletar Usuários</a></li>
			</ul>
		</div>
		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
		</li>
		</ul>
		</c:if>		
		<div class="clear"></div>
		</div>
		<div class="clear"></div>
		</div>
		<!--  start nav -->

</div>
<div class="clear"></div>
<!--  start nav-outer -->
</div>
<!--  start nav-outer-repeat................................................... END -->

 <div class="clear"></div>

<!-- start content-outer ........................................................................................................................START -->
<div id="content-outer">
<!-- start content -->
<div id="content">
			<span style="float: right">
	    <a href="?lang=en_US">en</a>
	    |
	    <a href="?lang=pt_BR">pt</a>
	</span>

 