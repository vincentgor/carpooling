$(function(){
	loginState();
	init();
});

function init(){
	add_btn_summit();
}

//登陆
function add_btn_summit(){
	$("#_id_btn_summit").click(function() {
		sessionStorage.setItem("me","vinxent");   //记录我的用户名
		location.href = "index.html";
		return false;
	});
}

//判断是否已经登录
function loginState() {
	var me = sessionStorage.getItem("me");
	
	if(me==null) {
		alert("not扫地僧 login!!");
	} else {
		alert("aready算法是 login!!");
		location.href = "index.html";
	}
}