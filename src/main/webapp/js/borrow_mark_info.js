//添加用户
function newUser(){
	$('#dlg').dialog('open').dialog('setTitle','New User');
	$('#fm').form('clear');
	url = "user/Save";
}






//查看

function formatOper(val,row,index){
	/*return '<a href="#" onclick="lookDetail('+index+')">查看</a>';*/
	return '<a href="#">查看</a>';
}

/*function lookDetail(index)
{
	$('#dg').datagrid('selectRow',index);// 关键在这里
	var row = $('#dg').datagrid('getSelected');
	if (row){
		$('#dlg').dialog('open').dialog('setTitle','查看信息');
		alert("查看信息");
	}

}*/

$('#dg').datagrid({
    columns : [ [ //添加列  
        {
            field : 'createUser', //绑定数据源ID  
            title : '借款人', //显示列名称
            align : 'center', //内容在列居中
            width : 100 //列的宽度
        },
        {
            field : 'title',
            title : '借款标题',
            align : 'center',
            width : 100
        },
        {
            field : 'currentRateStr',
            title : '年利率',
            align : 'center',
            width : 100
        },
        {
            field : 'bidRequestAmount',
            title : '金额',
            align : 'center',
            width : 100
        },
        {
            field : 'returnTypeString',
            title : '还款方式',
            align : 'center',
            width : 100
        },
        {
            field : 'progressStr',
            title : '进度',
            align : 'center',
            width : 100
        },
        {
        	field:'-',
        	title:'操作',
        	width:100,
        	formatter: function(value,row,index){
               	/* row.uuid = row.uid; */row.loanId
               	   var ret = {loanId:row.loanId,borrowUserId:row.borrowUserId};
               		ret =JSON.stringify(ret);
               		console.log("===>ret: "+ret +"typeof(ret): "+typeof(ret)+"  typeof(loanIf): "+typeof(row.loanId));
               		//(\''+ret+ '\')
                   var oper = '<a class="operateBtn" href="javascript:void(0)" onclick="viewDetail(\''+row.loanId+','+row.borrowUserId+'\')">查看</a>';
                   return oper;
        	}
        }

       
    ] ],
    pagination : true, //开启分页
    url : 'getBorrowMarkInfos', //获取数据地址
    loadFilter : pagerFilter, //①调用分页函数   
});

function viewDetail(ret)
{
	var split=ret.split(",");
	var loanId=split[0];
	var userId = split[1];
	/*console.log("typeof(ret): "+typeof(ret));*/
	console.log("loanId: "+ret+" userId:"+userId);

	console.log("===路径："+$("#PageContext").val());
	window.location.href=$("#PageContext").val()+'/invest/admin.jsp?loanId='+loanId+"&userId="+userId;
}
//分页事件
var pager = $("#dg").datagrid("getPager"); 
if(pager)  
{  
   $(pager).pagination({  
       onBeforeRefresh:function(){  
           alert('刷新前。。。。');  
    },  
       onRefresh:function(pageNumber,pageSize){  
           alert(pageNumber);  
           alert(pageSize);  
        },  
       onChangePageSize:function(){  
           alert('pagesize 更变。。。');  
        },  
       onSelectPage:function(pageNumber,pageSize){  
           alert(pageNumber);  
           alert(pageSize);  
        }  
   });  
}




//②构造分页函数，万能的Tools函数! 
//分页数据的操作 :
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