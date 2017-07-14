<html>
<head>
    <title>订单列表</title>
    <#include "header/header.ftl">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-8">
            <br/>
            <div class="panel panel-default">
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>订单号</th>
                        <th>订单类型</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list orderList as order>
                    <tr>
                        <td>${order.id?if_exists}</td>
                        <td>${order.orderNum?if_exists}</td>
                        <td>${order.orderType?if_exists}</td>
                    </tr>
                    </#list>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
