<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>登录 | Bread</title>
<link type="image/x-icon" href="img/favicon.ico" rel="shortcut icon">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="Cache-Control" content="public">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<meta name="apple-mobile-web-app-status-bar-style" content="black" />
<meta name="renderer" content="webkit">
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
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
				placeholder="请输入用户名">
			</li>
			<li><input type="password" class="input password"
				name="password" placeholder="请输入密码">
			</li>
			<li>
				<button class="loginBtn" onclick="check();">登 录</button>
			</li>
		</ul>
		<p>
			<a href="register.jsp" class="fl">注册账号</a> 
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
			"username" : $(".username").val(),
			"password" : $(".password").val()
		}, function(data) {
			if (data.result.state == "success") {
				$('.tips').show().text("登录成功！");closeTips();
				window.location.href = "IndexAction.action";
			} else {
				$('.tips').show().text(data.result.message);closeTips();
			}
		}, "json");

		return false;
	}
	function closeTips() {
		setTimeout("$('.tips').hide()", 3000);
	}
</script>

</html>