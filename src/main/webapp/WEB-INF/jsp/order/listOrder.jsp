<%--
  Created by IntelliJ IDEA.
  User: hu
  Date: 2018-04-23
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <title>管理系统</title>
    <link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
    <link rel="stylesheet" href="jqueryui/style.css">
</head>
<body>

<table border="2px" width="100%">
    <tr align="center">
        <td>
            客户名
        </td>
        <td>
            开始时间
        </td>
        <td>
            结束时间
        </td>

    </tr>
    <tr align="center">
        <td>
            <form action="/erp/queryorder" method="get">
             <input type="text" name="customerName">

            <input type="date" id="from" name="startDate">

            <input type="date" id="to" name="endDate">

            <input type="submit">
            </form>
        </td>

    </tr>
</table>
<%--list--%>
<div class="workingArea">
    <h1 class="label label-info">分类管理</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed" align="center" border="2px" width="100%">
            <thead>
            <tr class="success">
                <th>订单号</th>
                <th>客户名</th>
                <th>日期</th>
                <th>匹数</th>
                <th>重量</th>
                <th>未完成匹数</th>
                <th>品种备注</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${ordertable}" var="order">
                <tr>
                    <td>${order.orderno}</td>
                    <td>${order.customer}</td>
                    <td>${order.date}</td>
                    <td>${order.countofcloth}</td>
                    <td>${order.weight}</td>
                    <td>${order.uncompleted}</td>
                    <td>${order.remarkoftype}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div>
<%--list--%>


</body>
</html>
