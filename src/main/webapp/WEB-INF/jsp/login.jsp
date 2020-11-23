<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
    <script src="${pageContext.request.contextPath}/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <base href="<%=basePath%>">
    <title>学生管理系统首页</title>
</head>
<body background="<%=basePath%>/static/img/96.jpg">
<div align="center" class="alert alert-warning">
    <h2>系统用户登录</h2>
</div>

<div class="alert alert-success" align="center" style="margin-top: 30px">
    <h4>${msg}</h4>
</div>

<div style="margin-top: 50px" align="center">
    <form action="<%=basePath%>user/login" method="post">
        工号/学号<input type="text" name="username"><br/><br/>
        &nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;
        <input type="password" name="password"><br/><br/>
        <input class="btn btn-warning" type="reset" value="重置">
        <input class="btn btn-success" type="submit" value="登录">
    </form>
</div>
</body>
</html>
