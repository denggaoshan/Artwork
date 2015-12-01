<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8">
		<title>个人主页 | <s:property value="#session.user.nickName"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
		<meta http-equiv="Cache-Control" content="public">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="format-detection" content="telephone=no">
		<meta name="apple-mobile-web-app-status-bar-style" content="black" />
		<meta name="renderer" content="webkit">
		<link rel="stylesheet" href="css/style.css" type="text/css">
	</head>
<body>

	昵称<s:property value="#session.user.nickName"/><br/>
	头像<img src="<s:property value="#session.user.avatar"/>"/><br/>
	
	<s:form action="addCommodity.jsp">
		<button type="submit">添加商品</button>
	</s:form>
	
</body>
</html>