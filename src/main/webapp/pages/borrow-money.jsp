<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ include file="/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"  href="${cpath }/css/borrow-money.css">
<style>
	.panel-header{
		background:#f5f5f5;
	}
	.mida{
		text-align: center;
	}
	
</style>
<title>我要借款</title>
</head>
<body>
	<div style="margin: 50px 50px">
		<div class="creditloan">
			<div class="easyui-panel" title="信用贷" style="width: 240px;height: 260px;padding: 10px;">
				<p class="ptitle">认证后可借金额 ￥200</p>
				<h5 class="hcondition hpd">申请条件</h5>
				<p class="paddress">仅限广州地区</p>
				<ul class="borrowul">
					<li><a href="${cpath }/user/userInfo.jsp">填写基本资料</a></li>
					<li><a class="hcondition" href="${cpath }/backstage/realname_authentication.jsp">身份认证</a></li>
					<li><a class="hcondition">资料认证分数达到30分</a></li><br/>
				</ul>
				<div class="mida">
					<a class="easyui-linkbutton mida" href="${cpath }/backstage/loanApplication.jsp">申请贷款</a>
				</div>
				
			</div>
		</div>
		
		<div class="carloan">
			<div class="easyui-panel" title="车易贷" style="width: 240px;height: 260px;padding: 10px;">
				<p class="ptitle">认证后可借金额 ￥200</p>
				<h5 class="hcondition hpd">申请条件</h5>
				<p class="paddress">仅限广州地区</p>
				<ul class="borrowul">
					<li><a href="${cpath }/user/userInfo.jsp">填写基本资料</a></li>
					<li><a class="hcondition" href="${cpath }/backstage/realname_authentication.jsp">身份认证</a></li>
					<li><a class="hcondition">资料认证分数达到30分</a></li><br/>
				</ul>
				<div class="mida">
					<a class="easyui-linkbutton " href="${cpath }/backstage/loanApplication.jsp">申请贷款</a>
				</div>
			</div>
		</div>
		
		<div class="carloan">
			<div class="easyui-panel" title="房易贷" style="width: 240px;height: 260px;padding: 10px;">
				<p class="ptitle">认证后可借金额 ￥200</p>
				<h5 class="hcondition hpd">申请条件</h5>
				<p class="paddress">仅限广州地区</p>
				<ul class="borrowul">
					<li><a href="${cpath }/user/userInfo.jsp">填写基本资料</a></li>
					<li><a class="hcondition" href="${cpath }/backstage/realname_authentication.jsp">身份认证</a></li>
					<li><a class="hcondition">资料认证分数达到30分</a></li><br/>
					
				</ul>
				<div class="mida">
						<a class="easyui-linkbutton" href="${cpath }/backstage/loanApplication.jsp">申请贷款</a>
				</div>
			</div>
		</div>
		
	</div>
</body>
</html>