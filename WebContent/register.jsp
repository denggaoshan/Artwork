<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册 | Bread</title>
<link type="image/x-icon" href="img/favicon.ico" rel="shortcut icon">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="Cache-Control" content="public">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<meta name="apple-mobile-web-app-status-bar-style" content="black" />
<meta name="renderer" content="webkit">
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>
	<div class="head-pic">
		<a href="index.jsp"><i class="closeIcon"></i> </a>
		<dl>
			<img src="img/logo.png" alt="logo" />
		</dl>
	</div>
	<div class="login">
		<ul>
			<li><input type="text" class="input username" name="username"
				placeholder="请输入用户名"><span class="fl" id="verifyBtn" style="margin-top:5px;"></span>
			</li>
			<li><input type="password" class="input password"
				name="password" placeholder="请输入密码">
			</li>
			<li><input type="password" class="input repassword"
				name="repassword" placeholder="请再次输入密码">
				<span class="fl" id="reVerifyBtn" style="margin-top:5px;"></span>
			</li>
			<li><input type="text" class="input nickname" name="nickName"
				placeholder="请输入昵称">
			</li>
			<li><button class="loginBtn" onclick="check();">注 册</button></li>
		</ul>
		<p>
			<a href="login.jsp" class="fl">直接登录</a>
			<!-- <a href="password.html" class="fr">忘记密码</a> -->
		</p>
	</div>

	<div class="tips"></div>
</body>
<script src="js/jquery.js"></script>
<script>
	function check() {
		var username = $(".username").val();
		var password = $(".password").val();
		var repassword = $(".repassword").val();
		var nickname = $('.nickname').val();

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
			"username" : $(".username").val(),
			"password" : $(".password").val(),
			"nickname" : $(".nickname").val()
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
	function closeTips() {
		setTimeout("$('.tips').hide()", 3000);
	}
</script>
	<script>
		$(function() {
			$(".username").blur(function(event) {
				var username = $(".username").val();
				if (username != '') {
					$.post("RegisterAction.action", {
						"username" : $(".username").val(),
						"justCheck" : "1"
					}, function(data) {
						if (data.result.state == "success") {
							$('#verifyBtn').css("color","green");
							$('#verifyBtn').html("恭喜，账号可用！");
						} else {
							$('#verifyBtn').css("color","red");
							$('#verifyBtn').html(data.result.message);
						}
					}, "json");
				}
			});
			$(".repassword").blur(function(event) {
				var password = $(".password").val();
				var repassword = $(".repassword").val();
				if(password!=repassword){
					$('#reVerifyBtn').css("color","red");
					$('#reVerifyBtn').html("两次输入密码不同！");
				}
				else{
					$('#reVerifyBtn').html("");
				}
			});
		})
	</script>
</html>