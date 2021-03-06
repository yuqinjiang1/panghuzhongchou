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
 <script type="text/javascript" src="${cpath }/easyui/jquery.serializejson.min.js"></script>
 <script>
 $(function(){
	 var userId = '${param.userId}';
	 $("#underlinerecharge").datagrid({
			 /* url:content, */
         iconCls:'icon-ok',
         columns:[[
                   {field:'bankName',title:'银行名称',width:100},
                   {field:'nameOfAccountHolder',title:'开户人姓名',width:100},
                   {field:'bankAccount',title:'银行卡号',width:100},
                   {field:'bankBranch',title:'支行名称',width:100},
                 
                   ]],
                   
         fitColumns:true,//允许表格自动缩放，以适应父容器
         pagination : false//分页

		 });
	 
		//获取投标信息
		$.ajax({
			url : "${cpath }/bank/getBankInfoByUserId?userId=" + userId,
			dataType : "json",
			method : "get",
			success : function(data) {
				/* console.log("data: " + data);
				var borrowInfo = data.data; */
				if(data.status==1)
				{
					console.log("请求成功");
					var bankInfo  = data.data;
					if(data!=null)
						{
							$("#underlinerecharge").datagrid('loadData', bankInfo);
							/*  $(bankInfo).each(function(i,pro)
							 {
								var test = JSON.stringify(pro);
								 console.log("test: "+test);
								
							 }); */
							 var test = JSON.stringify(bankInfo);
							 console.log("test: "+test);
							 var arr=new Array();
							 $(data).each(function(i,pro){
								 arr.push(pro);
							 
							 });
							 console.log("arr: "+arr);
							 var setValueFlag = false;
							 $("#cNumber").combobox({
									data:bankInfo,  
									valueField:'bankId',
									textField:'bankAccount',
									
									/*  formatter: function(row){
										          return '<span>'+row.bankName+row.bankAccount+"("+row.bankBranch+")"+'</span>';
									 },
									 onChange: function (n,o) {
										console.log("n:  "+n+"  o: "+o+" arr:"+arr);
											$('#cNumber').combobox("select",n);
											arr[n];
										 } */
									   onLoadSuccess : function(row){
										  var testrow = JSON.stringify(row);
											 console.log("testrow: "+testrow);
											 $('#cNumber').combobox('setValue',''); 
										//  console.log("row: "+row);
									   /*  if(!setValueFlag)
									    {
									    	//row.bankId
									    	$('#cNumber').combobox('setValue',row.bankId);
									    	setValueFlag = true;
									    } */
									} 
								});

				
							
						}
			  		//将数据绑定到datagrid
			  		  
			  		
					
				}else{
					console.log("请求失败");
				}
			
			},
			error : function(data) {
				console.log("失败： " + data);
			}
		});

 });
 function submitForm() {
		console.log("充值");
		var valid = $("#ff").form('enableValidation').form('validate');
		if(valid)
		{
			console.log("数据有效");
			var submitData= $('#ff').serializeJSON();
			console.log("submitData: "+submitData);

			$.ajax({
				url: "${cpath}/account/recharge",
				data: $("#ff").serialize(),
				dataType:'json',
				type:'post',
				success:function(rtn){
					//{success:true, message: 操作失败}
					console.log(rtn.status+"===>rtn.msg");
					if(rtn.status==1){
						console.log("进入了成功 页面跳转");
						$.messager.alert('提示',"充值成功", 'info',function(){
							window.location.href='${pageContext.request.contextPath}/index.jsp';
						});
						
					}else{
						$.messager.alert('提示',"操作失败");
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


		
		<div style="margin: 0 auto;width: 80%;" >
				<div class="easyui-panel" title="银行卡"
			style="width: 100%;">

			<table id="underlinerecharge" style="width: 100%;" class="easyui-datagrid">

			</table>


		</div>
			<div class="easyui-panel" title="充值" style="width:100%;height: 300px">
				<div  style="text-align:center">
			    <form id="ff" method="post" action="${cpath}/addLoanFormInfo">
			    	<table style="margin: 0 auto;border-collapse:separate; border-spacing:0px 30px">
			    		<tr>
			    			<input type="hidden" name="userId" value="${param.userId }"/>
							
							
	                     <tr>
	                        <td>银行</td>
	                        <td>
	                        <select name="cardNumber" class="easyui-combobox" id="cNumber"
	                        				style="width: 350px;" editable="false" panelHeight="auto">
	                        				<option value="0">请选择</option>
	                        </select>
	                        </td>
	                   	</tr>
			    		<tr style="margin-top: 100px;">
							<td>充值金额</td>
							<td><input class="easyui-textbox" type="text" name="totalAccount" id="blockAccount"
							data-options="required:true"></input></td>
						</tr>
						<!--  <tr>
							<td>充值时间</td>
							<td><input class="easyui-datebox" type="text" name="birthDate"
								data-options="multiline:true"></input></td>
						</tr>  -->
		
			    	</table>
			    </form>
	    <div >
	    	<a  class="easyui-linkbutton" onclick="submitForm()">确认提交</a>
	    	<a href="${pageContext.request.contextPath}/index.jsp" class="easyui-linkbutton" >取消</a>
	    </div>
	    </div>
	</div>
	</div>


</body>
</html>