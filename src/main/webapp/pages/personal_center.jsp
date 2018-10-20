<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>账户信息</title>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>

<link rel="stylesheet" type="text/css"
	href="${cpath }/css/personal_center.css">
<link rel="stylesheet" type="text/css" href="${cpath }/css/head.css" />

	<script type="text/javascript" src="${cpath }/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="${cpath }/easyui/jquery.easyui.min.js"></script>
	<link rel="stylesheet" href="${cpath }/easyui/themes/icon.css" type="text/css" />
	

<style type="text/css">
#topd {
	height: 200px;
}

.basecontent {
	color: red;
}

#topcontainer {
	background-color: red;
}

</style>



</head>
<body>
	<div class="easyui-layout" data-options="fit:true">


		<!-- 页面上部-->
		<div data-options="region:'north',split:true" style="height: 150px">
			<div>
				<img id="headImg" src="${cpath }/images/personicon.png"
					style="float: left; margin-right: 20px" />
				<h5 class="basecontent">用户名: <span>${user.name } </span></h5>
				<h5 class="basecontent">最后登录时间：${user.lastLoginTime }</h5>
				<a href="${cpath }/user/recharge_interface.jsp?userId=${user.userId}" class="easyui-linkbutton" >账户充值</a>
				<a href="#" class="easyui-linkbutton">账户提现</a>
				<input type="hidden" value="${user.userId}" id="loginuserId"/>
			</div>

		</div>

		<!-- 页面中部-->
		<div data-options="region:'center',split:true" style="height: 50px;">
			<div>
				<ul style="list-style-type: none;">
					<li style="float: left; margin: 10px 0; width: 250px">
						账户总额:
						<span style="color: #337ab7; padding-left: 10px" id="totalAccount">元</span>
					</li>
					
					<li style="float: left; margin: 10px 0; width: 250px">
						可用金额:
						<span style="color: #337ab7; padding-left: 10px" id="usableAmount"></span>
					</li>
					
					<li style="float: left; margin: 10px 0; width: 250px">
						冻结金额:
						<span style="color: #337ab7; padding-left: 10px" id="blockAccount"></span>
					</li>
					
					<li style="float: left; margin: 10px 0; width: 250px">
						代收利息:
						<span style="color: #337ab7; padding-left: 10px" id="unReceiveInterest"></span>
					</li>
					
					<li style="float: left; margin: 10px 0; width: 250px">
						代收本金:
						<span style="color: #337ab7; padding-left: 10px" id="receivePrincipal"></span>
					</li>
					
					<li style="float: left; margin: 10px 0; width: 250px">
						代还本息:
						<span style="color: #337ab7; padding-left: 10px" id="toReturnToThePrincipalAndInterest"></span>
					</li>
				</ul>
			</div>

		</div>
		<!-- 页面南部-->
		<div data-options="region:'south',split:true" style="height: 400px;">

			<ul style="list-style-type: none; margin: 30px auto">
			
				<!-- 实名认证 -->		
				<li
					style="width: 300px; height: 150px; float: left; margin-left: 20px;">
					<img src="${cpath }/images/renzhengicon.png"
					style="float: left; margin-top: 5px; margin-right: 10px" />
					<div style="margin-top: 0px;">
						<strong>实名认证</strong> </br> <span>已认证
						<a href="${pageContext.request.contextPath}/backstage/pass.jsp"
							style="padding-left: 10px;color: #337ab7;">查看</a></span>
					</div>
					<p style="clear: both">实名认证之后才能在平台投资</p>
				</li>
				
				<!-- 手机认证 -->
				<li
					style="width: 300px; height: 150px; float: left; margin-left: 20px;">
					<img src="${cpath }/images/phonecheckicon.png"
					style="float: left; margin-top: 5px; margin-right: 10px" />
					<div style="margin-top: 0px;">
						<strong>手机认证</strong> </br> <span>已认证<a href="#"
							style="padding-left: 10px;color: #337ab7;">查看</a></span>
					</div>
					<p style="clear: both">可以收到系统操作信息,并增加使用安全性</p>
				</li>
				
				<!-- 邮箱认证 -->
				<li
					style="width: 300px; height: 150px; float: left; margin-left: 20px;">
					<img src="${cpath }/images/emailcheckicon.png"
					style="float: left; margin-top: 5px; margin-right: 10px" />
					<div style="margin-top: 0px;">
						<strong>邮箱认证</strong> </br> <span>已认证<a href="${cpath }/user/verifying_mailbox.jsp"
							style="padding-left: 10px;color: #337ab7;">查看</a></span>
					</div>
					<p style="clear: both">您可以设置邮箱来接收信息</p>
				</li>
				
				<!-- vip会员 -->
				<li
					style="width: 300px; height: 150px; float: left; margin-left: 20px;">
					<img src="${cpath }/images/vipicon.png"
					style="float: left; margin-top: 5px; margin-right: 10px" />
					<div style="margin-top: 0px;">
						<strong>vip会员</strong> </br> <span>已认证<a href="#"
							style="padding-left: 10px;color: #337ab7;">查看</a></span>
					</div>
					<p style="clear: both">vip会员,让你更快捷地投资</p>
				</li>


			</ul>

		</div>

	</div>

<script type="text/javascript">
 

$(function(){
	
	console.log("加载shu");
	var userId = $("#loginuserId").val();

	$.ajax({
		url: "${cpath}/account/getAccountInfo?userId="+userId,
		dataType:'json',
		type:'get',
		success:function(data){
			//{success:true, message: 操作失败}
			console.log(data.status+"===>rtn.msg");
			if(data.status==1){
				console.log("查询成功");
				var accountInfo = data.data;
				$("#totalAccount").html(accountInfo.totalAccount+"元");
				$("#usableAmount").html(accountInfo.usableAmount+"元");
				$("#receivePrincipal").html(accountInfo.receivePrincipal+"元");
				$("#toReturnToThePrincipalAndInterest").html(accountInfo.toReturnToThePrincipalAndInterest+"元");
				$("#unReceiveInterest").html(accountInfo.unReceiveInterest+"元");
				$("#blockAccount").html(accountInfo.blockAccount+"元");
				
			}else{
				$.messager.alert('提示',"操作失败");
			}
			
		},
		error:function(data){
			alert("操作失败");
		}
	}); 
});   

</script>
</body>

</html>