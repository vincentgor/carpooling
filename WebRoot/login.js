$(function(){
	loginState();
	init();
});

function init(){
	add_btn_summit();
}

//��½
function add_btn_summit(){
	$("#_id_btn_summit").click(function() {
		sessionStorage.setItem("me","vinxent");   //��¼�ҵ��û���
		location.href = "index.html";
		return false;
	});
}

//�ж��Ƿ��Ѿ���¼
function loginState() {
	var me = sessionStorage.getItem("me");
	
	if(me==null) {
		alert("notɨ��ɮ login!!");
	} else {
		alert("aready�㷨�� login!!");
		location.href = "index.html";
	}
}