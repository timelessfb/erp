<%--<?xml version="1.0" encoding="UTF-8"?>--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>闽三元登陆</title>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <h2 class="text-center">
                闽三元染整漂染生产流转管理系统
            </h2>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span4">
        </div>
        <div class="span6">
            <form class="form-horizontal" action="login">
                <div class="control-group">
                    <label class="control-label" for="inputID">账号</label>
                    <div class="controls">
                        <input id="inputID" name="phoneno" type="text"/>
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputPassword">密码</label>
                    <div class="controls">
                        <input id="inputPassword" name="password" type="password"/>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <button class="btn" type="submit">登陆</button>
                    </div>
                </div>
            </form>
        </div>
        <div class="span2">
        </div>
    </div>
</div>
</body>
</html>