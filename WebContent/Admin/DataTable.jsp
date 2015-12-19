<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html class=" ">
<head>
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<meta charset="utf-8" />
<title>首页 | Bread</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<link rel="shortcut icon" href="assets/images/favicon.png"
	type="image/x-icon" />

<!-- CORE CSS FRAMEWORK - START -->
<link href="assets/plugins/pace/pace-theme-flash.css" rel="stylesheet"
	type="text/css" media="screen" />
<link href="assets/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets/plugins/bootstrap/css/bootstrap-theme.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets/fonts/font-awesome/css/font-awesome.css"
	rel="stylesheet" type="text/css" />
<link href="assets/css/animate.min.css" rel="stylesheet" type="text/css" />
<link href="assets/plugins/perfect-scrollbar/perfect-scrollbar.css"
	rel="stylesheet" type="text/css" />
<!-- CORE CSS FRAMEWORK - END -->

<!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - START -->
<link href="assets/plugins/datatables/css/jquery.dataTables.css"
	rel="stylesheet" type="text/css" media="screen" />
<link
	href="assets/plugins/datatables/extensions/TableTools/css/dataTables.tableTools.min.css"
	rel="stylesheet" type="text/css" media="screen" />
<link
	href="assets/plugins/datatables/extensions/Responsive/css/dataTables.responsive.css"
	rel="stylesheet" type="text/css" media="screen" />
<link
	href="assets/plugins/datatables/extensions/Responsive/bootstrap/3/dataTables.bootstrap.css"
	rel="stylesheet" type="text/css" media="screen" />
<!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END -->

<!-- CORE CSS TEMPLATE - START -->
<link href="assets/css/style.css" rel="stylesheet" type="text/css" />
<!-- CORE CSS TEMPLATE - END -->

</head>

<body class=" ">
	<!-- START 顶部菜单 -->
	<%@include file="Topbar.jsp"%>
	<!-- END 顶部菜单 -->

	<!-- START 页面 -->
	<div class="page-container row-fluid">

		<!-- 左菜单 -->
		<%@include file="LeftMenu.jsp"%>

		<!-- 右边内容 -->
		<section id="main-content" class=" ">
			<section class="wrapper main-wrapper" style=''>
				<div class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>
					<div class="page-title">
						<div class="pull-left">
							<h1 class="title">
								<s:property value="showHead" />
							</h1>
						</div>

					</div>
				</div>
				<div class="clearfix"></div>

				<div class="col-lg-12">
					<section class="box ">
						<header class="panel_header">
							<h2 class="title pull-left">
								<s:property value="showTableHead" />
							</h2>
							<div class="actions panel_actions pull-right">
								<i class="box_toggle fa fa-chevron-down"></i>
							</div>
						</header>
						<div class="content-body">
							<div class="row">
								<div class="col-md-12 col-sm-12 col-xs-12">


									<table id="DataTable"
										class="table table-striped dt-responsive display"
										cellspacing="0" width="100%">
										<thead>
											<tr>
												<s:iterator value="showHeadList" id="head">
													<th><s:property value="#head" /></th>
												</s:iterator>
											</tr>
										</thead>

										<tbody>
											<s:property value="dataString" escape="false" />
										</tbody>

									</table>

								</div>
							</div>
						</div>
					</section>
				</div>

			</section>
		</section>

		<div class="page-chatapi hideit">
			<!-- 聊天  -->
			<%@include file="Chat.jsp"%>
		</div>

		<div class="chatapi-windows "></div>
	</div>
	<!-- END CONTAINER -->
	<!-- LOAD FILES AT PAGE END FOR FASTER LOADING -->

	<!-- CORE JS FRAMEWORK - START -->
	<script src="assets/js/jquery-1.11.2.min.js" type="text/javascript"></script>
	<script src="assets/js/jquery.easing.min.js" type="text/javascript"></script>
	<script src="assets/plugins/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="assets/plugins/pace/pace.min.js" type="text/javascript"></script>
	<script src="assets/plugins/perfect-scrollbar/perfect-scrollbar.min.js"
		type="text/javascript"></script>
	<script src="assets/plugins/viewport/viewportchecker.js"
		type="text/javascript"></script>
	<!-- CORE JS FRAMEWORK - END -->

	<!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - START -->
	<script src="assets/plugins/datatables/js/jquery.dataTables.min.js"
		type="text/javascript"></script>
	<script
		src="assets/plugins/datatables/extensions/TableTools/js/dataTables.tableTools.min.js"
		type="text/javascript"></script>
	<script
		src="assets/plugins/datatables/extensions/Responsive/js/dataTables.responsive.min.js"
		type="text/javascript"></script>
	<script
		src="assets/plugins/datatables/extensions/Responsive/bootstrap/3/dataTables.bootstrap.js"
		type="text/javascript"></script>
	<!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END -->

	<!-- CORE TEMPLATE JS - START -->
	<script src="assets/js/scripts.js" type="text/javascript"></script>
	<!-- END CORE TEMPLATE JS - END -->

	<!-- Sidebar Graph - START -->
	<script src="assets/plugins/sparkline-chart/jquery.sparkline.min.js"
		type="text/javascript"></script>
	<script src="assets/js/chart-sparkline.js" type="text/javascript"></script>
	<!-- Sidebar Graph - END -->

<script type="text/javascript">
		$(".passCheck").click(function(){
			$.post("ChiefEditor_PassAdvertorial.action", {
				"id" : $(this).attr("data-id")
			}, function(data) {
				if (data.result.state == "success") {
					window.location.href = "AdminAction.action";
				} else {
					alert(data.result.message);
				}
			}, "json");
		});
		$(".rejectCheck").click(function(){
			$.post("ChiefEditor_RejectAdvertorial.action", {
				"id" : $(this).attr("data-id")
			}, function(data) {
				if (data.result.state == "success") {
					window.location.href = "AdminAction.action";
				} else {
					alert(data.result.message);
				}
			}, "json");
		});
		</script>

</body>

</html>