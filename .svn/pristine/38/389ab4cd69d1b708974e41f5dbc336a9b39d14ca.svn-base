<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>认证材料审核</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>

</head>
<body  style="text-align: center; margin: 0 auto">
	
    	<table>
			<tr>
				<td>
					状态<select class="easyui-combobox" name="state" style="width:100px;">
						<option value="reject">审核拒绝</option>
						<option value="pass">审核通过</option>
					</select>
				</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;申请时间</td>
				<td>
					<input class="easyui-datebox" data-options="sharedCalendar:'#cc'">
				</td>
				<td>到</td>
				<td>
					<input class="easyui-datebox" data-options="sharedCalendar:'#cc'">
					<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search"
						 id="searchByDate" onclick="doSearchUser()">查询</a>
				</td>
			</tr>
		</table>
	<div id="cc" class="easyui-calendar"></div>

	<table id="dg" class="easyui-datagrid" style="width: 100％">
		<thead>
			<tr style="text-align: center; margin: 0 auto">
				<th field="username" width="100" align="center">用户名</th>
				<th field="realname" width="100" align="center">真实姓名</th>
				<th field="gender" width="50" align="center">性别</th>
				<th field="idCard" width="200" align="center">身份证号码</th>
				<th field="address" width="150" align="center">身份证地址</th>
				<th field="state" width="100" align="center">状态</th>
				<th field="admin" width="50" align="center">审核人</th>
				<th field="审核" width="50" align="center">    </th>
			</tr>
		</thead>
	</table><br/><br/>
	
			<div class="easyui-panel">
		<div class="easyui-pagination" data-options="total:114"></div>
	</div>
</body>
</html>