<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>P2P网站后台管理系统（未登录）</title>

</head>
<body >
		<div style="margin:20px 0;"></div>
	<div class="easyui-panel" title="网站管理员登录" style="width:400px">
		<div style="padding:10px 60px 20px 60px ;style="margin: 0 auto">
	    <form id="ff" method="post">
	    	<table cellpadding="5">
	    		<tr>
	    			<td>管理员名称</td>
	    			<td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>密码</td>
	    			<td><input class="easyui-textbox" type="password" name="password" data-options="required:true"></input></td>
	    		</tr>

	    	</table>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a href="${pageContext.request.contextPath}/backstage.jsp" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    	<a href="${pageContext.request.contextPath}/index.jsp" class="easyui-linkbutton" onclick="clearForm()">取消</a>
	    </div>
	    </div>
	</div>
	<script>
		function submitForm(){
			$('#ff').form('submit');
		}
		function clearForm(){
			$('#ff').form('clear');
		}
	</script>
</body>
</html>