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
    <title>课程管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
    <script src="${pageContext.request.contextPath}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">


    <%--标题--%>
    <div class="row">
        <div class="col-sm-12">
            <h1 class="text-center">课程信息录入</h1>
        </div>
    </div>

    <%--创建表单--%>
    <div class="row">
        <div class="col-sm-6 col-sm-offset-3">
            <form id="addCourse" class="form-horizontal" action="" method="post">
                <div class="form-group">
                    <label for="courseName" class="col-sm-2 control-label">课名</label>
                    <div class="col-sm-10">
                        <input type="text" name="courseName" class="form-control" id="courseName" placeholder="请输入课程名称">
                    </div>
                </div>
                <div class="form-group">
                    <label for="courseHour" class="col-sm-2 control-label">课时</label>
                    <div class="col-sm-10">
                        <input type="text" name="courseHour" class="form-control" id="courseHour" placeholder="请输入课时">
                    </div>
                </div>
                <div class="form-group" style="margin-top: 20px;">
                    <div class="col-sm-12 col-sm-offset-1">
                        <button type="submit" style="width: 45%" class="btn btn-info">提交</button>
                        <a href="${pageContext.request.contextPath}/course/findAll" style="width: 45%"
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
        $("#addCourse").submit(function (e) {
            $.ajax({
                url: "${pageContext.request.contextPath}/course/insert",
                type: "post",
                data: {
                    "courseName": $("#courseName").val(),
                    "courseHour": $("#courseHour").val(),
                }
            })
            e.preventDefault();
            alert("添加成功！")
        })

    })
</script>