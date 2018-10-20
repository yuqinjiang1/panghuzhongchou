<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<link rel="stylesheet" type="text/css"
	href="${cpath }/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="${cpath }/easyui/themes/icon.css" />
<!-- 需要先导入jquery的文件，再导入easyUI文件 -->
<script type="text/javascript" src="${cpath }/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${cpath }/easyui/jquery.easyui.min.js"></script>

<link rel="stylesheet" type="text/css" href="${cpath }/css/login.css">
<script type="text/javascript" src="${cpath }/js/jquery-3.3.1.js"></script>
<script type="text/javascript">

				$(function(){
				/* 清空 */
		
				 $("input",$("#usersname").next("span")).click(function(){
					 $("#namespan").html("");
					 });
				
				 $("input",$("#pwd").next("span")).click(function(){
					 $("#pwdspan").html("");
					 });
			});
		
			
			
		</script>
</head>
<body>
	<div style="margin: 0 auto;width: 480px">
			<div id="loginBox" class="easyui-panel" title="用户登录">
		<div style="padding: 20px 90px 20px 90px">
			<form id="ff" method="post" action="${cpath }/login">
				<table cellpadding="5">
					<tr>
						<td>用户名:</td>
						<td><input id="usersname" class="easyui-textbox" type="text"
							name="name" value="张三" onfocus="clearspan(this)" />
							 <br/>
							<span style="color: red" id="namespan">${Message}</span></td>
					</tr>
					<tr>
						<td>密&nbsp;&nbsp;&nbsp;码:</td>
						<td><input id="pwd" class="easyui-textbox" type="password" name="password"
							 value="123456" onfocus="clearspan(this)" />
							 <br/>
							<span style="color: red" id="pwdspan">${Messagepwd} </span></td>
					</tr>
				</table>
						<div style="width: 80%;text-align: center;margin-left: 80px">   <!-- style="margin:0 auto;width:0;" -->
						<input id="ip" type="submit" value="登录" style="padding: 5px 20px;margin: 10px 20px"  class="easyui-linkbutton">
						<a href="register.jsp" >新用户.马上注册</a><br/>
						</div> 
						
						
				</form>
			</div>
		</div>
	
	</div>
</body>
</html>