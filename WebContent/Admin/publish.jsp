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
<title>发布软文</title>
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
<link
	href="assets/plugins/bootstrap3-wysihtml5/css/bootstrap3-wysihtml5.min.css"
	rel="stylesheet" type="text/css" media="screen" />
<link href="assets/plugins/daterangepicker/css/daterangepicker-bs3.css"
	rel="stylesheet" type="text/css" media="screen" />
<!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END -->

<!-- CORE CSS TEMPLATE - START -->
<link href="assets/css/style.css" rel="stylesheet" type="text/css" />
<!-- CORE CSS TEMPLATE - END -->

</head>

<body class=" ">

	<!-- START TOPBAR -->
	<div class='page-topbar '>
		<div class='logo-area'></div>
		<div class='quick-area'>
			<div class='pull-left'>
				<ul class="info-menu left-links list-inline list-unstyled">
					<li class="sidebar-toggle-wrap"><a href="#"
						data-toggle="sidebar" class="sidebar_toggle"> <i
							class="fa fa-bars"></i> </a>
					</li>
					<li class="message-toggle-wrapper"><a href="#"
						data-toggle="dropdown" class="toggle"> <i
							class="fa fa-envelope"></i> <span class="badge badge-primary">7</span>
					</a>
						<ul class="dropdown-menu messages animated fadeIn">
							<li class="list">
								<ul class="dropdown-menu-list list-unstyled ps-scrollbar">
									<li class="unread status-available"><a href="javascript:;">
											<div class="user-img">
												<img src="assets/images/defaultAvatar.png" alt="user-image"
													class="img-circle img-inline">
											</div>
											<div>
												<span class="name"> <strong>通知名</strong> <span
													class="time small">通知时间</span> <span
													class="profile-status available pull-right"></span> </span> <span
													class="desc small"> 通知内容 </span>
											</div> </a>
									</li>
								</ul>
							</li>
							<li class="external"><a href="javascript:;"> <span>查看所有通知</span>
							</a>
							</li>
						</ul>
					</li>
					<li class="hidden-sm hidden-xs searchform">
						<div class="input-group">
							<span class="input-group-addon input-focus"> <i
								class="fa fa-search"></i> </span>
							<form action="search.html" method="post">
								<input type="text" class="form-control animated fadeIn"
									placeholder="搜索"> <input type='submit' value="">
							</form>
						</div>
					</li>
				</ul>
			</div>
			<div class='pull-right'>
				<ul class="info-menu right-links list-inline list-unstyled">
					<li class="profile"><a href="#" data-toggle="dropdown"
						class="toggle"> <img src="assets/images/defaultAvatar.png"
							alt="user-image" class="img-circle img-inline"> <span>用户名&nbsp;<i
								class="fa fa-angle-down"></i> </span> </a>
						<ul class="dropdown-menu profile animated fadeIn">
							<li><a href="#help"> <i class="fa fa-info"></i> 帮助 </a>
							</li>
							<li class="last"><a href="ui-login.html"> <i
									class="fa fa-lock"></i> 登出 </a>
							</li>
						</ul>
					</li>
					<li class="chat-toggle-wrapper"><a href="#"
						data-toggle="chatbar" class="toggle_chat"> <i
							class="fa fa-comments"></i> <span class="badge badge-warning">9</span>
							<i class="fa fa-times"></i> </a>
					</li>
				</ul>
			</div>
		</div>

	</div>
	<!-- END TOPBAR -->
	<!-- START CONTAINER -->
	<div class="page-container row-fluid">

		<%@include file="LeftMenu.jsp"%>

		<!-- START CONTENT -->
		<section id="main-content" class=" ">
			<section class="wrapper main-wrapper" style=''>
				<div class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>
					<div class="page-title">
						<div class="pull-left">
							<h1 class="title">添加软文</h1>
						</div>

					</div>
				</div>

				<div class="clearfix"></div>

				<div class="col-lg-12">
					<section class="box ">
						<header class="panel_header">
							<h2 class="title pull-left">软文信息</h2>
							<div class="actions panel_actions pull-right">
								<i class="box_toggle fa fa-chevron-down"></i>
							</div>
						</header>
						<div class="content-body">
							<div class="row">
								<div class="col-md-12 col-sm-12 col-xs-12">


									<div class="form-group">
										<label class="form-label" for="title">标题</label> <span
											class="desc">不能超过20个字</span>
										<div class="controls">
											<input value="采编软文测试" type="text" class="form-control"
												id="title" />
										</div>
									</div>

									<div class="form-group">
										<label class="form-label" for="topic">摘要</label> <span
											class="desc">不能超过50个字</span>
										<div class="controls">
											<input value="这是一个摘要。" type="text" class="form-control"
												id="topic">
										</div>
									</div>

									<div class="form-group">
										<label class="form-label" for="homeImage">封面图片</label> <span
											class="desc"> 例 “”</span>
										<div class="controls">
											<input
												value="http://86bizhi.manmankan.com/bizhipic/201502/5222/1_1280x800.jpg"
												type="text" class="form-control" id="homeImage">
										</div>
									</div>

									<div class="form-group">
										<label class="form-label" for="position">位置</label> <span
											class="desc"> 例 "1"：表示主页广告</span>
										<div class="controls">
											<input value="1" type="text" class="form-control"
												id="position">
										</div>
									</div>

									<div class="form-group">
										<label class="form-label" for="daterange">上线时间</label>
										<div class="controls">
											<input type="text" id="daterange"
												class="form-control daterange">
										</div>
									</div>

								</div>
							</div>
						</div>
					</section>
					<section class="box ">
						<header class="panel_header">
							<h2 class="title pull-left">软文内容</h2>
							<div class="actions panel_actions pull-right">
								<i class="box_toggle fa fa-chevron-down"></i>
							</div>
						</header>
						<div class="content-body">
							<div class="row">
								<div class="col-md-12 col-sm-12 col-xs-12">

									<div class="form-group">
										<textarea value="这是一个简单的内容。" id="content"
											class="bootstrap-wysihtml5-textarea" placeholder="输入内容"
											style="width: 100%; height: 250px; font-size: 14px; line-height: 23px;padding:15px;"></textarea>
									</div>
									<div class="form-group">
										<button onclick="publish();" type="button"
											class="btn btn-primary ">提交申请</button>
									</div>
								</div>
							</div>
						</div>
					</section>
				</div>

			</section>
		</section>
		<!-- END CONTENT -->
		<div class="page-chatapi hideit">

			<div class="search-bar">
				<input type="text" placeholder="Search" class="form-control">
			</div>

			<div class="chat-wrapper">
				<h4 class="group-head">信息</h4>
				<ul class="contact-list">
					<li class="user-row" id='chat_user_1' data-user-id='1'>
						<div class="user-img">
							<a href="#"><img src="assets/images/defaultAvatar.png" alt="">
							</a>
						</div>
						<div class="user-info">
							<h4>
								<a href="#">好友2</a>
							</h4>
							<span class="status available" data-status="available">
								新消息</span>
						</div>
						<div class="user-status available">
							<i class="fa fa-circle"></i>
						</div>
					</li>
					<li class="user-row" id='chat_user_2' data-user-id='2'>
						<div class="user-img">
							<a href="#"><img src="assets/images/defaultAvatar.png" alt="">
							</a>
						</div>
						<div class="user-info">
							<h4>
								<a href="#">好友2</a>
							</h4>
							<span class="status away" data-status="away"> 无新消息</span>
						</div>
						<div class="user-status offline">
							<i class="fa fa-circle"></i>
						</div>
					</li>
				</ul>
			</div>

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
	<script
		src="assets/plugins/inputmask/min/jquery.inputmask.bundle.min.js"
		type="text/javascript"></script>
	<script src="assets/plugins/autonumeric/autoNumeric-min.js"
		type="text/javascript"></script>
	<script
		src="assets/plugins/bootstrap3-wysihtml5/js/bootstrap3-wysihtml5.all.min.js"
		type="text/javascript"></script>
	<script src="assets/plugins/ckeditor/ckeditor.js"
		type="text/javascript"></script>
	<script src="assets/plugins/daterangepicker/js/moment.min.js"
		type="text/javascript"></script>
	<script src="assets/plugins/daterangepicker/js/daterangepicker.js"
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
		function publish() {
			var time = $("#daterange").val().split(' ~ ');
			$.post("Editor_AddAdvertorial.action", {
				"homeImg" : $("#homeImage").val(),
				"begin" : time[0],
				"end" : time[1],
				"position" : $("#position").val(),
				"title" : $("#title").val(),
				"topic" : $("#topic").val(),
				"content" : $("#content").val()
			}, function(data) {
				if (data.result.state == "success") {
					window.location.href = "AdminAction.action";
				} else {
					alert(data.result.message);
				}
			}, "json");

			return false;
		}

		$("#daterange").daterangepicker({});
	</script>
</body>

</html>

