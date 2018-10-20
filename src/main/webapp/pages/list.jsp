<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="/easyui/themes/default/easyui.css"/>
		<link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css"/>
		<!-- 需要先导入jquery的文件，再导入easyUI文件 -->
		<script type="text/javascript" src="/easyui/jquery.min.js"></script>
		<script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
		<c:set var="cpath" value="${pageContext.request.contextPath }"
		scope="page"></c:set>
		<link rel="stylesheet" href="/easyui/themes/icon.css" type="text/css" />
		
</head>
<body>

	状态<select class="easyui-combobox" name="state" style="width:100px;">
						<option value="all">全部</option>
						<option value=""></option>
			</select>
	<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search">查询</a>
	
	<table id="dg" class="easyui-datagrid" style="width: 100％" title="投资项目">
		<thead>
			<tr style="text-align: center; margin: 0 auto">
				<th field="username" width="100" align="center">投资借款</th>
				<th field="realname" width="100" align="center">投资时间</th>
				<th field="gender" width="100" align="center">投资金额（元）</th>
				<th field="idCard" width="100" align="center">利息</th>
				<th field="address" width="150" align="center">状态</th>
			</tr>
		</thead>
	</table><br/><br/>
	
			<div class="easyui-panel">
		<div class="easyui-pagination" data-options="total:114"></div>

<%-- 			<table id="dg" style="width: 800px" title="My Users"
				rownumbers="true" data-options="fit:true" toolbar="#toolbar"
				fitColumns="true" singleSelect="true"></table>
			<div id="toolbar">
				<a href="#" class="easyui-linkbutton" iconCls="icon-add"
					plain="true" onclick="newUser()">New User</a> <a href="#"
					class="easyui-linkbutton" iconCls="icon-edit" plain="true"
					onclick="editUser()">Edit User</a> <a href="#"
					class="easyui-linkbutton" iconCls="icon-remove" plain="true"
					onclick="destroyUser()">Remove User</a> <input id="searchByName"
					style="line-height: 26px; border: 1px solid #ccc"> <a
					href="#" class="easyui-linkbutton" plain="true"
					iconCls="icon-search" onclick="doSearch()">Search</a>
			</div>
			
			
				<div id="dlg" class="easyui-dialog"
				style="width: 400px; height: 280px; padding: 10px 20px"
				closed="true" buttons="#dlg-buttons">
				<div class="ftitle">User Information</div>
				<form id="fm" method="post">
					<div class="fitem">
						<label>name:</label> <input name="name" class="easyui-validatebox"
							required="true">
					</div>
					<br>
					<div class="fitem">
						<label>phone:</label> <input name="phone"
							class="easyui-validatebox" validType="email">
					</div>
					<br>
					<div class="fitem">
						<label>email:</label> <input name="email"
							class="easyui-validatebox">
					</div>
				</form>
			</div>
			<div id="dlg-buttons">
				<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
					onclick="saveUser()">Save</a> <a href="#" class="easyui-linkbutton"
					iconCls="icon-cancel"
					onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
			</div>

			<!-- <script type="text/javascript" src="js/fun.js">
				//使用外引入，加快的页面的加载速度，同时分离了不同类型的代码，查看的时候可以左右对照着看，查bug更方便
			</script>
			-->
			 <script type="text/javascript" src="${cpath }/js/list.js"></script>
			 <script type="text/javascript" src="${cpath }/js/listsearch.js"></script>  --%>
	
</body>
</html>