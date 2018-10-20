<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<link rel="stylesheet" type="text/css"
	href="${cpath }/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="${cpath }/easyui/themes/icon.css" />

<!-- 需要先导入jquery的文件，再导入easyUI文件 -->
<script type="text/javascript" src="${cpath }/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${cpath }/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${cpath }/easyui/jquery.easyui.min.js"></script>
<link rel="stylesheet" href="${cpath }/easyui/themes/icon.css" type="text/css" />
<%-- <script type="text/javascript" src="${cpath }/easyui/locale/easyui-lang-zh_CN.js"></script> --%>
<script type="text/javascript">


/* //适合弹框用(正则表达式)
 $.extend($.fn.textbox.defaults.rules, {
    equals: {    
        validator: function(value,param){    
            return value == $(param[0]).val();    
        },    
        message: 'Field do not match.'   
    },  
    onlyNum:{
        validator:function(value,param){
            var reg = /^\d+$/g;
            return reg.test(value);
        },
        message:  '只能输入数字！'
    }
}); */


/* =============================== */
 
 
 
//验证用户
$(function() {
	$("input", $("#name").next("span")).blur(function() {
		var name = $("input[name=name]").val();
		if (name == null | name == "") {
			//alert("用户名不能为空"); 
			 $("#admin").text("用户名不能为空");
		} else {
			//正则表达式
			var reg = /^[a-zA-Z][a-zA-Z0-9_]{4,15}$/;
			if(!reg.test(name)){
				
				//alert("name:"+name);
				$("#admin").text("格式不符合"); 
			}else{
				
			$.ajax({
				url:"${cpath}/checkNameRegister",
				data:"name="+name,
				dataType:"text",
				method:"post",
				success:function(data){
					//alert(name+"name");
					//alert("data:"+data);
					if(data=="√"){
						$("#admin").text("用户名可用√");
						//alert("用户名可用");
					}else{
						$("#admin").text("用户名已注册×");
					}
				},
				error:function(data){
					alert("请求服务失败");
				}
			});  
		}
			}
		});
	
	
		//验证密码
		$("input", $("#password").next("span")).blur(function() {
			var pwd = $("input[name=password]").val();
			if (pwd == null | pwd == "") {
				/* alert("用户名不能为空"); */
				$("#adminpwd").text("  ×");
			} else {
				//密码正则，6到18位（字母，数字，下划线）
				/* var pw = /^[a-zA-Z]w{5,17}$/; */
				var pw = /^[a-zA-Z]([_a-zA-Z0-9]{6,18})$/;
				//var pw = /^[A-Za-z][0-9]{4,18}$/;
				console.log("pwd: "+pwd);
				if(!pw.test(pwd)){
					console.log("密码格式不正确");
					$("#adminpwd").text("密码格式不符合");
				}else{
					console.log("密码格式正确");
					$("#adminpwd").text("  √");
				}
			}
		});
		/* 
		//手机号码验证
		$("input",$("#number").next("span")).blur(function(){
			var num = $("input[name=number]").val();
			if(num == null | num == ""){
				$("#number2").text("	×");
			}else{
				var numb = /^1[3|4|5|7|8][0-9]{9}$/;
				alert("numb---->"+numb);
				if(!numb.test(number)){
					$("#number2").text("格式不符合×");
				}else{
					$("#number2").text("	√");
				}
			}
		}); */
		
		//验证码
		$("input", $("#validate").next("span")).blur(function() {
			/* alert("--------->"); */
			//获取用户输入的验证码
			var code = $("input[name=image]").val();
			if(code==null | code==""){
				$("#adminvalidateCode").text("验证码不能为空×");
				
			}else{
				
			//一般验证用户输入的验证码会采用Ajax验证
			$.post("${cpath}/checkVerifyCode", "verifyCode=" + code, function(data) {
			/* alert("code--->"+code);
			alert("data--->"+data); */
				if(data=="√"){
					$("#adminvalidateCode").text("输入正确√");
				}else{
					$("#adminvalidateCode").text("验证码输入错误×");
				}
				
			});
			}
		});
	});
 				/* ==================以上代码同一个方法里面===================== */ 
	//验证确认密码
	$(function() {
		$("input", $("#password2").next("span")).blur(function() {
			var pwd = $("input[name=password]").val();
			/* alert("pwd--->"+pwd); */
			var pwd2 = $("input[name=password2]").val();
			/* alert("pwd2"+pwd2) */
			if (pwd2 == null | pwd2 == "") {
				$("#adminpwd2").text("确认密码不能为空×");
			} else {
				if (pwd != pwd2) {
					$("#adminpwd2").text("密码不匹配×");
				} else {
					$("#adminpwd2").text("密码相同  √");
				}

			}

		});
	});

 				
	//清空
	$(function() {
		//用户
		$("input", $("#name").next("span")).click(function() {
			$("#admin").html("");
		});
		//密码
		$("input", $("#password").next("span")).click(function() {
			$("#adminpwd").html("");
		});
		//确认密码
		$("input", $("#password2").next("span")).click(function() {
			$("#adminpwd2").html("");
		});
		//验证码
		$("input",$("#validate").next("span")).click(function(){
			$("#adminvalidateCode").html("");
		});
	});
		
	//验证码
	function yzma() {
		//获取用户输入的验证码
		alert("------>");
		var code = $("input[name=image]").val();
		//一般验证用户输入的验证码会采用Ajax验证
		$.post("checkVerifyCode", "verifyCode=" + code, function(data) {
			alert("data--->"+data);
			
		});
	}
	//刷新验证码图片
	function reflushImg() {
		var src = $("#imgcode").attr("src");
		//时间戳
		$("#imgcode").attr("src", src + "?time=" + new Date().getTime());
		return false;
	}
	
	
