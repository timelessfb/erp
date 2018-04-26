<%--
  Created by IntelliJ IDEA.
  User: fb
  Date: 2018/4/25
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>管理系统</title>
    <link rel="stylesheet" href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
    <script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
    <link rel="stylesheet" href="jqueryui/style.css">
    <script type="text/javascript">
        $(document).ready(function () {
            $("p.trace_show").toggle(function () {
                $(this).next("div").show('fast');
            }, function () {
                $(this).next("div").hide('slow');
            });
        });
    </script>
</head>
<body>
<table>
    <tr align="center">
        <td>客户名</td>
        <td>开始日期</td>
        <td>结束日期</td>
    </tr>
    <tr align="center">
        <form action="/erp/queryorder" method="post">
            <td>
                <input type="text" name="customerName" placeholder="请输入查询的客户名">
            </td>
            <td>
                <input type="date" id="from" name="startDate" placeholder="开始时间">
            </td>
            <td>
                <input type="date" id="to" name="endDate" placeholder="结束时间">
            </td>
            <td>
                <input type="submit">
            </td>
        </form>
    </tr>
</table>
<%--list--%>
<div class="workingArea">
    <h1 class="label label-info">订单信息</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed" align="center" border="2px"
               width="100%">
            <thead>
            <tr class="success">
                <th>缸号</th>
                <th>订单号</th>
                <th>生产日期</th>
                <th>生产流程</th>
                <th>当前生产状态</th>
                <%--<th>客户名</th>--%>

            </tr>
            </thead>
            <tbody>
            <%--private String taskno;缸号--%>

            <%--private String orderno;订单号--%>

            <%--private String workblankno;--%>

            <%--private Date dateofproduce;生产日期--%>

            <%--private String colorname;--%>

            <%--private String colorno;--%>

            <%--private String deadline;--%>

            <%--private String type;--%>

            <%--private String weightpercloth;--%>

            <%--private String mouse;--%>

            <%--private String countofclothoftask;--%>

            <%--private String weightoftask;--%>

            <%--private String weightperdoor;--%>

            <%--private String dyetype;--%>

            <%--private String lightsource;--%>

            <%--private String lightface;--%>

            <%--private Double ph;--%>

            <%--private String deoil;--%>

            <%--private String fixation;--%>

            <%--private String polish;--%>

            <%--private String aberration;--%>

            <%--private String detection;--%>

            <%--private String fastness;--%>

            <%--private String application;--%>

            <%--private String slice;--%>

            <%--private String function;--%>

            <%--private String remark;--%>

            <%--private String curstate;当前生产状态--%>

            <%--private String nextstate;--%>
            <%--private byte[] process;生产流程--%>
            <c:forEach items="${tasks}" var="task">
                <p class="trace_show">
                    <tr>
                        <td>${task.taskno}</td>
                        <td>${task.orderno}</td>
                        <td><fmt:formatDate value="${tasks.dateofproduce}" type="date"/></td>
                        <td>${task.process}</td>
                        <td>${task.curstate}</td>
                    </tr>
                </p>
                <div class="trace_content" style="display: none;">
                    <tr>
                        <td>毛坯区号：${task.workblankno}</td>
                        <td>色名：${task.colorname}</td>
                        <td>色号：${task.colorno}</td>
                        <td>交货期：${task.deadline}</td>
                        <td>品种：${task.type}</td>
                        <td>坯布克重：${task.weightpercloth}</td>
                        <td>寸口：${task.mouse}</td>
                        <td>匹数：${task.countofclothoftask}</td>
                        <td>重量：${task.weightoftask}</td>
                        <td>门幅克重：${task.weightperdoor}</td>
                        <td>定染类别：${task.dyetype}</td>
                            <%--<td>对色光源：${task.dyetype}</td>--%>
                        <td>对色面：${task.dyetype}</td>
                        <td>ph值：${task.dyetype}</td>
                        <td>去油：${task.dyetype}</td>
                        <td>固色：${task.dyetype}</td>
                        <td>抛光：${task.dyetype}</td>
                        <td>色差要求：${task.dyetype}</td>
                        <td>检测标准：${task.dyetype}</td>
                        <td>牢度要求：${task.dyetype}</td>
                        <td>产品用途：${task.dyetype}</td>
                        <td>浆边浆切边：${task.dyetype}</td>
                        <td>生理性整理：${task.dyetype}</td>
                        <td>生产备注：${task.dyetype}</td>
                    </tr>
                </div>


            </c:forEach>
            </tbody>
        </table>
    </div>

</div>


</body>
</body>
</html>
