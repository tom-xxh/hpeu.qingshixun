$(document).ready(function(){  
    //初始化宽度、高度  
    $('.main').height($(window).height());
    $(".left").height($(window).height()-100);  
    $(".right").height($(window).height()-100);  
    //当文档窗口发生改变时 触发  
    $(window).resize(function() {
    	$('.main').height($(window).height());
    	$(".left").height($(window).height()-100);  
    	$(".right").height($(window).height()-100);
    }); 
});
