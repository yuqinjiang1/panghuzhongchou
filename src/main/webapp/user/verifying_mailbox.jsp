<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>实名认证审核</title>
<c:set var="cpath" value="${pageContext.request.contextPath}"></c:set>
<link rel="stylesheet" type="text/css"
	href="${cpath}/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${cpath}/easyui/themes/icon.css">
<script type="text/javascript"
	src="${cpath}/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${cpath}/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${cpath}/easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="${cpath}/easyui/jquery.serializejson.min.js"></script>
	
<script type="text/javascript" src="${cpath}/easyui/jquery.serializejson.min.js"></script>
<script type="text/javascript" src="${cpath}/easyui/jquery.serializejson.min.js"></script>
 <script type="text/javascript" src="${cpath }/js/utils.js"></script>
 <script>
 $(function(){
/* 	 $.extend($.fn.validatebox.defaults.rules, 
			 {  
		 		

			 }); */

 });
 function submitForm() {
		console.log("提交邮箱");
		var valid = $("#ff").form('enableValidation').form('validate');
		if(valid)
		{
			console.log("数据有效");
			var submitData= $('#ff').serializeJSON();
			console.log("submitData: "+submitData);

			$.ajax({
				url: "${cpath}/sendVerifyEmail",
				data: $("#ff").serialize(),
				dataType:'json',
				type:'post',
				success:function(rtn){
					//{success:true, message: 操作失败}
					console.log(rtn.status+"===>rtn.msg");
					if(rtn.status==1){
						console.log("进入了成功 页面跳转");
						$.messager.alert('提示',"发送成功", 'info',function(){
							window.location.href='${pageContext.request.contextPath}/index.jsp';
						});
						
					}
					
				},
				error:function(data){
					alert("操作失败");
				}
			}); 
			
		}else{
			console.log("数据无效");
		}
 		

	} 
	</script>
</head>
<body >


		
		<div style="margin: 0 auto;width: 500px;" >
			<div class="easyui-panel" title="邮箱认证" style="width:500px;height: 300px">
		<div  style="text-align:center">
	    <form id="ff" method="post" action="${pageContext.request.contextPath}/addLoanFormInfo">
	    	<table style="margin: 10% auto;">
	    		<tr>
	    			<input type="hidden" name="userId" value="${user.userId }"/>
					
					<tr>
						<td colspan="2" style="color: red;">
							请输入邮箱</td>
					</tr>
					<tr>
						<td>邮箱</td>
						<td>
							<input id="email" class="easyui-textbox" validType='email' name="email" data-options="required:true" missingMessage="邮箱不能为空" invalidMessage="请输入正确的邮箱" type="text">
						</td>
					</tr>
	    		</tr>

	    	</table>
	    </form>
	    <div >
	    	<a  class="easyui-linkbutton" onclick="submitForm()">提交认证</a>
	    	<a href="${pageContext.request.contextPath}/index.jsp" class="easyui-linkbutton" >取消</a>
	    </div>
	    </div>
	</div>
	</div>


</body>
</html>