</script>
<style type="text/css">
	a:LINK{
		text-decoration: none;
		color: #2fa8ee;
	}
	a:HOVER {
		color:blue;
	}
/* 	a:VISITED {
		color: #2fa8ee;
	} */
	
	#sbtn{
		background-image: url("images/ebtnbg.png");
		color:#ffffff;
	}
  	#veryfcodetd{
		position:relative;
		width:320px;
	}  

	 #imgcode{
		left: 180px;
	 	bottom: 0px;
	 	position: absolute;
	} 
	
	#adminvalidateCode{
		left:330px;
		position: absolute;
	}
	
/* 	#imgcode{
		left:0px;
	 	top: -50px;
	 	position: positve;
	} */
 	#crefimg{
		left: 250px;
	 	bottom: 10px;
	 	position: absolute;
	} 
/* 		#crefimg{
		left: 100px;
	 	bottom: 10px;
	 	position: positve;
	} */
}
</style>

<script type="text/javascript">

function yzma(){
	//判断用户输入的验证码是否正确
	//获取用户输入的验证码
	var code = $("input[name=image]").val();
	//一般验证用户输入的验证码会采用Ajax验证
		 $.post("checkVerifyCode","verifyCode="+code,function(data){
			/* alert(data); */
		}); 
	}
//刷新验证码图片
function reflushImg(){
	var src = $("#imgcode").attr("src");
	//时间戳
	$("#imgcode").attr("src",src+"?time="+new Date().getTime());
	return false;
}
</script>
<style type="text/css">
	a:LINK{
		text-decoration: none;
		color: #2fa8ee;
	}
	a:HOVER {
		color:blue;
	}
/* 	a:VISITED {
		color: #2fa8ee;
	} */
	
	#sbtn{
		background-image: url("images/ebtnbg.png");
		color:#ffffff;
	}
	#veryfcodetd{
		position: relative;
	}
	#imgcode{
		right: -70px;
	 	bottom: 0px;
	 	position: absolute;
	}
	#crefimg{
		right: -130px;
	 	bottom: 10px;
	 	position: absolute;
	}
}
</style>
<!-- <script type="text/javascript">
function check() {
	$(".error").text("");
	var bool = true;
	
	 //验证用户名
	if(!$(":text[name=cname]").val()) {                     
		$("#cnameError").text("客户名称不能为空");
		bool = false;
	}
	
	 //验证密码
	if($("#password")){
		$("#genderError").text("客户性别不能为空");
		bool = false;
	}
	
	 //验证确认密码
	if(!$(":text[name=cellphone]").val()) {
		$("#cellphoneError").text("手机不能为空");
		bool = false;
	}
	
	 //验证验证码
	if(!$(":text[name=email]").val()) {
		$("#emailError").text("email不能为空");
		bool = false;
	}
	
	 //验证手机
	var p=document.getElementById("phone");
	 		p=p.value;
	 		if(p.length!=11){
	 			$("phoneError").text("");
				bool = false;
	}
	
	 //验证短信验证码
	if(!$(":text[name=email]").val()) {
		$("#emailError").text("email不能为空");
		bool = false;
	}
	
	 //验证推荐码
	if(!$(":text[name=email]").val()) {
		$("#emailError").text("email不能为空");
		bool = false;
	}
	
	if(bool) {
		$("form").submit();
	}
}
</script>
 -->
	<style type="text/css">
		.a{text-align:right;}
		.c {text-align: center;}
		.error{color:red;	}
	</style>
	<script>
		function submitForm() {
			console.log("提交注册表单");
			$('#ff').form('submit');
		}
	</script>
