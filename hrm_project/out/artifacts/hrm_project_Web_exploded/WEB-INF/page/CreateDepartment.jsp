<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/19 0019
  Time: 20:00
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
    <script src="js/jquery-3.1.0.js"></script>
    <script>
        $(function () {
            $("#change").change(function () {
                $.get("queryPosition",{"dep_id":$(this).val()},function (obj) {
                    $("#select2 option").remove();
                    for (var i in obj) {
                        $("#select2").append("<option value='"+obj[i]['pos_id']+"'>"+obj[i]['pos_name']+"</option>")
                    }
                })
            })
        })
    </script>
</head>
<body>
<div>
    <h3>创建部门</h3>
    <form action="createDepartment" method="post">
        部门名：<input name="dep_name">
        <input type="submit" value="创建">
    </form>
</div>
<div>
    <h3>创建职位</h3>
    <form action="createPosition" method="post">
        部门名：<select name="pos_depId" id="change">
            <option></option>
            <c:forEach items="${sessionScope.departmentsAdmin}" var="dep">
                <option value="${dep.dep_id}">${dep.dep_name}</option>
            </c:forEach>
        </select>
        职位名：<input name="pos_name">
        <input type="submit" value="创建">
    </form>
</div>
</body>
</html>