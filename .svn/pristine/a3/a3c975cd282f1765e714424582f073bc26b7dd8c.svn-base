<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<!-- 需要先导入jquery的文件，再导入easyUI文件 -->
<script type="text/javascript" src="${cpath }/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="${cpath }/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${cpath }/easyui/jquery.easyui.min.js"></script>
<link rel="stylesheet" href="${cpath }/easyui/themes/icon.css"
	type="text/css" />

<script type="text/javascript">
	
</script>
<style type="text/css">
/* #ee {
	float: left;
	margin-left: 300px;
	margin-right: 30px;
} */

.textbox{
    height:20px;
    margin:0;
    padding:0 2px;
    box-sizing:content-box;
}
$('#testIcon').combobox({
                        valueField:'flowEnName',
                        textField:'text',
                        data : template,
                        formatter : function (row){
                            var opts = $(this).combobox('options');
                            return row[opts.textField]+"<span>月</span>";
                        }
                    }); 


</style>
</head>
<body>
	
	<div>
		<span>借款信息</span> <span>信用标</span>
	</div>

	<div>
	
		 <form id="ff" method="post">
	    	<table cellpadding="5">
	    		<tr>
	    			<td>Name:</td>
	    			<td>
		    			<input class="easyui-textbox" type="text" name="bidRequestAmount" data-options="required:true">
		    				<span>元</span>
		    			</input>
	    			</td>
	    		</tr>
	    		<tr>
	    			<td>Email:</td>
	    			<td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"></input><span>%</span></td>
	    		</tr>
	    		<tr>
	    			<td>Subject:</td>
	    			<td>
	    				<select id="testIcon" style="padding: 10px 10px" class="easyui-combobox" name="bidRequestAmount">
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
						<td><input type="radio" name="returntype" value="1"><span>按月分期</span>
							<input type="radio" name="returntype" value="2"><span>按月到期</span></td>
	    		</tr>
	    		
	    		<tr>
	    			<td>最小投标:</td>
	    			<td>
		    			<input class="easyui-textbox" type="text" name="bidRequestAmount" data-options="required:true">
		    				<span>元</span>
		    			</input>
	    			</td>
	    		</tr>
	    		<tr>
	    			<td>招标天数:</td>
	    			<td>
	    				<select id="testIcon" style="padding: 10px 10px" class="easyui-combobox" name="bidRequestAmount">
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
	    			<td>Message:</td>
	    			<td><input class="easyui-textbox" name="message" data-options="multiline:true" style="height:60px"></input></td>
	    		</tr>
	    		<tr>
	    			<td> </td>
	    			<td>
	    				<input class="easyui-textbox"  data-options="prompt:'Username',iconCls:'icon-man',iconWidth:38">
	    			</td>
	    		</tr>
	    		<tr>
	    			<td>Language:</td>
	    			<td>
	    				<select class="easyui-combobox" name="language">
	    					<option value="ar">Arabic</option>
	    				</select>
	    			</td>
	    		</tr>
	    	</table>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
	    </div>
	    </div>
	    
	</div>
	
</body>
</html>