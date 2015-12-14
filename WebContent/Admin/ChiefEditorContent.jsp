<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 主编 -->
<section id="main-content" class=" ">
	<section class="wrapper main-wrapper" style=''>
		<div class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>
			<div class="page-title">
				<div class="pull-left">
					<h1 class="title">管理</h1>
				</div>

			</div>
		</div>
		<div class="clearfix"></div>


		<!-- 显示软文-->
		<s:if test='#session.showTableType=="Advertorial"'>
			<%@include file="AdvertorialTable.jsp"%>
		</s:if>

		<!-- 显示广告-->
		<s:if test='#session.showTableType=="Advertisement"'>
			<%@include file="AdvertisementTable.jsp"%>
		</s:if>

	</section>
</section>