</head>

<body style="text-align: center; margin: 0 auto">
	<h3>填写注册信息</h3>

	<!-- <div style="text-align: center;background-color: red"> -->
	<div style="margin: 0 auto; width: 800px">
		<div class="easyui-panel" title="注册" style="width: 780px;">
<!-- 	<div style="margin: 0 auto; width: 500px">
		<div class="easyui-panel" title="注册" style="width: 500px;"> -->
			<div style="padding: 10px 60px 20px 60px">
			
				<form id="ff" method="post" action="${cpath }/register">
					<table cellpadding="5">
						<tr>
							<td class="a">用户名</td>
							<td>
							<input id="name"  class="easyui-textbox" type="text" name="name"  data-options="prompt:'字母开头，允许5-16字节，允许字母数字下划线'" validType="checkLongitude" value="${param.name }"/>
							<span style="color: red;font-size: 15px" id="admin" >${message }</span></td>
						</tr>
						<tr>
							<td  class="a">密码</td>
							<td><input id="password" class="easyui-textbox" type="text" name="password"  value="${param.password }" data-options="prompt:'以字母开头，长度在6-18之间，只能包含字符、数字和下划线'"/>
							<span style="color: red;font-size: 15px" id="adminpwd" >${pwdmessage }</span></td>
						</tr>
						<tr>
							<td  class="a">确认密码</td>
							<!-- data-options="prompt:'以字母开头，长度在6-18之间，只能包含字符、数字和下划线'" -->
							<td><input id="password2" class="easyui-textbox" type="text" name="password2"   value="${param.password2 }" data-options="prompt:'以字母开头，长度在6-18之间，只能包含字符、数字和下划线'"/>
							<span style="color: red;font-size: 15px;" id="adminpwd2" >${repwdmessage }</span>
							</td>
						</tr>
						<tr>
							<td  class="a">验证码</td>
							<td id="veryfcodetd">
								 <input id="validate"  class="easyui-textbox" type="text" name="image" value="${param.validateCode}"/>
								 <img id="imgcode" name="image" title="点击图片刷新" src="getVerifyCode" onclick="reflushImg()"/>
									 <!-- <br/> -->
									 <a id="crefimg" href="#" onclick="reflushImg()">点击刷新</a> 
									 <span style="color: red;font-size: 15px;width: 150px" id="adminvalidateCode" >${validateCodemessage }</span>
									<!--title="点击图片刷新" src="getVerifyCode" onclick="reflushImg()"  -->
							</td>
						

						</tr>
						<tr>
							<td  class="a">手机号码</td>
							<td><input id="number" class="easyui-textbox" name="number" data-options="prompt:'以数字1开头，长度为11，第2位只能用3、4、5、7、8，第三位开始任意数字'"  type="text" name="phone" ></input>
							<span style="color: red;font-size: 15px;" id="number2" >${repwdmessage }</span>
							</td>
						</tr>
						<tr>
							<td  class="a">手机验证码</td>
							<td><input class="easyui-textbox" type="text" name="PhoneValidate" ></input></td>
						</tr>
						<tr>
							<td  class="a">推荐码</td>
							<td><input class="easyui-textbox" type="text" name="RecommendCode" ></input></td>
						</tr>
						<tr>

							<td colspan="2" class="c"><a href="#" >《鸿学金信网站服务协议》</a></td>

						</tr>
					</table>
				</form>
				<div style="text-align: center; padding: 5px">
					<a id="sbtn" href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()" style="background-color: #2fa8ee">同意协议并注册</a> 
				</div>
			</div>
		</div>
	</div>
	


</body>
</html>