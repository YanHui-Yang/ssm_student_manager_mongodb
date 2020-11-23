<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
<script src="${pageContext.request.contextPath}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">班级管理系统
                <small>V1.0</small>
            </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

            <ul class="nav navbar-nav navbar-right">
                <c:if test="${sessionScope.user!=null}">
                    <li><a href="javascript:;">欢迎: <span class="text-danger">${sessionScope.user.username}</span></a></li>
                    <a href="${pageContext.request.contextPath}/user/logout" target="_top" type="button"
                       class="btn btn-danger navbar-btn">退出</a>
                </c:if>
                <c:if test="${sessionScope.user==null}">
                    <li><a href="javascript:;"><span class="text-info">您当前还是访客身份,赶紧去登录吧~~</span></a></li>
                    <a href="${pageContext.request.contextPath}/user/login" target="_top" type="button"
                       class="btn btn-primary navbar-btn">登录</a>
                </c:if>
            </ul>
        </div>
    </div>
</nav>