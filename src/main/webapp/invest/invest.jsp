<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css" />
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<link rel="stylesheet" type="text/css"
	href="${cpath }/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="${cpath }/easyui/themes/icon.css" />

<!-- 需要先导入jquery的文件，再导入easyUI文件 -->
<script type="text/javascript" src="${cpath }/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${cpath }/easyui/jquery.easyui.min.js"></script>
<link rel="stylesheet" href="${cpath }/easyui/themes/icon.css"
	type="text/css" />
</head>
<body>
	<div style="margin-bottom: 10px">
		<a href="#" class="easyui-linkbutton"
			onclick="addTab('全部','#')">全部</a> <a
			href="#" class="easyui-linkbutton"
			onclick="addTab('投标中','#')">投标中</a> <a
			href="#" class="easyui-linkbutton"
			onclick="addTab('已完成','#')">已完成</a>
	</div>
	
	
	<h2>
		<a href="#">进行中借款</a>
	</h2>
	<table id="tt" class="easyui-datagrid"
		style="width: 1200px; height: 400px;">
		<thead>
			<tr>
				<th field="name1" width="150" align="center">借款人</th>
				<th field="name2" width="150" align="center">借款标题</th>
				<th field="name3" width="150" align="center">年利率</th>
				<th field="name4" width="150" align="center">金额</th>
				<th field="name5" width="150" align="center">还款方式</th>
				<th field="name6" width="150" align="center">借款期限</th>
				<th field="name7" width="150" align="center">进度</th>
				<th field="name8" width="150" align="center">操作</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>stef</td>
				<td>借钱交学费</td>
				<td>15%</td>
				<td>1500</td>
				<td>按月分期还款</td>
				<td>6月</td>
				<td>100.00%</td>
				<td><a href="#" style="color: red">查看</a></td>
			</tr>
			<tr>
				<td>stef</td>
				<td>借钱交学费</td>
				<td>15%</td>
				<td>1500</td>
				<td>按月分期还款</td>
				<td>6月</td>
				<td>100.00%</td>
				<td><a href="#" style="color: red">查看</a></td>
			</tr>
			<tr>
				<td>stef</td>
				<td>借钱交学费</td>
				<td>15%</td>
				<td>1500</td>
				<td>按月分期还款</td>
				<td>6月</td>
				<td>100.00%</td>
				<td><a href="#" style="color: red">查看</a></td>
			</tr>
			<tr>
				<td>stef</td>
				<td>借钱交学费</td>
				<td>15%</td>
				<td>1500</td>
				<td>按月分期还款</td>
				<td>6月</td>
				<td>100.00%</td>
				<td><a href="#" style="color: red">查看</a></td>
			</tr>
			<tr>
				<td>stef</td>
				<td>借钱交学费</td>
				<td>15%</td>
				<td>1500</td>
				<td>按月分期还款</td>
				<td>6月</td>
				<td>100.00%</td>
				<td><a href="#" style="color: red">查看</a></td>
			</tr>
		</tbody>
	</table>

</body>
</html>