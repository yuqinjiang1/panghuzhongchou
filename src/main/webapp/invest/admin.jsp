<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/head.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<link rel="stylesheet" type="text/css"
	href="${cpath }/easyui/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="${cpath }/easyui/themes/icon.css" />
<script type="text/javascript" src="${cpath }/easyui/jquery.serializejson.min.js"></script>

<script type="text/javascript" src="${cpath }/js/utils.js"></script>
<!-- 需要先导入jquery的文件，再导入easyUI文件 -->
<style type="text/css">
.carloans {
	float: left;
	/* margin-left: 300px; */
	margin-right: 30px;
}

.bifinfo {
	float: right;
}

.headimg {
	width: 100px;
	height: 100px;
	margin: 0 auto;
}

.content {
	width: 80%;
	text-align: center;
	margin: 20px auto;
}

#meterdg .datagrid-header {
	position: absolute;
	visibility: hidden;
}

#meterdg .datagrid-body {
	overflow: hidden;
}

.panel-header {
	background: #F5F5F5;
	border-color: #f5f5f5;
}

.panel-body {
	border-color: #f5f5f5;
}
</style>

<script type="text/javascript">
var InterValObj = null;
	$(function() {
		$("#nodataDiv").attr("style","display:block;");
		
		console.log("获取数据");
		var loanid = ${param.loanId};
		var userid = '${param.userId}';
		

 		 $("#bidcords").datagrid({
  			 /* url:content, */
             iconCls:'icon-ok',
             columns:[[
                       {field:'biduser',title:'投标人',width:100},
                       {field:'actualRate',title:'年利率',width:100},
                       {field:'availableAmount',title:'有效金额',width:100},
                       {field:'bidTimeString',title:'投标时间',width:100},
                       {field:'bidRequestState',title:'状态',width:100},
                       ]],
                       
             fitColumns:true,//允许表格自动缩放，以适应父容器
             pagination : false//分页

  		 });
		   
		//获取借款信息    
		$.ajax({
			url : "${cpath }/getLoanformInfoByLoanId?loanId=" + loanid,
			dataType : "json",
			method : "get",
			success : function(data) {
				console.log("data: " + data);
				var borrowInfo = data.data;
				console.log("借款金额： " + borrowInfo.bidRequestAmount);
				//装载数据
				
				$("#tt").html(borrowInfo.title);
				$("#borrowAmount").html(borrowInfo.bidRequestAmount);
				$("#rate").html(borrowInfo.currentRate);
				console.log("borrowInfo.currentRate: "+borrowInfo.currentRate)
				$("#monthes2Return").html(borrowInfo.monthes2Return);
				$("#totalRewardAmount").html(borrowInfo.totalRewardAmount);
				$("#retrunType").html(borrowInfo.returnTypeString);
				$("#minBidAmount").html(borrowInfo.minBidAmount);
				$("#note").html(borrowInfo.note);
				$("#bidcount").html(borrowInfo.bidCount);
				
				console.log("borrowInfo.currentSum: "+borrowInfo.currentSum);
				console.log("borrowInfo.bidRequestAmount: "+borrowInfo.bidRequestAmount);
				var progress = parseInt(100*borrowInfo.currentSum/borrowInfo.bidRequestAmount);
				console.log("progress: "+progress+" type: "+typeof(progress));
				$('#progr').progressbar('setValue', progress);
			
			
	

				//countdown disableDate
				var dtime = new Date(borrowInfo.disableDate);
				console.log("dtime: "+dtime);
				var ndate = new Date();
				console.log("ndate: "+ndate+ " 差: "+(ndate -dtime));
				var timecamp = dtime - ndate;
				if(timecamp > 0){
					/* countDown(timecamp,'#countdown'); */
				}
				
				InterValObj = window.setInterval(function(){ShowCountDown(dtime,'#countdown');}, 1000);
				
				/* $("#bidCount").html(borrowInfo.bidCount); */
				var castSum = borrowInfo.currentSum;
				console.log("castSum: "+castSum);
				//还需金额
				$(".amountneeded").html(
						(borrowInfo.bidRequestAmount - borrowInfo.currentSum)
								+ "元");
				var bidRState= $("#bidRequestState");
				if(bidRState!=null)
				{
					$("#bidRequestState").html(borrowInfo.bidRequestState);
					$(".alreadyCast").html(borrowInfo.currentSum);
					$("#yearRate").html(borrowInfo.currentRate);
					console.log("文本框： "+$("#yearRate"));
					console.log("利率=====>"+$("#yearRate").val()+"borrowInfo.currentRate: "+borrowInfo.currentRate);
				}
			},
			error : function(data) {
				console.log("失败： " + data);
			}
		});
		
		//获取借款人信息
		$.ajax({
			url : "${cpath }/getUserById?userid=" + userid,
			dataType : "json",
			method : "get",
			success : function(data) {
				/* console.log("data: " + data);
				var borrowInfo = data.data; */
				if(data.status==1)
				{
					console.log("请求成功");
					var userInfo  = data.data;
					console.log("日期类型： "+typeof(userInfo.registerTime));
					console.log("userInfo: "+userInfo+" userType:" +typeof(userInfo));
					 var datef = format(userInfo.registerTime, 'yyyy-MM-dd'); 
				
					console.log("注册时间： userInfo.registerTime："+datef);
					$("#registerTime").html(datef);
					
				}else{
					console.log("请求失败");
				}
			
			},
			error : function(data) {
				console.log("失败： " + data);
			}
		});
		
		//获取账号信息
		$.ajax({
			url : "${cpath }/account/getAccountInfo?userId=" + userid,
			dataType : "json",
			method : "get",
			success : function(data) {
				/* console.log("data: " + data);
				var borrowInfo = data.data; */
				if(data.status==1)
				{
					console.log("请求账号信息成功");
					var countInfo = data.data;
					var str = JSON.stringify(countInfo);
					console.log("str==>: "+str)
					$("#avalibleCount").html(countInfo.usableAmount);
					
				}else{
					console.log("请求账号信息失败");
				}
			
			},
			error : function(data) {
				console.log("失败： " + data);
			}
		});
		
		//获取投标信息
		$.ajax({
			url : "${cpath }/bid/getBidsInfo?loanId=" + loanid,
			dataType : "json",
			method : "get",
			success : function(data) {
				/* console.log("data: " + data);
				var borrowInfo = data.data; */
				if(data.status==1)
				{
					console.log("请求成功");
					var bidsInfo  = data.data;
					if(data!=null)
						{
							$("#bidcords").datagrid('loadData', bidsInfo);
							$("#nodataDiv").attr("style","display:none;");
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
	



	
	//倒计时
	function ShowCountDown(endDate,divname)
    {
        var now = new Date();
        var leftTime=endDate.getTime()-now.getTime();
        if(leftTime>0)
        {
        	 var dd = parseInt(leftTime / 1000 / 60 / 60 / 24, 10);//计算剩余的天数
             var hh = parseInt(leftTime / 1000 / 60 / 60 % 24, 10);//计算剩余的小时数
             var mm = parseInt(leftTime / 1000 / 60 % 60, 10);//计算剩余的分钟数
             var ss = parseInt(leftTime / 1000 % 60, 10);//计算剩余的秒数
             dd = checkTime(dd);
             hh = checkTime(hh);
             mm = checkTime(mm);
             ss = checkTime(ss);//小于10的话加0
             var cc = document.getElementById(divname);
            // cc.innerHTML = "距离" + year + "年" + month + "月" + day + "日还有：" + dd + "天" + hh + "小时" + mm + "分" + ss + "秒";
             console.log(dd+"天:"+hh+"小时："+mm+"分钟："+ss +"秒");
             $(divname).html(dd+"天:"+hh+"小时："+mm+"分钟："+ss +"秒");
        }else{
        	window.clearInterval(InterValObj);
        }
    }
    function checkTime(i)
    {
        if (i < 10) {
            i = "0" + i;
        }
        return i;
    }
    
    function myrefresh(){
    	window.location.reload();
    }

    //投标
	function immediatelyBid()
	{
		console.log("投标============");
	
		var submitData= $('#bidff').serializeJSON();
		console.log("submitData:"+submitData);
		$.ajax({
			url: "${cpath }/bid/addBid",
			data: submitData,
			dataType: 'json',
			type: 'post',
			success:function(rtn){
				//{success:true, message: 操作失败}
				console.log("rtn.data: "+rtn.data);
				if(rtn.status==1){
					console.log("进入了成功 改变按钮状态");
					/* location.reload(); */
					$.messager.alert('提示',rtn.msg, 'info',function(){
						myrefresh();
						$("#bidsb").linkbutton('disable');
					});
					
					//window.location.href='${pageContext.request.contextPath}/pages/personal_center.jsp';
				}else{
					$.messager.alert('提示',rtn.msg, 'info',function(){
					});
				}
				
			},
			error:function(data)
			{
				console.log("操作失败: "+data);
			}
		});
	}
</script>
</head>
<body>

	<div class="content">
		<div class="carloans">
			<div class="creditloan">
				<div class="easyui-panel" title="借款人"
					style="width: 300px; height: 250px;">
					<!--   显示头像资料:<input></input> -->
					<div id="headimg">
						<img alt="" src="${cpath }/images/personicon.png" />
					</div>
					<span>${user.name }</span>
					<p>籍贯:四川成都</p>
					<p>认证信息：</p>
				</div>
			</div>
		</div>

		<div class="carloans"> 
			<table>
				<tr>
					<th colspan="2" style="color: #0299DD"><h2 id="tt"></h2></th>
				</tr>
				<tr>
					<td>借款金额</td>
					<td style="color: #0299dd" id="borrowAmount"></td>
					<td>借款金额</td>
					<td style="color: #0299DD" id="rate"></td>
				</tr>

				<tr>
					<td>借款期限</td>
					<td style="color: #0299DD" id="monthes2Return"></td>
					<td>总可得利息</td>
					<td style="color: #0299DD" id="totalRewardAmount"></td>
				</tr>
				<tr>
					<td>还款方式</td>
					<td style="color: #0299DD" id="retrunType"></td>
					<td>最小投标</td>
					<td style="color: #0299DD" id="minBidAmount"></td>
				</tr> 

				<tr>
					<td>风控意见</td>
					<td colspan="2" style="color: #0299DD" id="note"></td>
				</tr>

				<tr>
					<td>剩余时间</td>
					<td colspan="2" style="color: #0299DD" id="countdown"></td>
				</tr>
			</table>
		</div>

		<div class="bifinfo">
			<table>
				<tr>
					<td>投标总数</td>
					<td style="color: #0299DD" id="bidcount"></td>
				</tr>
				<tr>
					<td>还需金额</td>
					<td style="color: #0299DD" class="amountneeded"></td>
				</tr>
				<tr>
					<td>投标进度</td>
					<td></td>
				</tr>
			</table>
			<!-- 进度条 -->

			<div class="easyui-progressbar" style="width: 100%;" id="progr"></div>

			<div style="background: #fafafa; width: 150px;">
				<c:if test="${empty user }">
					<a href="${cpath }/login.jsp" class="easyui-linkbutton"
						style="background: #D9534F; color: white; width: 200px; height: 30px; margin-top: 20px">登录投标</a>
				</c:if>
				<c:if test="${!empty user }">
				<div>
					<form id="bidff" action="${cpath }/bid/addBid">
					<table  class="bifinfo" style="width: 100%;">
						<input type="hidden" name="loanId" value="${param.loanId }"/>
						
						<input type="hidden" name="bidderId" value="${user.userId }"/>
						<input type="hidden" name="biduser" value="${user.name }"/>
						<input type="hidden" name="bidRequestState"/>
						
						<input type="hidden" name="actualRate" id="yearRate"/>
						<tr>
							<td>可用余额</td>
							<td style="color: #0299DD" id="avalibleCount"></td>
						</tr>
						<tr>
							<td>已投</td>
							<td style="color: #0299DD" class="alreadyCast"></td>
						</tr>
						<tr>
							<td>还需要</td>
							<td class="amountneeded"></td>
						</tr>
						<tr>
							<td colspan="2">
								<input  data-options="prompt:'投资金额'" class="easyui-textbox" type="text" name="availableAmount" />
							</td>
						</tr>
					</table>
					</form>
				</div>
					<a id="bidsb" href="#" class="easyui-linkbutton"
						style="background: #D9534F; color: white; width: 100%; height: 30px; margin-top: 20px"
						onclick="immediatelyBid()">马上投标</a>
				</c:if>

			</div>

		</div>


		<div style="clear: both">
			<div class="easyui-panel" title="借款人信息"
				style="width: 100%; height: 150px;">
				<div data-options="region:'center',split:true" style="height: 50px;">
					<div>
						<ul style="list-style-type: none;">
							<li style="float: left; margin: 10px 0; width: 250px">注册时间<span
								style="color: #337AB7; padding-left: 10px" id="registerTime"></span>
							</li>
							<li style="float: left; margin: 10px 0; width: 250px">借款额度 <span
								style="color: #337AB7; padding-left: 10px">1500</span>
							</li>
							<li style="float: left; margin: 10px 0; width: 250px">性别<span
								style="color: #337AB7; padding-left: 10px">男</span>
							</li>
							<li style="float: left; margin: 10px 0; width: 250px">住房条件<span
								style="color: #337AB7; padding-left: 10px"></span>
							</li>

							<li style="float: left; margin: 10px 0; width: 250px">文化程度<span
								style="color: #337AB7; padding-left: 10px">本科</span>
							</li>
							<li style="float: left; margin: 10px 0; width: 250px">每月收入<span
								style="color: #337AB7; padding-left: 10px">3000以下</span>
							</li>
							<li style="float: left; margin: 10px 0; width: 250px">婚姻情况<span
								style="color: #337AB7; padding-left: 10px">未婚</span>
							</li>
							<li style="float: left; margin: 10px 0; width: 250px">子女情况<span
								style="color: #337AB7; padding-left: 10px">无子女</span>
							</li>

						</ul>
					</div>
				</div>
			</div>
		</div>

		<div>
			<div id="material" class="easyui-panel" title="材料信息"
				style="height: 300px;width: 100%">

				<table id="meterdg" class="easyui-datagrid" data-options="fit:true" 
				fitColumns="true" singleSelect="true" style="width:100%">
					<thead>
						<tr>
							<th data-options="field:'code'" style="width:50%">材料类型</th>
							<th data-options="field:'name'" style="width:50%">材料数量</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>家属身份证正面</td>
							<td>1</td>
						</tr>

						<tr>
							<td>家属身份证背面</td>
							<td>1</td>
						</tr>

						<tr>
							<td>借款承诺书</td>
							<td>1</td>
						</tr>

						<tr>
							<td>公司银行流水</td>
							<td>1</td>
						</tr>

						<tr>
							<td>无信用记录的信用报告</td>
							<td>1</td>
						</tr>

						<tr>
							<td>驾驶证</td>
							<td>1</td>
						</tr>

						<tr>
							<td>正规毕业证</td>
							<td>1</td>
						</tr>
					</tbody>
				</table>


			</div>
		</div>





		<div class="easyui-panel" title="还款情况"
			style="width: 100%; height: 250px; text-align: center;">


			<table class="easyui-datagrid" style="width: 100%;"
				data-options="fit:true" toolbar="#toolbar" fitColumns="true"
				singleSelect="true">
				<thead>

					<tr>
						<th data-options="field:'code'" style="width: 18%">还款状态</th>
						<th data-options="field:'time'" style="width: 18%">最近一周</th>
						<th data-options="field:'month1'" style="width: 18%">最近1个月</th>
						<th data-options="field:'month6'" style="width: 18%">最近6个月</th>
						<th data-options="field:'month66'" style="width: 18%">6个月前</th>
						<th data-options="field:'month?'" style="width: 18%">总计(?)</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>提前还款</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
					</tr>

					<tr>
						<td>准时还款</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
					</tr>

					<tr>
						<td>逾期已还</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
					</tr>

					<tr>
						<td>逾期未还</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
						<td>0</td>
					</tr>
				</tbody>
			</table>
		</div>
		
		<div>
		<div class="easyui-panel" title="投标记录"
			style="width: 100%; ">


			<table id="bidcords" style="width: 100%;" class="easyui-datagrid">
				<!-- <thead>

					<tr>
						<th data-options="field:'code'" style="width: 20%">投标人</th>
						<th data-options="field:'time'" style="width: 20%">年利率</th>
						<th data-options="field:'month1'" style="width: 20%">有效金额</th>
						<th data-options="field:'month6'" style="width: 20%">投标时间</th>
						<th data-options="field:'month66'" style="width: 20%">类型</th>

					</tr>
				</thead> -->
			</table>

			<div style="width: 100%;" >
				<table id="nodataDiv" style="background-color: #F5F5F5; text-align: center;width: 100%">
					<thead>
						<tr>
							<th style="color: #337AB7;">暂时没有投标数据</th>

						</tr>
					</thead>
				</table>
			</div>

		</div>
	</div>
	</div>


	
</body>
</html>