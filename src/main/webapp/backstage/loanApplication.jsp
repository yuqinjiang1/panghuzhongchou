<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>贷款申请界面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.serializejson.min.js"></script>
</head>
<body>
	<div style="margin: 0 auto;width: 500px">
			<div class="easyui-panel" title="借款信息（信用标）" style="width:500px">
		<div  style="text-align:center">
	    <form id="ff" method="post" action="${pageContext.request.contextPath}/addLoanFormInfo">
	    	<table >
	    		<tr>
	    			<td>借款金额</td>
	    			<td><input class="easyui-textbox" type="text" name="bidRequestAmount" data-options="required:true"></input><span>元</span></td>
	    		</tr>
	    		<tr>
	    			<td>借款利息</td>
	    			<td><input class="easyui-textbox" type="text" name="currentRate" data-options="required:true"></input><span>%</span></td>
	    		</tr>
	    		<tr>
	    			<td>借款期限</td>
	    			<td>
						<select  class="easyui-combobox" name="monthes2Return" style="width: 175px;">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
						</select>
						<span>月</span>
					</td>
				</tr>
	    		<tr>
	    			<td>还款方式</td>
	    			<td>
	    				<input type="radio" name="retrunType" value="1"/>按月分期
	    				<input type="radio" name="retrunType" value="2"/>按月到期
	    			</td>
	    		</tr>
	    		<tr>
	    			<td>最小投标</td>
	    			<td><input class="easyui-textbox" type="text" name="minBidAmount" data-options="required:true"></input><span>元</span></td>
	    		</tr>
					<tr>
						<td>投标天数</td>
						<td><select class="easyui-combobox" name="disableDays" style="width: 175px;">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
								<option value="16">16</option>
								<option value="20">20</option>
								<option value="22">22</option>
								<option value="23">23</option>
								<option value="24">24</option>
								<option value="25">25</option>
								<option value="26">26</option>
								<option value="27">27</option>
								<option value="28">28</option>
								<option value="29">29</option>
								<option value="30">30</option>
								<option value="31">31</option>
						     </select>
						     <span>天</span>
						</td>
					</tr>
					<tr>
	    			<td>借款标题</td>
	    			<td><input class="easyui-textbox" name="title" data-options="multiline:true" style="height:30px"></input></td>
	    		</tr>
	    		<tr>
	    			<td>借款描述</td>
	    			<td><input class="easyui-textbox" name="description" data-options="multiline:true" style="height:60px"></input></td>
	    		</tr>
	    	</table>
	    </form>
	    <div >
	    	<a  class="easyui-linkbutton" onclick="submitForm()">提交申请</a>
	    	<a href="${pageContext.request.contextPath}/index.jsp" class="easyui-linkbutton" >取消</a>
	    </div>
	    </div>
	</div>
	</div>
	<script>
		function submitForm(){
			//$('#ff').form('submit');
			var submitData= $('#ff').serializeJSON();
			console.log("submitData:"+submitData);
			$.ajax({
				url: "${pageContext.request.contextPath}/addLoanFormInfo",
				data: submitData,
				dataType: 'json',
				type: 'post',
				success:function(rtn){
					//{success:true, message: 操作失败}
					console.log(rtn.status+"===>rtn.msg");
					$.messager.alert('提示',"操作成功", 'info',function(){
						if(rtn.status==1){
							console.log("进入了成功 页面跳转");
							window.location.href='${pageContext.request.contextPath}/index.jsp';
						}
					});
				},
				error:function(data){
					alert(data);
				}
			});
			
		}
		function clearForm(){
			$('#ff').form('clear');
		}
	</script>
</body>
</html>