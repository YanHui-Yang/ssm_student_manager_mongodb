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
    <title>成绩管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
    <script src="${pageContext.request.contextPath}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">


    <%--标题--%>
    <div class="row">
        <div class="col-sm-12">
            <h1 class="text-center">成绩信息录入</h1>
        </div>
    </div>

    <%--创建表单--%>
    <div class="row">
        <div class="col-sm-6 col-sm-offset-3">
            <form id="addScore" class="form-horizontal" action="" method="post">
                <div class="form-group">
                    <label for="stuName" class="col-sm-2 control-label">学生姓名</label>
                    <div class="col-sm-10">
                        <input type="text" name="stuName" class="form-control" id="stuName" placeholder="请输入学生姓名">
                    </div>
                </div>
                <div class="form-group">
                    <label for="courseName" class="col-sm-2 control-label">课程名称</label>
                    <div class="col-sm-10">
                        <input type="text" name="courseName" class="form-control" id="courseName" placeholder="请输入课程名称">
                    </div>
                </div>
                <div class="form-group">
                    <label for="score" class="col-sm-2 control-label">成绩</label>
                    <div class="col-sm-10">
                        <input type="number" name="score" class="form-control" id="score" placeholder="请输入成绩">
                    </div>
                </div>
                <div class="form-group" style="margin-top: 20px;">
                    <div class="col-sm-12 col-sm-offset-1">
                        <button type="submit" style="width: 45%" class="btn btn-info">提交</button>
                        <a href="${pageContext.request.contextPath}/score/findAll" style="width: 45%"
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
        $("#addScore").submit(function (e) {
            $.ajax({
                url: "${pageContext.request.contextPath}/score/insert",
                type: "post",
                data: {
                    "stuName": $("#stuName").val(),
                    "courseName": $("#courseName").val(),
                    "score": $("#score").val(),
                }
            })
            e.preventDefault();
            alert("添加成功！")
        })

    })
</script>