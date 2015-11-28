<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>

<link rel="stylesheet" href="css/style.css" type="text/css">

</head>
<body>
		<div class="head-pic">
			<a href="index.jsp"><i class="closeIcon"></i></a>
			<dl><img src="img/logo.png" alt="logo" /></dl>
		</div>
		
		<form class="login" action="RegisterAction.action" method="post" onsubmit="return check();">
			<ul>
				<li>
					<input type="text" class="input ursename" name="username" placeholder="请输入用户名">
				</li>
				<li>
					<input type="password" class="input password" name="password" placeholder="请输入密码">
				</li>
				<li>
					<input type="text" class="input nickname" name="nickName" placeholder="请输入昵称">
				</li>
				<li><button type="submit" href="javascript:;" class="loginBtn" onClick="check()">注 册</button></li>
			</ul>
			<p><a href="login.jsp" class="fl">直接登录</a> <a href="password.html" class="fr">忘记密码</a></p>
		</form>
		
		<div class="tips"></div>
	</body>
	<script src="js/jquery.js"></script>
	<script>
		function check() {
			var ursename = $(".ursename").val();
			var password = $(".password").val();
			var nickname =$('.nickname').val();
			
			if (ursename =='') {
				$('.tips').show().text("用户名不能为空");closeTips();
				return false;
			}
			if (password =='') {
				$('.tips').show().text("密码不能为空！");closeTips();
				return false;
			}
			if (nickname =='') {
				$('.tips').show().text("昵称不能为空！");closeTips();
				return false;
			}
			return true;
		}
		function closeTips(){setTimeout("$('.tips').hide()",3000);}
	</script>

</html>