<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
		<%-- <c:set var="cpath" value="${pageContext.request.contextPath }"scope="page"></c:set> --%>
		<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"/>
		<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"/>
		<!-- 需要先导入jquery的文件，再导入easyUI文件 -->
		<script type="text/javascript" src="easyui/jquery.min.js"></script>
		<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	 	<%-- <script type="text/javascript" src="${cpath }/js/indexpage.js"></script> --%>
		<script type="text/javascript" src="${cpath }/easyui/jquery.serializejson.min.js"></script>

		

				<script type="text/javascript">

			 $(function(){
				 
					
				 
					$("#home-layout").layout({
						fit:true
					});
					   /* resquestByKV();   */
					  $.ajax({
						// 提交数据的类型 POST GET
						type : "POST",
						// 提交的网址
						url : "menu/sys_user_menu",// 从HomeController.contentData方法获取数据
						// 提交的请求参数
						// data:{name:"sanmao", password:"sanmaoword"},
						// 返回数据的格式
						datatype : "json",// "xml", "html", "script", "json", "jsonp", "text".
						// 在请求之前调用的函数
						beforeSend : function() {
							/*$("#msg").html("logining");*/
						},
						// 成功返回之后调用的函数
						success : function(data) {
							// $("#msg1").html(decodeURI(data));
							//var result = jQuery.parseJSON(data);
							 var icon = [];
							var listMenu = data.data;
							console.log("list: "+listMenu);
							  $(listMenu).each(function(i,pro){
								 console.log("pro.text: "+pro.text);
							 }) 
								console.log("嘿嘿嘿");
							   $("#home-west").tree({ 
								   
								data:listMenu,
						 		method:"POST",
								lines:true,
								datatype:"json", 
								 animate:true, 
	 							  onClick:function(node){
									console.log("node.menuName"+node.menuName);
									if(node.attributes && node.attributes.url)
									{
										//打开内容区的tab，代码在其后
										addTab({
											url: "${cpath }/" + node.attributes.url,
											title: node.text
										});
									}
								}    
								

								/*  onSelect: function (node) {
									console.log("node: "+node);
				                    if (node==null || node.subMenus == null || node.subMenus.length<=0) {
				                        return;
				                    }
				                     LoadUrl(node.menuUrl, node.menuName); 
				                },
				                formatter: function (node) {
				                    icon.push({ "menuName": node.menuName, "menuUrl": node.menuUrl }); 
				                    return node.menuName;
				                }  */


								 
								
						 	});  
							 
							/*console.log("result: "+data);*/
							/*succFunction(result);*/
						},
						// 调用执行后调用的函数
						/*
						 * complete : function(XMLHttpRequest, textStatus) {
						 * alert(XMLHttpRequest.responseText); alert(textStatus);
						 * //HideLoading(); },
						 */
						// 调用出错执行的函数
						error : function() {
							alert("请求出错处理88888");
						}
					});
							
					/*  getUserMenu();   */
						
								
					
					/*
					* 初始化内容区的tabs
					*/
					$("#home-tabs").tabs({
						//fit : true,
						width:"auto",
						height: "90%",
						//tab页是否有边框
						border : false
						});
					addTab({
						url: "${cpath }/pages/borrower_mark_info.jsp",
						title: "投标明细"
					});
				});	
			 /*
				 * 在内容区添加一个tab
				 */
				function addTab(params) {
					var t = $("#home-tabs");
					var url = params.url;
					var opts = {
						title : params.title,
						closable : true,
						href : url,
						fit : true,
						border : false
					};
					//如果被选中的节点对应的tab已经存在，则选中该tab并刷新内容
					//否则打开一个新的tab
					if (t.tabs("exists", opts.title)) {
						var tab = t.tabs("select", opts.title).tabs("getSelected");
						t.tabs("update", {
							tab : tab,
							options : opts
						});
					} else {
						t.tabs("add", opts);
					}
				}
			
		</script>

</head>
<body>
 	<div style="margin:20px 0;"></div>
	<div id="home-layout">

		<!-- 页面西部 -->
		<div id="home-west" class="easyui-tree" data-options="region:'west',split:true" style="width: 200px;">

		</div>
		<input type="hidden" value="${cpath }" id="baseUrl"/>
		<!-- 页面北部 -->
		<div data-options="region:'center'" style="height: 400px">
			<div id="home-tabs">
				<!-- <div title="首页">
					<h2 style="text-align: center">欢迎登录</h2>
				</div> -->
			</div>
			
		</div>
	</div> 


</body>
</html>