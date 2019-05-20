<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/17 0017
  Time: 14:46
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
<form action="addInterview" method="post">
    <input type="date" name="int_time">
    <input name="int_address">
    <input name="int_linkman">
    <input type='hidden' id='uid' name='int_uid' value="${sessionScope.user.user_id}">
    <input type="hidden" name="int_rarId" value="${sessionScope.rarAdmin.int_rarId}">
    <input type="submit" value="发送面试">
</form>
</body>
</html>