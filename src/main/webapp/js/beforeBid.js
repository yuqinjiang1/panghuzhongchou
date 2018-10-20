//提交的方法名称
var method = "";
var height = 200;
var listParam = "";
var saveParam = "";
var uid = "";
$(function(){
	//加载表格数据
	$('#grid').datagrid({
		url:"getPreLoanAuditList",
		pagination : true, //开启分页
		loadFilter : pagerFilter, //①调用分页函数
		columns:columns=[[
		      			{field:'title',title:'标题',width:100},
		    			{field:'createUser',title:'借款人',width:100},
		    			{field:'applyTime',title:'发标时间',width:100},
		    			{field:'bidRequestAmount',title:'借款金额',width:100},
		    			{field:'monthes2Return',title:'期限',width:100},
		    			{field:'currentRate',title:'利率',width:100},
		    			{field:'totalRewardAmount',title:'总利息',width:100},
		    			{field:'bidRequestState',title:'状态',width:100},
		                {field:'-',title:'',width:100,formatter: function(value,row,index){
		                	console.log("row.uid:　"+row.uid);
		                	row.uuid = row.uid;
		                	console.log("value:"+value+" row: "+JSON.stringify(row)+" index: "+index);
		                    var oper = "<a class='updateabtn' href=\"javascript:void(0)\" onclick=\"edit(" +row.uid+ ')">审核</a>';
		                  
		                    return oper;
		                }}
		            ]],
		singleSelect: true,
		pagination: true,
		toolbar: [{
			text: '新增',
			iconCls: 'icon-add',
			handler: function(){
				//设置保存按钮提交的方法为add
				method = "add";
				//关闭编辑窗口
				$('#editDlg').dialog('open');
				
				// 清空表单
				$('#editForm').form('clear');
			}
		}]
	});

});
function pagerFilter(data) {
	  if (typeof data.length == 'number' && typeof data.splice == 'function') { // is array  
	      data = {
	          total : data.length,
	          rows : data
	      }
	  }
	  var dg = $(this);
	  var opts = dg.datagrid('options');
	  var pager = dg.datagrid('getPager');
	  pager.pagination({
	      onSelectPage : function(pageNum, pageSize) {
	          opts.pageNumber = pageNum;
	          opts.pageSize = pageSize;
	          pager.pagination('refresh', {
	              pageNumber : pageNum,
	              pageSize : pageSize
	          });
	          dg.datagrid('loadData', data);
	      }
	  });
	  if (!data.originalRows) {
	      data.originalRows = (data.rows);
	  }
	  var start = (opts.pageNumber - 1) * parseInt(opts.pageSize);
	  var end = start + parseInt(opts.pageSize);
	  data.rows = (data.originalRows.slice(start, end));
	  return data;
	}





