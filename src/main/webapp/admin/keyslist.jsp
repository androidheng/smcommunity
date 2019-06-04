<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>


<html>
<head id="Head1">
    <%@ include file="../common.jsp" %>
<script type="text/javascript">
$(function () {
    $('#grid1').datagrid({
        title: '用户列表',
        nowrap: false,
        striped: true,
        fit: true,
        url: "<%=baseUrl%>/moments/search",
        idField: 'id',
        pagination: true,
        rownumbers: true,
        pageSize: 10,
        pageNumber: 1,
        singleSelect: true,
        fitColumns: true,
        pageList: [5,10, 20, 50, 100, 200, 300, 500, 1000],
        sortName: 'id',
        sortOrder: 'desc',
        columns: [
            [
                //{field: 'ck', checkbox: true},
                {title: 'id', width: 100, field: 'id', sortable: true},
                {title: '日期',width: 300, field: 'createtime',sortable: true},
                {title: '次数', width: 300, field: 'nums',sortable: true},
                {title: '详情',width:100,field:'-',align:'center',
                    formatter: function(value,row,index){
                   // return '<a style="color:blue" href="/arbcase/case-'+row.id+'">'+结账+'</a>';
 						//	return '结账';
 							return '<a style="color:blue" href="javascript:void(0);" onclick=cal("'+row.createtime+'");>详情</a>';
 						//return '<a style="color:blue" href="localhost:8080\\img\\'+row.id+'.jpg">画像</a>';
                   // return '结账';
             } }
            ]
        ], toolbar: [
        	/*{
                text: '新增',
                id: "tooladd",
                disabled: false,
                iconCls: 'icon-add',
                handler: function () {
                    $("#action").val("add");
                    $("#managerDialog").dialog('open');
                    managForm.reset();
                }
            },
            '-',
            {
                text: '修改',
                id: 'tooledit',
                disabled: false,
                iconCls: 'icon-edit',
                handler: function () {
                    $("#action").val("edit");
                    var selected = $('#grid1').datagrid('getSelected');
                    if (selected) {
                        edit(selected);
                    } else {
                        $.messager.alert("提示", "请选择一条记录进行操作");
                    }
                }
            } ,
            '-',
            {
                text: '删除',
                id: 'tooldel',
                disabled: false,
                iconCls: 'icon-remove',
                handler: function () {
                    var rows = $('#grid1').datagrid('getSelections');
                    if (rows.length) {
                        var ids = "";
                        for (var i = 0; i < rows.length; i++) {
                            ids += rows[i].id + ",";
                        }
                        ids = ids.substr(0, (ids.length - 1));
                        $.messager.confirm('提示', '确定要删除吗？', function (r) {
                            if (r) {
                                deleteItem(ids);
                            }
                        });
                    } else {
                        $.messager.alert("提示", "请选择一条记录进行操作");
                    }
                }
            } */
        ]
    });

    document.onkeydown=function (e){
        e = e ? e : event;
        if(e.keyCode == 13){
            query();
        }
    }

});

function save() {
    $('#managForm').form('submit', {
        url: "<%=baseUrl%>/user/addOrUpdate",
        onSubmit: function () {
            return inputCheck();
        },
        success: function (data) {
        	console.log(data)
            closeBackGround();
            $.messager.alert("提示", data, "info", function () {
                closeFlush();
            });
        }
    });
}

/* function edit(obj) {
	var id = obj.id;
    $("#id").val(id);
    $("#username").val(obj.username);
    $("#password").val(obj.password);
    $("#sex").val(obj.sex);
    $("#managerDialog").dialog('open');
} */

function deleteItem(uuid) {
    openBackGround();
    $.post("<%=baseUrl%>/user/deleteItem", {id: uuid}, function (data) {
        closeBackGround();
        closeFlush();
    });
}

function cancel() {
    $.messager.confirm('提示', '是否要关闭？', function (r) {
        if (r) {
            closeFlush();
        }
    });
}

function query() {
    $('#grid1').datagrid('load', serializeObject($('#searchForm')));
}


function closeFlush() {
    //managForm.reset();
    $("#managerDialog").dialog('close');
    //$("#grid1").datagrid("reload");
}

function inputCheck() {
    if (!($("#managForm").form("validate"))) {
        return false;
    }
    openBackGround();
    return true;
}



