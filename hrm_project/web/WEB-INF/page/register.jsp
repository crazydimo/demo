<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/15 0015
  Time: 15:25
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
<body>
<div class="reg">
    <form action="register" method="post">
        用户名：<input name="user_name" required><br>
        密　码：<input name="pass_name" required><br>
        <input type="submit" value="注册">
    </form>
</div>
</body>
</html>