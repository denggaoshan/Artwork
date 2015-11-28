<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>艺术品交易网</title>
 
<link rel="stylesheet" href="jsp/css/style.css" type="text/css">
</head>
<body class="bg">

<section class="head-search">
  <ul>
      <i class="logo"></i>
      <input type="text" class="search-input inputIcon fl" name="keyword" style="margin-left:70px" placeholder="搜索艺术家/艺术品">
      
      <code style="border-radius:0px;top:15px;font-size:15px">
        		<a href="jsp/login.jsp">登录</a>
        	</code>    
  </ul>
</section>
<!--head-search end-->


<section class="adpic">

    <div class="banner">
      <div style="overflow:hidden" id="wrapper">
         <div id="scroller" style="width: 2560px; transform: translate(0px, 0px) scale(1);">
            <ul id="thelist">

            <li><a href="http://www.hihey.com/event-599.html"><img src="http://www.hihey.com/data/afficheimg/1448327486336528385.jpg" alt=""/></a></li><li><a href="http://www.hihey.com/yun"><img src="http://www.hihey.com/data/afficheimg/1448326236834753606.jpg" alt=""/></a></li><li><a href="http://www.hihey.com/star.php?id=105"><img src="http://www.hihey.com/data/afficheimg/1447210173364437055.jpg" alt=""/></a></li>            
            </ul>
        </div>
      </div>
      <div id="nav">
            <div onclick="myScroll.scrollToPage('prev', 0,400,3);return false" id="prev">← prev</div>
            <ul id="indicator">
                 <li class="active">1</li><li class="">2</li><li class="">3</li>          </ul>
            <div onclick="myScroll.scrollToPage('next', 0);return false" id="next">next →</div>
      </div>
      <div class="clr"></div>
  </div>

</section>

<!--adpic end-->
<section class="home-pm">
	<dl>
	   <dt><a href="Index/paimailist.html">拍卖</a></dt>
	   <a href='Index/collection/id/599.html'>
		   <dd style="font-weight:bold"> 油画 </dd>
		   <dd style="color:#999">2015年11月25日 01:00</dd>
	   </a>
	  </dl>  <p><a href='Index/news.html'>HIHEY推出¥299云艺术</a></p>
</section>
<!--home-pm end-->
<section class="artist">
 <ul>
  <p><a href="Index/artistlist.html">艺术家</a></p>
    <li>
    	<div class="swiper-container banners-container">
          <div class="swiper-wrapper" style="margin-left:15px;">
          	<div class="swiper-slide" style="width:85px;">
                  <dl><a href="Index/artist/id/2905.html"><dt><img src="http://www.hihey.com/data/brandlogo/1447983375146388493.jpg" alt=""/></dt><dd>郎世宁</dd></a></dl>
              </div><div class="swiper-slide" style="width:85px;">
                  <dl><a href="Index/artist/id/1974.html"><dt><img src="http://www.hihey.com/data/brandlogo/1361743675378319949.jpg" alt=""/></dt><dd>安迪·沃霍尔</dd></a></dl>
              </div><div class="swiper-slide" style="width:85px;">
                  <dl><a href="Index/artist/id/2907.html"><dt><img src="http://www.hihey.com/data/brandlogo/1447983692980923048.jpg" alt=""/></dt><dd>唐寅</dd></a></dl>
              </div><div class="swiper-slide" style="width:85px;">
                  <dl><a href="Index/artist/id/691.html"><dt><img src="http://www.hihey.com/data/brandlogo/1363905175837582158.jpg" alt=""/></dt><dd>周春芽</dd></a></dl>
              </div><div class="swiper-slide" style="width:85px;">
                  <dl><a href="Index/artist/id/473.html"><dt><img src="http://www.hihey.com/data/brandlogo/1361990788851954363.jpg" alt=""/></dt><dd>蔡志松</dd></a></dl>
              </div>          </div>
      </div>
    </li>
 </ul>
</section>
<!--artist end-->
<section class="choice">
  <h2><a href="Index/goodchoice.html">精选</a></h2>
  <div id="container" class="pt50">
    <ul class="col">
        
    </ul>
    <ul class="col" style="margin-right:0"></ul>
    <a href="javascript:" class="loadMeinvMOre" id="loadMeinvMOre">加载更多</a>
