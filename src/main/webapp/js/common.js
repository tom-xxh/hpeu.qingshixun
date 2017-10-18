// 定义获取和更新时间的函数
function showTime() {
    var curTime = new Date();
    $("#clock").html(curTime.toLocaleString());
    setTimeout("showTime()", 1000);
}
// 页面加载完成后执行上面的自定义函数
$(function(){
    showTime()
})