<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/17 0017
  Time: 13:23
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
<form action='toArrangeInterview' method='post'>
    <table border='1'>
        <tr>
            <td colspan='4' align='center'><span>个人简历</span></td>
        </tr>
        <tr>
            <input type="hidden" name="res_id" value="${sessionScope.resumeAdmin.res_id}">
            <td>姓名:</td><td><input type='text' maxlength='8' name='res_name' required style='border: 0' value="${sessionScope.resumeAdmin.res_name}"></td>
            <td>性别:</td><td><input type='text' name='res_sex' value='${sessionScope.resumeAdmin.res_sex}' required></td>
        </tr>
        <tr>
            <td>出生年月日：</td><td><input style='border: 0' type='date' name='res_birthday' value="${sessionScope.resumeAdmin.res_birthday}" required></td>
            <td>民族：</td><td><input  style='border: 0' type='text' name='res_nation' maxlength='8' value="${sessionScope.resumeAdmin.res_nation}"  required></td>
        </tr>
        <tr>
            <td>籍贯：</td><td><input  style='border: 0' type='text' maxlength='8' value="${sessionScope.resumeAdmin.res_nativePlace}" name='res_nativePlace' required></td>
            <td>毕业院校：</td><td><input  style='border: 0' type='text' name='res_school' maxlength='20' value="${sessionScope.resumeAdmin.res_school}" required></td>
        </tr>
        <tr>
            <td>政治面貌：</td><td><input  style='border: 0' type='text' name='res_politics' maxlength='10' value="${sessionScope.resumeAdmin.res_politics}"  required></td>
            <td>专业:</td><td><input  style='border: 0' type='text' name='res_major' maxlength='20' value="${sessionScope.resumeAdmin.res_major}" required></td>
        </tr>
        <tr>
            <td>学历：</td><td><input  style='border: 0' type='text' name='res_education' maxlength='10' value="${sessionScope.resumeAdmin.res_education}" required></td>
            <td>邮政编码：</td><td><input  style='border: 0' type='number' maxlength='6' value="${sessionScope.resumeAdmin.res_zipCode}" name='res_zipCode' required></td>
        </tr>
        <tr>
            <td>电话号码：</td><td><input  style='border: 0' type='number' maxlength='11' value="${sessionScope.resumeAdmin.res_phone}" name='res_phone' required></td>
            <td>E-MAIL</td><td><input  style='border: 0' type='text' name='res_email' value='${sessionScope.resumeAdmin.res_email}' required></td>
        </tr>
        <tr>
            <td>现住址：</td><td colspan='3'><input  style='border: 0' required type='text' maxlength='50' value="${sessionScope.resumeAdmin.res_address}" name='res_address'></td>
        </tr>
        <tr>
            <td colspan='4' align='center'>自我描述</td>
        </tr>
        <tr>
            <td colspan='4'><textarea name='res_evaluation' maxlength='225'>${sessionScope.resumeAdmin.res_evaluation}</textarea></td>
        </tr>
    </table>
    <input align='center' type='submit' value='安排面试'>
</form>
</body>
</html>