</div>
<!--container end of-->
</section>
<!--choice end-->
<div class="div-height"> </div>
<!--<下载条>-->
<div class="loadingpc">
    <code style="border-radius:20px;top:100px;font-size:30px">
        <span id="close" class="close" onclick="$('.loadingpc').hide();">×</span>
    </code>
    <p><img src="Public/img/loadingtiao.png" width="100%" href="javascript:;" onclick="loadingtiao();"/></p>
</div>

<!--下载条 end-->


<footer class="foot">
   <ul>
  <li><a onclick="toHistory();"><i class="ftGoBack"></i></a></li>
    <li><a href="Index/search.html"><i class="ftSearch"></i></a></li>
    <li><a onclick="caidan();" href="javascript:void(0);"><i class="ftLogo"></i></a>
      <dl id="foot-link">
            <i></i>
          <dd><a onclick="paimai();" href="javascript:void(0);">拍卖</a></dd>
            <dd><a onclick="yishupin();" href="javascript:void(0);">艺术品</a></dd>
            <dd><a onclick="artist();" href="javascript:void(0);">艺术家</a></dd>
            <dd><a onclick="exhibition();" href="javascript:void(0);">展览</a></dd>
        </dl>
    </a>
    <li><a href="Index/artorder.html"><i class="ftHeart"></i></a></li>
    <li>
    	    <code style="border-radius:0px;margin:25px auto 0;font-size:15px">
        <a href="Index/login.html"><img src="Public/img/denglu.png" alt=""/> </a>
      </code>    </li>  
  </ul>
</footer>
<script>
	function paimai()
	{
		window.location.href="/Index/paimailist";
		$('#foot-link').hide();
	}
	function yishupin()
	{
		window.location.href="/Index/goodchoice";
		$('#foot-link').hide();
	}
	function artist()
	{
		window.location.href="/Index/artistlist";
		$('#foot-link').hide();
	}
	function exhibition()
	{
		window.location.href="/Index/show";
		$('#foot-link').hide();
	}
	function caidan()
	{
		$('#foot-link').show();
	}
</script>

