<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>充值明细</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>

</head>
<body>
	<table >
			<tr>
				<td>时间范围</td>
				<td>
					<input class="easyui-datebox" data-options="sharedCalendar:'#cc'">
				</td>
				<td>到</td>
				<td>
					<input class="easyui-datebox" data-options="sharedCalendar:'#cc'">
				</td>
					<td>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;状态
						<select class="easyui-combobox" name="state" style="width:100px;">
						<option value="all">全部</option>
						<option value=""></option>
						<option value=""></option>
						<option value=""></option>
						<option value=""></option>
					</select>
				</td>
				<td>
					<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search">查询</a>
				</td>
			</tr>
		</table>
	<div id="cc" class="easyui-calendar"></div>

	<table id="dg" class="easyui-datagrid" style="width: 100％">
		<thead>
			<tr style="text-align: center; margin: 0 auto">
				<th field="username" width="100" align="center">平台账号</th>
				<th field="realname" width="100" align="center">交易号</th>
				<th field="gender" width="100" align="center">充值时间</th>
				<th field="idCard" width="200" align="center">充值金额</th>
				<th field="address" width="150" align="center">充值状态</th>
			</tr>
		</thead>
	</table><br/><br/>
	
			<div class="easyui-panel">
		<div class="easyui-pagination" data-options="total:114"></div>
	</div>
</body>
</html>