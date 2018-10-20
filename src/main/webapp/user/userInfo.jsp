<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.serializejson.min.js"></script>
<style type="text/css">
	.a {
		width:30%;
		text-align:right;
		font-weight:bold
	}

	.sbmit {
	 text-align: center;
	color:white
	}
</style>

<script type="text/javascript">
	$(function(){
		$.ajax({
			url:"${pageContext.request.contextPath}/getDicAndItemsById",
			dataType:"json",
			method:"get",
			success:function(data){
				console.log("成功 data"+data);
				 $(data).each(function(i,pro){
					/* $("#province").append("<option>"+pro.name+"</option>"); */
					console.log("i: "+i+" pro: "+pro+" pro.dicId: "+pro.dicId);
						if(pro.dicId==1)
						{
							console.log("月收入items: "+pro.items);
							$("#monthlyIncome").combobox({
								data:pro.items,  
								valueField:'itemValue',
								textField:'itemName',
							/* 	 onLoadSuccess : function(){
								    $('#monthlyIncome').combobox('setValue','5');
								}  */
							});
						}
						else if(pro.dicId==2)
						{
							$("#stateofChildren").combobox({
								data:pro.items,  
								valueField:'itemValue',
								textField:'itemName',
								/* onLoadSuccess : function(){
								    $('#stateofChildren').combobox('setValue','5');
								} */
							});
						}
						else if(pro.dicId==3)
						{
							console.log("学历情况items: "+pro.items);
							 $("#education").combobox({
									data:pro.items,  
									valueField:'itemValue',
									textField:'itemName',
									onLoadSuccess : function(){
									    $('#education').combobox('setValue','5');
									}
								});
						}
						else if(pro.dicId==4)
						{
							console.log("住房条件items: "+pro.items);
							 $("#houseCondition").combobox({
									data:pro.items,  
									valueField:'itemValue',
									textField:'itemName',
									/* onLoadSuccess : function(){
									    $('#houseCondition').combobox('setValue','5');
									} */
								});
						}
						else if(pro.dicId==5)
						{
							console.log("婚姻情况items: "+pro.items);
							$("#maritalStatus").combobox({
								data:pro.items,  
								valueField:'itemValue',
								textField:'itemName',
								/* onLoadSuccess : function(){
								    $('#maritalStatus').combobox('setValue','5');
								} */
							});
						}
				 }); 
			},
			error:function(data){
				console.log("失败");
			}
		});
	})
	
	
	function submitForm(){
			//$('#ff').form('submit');
			var submitData= $('#fm').serializeJSON();
			console.log("submitData:"+submitData);
			$.ajax({
				url: "${pageContext.request.contextPath}/updateUserInfo",
				data: submitData,
				dataType: 'json',
				type: 'post',
				success:function(rtn){
					//{success:true, message: 操作失败}
					console.log("rtn.data: "+rtn.data);
					$.messager.alert('提示',"操作成功", 'info',function(){
						if(rtn.msg=="OK"){
							console.log("进入了成功 页面跳转");
							window.location.href='${pageContext.request.contextPath}/pages/personal_center.jsp';
						}
					});
				}
			});
			
		}

</script>

</head>
<body style="margin:1px">
        <div style="width:400px;margin: 0 auto">
	<div class="easyui-panel" title="个人资料" style="width:400px">
		<div style="padding:30px 60px 30px 60px">
            <form method="post" id="fm" action="#">
                <table cellspacing="10px;">
                    <tr>
                        <td class="a" >用户名</td>
                        <td><input type="text" id="userName" name="name"
                            class="easyui-validatebox"  required="true" value=${user.name }>
                        </td>
                      </tr>
                     <tr>
                        <td class="a">真实姓名</td>
                        <td><input type="text" id="realName" name="realName"
                            class="easyui-validatebox" required="true" value="${user.realName }">
                        </td>
                      </tr>
                    <tr>
                        <td class="a">身份证号码</td>
                        <td><input type="text" id="idNumber" name="idNumber"
                            class="easyui-validatebox" required="true" />
                        </td>
                   </tr>
                   	<tr>
                        <td class="a">手机号码</td>
                        <td><input type="text" id="phone" name="phone"
                            class="easyui-validatebox" required="true" />
                        </td>
                    </tr>
                    <tr>
                        <td class="a">个人学历</td>
                        <td>
                        <select name="educationBackground" class="easyui-combobox" id="education"
                        				style="width: 140px;" editable="false" panelHeight="auto">
                        				<option value="0">请选择</option>
									
                        </select>
                        </td>
                   </tr>
                     <tr>
                        <td class="a">月收入</td>
                        <td>
                        <select name="monthlyIncome" class="easyui-combobox" id="monthlyIncome"
                        				style="width: 140px;" editable="false" panelHeight="auto">
                        				<option value="0">请选择</option>
                        </select>
                        </td>
                   </tr>
                   </tr>
                     <tr>
                        <td class="a">婚姻情况</td>
                        <td>
                        <select name="maritalStatus" class="easyui-combobox" id="maritalStatus"
                        				style="width: 140px;" editable="false" panelHeight="auto">
                        				<option value="0">请选择</option>
                        </select>
                        </td>
                   </tr>
                    <tr>
                        <td class="a">子女情况</td>
                        <td>
                        <select name="childrenSituation" class="easyui-combobox" id="stateofChildren"
                        				style="width: 140px;" editable="false" panelHeight="auto">
                        				<option value="0">请选择</option>
                        </select>
                        </td>
                   </tr>
                    <tr>
                        <td class="a">住房条件</td>
                        <td>
                        <select name="housingConditions" class="easyui-combobox" id="houseCondition"
                        				style="width: 140px;" editable="false" panelHeight="auto">
                        				<option value="0">请选择</option>
                        </select>
                        </td>
                   </tr>
                    <tr>
                    	<td  colspan="2" class="sbmit">
                    		<a class="easyui-linkbutton" onclick="submitForm()">保存数据</a>
                    	</td>
                    </tr>
                </table>
            </form>
        </div>
</div>
</body>
</html>