<script type="text/javascript">
	var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");
	document.write(unescape("%3Cspan style='display:none;' id='cnzz_stat_icon_30053482'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "w.cnzz.com/c.php%3Fid%3D30053482%26l%3D3' type='text/javascript'%3E%3C/script%3E"));
</script>
<script>

	function toHistory(){

		var homeUrl="http://123.57.1.95/";
		var curUrl = window.location.href;
		if(curUrl == homeUrl){
			return;
		}else{
			history.go(-1);
		}

	}


</script>


<div id="peimaihtml" style="display:none">
{"ads":[{"id":"901","image":"http:\/\/www.hihey.com\/data\/afficheimg\/1448327486336528385.jpg","url":"http:\/\/www.hihey.com\/event-599.html"},{"id":"891","image":"http:\/\/www.hihey.com\/data\/afficheimg\/1448326236834753606.jpg","url":"http:\/\/www.hihey.com\/yun"},{"id":"890","image":"http:\/\/www.hihey.com\/data\/afficheimg\/1447210173364437055.jpg","url":"http:\/\/www.hihey.com\/star.php?id=105"}],"ads_num":"3","artist":[{"id":"2905","name":"\u90ce\u4e16\u5b81","image":"http:\/\/www.hihey.com\/data\/brandlogo\/1447983375146388493.jpg"},{"id":"1974","name":"\u5b89\u8fea\u00b7\u6c83\u970d\u5c14","image":"http:\/\/www.hihey.com\/data\/brandlogo\/1361743675378319949.jpg"},{"id":"2907","name":"\u5510\u5bc5","image":"http:\/\/www.hihey.com\/data\/brandlogo\/1447983692980923048.jpg"},{"id":"691","name":"\u5468\u6625\u82bd","image":"http:\/\/www.hihey.com\/data\/brandlogo\/1363905175837582158.jpg"},{"id":"473","name":"\u8521\u5fd7\u677e","image":"http:\/\/www.hihey.com\/data\/brandlogo\/1361990788851954363.jpg"},{"id":"439","name":"\u6751\u4e0a\u9686","image":"http:\/\/www.hihey.com\/data\/brandlogo\/1351802665287089400.jpg"},{"id":"200","name":"\u5434\u51a0\u4e2d","image":"http:\/\/www.hihey.com\/data\/brandlogo\/1442526207338833947.jpg"},{"id":"3065","name":"\u674e\u6d25","image":"http:\/\/www.hihey.com\/data\/brandlogo\/1396568730996734798.jpg"}],"artist_num":"8","event":[{"event_id":"599","event_name":"\u6cb9\u753b","start_time":"1448427600","end_time":"1448438400","user_rank":"0,1,2,4","image":"http:\/\/www.hihey.com\/data\/event\/1448327397762760828.jpg"}],"event_num":"1","eventf":[{"event_id":"599","event_name":"\u6cb9\u753b","start_time":"1448427600","end_time":"1448438400"}],"eventf_num":"1","new_articles":[{"article_id":"524","title":"HIHEY\u63a8\u51fa\u00a5299\u4e91\u827a\u672f","add_time":"1448363910"},{"article_id":"523","title":"HIHEY\u4e0e\u5ae3\u7136\u5929\u4f7f\u57fa\u91d1\u4e3e\u529e\u6148\u5584\u4e49\u62cd\uff0c\u7b79\u5f97\u5584\u6b3e587000\u5143","add_time":"1447151521"},{"article_id":"522","title":"HIHEY\u5fa1\u5929\u6210\u4e94\u661f\u9152\u5e97\u827a\u672f\u8ba1\u5212\u9996\u5c55\u5728\u6b66\u6c49\u5149\u8c37\u5e0c\u5c14\u987f\u5f00\u5e55","add_time":"1443151067"},{"article_id":"521","title":"\u827a\u672f\u7535\u5546HIHEY\u63a8\u51fa\u201c\u4e8b\u4e1a\u5408\u4f19\u4eba\u201d\u5e03\u5c40\u5168\u56fd\u4e92\u8054\u7f51\uff0b\u827a\u672f\u6218\u7565","add_time":"1441027353"},{"article_id":"519","title":"\u4f60\u4e0e\u827a\u672f\u53ea\u6709\u4e00\u4e2a\u6307\u5c16\u7684\u8ddd\u79bbHIHEY\u79fb\u52a8\u7aef\u5168\u9762\u4e0a\u7ebf","add_time":"1438839592"}],"new_articles_num":"5","today_shows":[{"topic_id":"131","title":"HIHEY\u4e91\u827a\u672f","start_time":"1447293600","end_time":"1449842400"},{"topic_id":"122","title":"\u5fa1\u89c1HIHEY\u6b66\u6c49\u5149\u8c37\u5e0c\u5c14\u987f\u827a\u672f\u5c55","start_time":"1442800800","end_time":"1451570400"}],"today_shows_num":"2","fullscreen_num":"4","fullscreen_imgs":["http:\/\/www.hihey.com\/api2\/img\/813-1.jpg","http:\/\/www.hihey.com\/api2\/img\/813-2.jpg","http:\/\/www.hihey.com\/api2\/img\/813-3.jpg","http:\/\/www.hihey.com\/api2\/img\/813-4.jpg"],"fullscreen_ts":"1439464750","dev_rhw":"178","ser_rhw":"178","new_auction_num":"0","new_auctions":[],"arts":[{"id":"20436","name":"\u5982\u679c\u68b5\u9ad8\u6709\u5973\u513f\uff0c\u6211\u60f3\u732e\u7ed9\u5979","image":"http:\/\/www.hihey.com\/images\/201511\/goods_img\/20436_G_1447139803726.jpg","price":"40000.00","artist":"\u4e54\u76f8\u4f1f","artist_image":"http:\/\/www.hihey.com\/data\/brandlogo\/1447176761439291476.jpg","imgwid":"334","imghei":"448"},{"id":"18292","name":"\u98ce\u548c\u65e5\u4e3d","image":"http:\/\/www.hihey.com\/images\/201506\/goods_img\/18292_G_1434078461675.jpg","price":"46000.00","artist":"\u8521\u4e3d\u8d24","artist_image":"http:\/\/www.hihey.com\/data\/brandlogo\/1423002105292596363.jpg","imgwid":"541","imghei":"448"},{"id":"17253","name":"\u84dd\u8272\u94bb\u6c99\u978bFS II257","image":"http:\/\/www.hihey.com\/images\/201504\/goods_img\/17253_G_1428607617334.png","price":"0.00","artist":"\u5b89\u8fea\u00b7\u6c83\u970d\u5c14","artist_image":"http:\/\/www.hihey.com\/data\/brandlogo\/1361743675378319949.jpg","imgwid":"560","imghei":"376"},{"id":"18078","name":"\u9ad8\u8ddf\u978b","image":"http:\/\/www.hihey.com\/images\/201505\/goods_img\/18078_G_1432527093240.jpg","price":"0.00","artist":"\u674e\u9f99\u98de","artist_image":"http:\/\/www.hihey.com\/data\/brandlogo\/1446424116677531037.jpg","imgwid":"361","imghei":"448"},{"id":"17929","name":"Red Shoes","image":"http:\/\/www.hihey.com\/images\/201505\/goods_img\/17929_G_1431484406225.jpg","price":"3000.00","artist":"\u738b\u5143\u5143","artist_image":"","imgwid":"560","imghei":"432"},{"id":"19300","name":"White Shoes","image":"http:\/\/www.hihey.com\/images\/201508\/goods_img\/19300_G_1439169934475.jpg","price":"2500.00","artist":"\u738b\u5143\u5143","artist_image":"","imgwid":"448","imghei":"448"},{"id":"140","name":"\u8868\u6f14\u4e4b\u540e","image":"http:\/\/www.hihey.com\/images\/201104\/goods_img\/140_G_1303096117676.jpg","price":"60000.00","artist":"\u5f20\u4e1a\u5174","artist_image":"http:\/\/www.hihey.com\/data\/brandlogo\/1352087422890114202.jpg","imgwid":"560","imghei":"416"},{"id":"12997","name":"\u6c89\u00b7\u6d6e\u4e4b\u4e8c","image":"http:\/\/www.hihey.com\/images\/201406\/thumb_img\/12997_thumb_P_1402960376222.jpg","price":"3000.00","artist":"\u674e\u6b23\u82b8","artist_image":"","imgwid":"223","imghei":"448"},{"id":"10750","name":"\u8fce\u5ba2\u677e\u4e0e\u978b","image":"http:\/\/www.hihey.com\/images\/201402\/goods_img\/10750_G_1393204341752.jpg","price":"12000.00","artist":"\u725b\u7267\u9752","artist_image":"","imgwid":"507","imghei":"448"},{"id":"13442","name":"\u97f3\u4e50\u8282\u6447\u6eda10","image":"http:\/\/www.hihey.com\/images\/201407\/goods_img\/13442_G_1404848776238.jpg","price":"0.00","artist":"\u590f\u6653\u4eae","artist_image":"http:\/\/www.hihey.com\/data\/brandlogo\/1409170035720109156.jpg","imgwid":"446","imghei":"448"}],"count":"1413","page":"1","page_size":"10","new_version":"2.3.1","new_app_url_ios":"http:\/\/itunes.apple.com\/cn\/app\/id933584640?l=zh&ls=1&mt=8"}</div>
</body>
<script  src="Public/js/jquery.js"> </script>
<script src="Public/js/base.js"></script>
<script src="Public/js/dragmin.js"></script>
<script src="Public/js/idangerous.swiper-2.0.min.js"></script>
<script src="Public/js/idangerous.swiper.3dflow-2.0.js"></script>
<script>
$(function(){
	$('.thumbs-cotnainer,.banners-container').each(function(){
		$(this).swiper({
			slidesPerView:'auto',
			offsetPxBefore:0,
			offsetPxAfter:0,
			calculateHeight: true
		})
	})
})
</script>
<script>
$(function(){
  //url data function dataType
  function loadMeinv() {
    var data = 0;
   
        var datass= eval("("+$("#peimaihtml").html()+")")
       
        for(var d in datass["arts"]){
           html = '<li><div><a href="/Index/workdetails/id/'+datass["arts"][d]['id']+'"><img src ='+datass["arts"][d]['image']+'></a></div><div class="water_user pdp4"><dl><dt>'
              + '<dt>'+datass["arts"][d]['artist']+'</dt><dd>'+datass["arts"][d]['name']+'</dd><dd>￥'+parseInt(datass["arts"][d]['price'])+'</dd></</li>';
              minUl = getMinUl();
              minUl.append(html);
        }

      
    
  }

  loadMeinv();
  //无限加载
  /*$(window).on("scroll", function() {
    $minUl = getMinUl();
    if ($minUl.height() <= $(window).scrollTop() + $(window).height()) {
      //当最短的ul的高度比窗口滚出去的高度+浏览器高度大时加载新图片
      loadMeinv();//加载新图片
    }
  })*/
  function getMinUl() {//每次获取最短的ul,将图片放到其后
    var arrUl = $("#container .col");
    var minUl = arrUl.eq(0);
    arrUl.each(function(index, elem) {
      if ($(elem).height() < minUl.height()) {
        minUl = $(elem);
      }
    });
    return minUl;
  }
  var pages=1;
  //点击更多加载
  $("#loadMeinvMOre").click(function() {
      pages=pages+1;
      $.get("/Ajax/moreajaxindex",{"page":pages},function(data){
          $("#peimaihtml").html(data);
           minUl = getMinUl();
           loadMeinv();
      })

   
  });
})
</script>

<script>
 var myScroll;
 function loaded(){myScroll = new iScroll('wrapper',{
    snap: true,momentum: false,hScrollbar: false,
    onScrollEnd: function(){document.querySelector('#indicator > li.active').className = '';document.querySelector('#indicator > li:nth-child(' + (this.currPageX+1) + ')').className = 'active';}
 });
}
document.addEventListener('DOMContentLoaded', loaded, false);
var count = document.getElementById("thelist").getElementsByTagName("img").length;  
  for(i=0;i<count;i++){document.getElementById("thelist").getElementsByTagName("img").item(i).style.cssText = " width:"+document.body.clientWidth+"px";}
  document.getElementById("scroller").style.cssText = " width:"+document.body.clientWidth*count+"px";
  setInterval(function(){myScroll.scrollToPage('next', 0,400,count);},3500);
  window.onresize = function(){ 
  for(i=0;i<count;i++){document.getElementById("thelist").getElementsByTagName("img").item(i).style.cssText = " width:"+document.body.clientWidth+"px";}
   document.getElementById("scroller").style.cssText = " width:"+document.body.clientWidth*count+"px";
} 
</script>
<script>

$(function(){
  $("input[name='keyword']").keyup(function(event){
      console.info('ddd');
        if(event.keyCode == 13){
           window.location.href="/Index/search?keyword="+$(this).val();
        }
    });
})

</script>

<!--<loading>-->
<script>
    var browser={
        versions:function(){
            var u = navigator.userAgent, app = navigator.appVersion;
            return {         //移动终端浏览器版本信息
                trident: u.indexOf('Trident') > -1, //IE内核
                presto: u.indexOf('Presto') > -1, //opera内核
                webKit: u.indexOf('AppleWebKit') > -1, //苹果、谷歌内核
                gecko: u.indexOf('Gecko') > -1 && u.indexOf('KHTML') == -1, //火狐内核
                mobile: !!u.match(/AppleWebKit.*Mobile.*/), //是否为移动终端
                ios: !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/), //ios终端
                android: u.indexOf('Android') > -1 || u.indexOf('Linux') > -1, //android终端或uc浏览器
                iPhone: u.indexOf('iPhone') > -1 , //是否为iPhone或者QQHD浏览器
                iPad: u.indexOf('iPad') > -1, //是否iPad
                webApp: u.indexOf('Safari') == -1 //是否web应该程序，没有头部与底部
            };
        }(),
        language:(navigator.browserLanguage || navigator.language).toLowerCase()
    }
    function loadingtiao()
    {
      if (browser.versions.ios || browser.versions.iPhone || browser.versions.iPad ){
          window.location.href="https://itunes.apple.com/cn/app/hihey/id933584640?mt=8";
      }
        else{
          window.location.href="http://a.app.qq.com/o/simple.jsp?pkgname=mobi.hihey";
      }
    }
//    document.writeln("语言版本: "+browser.language);
//    document.writeln(" 是否为移动终端: "+browser.versions.mobile);
//    document.writeln(" ios终端: "+browser.versions.ios);
//    document.writeln(" android终端: "+browser.versions.android);
//    document.writeln(" 是否为iPhone: "+browser.versions.iPhone);
////    document.writeln(" 是否iPad: "+browser.versions.iPad);
//    document.writeln(navigator.userAgent);
</script>
</html>