<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    $(function() {

        $('#pid').combotree({
            //url : '${path }/sys/systemResource/showTree.action',
            parentField : 'pid',
            lines : true,
            panelHeight : 'auto',
            value : '${systemResource.pid}'
        });
        
        $('#resourceEditForm').form({
            url : '${path }/sys/systemResource/edit.action',
            onSubmit : function() {
                progressLoad();
                var isValid = $(this).form('validate');
                if (!isValid) {
                    progressClose();
                }
                return isValid;
            },
            success : function(result) {
                progressClose();
                result = $.parseJSON(result);
                if (result.code==200) {
                    parent.$.modalDialog.openner_treeGrid.treegrid('reload');//之所以能在这里调用到parent.$.modalDialog.openner_treeGrid这个对象，是因为resource.jsp页面预定义好了
                    parent.$.modalDialog.handler.dialog('close');
                } else {
                    parent.$.messager.alert('提示', result.message, 'warning');
                }
            }
        });

        $("#status").val('${systemResource.status}');
        $("#resourcetype").val('${systemResource.resourcetype}');
    });
</script>
<div style="padding: 3px;">
    <form id="resourceEditForm" method="post">
        <table  class="grid">
            <tr>
                <td>资源名称</td>
                <td><input name="id" type="hidden"  value="${systemResource.id}" >
                <input name="name" type="text" placeholder="请输入资源名称" value="${systemResource.name}" class="easyui-validatebox span2" data-options="required:true" ></td>
                <td>资源类型</td>
                <td><select id="resourcetype" name="resourcetype" class="easyui-combobox" data-options="width:140,height:29,editable:false,panelHeight:'auto'">
                            <option value="0">菜单</option>
                            <option value="1">按钮</option>
                </select></td>
            </tr>
            <tr>
                <td>资源路径</td>
                <td><input name="url" type="text" value="${systemResource.url}" placeholder="请输入资源路径" class="easyui-validatebox span2" ></td>
                <td>排序</td>
                <td><input name="seq" value="${systemResource.seq}"  class="easyui-numberspinner" style="width: 140px; height: 29px;" required="required" data-options="editable:false"></td>
            </tr>
            <tr>
                <td>菜单图标</td>
                <td ><input  name="icon" value="${systemResource.icon}"/></td>
                <td>状态</td>
                <td ><select id="status" name="status" class="easyui-combobox" data-options="width:140,height:29,editable:false,panelHeight:'auto'">
                            <option value="0">正常</option>
                            <option value="1">停用</option>
                </select></td>
            </tr>
            <tr>
                <td>上级资源</td>
                <td colspan="3"><select id="pid" name="pid" style="width: 200px; height: 29px;"></select>
                <a class="easyui-linkbutton" href="javascript:void(0)" onclick="$('#pid').combotree('clear');" >清空</a></td>
            </tr>
        </table>
    </form>
</div>