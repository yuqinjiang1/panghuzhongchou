function doSearch() {
    var $uname = $('#searchByName')
    var ByName = $uname.val()

    $('#dg').datagrid({
        //这个的作用类似 Ajax 了！向后台传递数据
        queryParams: {          
            name: ByName            
          },   
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
        name : ByName,
        url : 'getEasyUISearchResult', //获取数据地址,
        	 
        loadFilter : pagerFilter, //①调用分页函数
    });
}