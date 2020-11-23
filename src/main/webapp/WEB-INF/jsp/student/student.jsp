<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>学生管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
    <script src="${pageContext.request.contextPath}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">

    <%--标题--%>
    <div class="row">
        <div class="col-sm-4 col-sm-offset-4">
            <h1 class="text-center">学生管理</h1>
        </div>
    </div>

    <%--添加按钮--%>
    <div class="row" style="margin-bottom: 14px;">
        <div class="col-sm-12">
            <a href="${pageContext.request.contextPath}/page/addStudent" class="btn btn-success">添加</a>
        </div>
    </div>
    <%--表格--%>
    <div class="row" style="height: 600px;">
        <div class="col-sm-12">
            <c:if test="${requestScope.students.size()==0}">
                <h1 class="text-center text-info">
                    还没有任何数据哦~~!!!
                </h1>
            </c:if>
            <c:if test="${requestScope.students.size()>0}">
                <table class="table table-striped table-hover table-bordered">
                    <tr>
                        <th>姓名</th>
                        <th>班级</th>
                        <th>电话</th>
                        <th>成绩</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${requestScope.students}" var="student">
                        <tr>
                            <td>${student.stuName}</td>
                            <td>${student.stuClazz}</td>
                            <td>${student.stuPhone}</td>
                            <td>${student.stuScore}</td>
                            <td id="stuId" style="display: none;">${student.id}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/page/editStudent/${student.id}"
                                   class="btn btn-info">修改</a>
                                <a href="${pageContext.request.contextPath}/student/delete/${student.id}" class="btn btn-danger">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </c:if>
        </div>
    </div>

</div>

</body>