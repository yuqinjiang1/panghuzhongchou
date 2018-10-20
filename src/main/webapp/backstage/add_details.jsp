<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加数据字典明细</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>


</head>
<body style="text-align: center; margin: 0 auto">
	
	<div class="easyui-panel" title="编辑/增加" style="width: 100％">
		
		<div style="margin: 0 auto; width:500px">
	    
	    <form id="ff" method="post">
	    	
	    	<table cellpadding="5">
	    		<tr>
	    			<td>名称</td>
	    			<td><input  type="text" name="name" 
	    						placeholder="字典值名称" data-options="required:true"></input></td>
	    		</tr>
	    		<tr>
	    			<td>顺序</td>
	    			<td><input  type="text" name="email" 
	    						placeholder="字典值显示顺序" data-options="required:true,validType:'email'"></input></td>
	    		</tr>
	    		<tr>
	    			<td>字典值</td>
	    			<td><input  type="text" name="subject" 
	    						placeholder="字典值"	data-options="required:true"></input></td>
	    		</tr>
	    		
	    	</table>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a href="${pageContext.request.contextPath}/backstage.jsp" class="easyui-linkbutton" onclick="submitForm()">保存</a>
	    	<a href="${pageContext.request.contextPath}/backstage.jsp" class="easyui-linkbutton" onclick="clearForm()">关闭</a>
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