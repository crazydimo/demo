<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/17 0017
  Time: 10:05
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
    <a href="toCreateDepartment">创建部门和职位</a>
</div>
<div>
    <a href="toPostRecruitment">发布招聘信息</a>
</div>
<div>
    <h3>已收到的简历</h3>
    <ul>
        <li>
            招聘id简历id
        </li>
        <c:forEach items="${sessionScope.rarsAdmin}" var="rar">
        <li>
            ${rar.rar_recId}${rar.rar_resId}
            <a href="adminResume?res_id=${rar.rar_resId}&rar_id=${rar.rar_id}">查看简历</a>
        </li>
    </c:forEach>
    </ul>
</div>
<div>
    <h3>面试</h3>
    <ul>
        <li>
            面试id用户id
        </li>
        <c:forEach items="${sessionScope.interviewsAdmin}" var="inte">
            <li>
                    ${inte.int_id}${inte.int_uid}
            </li>
            <a href="hire?inte_id=${inte.int_id}">录用</a>
            <a href="refuseAdmin?inte_id=${inte.int_id}">拒绝</a>
        </c:forEach>
    </ul>
</div>
</body>
</html>