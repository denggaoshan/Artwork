<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- SIDEBAR - START -->
<div class="page-sidebar ">

	<!-- USER INFO - START -->
	<div class="profile-info row">
		<div class="profile-image col-md-4 col-sm-4 col-xs-4">
			<a href="ui-profile.html"> <img
				src='<%=basePath%><s:property value="#session.user.avatar"/>'
				class="img-responsive img-circle" /> </a>
		</div>

		<div class="profile-details col-md-8 col-sm-8 col-xs-8">

			<h3>
				<a href="#"> <s:property value="#session.user.nickName" /> </a>

				<!-- Available statuses: online, idle, busy, away and offline -->
				<span class="profile-status online"></span>
			</h3>

			<p class="profile-title">
				<s:property value="#session.user.account" />
			</p>

		</div>

	</div>

	<!-- MAIN MENU - START -->
	<div class="page-sidebar-wrapper" id="main-menu-wrapper">

		<ul class='wraplist'>

			<!--  采编的菜单 -->
			<s:if test='#session.userType=="Editor"'>
				<li class=""><a href="AdminAction.action"><i
						class="fa fa-dashboard"></i> <span class="title">查看软文</span> </a>
				</li>

				<li class=""><a href="Publish.jsp"><i
						class="fa fa-dashboard"></i> <span class="title">发布软文</span> </a>
				</li>
			</s:if>

			<!--  主编的菜单 -->
			<s:if test='#session.userType=="ChiefEditor"'>
				<li class=""><a href="AdminAction.action?chooseType=check"><i
						class="fa fa-dashboard"></i> <span class="title">待审核</span> </a>
				</li>

				<li class=""><a href="AdminAction.action?chooseType=checked"><i
						class="fa fa-dashboard"></i> <span class="title">已审核</span> </a>
				</li>
			</s:if>

			<!--  管理员的菜单 -->
			<s:if test='#session.userType=="Manager"'>
				<li class=""><a href="AdminAction.action?chooseType=user"><i
						class="fa fa-dashboard"></i> <span class="title">用户管理</span> </a>
				</li>
				<li class=""><a href="AdminAction.action?chooseType=artist"><i
						class="fa fa-dashboard"></i> <span class="title">艺术家管理</span> </a>
				</li>
				<li class=""><a href="AdminAction.action?chooseType=editor"><i
						class="fa fa-dashboard"></i> <span class="title">采编管理</span> </a>
				</li>
				<li class=""><a
					href="AdminAction.action?chooseType=chiefEditor"><i
						class="fa fa-dashboard"></i> <span class="title">主编管理</span> </a>
				</li>

				<li class=""><a
					href="AdminAction.action?chooseType=advertorial"><i
						class="fa fa-dashboard"></i> <span class="title">软文管理</span> </a>
				</li>
				<li class=""><a
					href="AdminAction.action?chooseType=advertisement"><i
						class="fa fa-dashboard"></i> <span class="title">广告管理</span> </a>
				</li>
				<li class=""><a href="#"><i
						class="fa fa-dashboard"></i> <span class="title">订单管理</span> </a>
				</li>
			</s:if>

		</ul>

	</div>
	<!-- MAIN MENU - END -->


</div>

<!--  SIDEBAR - END -->


