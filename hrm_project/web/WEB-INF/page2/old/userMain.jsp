<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/15 0015
  Time: 16:24
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
<script src="../../../js/jquery-3.1.0.js"></script>

<body>
<a href="toIndex">注销</a>
<a href="toResume">填写简历</a>
<a href="showResume">查看简历</a>
<a href="showRAR">我的投递</a>
<div class="rec">
    <h3>招聘信息</h3>
    <c:choose>
        <c:when test="${sessionScope.recruits != null && fn:length(sessionScope.recruits) != 0}">
            <ul >
                <c:forEach items="${sessionScope.recruits}" var="r">
                    <li class="recs">
                        <a href="toRecruit">
                                ${r.rec_posId}
                                ${r.rec_budget}
                                ${r.rec_welfare}
                                ${r.rec_requirement}
                        </a>
                    </li>
                    <form action="dropResume" method="post">
                        <input type="hidden" name="rar_recId" value="${r.rec_id}">
                        <input type="hidden" name="rar_resId" value="${sessionScope.resume.res_id}">
                        <input type="submit" value="投递简历">
                    </form>
                </c:forEach>
            </ul>
        </c:when>
        <c:otherwise>
            <h3>没有信息</h3>
        </c:otherwise>
    </c:choose>
</div>
</body>
</html>