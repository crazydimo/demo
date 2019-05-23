<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/15 0015
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>Title</title>
</head>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="css/index.css" type="text/css" rel="stylesheet">
<script src="js/jquery-3.1.0.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
    $(function () {
        $(".rec").hide();
        $(".log2").hide();
        $(".log3").hide();
        $("#l1").click(function () {
            $(".syn").show();
            $(".rec").hide();
        });
        $("#l2").click(function () {
            $(".rec").show();
            $(".syn").hide();
        });
        $("#l3").click(function () {
            $(".log1").show();
            $(".log2").hide();
            $(".log3").hide();
        });
        $("#l4").click(function () {
            $(".log2").show();
            $(".log1").hide();
            $(".log3").hide();
        });
        $("#l5").click(function () {
            $(".log3").show();
            $(".log1").hide();
            $(".log2").hide();
        });
    })
</script>
<body>
<%
  session.removeAttribute("user");
  session.removeAttribute("resume");
%>
<div class="nav_f">
    <h1 class="title">小高在吗有限公司</h1>
    <div class="nav">
        <ul>
            <li class="avi" id="l1"><a >了解小高</a></li>
            <li class="avi" id="l2"><a >招聘信息</a></li>
            <li class="avi" id="l3"><a>用户登录</a></li>
            <li class="avi" id="l5"><a>员工登录</a></li>
            <li class="avi" id="l4"><a>管理员登录</a></li>

        </ul>
    </div>
</div>

<div class="log1">
    <h2>用户登录</h2>
    <form action="userLogin" method="post">
        用户名：<input name="user_name"><br>
        密　码：<input name="user_pass"><br>
        <input type="submit" value="登录">
    </form>
    <a data-toggle="modal" data-target="#exampleModal">还没有账号？去注册</a>
</div>
<div class="log2">
    <h2>管理员登录</h2>
    <form action="adminLogin" method="post">
        用户名：<input name="admin_name"><br>
        密　码：<input name="admin_pass"><br>
        <input type="submit" value="登录">
    </form>
</div>
<div class="log3">
    <h2>员工登录</h2>
    <form action="loginEmployee" method="post">
        用户名：<input name="emp_account"><br>
        密　码：<input name="emp_pass"><br>
        <input type="submit" value="登录">
    </form>
</div>

<div class="syn">
    <h3>公司简介</h3>
</div>

<div class="rec">
    <h3>招聘信息</h3>
    <c:choose>
        <c:when test="${sessionScope.recruits != null && fn:length(sessionScope.recruits) != 0}">
                <c:forEach items="${sessionScope.recruits}" var="r">
                    <a href="showRecruit?rec_id=${r.rec_id}">
                        <div class="recs">
                            <div class="rec_posId">${r.rec_posId}</div>
                            <div class="rec_budget">${r.rec_budget}</div>
                        </div>
                        <div class="recs">
                            <div class="rec_requirement">${r.rec_requirement}</div>
                            <div class="rec_time">${r.rec_time}</div>
                            <div class="dropResume"><a href="dropResume">投递简历</a></div>
                        </div>
                    </a>
                </c:forEach>
        </c:when>
        <c:otherwise>
            <h3>没有信息</h3>
        </c:otherwise>
    </c:choose>
</div>

<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="exampleModalLabel">用户注册</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" action="register" method="post">
                    <div class="form-group">
                        <label for="recipient-name"  class="col-sm-2 control-label">用户名：</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="user_name" id="recipient-name" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="recipient-pass"  class="col-sm-2 control-label">密　码：</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" name="user_pass" id="recipient-pass"  required>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default">注册</button>
                        </div>
                    </div>
                </form>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="js/jquery-3.1.0.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>