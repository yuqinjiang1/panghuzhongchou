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

			//过滤文件格式
			function checkFile(){
				$('#sp').text('');
				var fileTypes = ['.jpg', '.jpeg', '.bmp', '.png', '.gif'];
				//获取文件路径
				var filePath = $('#fb').textbox('getValue');
				//alert("filePath----->"+filePath);
				if (filePath != '') {
					var flag = false;
					var fileType = filePath.substring(filePath.lastIndexOf("."));
					//alert("fileType--->"+fileType);
					if (fileTypes && fileTypes.length > 0) {
						for (var i = 0; i < fileTypes.length; i++) {
							if (fileTypes[i] == fileType) {
								lookImg();
								flag = true;
								break;
							}
						}
					}
					if (!flag) {
						//alert('不支持' + fileType + '文件类型上传');
						$('#fb').textbox('setValue', '');
						$('#sp').text('格式不支持');
						return;
					}
				}
			}
		
		//上传图片
		 function lookImg() {
			var f = $("#fb").next().find('input[type=file]')[0];
			//alert("f--->"+f);
			if (f.files && f.files[0]) {
				// 更换图片时清空原图片展示内容
				$('#addImage').html('');
				for (var i = 0; i < f.files.length; i++) {
					//alert("f.files[i]"+f.files[i]);
					var reader = new FileReader(f.files[i]);
					//alert("reader:" + reader);
					reader.onload = function(e) {
						//append为在元素中的末尾添加内容
						$('#addImage')
								.append(
										"<img src='"+e.target.result+"'width='100px;''height='100px;'/>");
					}
					 var abc = reader.readAsDataURL(f.files[i]);
					//alert("reader.readAsDataURL(f.files[i])"+abc);
				}
			}
		}
  
		
		//过滤文件格式
			function checkFile1(){
				$('#sp1').text('');
				var fileTypes = ['.jpg', '.jpeg', '.bmp', '.png', '.gif'];
				//获取文件路径
				var filePath = $('#fb1').textbox('getValue');
				//alert("filePath----->"+filePath);
				if (filePath != '') {
					var flag = false;
					var fileType = filePath.substring(filePath.lastIndexOf("."));
					//alert("fileType--->"+fileType);
					if (fileTypes && fileTypes.length > 0) {
						for (var i = 0; i < fileTypes.length; i++) {
							if (fileTypes[i] == fileType) {
								lookImg1();
								flag = true;
								break;
							}
						}
					}
					if (!flag) {
						//alert('不支持' + fileType + '文件类型上传');
						$('#fb1').textbox('setValue', '');
						$('#sp1').text('格式不支持');
						return;
					}
				}
			}
		
		//上传图片
		 function lookImg1() {
			var f = $("#fb1").next().find('input[type=file]')[0];
			//alert("f--->"+f);
			if (f.files && f.files[0]) {
				// 更换图片时清空原图片展示内容
				$('#addImage1').html('');
				for (var i = 0; i < f.files.length; i++) {
					//alert("f.files[i]"+f.files[i]);
					var reader = new FileReader(f.files[i]);
					//alert("reader:" + reader);
					reader.onload = function(e) {
						//append为在元素中的末尾添加内容
						$('#addImage1')
								.append(
										"<img src='"+e.target.result+"'width='100px;''height='100px;'/>");
					}
					 var abc = reader.readAsDataURL(f.files[i]);
					//alert("reader.readAsDataURL(f.files[i])"+abc);
				}
			}
		}
	</script>
</head>
<body >


	<div class="easyui-panel" title="实名认证" style="width: 100%;">

		<div style="margin: 0 auto;width: 60%">

			<form id="ff1">

				<table cellpadding="5">
					<input type="hidden" name="userId" value="${user.userId }"/>
					<input type="hidden" name="name" value="${user.name }"/>
					<tr>
						<td colspan="2" style="color: red;">
							为保护您账户安全，实名认证成功之后不能修改信息，请认真填写！</td>
					</tr>
					<tr>
						<td>用户名</td>
						<td><input class="easyui-textbox" type="text" name="username"
							data-options="required:true"></input></td>
					</tr>
					<tr>
						<td>性别</td>
						<td><input type="radio" name="sex" value="1"><span>男</span>
							<input type="radio" name="sex" value="0"><span>女</span></td>
					</tr>
					<tr>
						<td>证件号码</td>
						<td><input class="easyui-textbox" type="text" name="identificationNumber"
							data-options="required:true"></input></td>
					</tr>
					 <tr>
						<td>出生日期</td>
						<td><input class="easyui-datebox" type="text" name="birthDate"
							data-options="multiline:true"></input></td>
					</tr> 
					<tr>
						<td>证件地址</td>
						<td><input class="easyui-textbox" type="text"
							name="identificationAddress" data-options="multiline:true"></input></td>
					</tr>

				</table>
			</form>
			
			<form id="ff" method="post" action="${cpath}/multiFileUpload"
				enctype="multipart/form-data">
				<table cellpadding="5">
					<tr> 
						<td>身份证正反照片</td>
						<td>
							<div>
									<input style="width: 270px;" id="fb" class="easyui-filebox"name="goods_img"
											data-options="buttonText:'身份证正面',prompt:'选择图片（2M以内）',onChange:checkFile">
									<span id="sp" style="color: red"></span>
									<div style=" margin-bottom:0px;hebackground-color: red"id="addImage"></div>
									
									<input style="width: 270px;" id="fb1" class="easyui-filebox"name="goods_img"
											data-options="buttonText:'身份证反面',prompt:'选择图片（2M以内）',onChange:checkFile1">
									<span id="sp1" style="color: red"></span>
									<div style=" margin-bottom:0px;hebackground-color: red"id="addImage1"></div>
							</div>
							
							

						</td>
					</tr>
				</table>
			</form>
			<div style="margin-bottom: 20px" id="addImage"></div>
			<div style="text-align: center; padding: 5px">
				<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a> 
				<!-- <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">取消</a> -->

			</div>
		</div>
	</div>

		


		<script>
 		function submitForm() {
 			//${cpath}/Authentication/addAuthInfo
 			var submitData= $('#ff1').serializeJSON();
 			console.log("submitData: "+submitData);
 			
/*  			var ndate = new date();
 			console.log("ndate: "+typeof(ndate)); */
 			$.ajax({
				url: "${cpath}/addAuthInfo",
				data: $("#ff1").serialize(),
				dataType:'json',
				type:'post',
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
					alert("操作失败");
				}
			});
 			
/*  			$('#ff').form({
			    url:"${cpath}/Authentication/addAuthInfo",
			    onSubmit: function(){
					// do some check
					// return false to prevent submit;
			    },
			    success:function(data){
					alert(data)
			    }
			}); */
 		
 		/* 	var file = $("#fb").next().find('input[type=file]')[0];
 			var file1 = $("#fb1").next().find('input[type=file]')[0];
             var formData = new FormData();

             formData.append('goods_img', file);
             formData.append('goods_img', file1);
     		$.ajax({
    			url:"${cpath}/multiFileUpload",
    			dataType:"json",
    			method:"post",
    			data:formData,
    			success:function(data){
    				
    			}
     		}); */
               
     

		/* 	var submitData= $('#ff').serializeJSON();
			$.ajax({
				url:"${cpath}/multiFileUpload",
				data: submitData,
				dataType:"json",
				method:"post",
				success:function(data){
					console.log("成功 data"+data);
					
				},
				error:function(data){
					console.log("失败 data"+data);
				}
			}); */
		} 
		

	</script>
</body>
</html>