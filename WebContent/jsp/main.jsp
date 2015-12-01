<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta charset="utf-8">
		<title>面包艺术网</title>
		<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
		<meta http-equiv="Cache-Control" content="public">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="format-detection" content="telephone=no">
		<meta name="apple-mobile-web-app-status-bar-style" content="black" />
		<meta name="renderer" content="webkit">
		<link rel="stylesheet" href="css/style.css" type="text/css">
	</head>
<body class="bg">
		<a href="ImageUploadForm.jsp">点我</a>
		<section class="head-search">
			<ul>
				<i class="logo"></i>
				<!-- onclick="goSearch();" -->
				<input type="text" class="search-input inputIcon fl" name="keyword" style="margin-left:70px" placeholder="搜索艺术家/艺术品">
				<!-- <cite class="searchBtn" onclick="goSearch();"></cite> -->
				<code style="border-radius:0px;top:15px;font-size:15px">
        		<a href="login.jsp">登录</a>
        	</code>
			</ul>
		</section>
		<!--head-search end-->

		<section class="adpic">
			<div class="banner">
				<div style="overflow:hidden" id="wrapper">
					<div id="scroller" style="width: 2560px; transform: translate(0px, 0px) scale(1);">
						<ul id="thelist">
							<li>
								<a href="#"><img src="http://www.hihey.com/data/afficheimg/1448589272547429802.jpg" alt="" /></a>
							</li>
							<li>
								<a href="#"><img src="http://www.hihey.com/data/afficheimg/1448326236834753606.jpg" alt="" /></a>
							</li>
							<li>
								<a href="#"><img src="http://www.hihey.com/data/afficheimg/1447210173364437055.jpg" alt="" /></a>
							</li>
						</ul>
					</div>
				</div>
				<div class="clr"></div>
			</div>
		</section>

		<!--home-pm end-->
		<section class="artist">
			<ul>
				<p><a href="Index/artistlist.html">艺术家</a></p>
				<li>
					<div class="swiper-container banners-container">
						<div class="swiper-wrapper" style="margin-left:15px;">
						
						<s:iterator value="artistList">
  								<div class="swiper-slide" style="width:85px;">
								<dl>
								<a href="Index/artist/id/2905.html">
								<dt>
								<img src="<s:property value="avatar"/>" alt=""/>
								</dt>
								<dd>
								<s:property value="nickName"/>
								</dd></a></dl>
								</div>
						</s:iterator>
							
						</div>
					</div>
				</li>
			</ul>
		</section>
		<!--artist end-->
		<section class="choice">
			<h2><a href="Index/goodchoice.html">精选</a></h2>
			<div id="container" class="pt50">
				
				
				<ul class="col">
					<s:iterator value="advertorialListLeft">
					
					<li>
					 <s:a href="AdvertorialAction.action?id=%{guid}">
					
					<div>
					<img src="<s:property value="homeImage"/>"/>
					
					</div>
					<div class="water_user pdp4">
					<dl><dt></dt><dt><s:property value="topic"/></dt>
					<dd><s:property value="userByAuthorGuid.username"/></dd>
					<dd><s:property value="createdOn"/></dd></dl>
					</div>
					
					 </s:a>
					</li>
					</s:iterator>
					
				</ul>
				<ul class="col" style="margin-right:0">
				<s:iterator value="advertorialListRight">
					<li><div>
					
					<s:a href="AdvertorialAction.action?id=%{guid}">
					
					<img src="<s:property value="homeImage"/>"/>
					</div>
					<div class="water_user pdp4">
					<dl><dt></dt><dt><s:property value="topic"/></dt>
					<dd><s:property value="userByAuthorGuid.username"/></dd>
					<dd><s:property value="createdOn"/></dd></dl></div>
					</s:a>
					</li>
					</s:iterator>
				</ul>
				<a href="javascript:" class="loadMeinvMOre" id="loadMeinvMOre">加载更多</a>
			</div>
			<!--container end of-->
		</section>
		<!--choice end-->
		<div class="div-height"> </div>
	</body>
	<script src="js/jquery.js">
	</script>
	<script src="js/base.js"></script>
	<script src="js/dragmin.js"></script>
	<script src="js/idangerous.swiper-2.0.min.js"></script>
	<script src="js/idangerous.swiper.3dflow-2.0.js"></script>
	<script>
		$(function() {
			$('.thumbs-cotnainer,.banners-container').each(function() {
				$(this).swiper({
					slidesPerView: 'auto',
					offsetPxBefore: 0,
					offsetPxAfter: 0,
					calculateHeight: true
				})
			})
		})
	</script>
	<script>
		$(function() {
			var pages = 1;
			//点击更多加载
			$("#loadMeinvMOre").click(function() {
				pages = pages + 1;
			});
		})
	</script>

	<script>
		var myScroll;

		function loaded() {
			myScroll = new iScroll('wrapper', {
				snap: true,
				momentum: false,
				hScrollbar: false
			});
		}
		document.addEventListener('DOMContentLoaded', loaded, false);
		var count = document.getElementById("thelist").getElementsByTagName("img").length;
		for (i = 0; i < count; i++) {
			document.getElementById("thelist").getElementsByTagName("img").item(i).style.cssText = " width:" + document.body.clientWidth + "px";
		}
		document.getElementById("scroller").style.cssText = " width:" + document.body.clientWidth * count + "px";
		setInterval(function() {
			myScroll.scrollToPage('next', 0, 400, count);
		}, 3500);
		window.onresize = function() {
			for (i = 0; i < count; i++) {
				document.getElementById("thelist").getElementsByTagName("img").item(i).style.cssText = " width:" + document.body.clientWidth + "px";
			}
			document.getElementById("scroller").style.cssText = " width:" + document.body.clientWidth * count + "px";
		}
	</script>
	<script>
		$(function() {
			$("input[name='keyword']").keyup(function(event) {
				console.info('ddd');
				if (event.keyCode == 13) {
					window.location.href = "/Index/search?keyword=" + $(this).val();
				}
			});
		})
	</script>
</html>