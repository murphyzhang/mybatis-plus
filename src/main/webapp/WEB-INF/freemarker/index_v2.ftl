<html>
<head>
    <title>用户列表</title>
    <#include "header/header.ftl">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-8">
            <br/>
            <div class="panel panel-default">
                <div class="panel-body">
                    <button type="button" onclick="preSave()" class="btn btn-default">添加</button>
                </div>
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>姓名</th>
                        <th>年龄</th>
                        <th>创建时间</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list userList as user>
                    <tr>
                        <td>10000 + ${user.id}</td>
                        <td>${user.name}</td>
                        <td>${user.age}</td>
                        <td>${user.ctime?string("yyyy-MM-dd HH:mm:ss")}</td>
                        <td>
                            <a href="javascript:void(0);" onclick="preSave('${user.id}')" title="编辑">
                                <i class="glyphicon glyphicon-edit"></i>
                            </a>
                            <a href="javascript:void(0);" onclick="del('${user.id}')" title="删除">
                                <i class="glyphicon glyphicon-remove"></i>
                            </a>
                        </td>
                    </tr>
                    </#list>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<script>
    function preSave(id) {
        if (id == undefined || id == null || id == '') {
            window.location.href = '${ctx}/preSave';
        } else {
            window.location.href = '${ctx}/preSave?id=' + id;
        }
    }

    function del(id) {
        $.ajax({
            type: 'POST',
            url: '${ctx}/delete',
            data: {
                id: id
            },
            dataType: 'json',
            success: function (data) {
                alert(data.msg);
                if (data.success) {
                    setTimeout('toIndex()', 100);
                }
            },
            error: function () {
                alert("出错了,请重试!");
            }
        });
    }
</script>
</body>
</html>
