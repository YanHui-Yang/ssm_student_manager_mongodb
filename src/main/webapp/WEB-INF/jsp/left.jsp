<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
<script src="${pageContext.request.contextPath}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<style>
    body, ul, li {
        background: #eee;
    }

    .list-group-item {
        background: #eee;
    }
</style>
<body>
<ul class="list-group text-center" style="margin-top: 70px;">

    <li class="list-group-item"><a href="${pageContext.request.contextPath}/student/findAll" target="content">学生管理</a>
    </li>
    <li class="list-group-item"><a href="${pageContext.request.contextPath}/teacher/findAll" target="content">教师管理</a>
    </li>
    <li class="list-group-item"><a href="${pageContext.request.contextPath}/course/findAll" target="content">课程管理</a>
    </li>
    <li class="list-group-item"><a href="${pageContext.request.contextPath}/score/findAll" target="content">成绩管理</a>
    </li>
    <li class="list-group-item"><a href="${pageContext.request.contextPath}/user/findAll" target="content">用户管理</a>
    </li>
</ul>
</body>
