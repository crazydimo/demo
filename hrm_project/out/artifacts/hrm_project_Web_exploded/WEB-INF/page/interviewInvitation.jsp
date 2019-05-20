<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/17 0017
  Time: 9:14
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
    <ul>
        待面试
        <c:forEach items="${sessionScope.interviews}" var="inte">
                <c:if test="${inte.int_state == 1}">
                    <li>
                        <a>
                                ${inte.int_time}
                                ${inte.int_address}
                                ${inte.int_linkman}
                        </a>
                    </li>
                    <a href="toInterview?int_id=${inte.int_id}">去面试</a>
                    <a href="refuseInterview?int_id=${inte.int_id}">拒绝</a>
                </c:if>
        </c:forEach>
    </ul>
</div>
<div>
    <ul>
        面试结果
        <c:forEach items="${sessionScope.interviews}" var="inte">
            <c:choose>
                <c:when test="${inte.int_state==2}">
                    <li>
                        <a>
                                ${inte.int_time}
                                ${inte.int_address}
                                ${inte.int_linkman}
                        </a>
                        <h5>等待消息</h5>
                    </li>
                </c:when>
                <c:when test="${inte.int_state==3}">
                    <li>
                        <a>
                                ${inte.int_time}
                                ${inte.int_address}
                                ${inte.int_linkman}
                        </a>
                        <h5>已拒绝</h5>
                    </li>
                </c:when>
                <c:otherwise>
                    <li>
                        <a>
                                ${inte.int_time}
                                ${inte.int_address}
                                ${inte.int_linkman}
                        </a>
                        <h5>同意</h5>
                    </li>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </ul>
</div>
</body>
</html>