function setNull(){
    searchForm.reset();
}
function cal(createtime){
	
     //window.location.href="${pageContext.request.contextPath }/img/"+id+".jpg";
    var key= $("#key").val();
    if(key==''){
    	alert("请输入关键字");
    	return ;
    }
	edit(key,createtime);
};
function edit(key,createtime) {
    $('#grid2').datagrid({
        title: '详情列表',
        nowrap: false,
        striped: true,
        fit: true,
        url: '<%=baseUrl%>/moments/detail?key='+key+'&date='+createtime,
        idField: 'id',
        pagination: true,
        rownumbers: true,
        pageSize: 10,
        pageNumber: 1,
        singleSelect: true,
        fitColumns: true,
        pageList: [5,10, 20, 50, 100, 200, 300, 500, 1000],
        sortName: 'id',
        sortOrder: 'desc',
        columns: [
            [
                //{field: 'ck', checkbox: true},
                {title: '评论内容',width: 300, field: 'content',sortable: true}
            ]
        ], toolbar: [
        	/*{
                text: '新增',
                id: "tooladd",
                disabled: false,
                iconCls: 'icon-add',
                handler: function () {
                    $("#action").val("add");
                    $("#managerDialog").dialog('open');
                    managForm.reset();
                }
            },
            '-',
            {
                text: '修改',
                id: 'tooledit',
                disabled: false,
                iconCls: 'icon-edit',
                handler: function () {
                    $("#action").val("edit");
                    var selected = $('#grid1').datagrid('getSelected');
                    if (selected) {
                        edit(selected);
                    } else {
                        $.messager.alert("提示", "请选择一条记录进行操作");
                    }
                }
            } ,
            '-',
            {
                text: '删除',
                id: 'tooldel',
                disabled: false,
                iconCls: 'icon-remove',
                handler: function () {
                    var rows = $('#grid1').datagrid('getSelections');
                    if (rows.length) {
                        var ids = "";
                        for (var i = 0; i < rows.length; i++) {
                            ids += rows[i].id + ",";
                        }
                        ids = ids.substr(0, (ids.length - 1));
                        $.messager.confirm('提示', '确定要删除吗？', function (r) {
                            if (r) {
                                deleteItem(ids);
                            }
                        });
                    } else {
                        $.messager.alert("提示", "请选择一条记录进行操作");
                    }
                }
            } */
        ]
    });

    document.onkeydown=function (e){
        e = e ? e : event;
        if(e.keyCode == 13){
            query();
        }
    }
    $("#managerDialog").dialog('open');
}

</script>
</head>
<body class="easyui-layout">
<div region="north" border="false" style="height:3px;overflow: hidden"></div>
<div region="west" border="false" style="width:3px;"></div>
<div region="east" border="false" style="width:3px;"></div>
<div region="south" border="false" style="height:3px;overflow: hidden"></div>
<div region="center" border="false">
    <div id="main" class="easyui-layout" fit="true" style="width:100%;height:100%;">
        <div region="north" id="" style="height:100%;" class="" title="查询条件">
            <form action="" id="searchForm" name="searchForm" method="post" align="center">
                <table cellpadding="5" cellspacing="0" class="tb_search" align="center">
                    <tr>
                        <td width="2%" >
                            <label for="sname">关键词：</label>
                            <input type="text" id="key" name="key"  maxlength="32"/>
                        </td>
                        <td width="10%" >
                            <label for="sname">开始日期：</label>
                            <input id="startdate" name="startdate" type="text" class="easyui-datebox" required="required">
                            <label for="sname">结束日期：</label>
                            <input id="enddate" name="enddate" type="text" class="easyui-datebox" required="required">
                        </td>
                        <td width="10%">
                            <a href="#" onclick="query();" id="querylink" class="easyui-linkbutton"
                               iconCls="icon-search">查询</a>
                            <a href="#" onclick="setNull();" class="easyui-linkbutton" iconCls="icon-redo">重置</a>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <div region="center" border="false" style="padding:3px 0px 0px 0px;overflow:hidden">

            <table id="grid1"></table>

        </div>
    </div>
</div>


<div id="managerDialog" class="easyui-dialog" title="用户管理" style="width:450px;height:350px;" toolbar="#dlg-toolbar"
     buttons="#dlg-buttons2" resizable="true" modal="true" closed='true'>
        <table id="grid2"></table>


    <div id="dlg-buttons2">
        <a href="#" class="easyui-linkbutton" onclick="cancel();">关闭</a>
    </div>
</div>



</body>
</html>