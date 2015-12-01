<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8">
		<title><s:property value="advertorial.getTopic()"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
		<meta http-equiv="Cache-Control" content="public">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="format-detection" content="telephone=no">
		<meta name="apple-mobile-web-app-status-bar-style" content="black" />
		<meta name="renderer" content="webkit">
		<link rel="stylesheet" href="css/style.css" type="text/css">
	</head>
<body>
	<s:property value="advertorial.topic"/><br/>
	<img src="<s:property value="advertorial.homeImage"/>"/><br/>
	<s:property value="advertorial.abstract"/><br/>
	<s:property value="advertorial.content"/>
</body>
</html>