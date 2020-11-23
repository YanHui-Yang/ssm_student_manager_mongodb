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
        <div class="col-sm-12">
            <h1 class="text-center">学生信息录入</h1>
        </div>
    </div>

    <%--创建表单--%>
    <div class="row">
        <div class="col-sm-6 col-sm-offset-3">
            <form id="editStudent" class="form-horizontal" action="" method="post">
                <input type="hidden" id="id" name="id" value="${student.id}">
                <div class="form-group">
                    <label for="stuName" class="col-sm-2 control-label">姓名</label>
                    <div class="col-sm-10">
                        <input type="text" name="stuName" class="form-control" id="stuName" value="${student.stuName}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="stuClazz" class="col-sm-2 control-label">班级</label>
                    <div class="col-sm-10">
                        <input type="text" name="stuClazz" class="form-control" id="stuClazz"
                               value="${student.stuClazz}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="stuPhone" class="col-sm-2 control-label">电话</label>
                    <div class="col-sm-10">
                        <input type="text" name="stuPhone" class="form-control" id="stuPhone"
                               value="${student.stuPhone}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="stuScore" class="col-sm-2 control-label">成绩</label>
                    <div class="col-sm-10">
                        <input type="text" name="stuScore" class="form-control" id="stuScore"
                               value="${student.stuScore}">
                    </div>
                </div>
                <div class="form-group" style="margin-top: 20px;">
                    <div class="col-sm-12 col-sm-offset-1">
                        <button type="submit" style="width: 45%" class="btn btn-info">提交</button>
                        <a href="${pageContext.request.contextPath}/student/findAll" style="width: 45%"
                           class="btn btn-danger">返回列表</a>
                    </div>
                </div>
            </form>
        </div>
    </div>

</div>


</body>

<script>
    $(function () {
        $("#editStudent").submit(function (e) {
            $.ajax({
                url: "${pageContext.request.contextPath}/student/insert",
                type: "post",
                data: {
                    "id": $("#id").val(),
                    "stuName": $("#stuName").val(),
                    "stuClazz": $("#stuClazz").val(),
                    "stuPhone": $("#stuPhone").val(),
                    "stuScore": $("#stuScore").val(),
                }
            })
            e.preventDefault();
            alert("修改成功！")
        })

    })
</script>