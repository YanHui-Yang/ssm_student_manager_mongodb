<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"/>

<div class="jumbotron">
    <div class="container">
        <h1>Hello, world!</h1>
        <p>This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured
            content or informatio...</p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>

        <p>磁盘使用率:(40%)</p>
        <div class="progress">
            <div class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="40"
                 aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                <span class="sr-only">40% Complete (success)</span>
            </div>
        </div>
        <p>内存使用率:(20%)</p>
        <div class="progress">
            <div class="progress-bar progress-bar-info progress-bar-striped" role="progressbar" aria-valuenow="20"
                 aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                <span class="sr-only">20% Complete</span>
            </div>
        </div>
        <p>cpu使用率:(60%)</p>
        <div class="progress">
            <div class="progress-bar progress-bar-warning progress-bar-striped" role="progressbar" aria-valuenow="60"
                 aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                <span class="sr-only">60% Complete (warning)</span>
            </div>
        </div>
        <p>数据库使用率:(80%)</p>
        <div class="progress">
            <div class="progress-bar progress-bar-danger progress-bar-striped" role="progressbar" aria-valuenow="80"
                 aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                <span class="sr-only">80% Complete (danger)</span>
            </div>
        </div>

        <div class="row" style="margin-top: 20px;">
            <div class="col-sm-6 col-md-4">
                <div class="thumbnail">
                    <img src="${pageContext.request.contextPath}/static/img/home.jpeg" >
                    <div class="caption">
                        <h3>班级管理系统V1.0</h3>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4">
                <div class="thumbnail">
                    <img src="${pageContext.request.contextPath}/static/img/home.jpeg" >
                    <div class="caption">
                        <h3>班级管理系统V1.0</h3>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4">
                <div class="thumbnail">
                    <img src="${pageContext.request.contextPath}/static/img/home.jpeg" >
                    <div class="caption">
                        <h3>班级管理系统V1.0</h3>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>