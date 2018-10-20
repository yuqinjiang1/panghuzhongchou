<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理系统</title>
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css"/>
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css"/>
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
		
<script type="text/javascript">
			 $(function(){
					$("#home-layout").layout({
						fit:true
					});
					
					$("#home-west").tree({
						url:"js/backstage.json",
						method:"get",
						lines:true,
						animate:true,
						onClick:function(node){
							if(node.attributes && node.attributes.url)
							{
								//打开内容区的tab，代码在其后
								addTab({
									url: "${cpath }/" + node.attributes.url,
									title: node.text
								});
							}
						}						
					});					
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

		页面西部
		<div id="home-west" data-options="region:'west',split:true" style="width: 200px;">

		</div>
		
		页面北部
		<div data-options="region:'center'" style="height: 400px" >
			<div id="home-tabs">
				<div title="欢迎来到p2p金融平台后台管理系统">
					<h2 style="text-align: center">欢迎</h2>
				</div>
			</div>
			
		</div>
	</div>






</body>
</html>