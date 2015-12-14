<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="chat-wrapper">
	<h4 class="group-head">信息</h4>
	<ul class="contact-list">
		<li class="user-row" id='chat_user_1' data-user-id='1'>
			<div class="user-img">
				<a href="#"><img
					src='<%=basePath%><s:property value="#session.user.avatar"/>'
					alt="">
				</a>
			</div>
			<div class="user-info">
				<h4>
					<a href="#">好友2</a>
				</h4>
				<span class="status available" data-status="available"> 新消息</span>
			</div>
			<div class="user-status available">
				<i class="fa fa-circle"></i>
			</div></li>
		<li class="user-row" id='chat_user_2' data-user-id='2'>
			<div class="user-img">
				<a href="#"><img
					src='<%=basePath%><s:property value="#session.user.avatar"/>'
					alt="">
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
			</div></li>
	</ul>
</div>
