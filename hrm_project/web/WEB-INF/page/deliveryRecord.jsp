<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/16 0016
  Time: 21:19
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
        <li>
            投递成功
        </li>
        <li>
            被查看
        </li>
        <li>
            待面试
        </li>
        <li>
            不合适
        </li>
    </ul>
</div>
<div>
    <c:forEach items="${sessionScope.rars}" var="rar">
        <c:forEach items="${sessionScope.recruits}" var="rec">
            <c:choose>
                <c:when test="${rar.rar_recId == rec.rec_id}">
                    <c:choose>
                        <c:when test="${rar.rar_state == 1}">
                            <h3>投递成功</h3>
                            <ul>
                                <li class="recs">
                                    <a href="toRecruit">
                                            ${rec.rec_posId}
                                            ${rec.rec_budget}
                                            ${rec.rec_welfare}
                                            ${rec.rec_requirement}
                                    </a>
                                </li>
                            </ul>
                        </c:when>
                        <c:when test="${rar.rar_state == 2}">
                            <h3>被查看</h3>
                            <ul>
                                <li class="recs">
                                    <a href="toRecruit">
                                            ${rec.rec_posId}
                                            ${rec.rec_budget}
                                            ${rec.rec_welfare}
                                            ${rec.rec_requirement}
                                    </a>
                                </li>
                            </ul>
                        </c:when>
                        <c:when test="${rar.rar_state == 3}">
                            <h3>面试信息</h3>
                            <ul>
                                <li class="recs">
                                    <a href="showInterview">
                                            ${rec.rec_posId}
                                            ${rec.rec_budget}
                                            ${rec.rec_welfare}
                                            ${rec.rec_requirement}
                                    </a>
                                </li>
                            </ul>
                        </c:when>
                    </c:choose>
                </c:when>
            </c:choose>
        </c:forEach>
    </c:forEach>
</div>

</body>
</html>