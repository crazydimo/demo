<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/19 0019
  Time: 22:52
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
<form action="issueRecruit" method="post">
    <table border="1px">
        <tr><td>招聘部门：</td>
            <td>
                <select name="rec_department" id="change">
                    <option></option>
                    <c:forEach items="${sessionScope.departmentsAdmin}" var="dep">
                        <option value="${dep.dep_id}">${dep.dep_name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr><td>招聘职位：</td><td><select name="rec_position" id="select2"><option></option></select></td></tr>
        <tr><td>薪　　资：</td><td><input required type="number" name="rec_budget" style="border: 0px" autocomplete="off" style="outline: none"></td></tr>
        <tr><td>职位描述：</td><td><input type="text" name="rec_description" style="border: 0px" required autocomplete="off" style="outline: none"></td></tr>
        <tr><td>福　　利：</td><td><input type="text" name="rec_description" style="border: 0px" required autocomplete="off" style="outline: none"></td></tr>
        <tr><td>职位要求：</td><td><input type="text" name="rec_requirement" style="border: 0px" required autocomplete="off" style="outline: none"></td></tr>
        <tr><td><input type="submit" value="保存"></td></tr>
    </table>
</form>
</body>
</html>