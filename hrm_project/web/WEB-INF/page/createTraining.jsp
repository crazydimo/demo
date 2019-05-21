<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/20 0020
  Time: 16:59
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
<div>
    <form action="addTraining" method="post">
        主题：<input type="text" name="tra_title">
        内容：<input type="text" name="tra_content">
        地点：<input type="text" name="tra_address">
        开始时间：<input type="date" name="tra_startTime">
        结束时间：<input type="date" name="tra_endTime">
        <input type="submit" value="创建培训">
    </form>
</div>
</body>
</html>