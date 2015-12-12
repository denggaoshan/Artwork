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
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no, minimal-ui">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<link type="image/x-icon" href="img/favicon.ico" rel="shortcut icon">
<title>首页 | Bread</title>
<link rel="stylesheet" href="css/framework7.ios.min.css">
<link rel="stylesheet" href="css/framework7.ios.colors.min.css">
<link rel="stylesheet" href="css/kitchen-sink.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/swipebox.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<!-- Status bar overlay for full screen mode (PhoneGap) -->
	<div class="statusbar-overlay"></div>
	<!-- Left panel with reveal effect-->
	<!-- Panels overlay-->
	<div class="panel-overlay"></div>
	<div class="panel panel-left panel-reveal">
		<div class="content-block">
			<div class="list-menu">
				<div class="list-group">
					<nav>
						<ul>
							<li class="divider">菜单</li>
							<li><a class="item-link close-panel item-content"
								href="dashbord.html">
									<div class="item-media">
										<i class="fa fa-home"></i>
									</div>
									<div class="item-inner">
										<div class="item-title">个人中心</div>
										<div class="item-after"></div>
									</div> </a>
							</li>
							<li><a
								class="item-link close-panel item-content close-popup open-login-screen"
								href="#">
									<div class="item-media">
										<i class="fa fa-sign-in"></i>
									</div>
									<div class="item-inner">
										<div class="item-title">登录</div>
										<div class="item-after"></div>
									</div> </a>
							</li>
							<li><a data-popup=".popup-register"
								class="item-link close-panel item-content open-popup" href="#">
									<div class="item-media">
										<i class="fa fa-user-plus"></i>
									</div>
									<div class="item-inner">
										<div class="item-title">注册</div>
										<div class="item-after"></div>
									</div> </a>
							</li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!-- menu end -->
	<div class="login-screen">
		<div class="view">
			<div class="page">
				<div class="page-content login-screen-content registerbody">
					<div class="register-content">
						<a href="#" class="close-login-screen floatright"><i
							class="fa fa-times"></i> </a>
						<h3>
							<img src="img/logo2.png" alt="">
						</h3>
						<div>
							<div class="inputbox">
								<span>手机号：</span><br> <input class="loginusername"
									type="text" name="loginusername" placeholder="请输入手机号">
							</div>
							<div class="inputbox">
								<span>密码：</span><br> <input class="loginpassword"
									type="password" name="password" placeholder="请输入密码">
							</div>
							<div class="inputbox">
								<button onclick="loginCheck();" class="button button-big">登录</button>
							</div>
						</div>
						<p>
							没有账号？<a data-popup=".popup-register" class="open-popup" href="#">注册</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- resister popup start-->
	<div class="popup popup-register">
		<div class="registerbody">
			<a href="#" class="close-popup closebutton"><i
				class="fa fa-times"></i> </a>
			<div class="register-content">
				<h3>
					<img src="img/logo2.png" alt="">
				</h3>
				<div>
					<div class="inputbox">
						<span>手机号：</span><br> <input class="registerusername"
							type="text" name="registerusername" placeholder="请输入手机号">
						<span class="fl" id="verifyBtn" style="margin-top:5px;"></span>
					</div>
					<div class="inputbox">
						<span>密码：</span><br> <input class="registerpassword"
							type="password" name="registerpassword" placeholder="请输入密码">
					</div>
					<div class="inputbox">
						<span>再次输入密码：</span><br> <input class="registerrepassword"
							type="password" name="registerrepassword" placeholder="请再次输入密码">
						<span class="fl" id="reVerifyBtn" style="margin-top:5px;"></span>
					</div>
					<div class="inputbox">
						<span>昵称：</span><br> <input class="registernickname"
							type="text" name="registernickname" placeholder="请输入昵称">
					</div>
					<div class="inputbox">
						<button onclick="registerCheck();" class="button button-big">注册</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- resister popup start-->
	<!-- Views -->
	<div class="views">
		<!-- Your main view, should have "view-main" class -->
		<div class="view view-main">
			<!-- Top Navbar-->
			<div class="navbar">
				<div class="navbar-inner">
					<!-- We need cool sliding animation on title element, so we have additional "sliding" class -->
					<div class="left">
						<!-- left link contains only icon - additional "icon-only" class-->
						<a href="#" class="link icon-only open-panel"> <i
							class="fa fa-list-ul" style="font-size:22px;color:#5ca7ba;"></i>
						</a>
					</div>
					<div class="center sliding">
						<img src="img/logo.png" alt="">
					</div>
					<div class="right">
						<!-- Right link contains only icon - additional "icon-only" class-->
						<a href="#" data-popover=".popover-links"
							class="link open-popover clickopen"> <i class="fa fa-user"
							style="font-size:22px;color:#5ca7ba;"></i> </a>
					</div>
				</div>
			</div>
			<div class="popover popover-links">
				<div class="popover-angle"></div>
				<div class="popover-inner">
					<div class="list-block">
						<ul>
							<li><a href="dashbord.html"
								class="list-button item-link clickopen">用户中心</a></li>
							<li><a href="#" class="list-button item-link clickopen">登出</a></li>
						</ul>
					</div>
				</div>
			</div>
			<!-- Pages container, because we use fixed-through navbar and toolbar, it has additional appropriate classes-->
			<div class="pages navbar-through toolbar-through">

				<!-- Page, "data-page" contains page name -->
				<div data-page="index" class="page">
					<!-- Scrollable page content -->
					<div class="page-content">
						<!-- Link to another page -->
						<div class="list-block">
							<!-- slider area start-->
							<div class="slider-area">
								<div class="ks-slider-custom">
									<div data-pagination=".swiper-pagination"
										data-space-between="0" data-next-button=".swiper-button-next"
										data-prev-button=".swiper-button-prev"
										data-pagination-clickable="true"
										class="swiper-container swiper-init">
										<div class="swiper-pagination"></div>
										<div class="swiper-wrapper">
										<!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!! 这里是banner -->
									
										<s:iterator value="advertisementList">
											<div style="background-image:url(<s:property value="homeImage"/>)"
												class="swiper-slide">
												<div class="slide-text">
													<p><s:property value="title"/></p>
													<h2>**</h2>
													<a href="#">查看详情</a>
												</div>
											</div>
										</s:iterator>
										
										</div>
									</div>
								</div>
							</div>
							<!-- shop discover area start-->
							<div class="features-product">
								<div class="section-heading">
									<h3>精彩资讯</h3>
								</div>
								<div class="clear"></div>
								<div class="ks-slider-custom">
									<div data-space-between="0"
										data-next-button=".swiper-button-next"
										data-prev-button=".swiper-button-prev"
										class="swiper-container2 swiper-init">
										<div class="swiper-wrapper">
										<!-- !!!!!!!!!!!!!! 软文 -->
										<s:iterator value="advertorialList">
										
											<div class="swiper-slide">
												<div class="single-project">
													<div class="product-img">
														<a href="#"><img src="<s:property value="homeImage"/>" alt="" /> </a> 
														<span>Top</span>
													</div>
													<div class="product-content">
														<h2 class="product-name">
															<a href="#"><s:property value="title"/></a>
														</h2>
														<div class="price-box">
															<span class="new-price"><s:property value="editor.nickName"/></span> <span
																class="old-price">日期</span>
														</div>
													</div>
												</div>
											</div>
										</s:iterator>
											
										</div>
									</div>
								</div>
							</div>
							<div class="corporate-area">
								<div class="footer-icon">
									<p>Copyright 2015. All rights reserved.</p>
									<!-- <a href="#"><i class="fa fa-facebook"></i> </a> <a href="#"><i
										class="fa fa-twitter"></i> </a> <a href="#"><i
										class="fa fa-linkedin"></i> </a> <a href="#"><i
										class="fa fa-google-plus"></i> </a>-->
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- Bottom Toolbar-->
		</div>
	</div>
	<div class="tips"></div>
	<!-- Path to Framework7 Library JS-->
	<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="js/framework7.min.js"></script>
	<!-- Path to your app js-->
	<script type="text/javascript" src="js/jquery.swipebox.js"></script>
	<script type="text/javascript" src="js/my-app.js"></script>
	<script type="text/javascript">
		function loginCheck() {
			var username = $(".loginusername").val();
			var password = $(".loginpassword").val();
			if (username == '') {
				$('.tips').show().text("用户名不能为空！");
				closeTips();
				return false;
			}
			if (password == '') {
				$('.tips').show().text("密码不能为空！");
				closeTips();
				return false;
			}

			$.post("LoginAction.action", {
				"username" : $(".loginusername").val(),
				"password" : $(".loginpassword").val()
			}, function(data) {
				if (data.result.state == "success") {
					$('.tips').show().text("登录成功！");
					closeTips();
					window.location.href = "IndexAction.action";
				} else {
					$('.tips').show().text(data.result.message);
					closeTips();
				}
			}, "json");

			return false;
		}
		function closeTips() {
			setTimeout("$('.tips').hide()", 3000);
		}

		$(function() {
			$(".registerusername").blur(function(event) {
				var username = $(".registerusername").val();
				if (username != '') {
					$.post("RegisterAction.action", {
						"username" : $(".registerusername").val(),
						"justCheck" : "1"
					}, function(data) {
						if (data.result.state == "success") {
							$('#verifyBtn').css("color", "green");
							$('#verifyBtn').html("恭喜，账号可用！");
						} else {
							$('#verifyBtn').css("color", "red");
							$('#verifyBtn').html(data.result.message);
						}
					}, "json");
				}
			});
			$(".registerrepassword").blur(function(event) {
				var password = $(".registerpassword").val();
				var repassword = $(".registerrepassword").val();
				if (password != repassword) {
					$('#reVerifyBtn').css("color", "red");
					$('#reVerifyBtn').html("两次输入密码不同！");
				} else {
					$('#reVerifyBtn').html("");
				}
			});
		})

		function registerCheck() {
			var username = $(".registerusername").val();
			var password = $(".registerpassword").val();
			var repassword = $(".registerrepassword").val();
			var nickname = $('.registernickname').val();

			if (username == '') {
				$('.tips').show().text("用户名不能为空");
				closeTips();
				return false;
			}
			if (password == '') {
				$('.tips').show().text("密码不能为空！");
				closeTips();
				return false;
			}
			if (password != repassword) {
				$('.tips').show().text("两次输入密码不同！");
				closeTips();
				return false;
			}
			if (nickname == '') {
				$('.tips').show().text("昵称不能为空！");
				closeTips();
				return false;
			}

			$.post("RegisterAction.action", {
				"username" : $(".registerusername").val(),
				"password" : $(".registerpassword").val(),
				"nickname" : $(".registernickname").val(),
				"justCheck" : "0"
			}, function(data) {
				if (data.result.state == "success") {
					$('.tips').show().text("注册成功！");
					closeTips();
					window.location.href = "IndexAction.action";
				} else {
					$('.tips').show().text(data.result.message);
					closeTips();
				}
			}, "json");

			return false;
		}
	</script>
</body>
</html>
