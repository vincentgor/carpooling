
var getRequestData_POST=function (reqUrl,params,successCallback) {
    try {
        $.ajax({
                    url : reqUrl,
                    type : "POST",
                    data : params,
                    dataType : "json",
                    success:successCallback,
                    error:function(params){
                    	alert("系统出错");
                    }
                });
    } catch (e) {
        alert("get:"+e.message);
    }
};

//解析参数
function getQueryString(name) {
   var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");
   var r = window.location.search.substr(1).match(reg);
   if (r!=null) 
	   return (r[2]); 
   return null;
}

//判断登录与否
function isLogin() {

}