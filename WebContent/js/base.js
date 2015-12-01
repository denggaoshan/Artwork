//foot-link
$(".foot li:eq(2)").toggle(
  function(){$('#foot-link').show();},
  function(){$('#foot-link').hide();}
)
//exhibition
$(".exhibition code,.shareIcon").toggle(
  function(){$('.ft-share').slideDown(500);},
  function(){$('.ft-share').slideUp(500);}
)
//cancelBtn
$(".cancelBtn").click(function(){
  $('.ft-share').slideUp(500);
}); 
//my-order-tab
$(function(){ 
  var curLi; 
  $(".my-order-tab li").mouseover(function(){ 
  curLi=$(this); 
  }); 
	  $(".my-order-tab li").click(function(){//鼠标点击也可以切换 
	  $(".show").removeClass("show"); 
	  $(".hide").eq($(".my-order-tab li").index(curLi)).addClass("show"); 
	  $(".onLi").removeClass("onLi"); 
	  curLi.addClass("onLi"); 
	  }); 
});
//pay
$(function(){ 
	$(".pay li").click(function(){
	  $(this).addClass("onLi").siblings().removeClass('onLi'); 	 
  }); 
})
var isShow = true;
$(".off").click(function(){
	$('.table').hide();
	if(!isShow){
	   $(this).find('p').animate({left: '+34px'}, "slow");
	   $('.hide').slideDown(500);
	  isShow = true;return false;
	}else{
	   $(this).find('p').animate({left: '0'}, "slow"); 
	   $('.hide').slideUp(500);
	  isShow = false;return false;
    }
});


$("#orrffBtnniming,#offBtn").click(function(){
	$('.table').hide();
	if(!isShow){
	   $(this).find('p').animate({left: '+34px'}, "slow");
	   $("div[name='"+$(this).attr("ds")+"']").slideDown(500);
	  isShow = true;return false;
	}else{
	   $(this).find('p').animate({left: '0'}, "slow"); 
	   $("div[name='"+$(this).attr("ds")+"']").slideUp(500);
	  isShow = false;return false;
    }
});	
