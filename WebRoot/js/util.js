
var getRequestData_POST=function (reqUrl,params,successCallback) {
    try {
        $.ajax({
                    url : reqUrl,
                    type : "POST",
                    data : params,
                    dataType : "json",
                    success:successCallback,
                    error:function(params){
                    	alert("ϵͳ����");
                    }
                });
    } catch (e) {
        alert("get:"+e.message);
    }
};

//��������
function getQueryString(name) {
   var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");
   var r = window.location.search.substr(1).match(reg);
   if (r!=null) 
	   return (r[2]); 
   return null;
}

//�жϵ�¼���
function isLogin() {

}