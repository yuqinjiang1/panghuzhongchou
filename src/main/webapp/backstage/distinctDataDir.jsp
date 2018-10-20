<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统数据字典目录</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>

</head>
<body>
	<table id="dg">
			<tr>
				<td>
					状态<select class="easyui-combobox" name="state" style="width:100px;">
						<option value="all">全部</option>
						<option value="pass">审核通过</option>
					</select>
				</td>

				<td>
				&emsp;&emsp;关键字<input  type="text" class="easyui-textbox"/>
					<a href="#" class="easyui-linkbutton" plain="true" iconCls="icon-search"
						 id="searchByDate" onclick="doSearchUser()">查询</a>&emsp;&emsp;&emsp;
					<a href="#" class="easyui-linkbutton" onclick="addDic()">添加数据字典</a>
				</td>
			</tr>
		</table>
		
		<table class="easyui-datagrid"  style="width:100%;height:100%; text-align:center" 
			data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:80">名称</th>
				<th data-options="field:'productid',width:100">编码</th>
				<th data-options="field:'unitcost',width:150">状态（点击修改）</th>
				<th data-options="field:'attr1',width:250">操作</th>
			</tr>
		</thead>
	</table>
</body>
</html>