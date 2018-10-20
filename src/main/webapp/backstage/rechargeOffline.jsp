<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户线下充值审核管理</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>

</head>
<body>
	<body  style="text-align: center; margin: 0 auto">
	
    	<table>
			<tr>
				<td>
					状态<select class="easyui-combobox" name="state" style="width:100px;">
						<option value="all">全部</option>
						<option value=""></option>
					</select>
				</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;开户行
					<select class="easyui-combobox" name="state" style="width:100px;">
						<option value="CMB">招行</option>
						<option value="CCB">建行</option>
						<option value="ABC">农行</option>
						<option value="ICBC">工行</option>
						<option value="BOC">中行</option>
					</select>
				</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;交易时间</td>
				<td>
					<input class="easyui-datebox" data-options="sharedCalendar:'#cc'">
		
			   	到
					<input class="easyui-datebox" data-options="sharedCalendar:'#cc'">
				</td>	
					<td>
					&nbsp;&nbsp;&nbsp;&nbsp;交易号<input class="easyui-textbox" />
			
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
				<th field="transaction_no" width="100" align="center">交易号</th>
				<th field="transaction_time" width="100" align="center">交易时间</th>
				<th field="recharge_amount" width="200" align="center">充值金额</th>
				<th field="platform_account" width="150" align="center">平台账号</th>
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