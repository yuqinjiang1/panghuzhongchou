//添加用户
function newUser(){
	$('#dlg').dialog('open').dialog('setTitle','New User');
	$('#fm').form('clear');
	url = "user/Save";
}


$('#dg').datagrid({
    columns : [ [ //添加列  
        {
            field : 'userId', //绑定数据源ID  
            title : '用户主键', //显示列名称
            align : 'center', //内容在列居中
            width : 100 //列的宽度
        },
        {
            field : 'name',
            title : '姓名',
            align : 'center',
            width : 100
        },
        {
            field : 'phone',
            title : '电话',
            align : 'center',
            width : 100
        },
        {
            field : 'email',
            title : '邮箱',
            align : 'center',
            width : 100
        },
       
    ] ],
    pagination : true, //开启分页
    url : 'getEasyUIResult', //获取数据地址
    loadFilter : pagerFilter, //①调用分页函数
});

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