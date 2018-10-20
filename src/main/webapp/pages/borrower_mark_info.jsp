<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>借款人标详情表</title>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
	<script type="text/javascript" src="../easyui/jquery.min.js"></script>
	<script type="text/javascript" src="../easyui/jquery.easyui.min.js"></script>
	<link rel="stylesheet" href="../easyui/themes/default/easyui.css"
		type="text/css" />
	<link rel="stylesheet" href="../easyui/themes/icon.css" type="text/css" />
	<script type="text/javascript" src="${cpath}/easyui/jquery.serializejson.min.js"></script>
<script type="text/javascript">
	var baseUrl = '${pageContext.request.contextPath}';
</script>
</head>
<body>
	<input id="PageContext" type="hidden" value="${pageContext.request.contextPath}" />
	<table id="dg" title="借款明细" class="easyui-datagrid"
		 data-options="fit:true"
		toolbar="#toolbar" rownumbers="true" fitColumns="true"
		singleSelect="true" ColumnHeadersVisible=false>
		 <thead>
			<tr>
				<th field="name" width="50">借款人</th>
				<th field="borrorTitle" width="50">借款标题</th>
				<th field="annualInterestRate" width="50">年利率</th>
				<th field="amount" width="50">金额</th>
				<th field="repaymentMethod" width="50">还款方式</th>
				<th field="progress" width="50">进度</th>
				<th data-options="field:'operate',width:80,align:'center',formatter:formatOper">操作</th>

			</tr>
		</thead>
	</table>
	<div id="toolbar">
		<!-- <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="newUser()">New User</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">Edit User</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="destroyUser()">Remove User</a> -->
	</div>
	<script type="text/javascript" src="${cpath }/js/borrow_mark_info.js"></script>
</body>
</html>