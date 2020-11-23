<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <link href="<%=basePath%>/static/bootstrap-4.1.3-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="<%=basePath%>/static/jquery-3.3.1/jquery-3.3.1.min.js"></script>
    <base href="<%=basePath%>">
    <title>首页</title>
</head>
<body>
<body background="<%=basePath%>/static/img/81.gif">
<div align="right" style="margin-right: 20px">
    请<a href="<%=basePath%>page/login">登录</a>
</div>
<div align="center">
    <h1>学生管理系统</h1>
</div>
</body>
</html>
