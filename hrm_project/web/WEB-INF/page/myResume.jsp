<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/15 0015
  Time: 18:54
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
<form action='addResume' method='post'>
    <table border='1'>
        <tr>
            <td colspan='4' align='center'><input type='text' value='我的个人简历'></td>
        </tr>
        <tr>
            <td>姓名:</td><td><input type='text' maxlength='8' placeholder='最多输入八个字符' name='res_name' required style='border: 0' ></td><td>性别:</td><td>
            <input type='radio' name='res_sex' value='男' required>男<input type='radio' name='res_sex' value='女' required>女</td>
        </tr>
        <tr>
            <td>出生年月日：</td><td><input style='border: 0' type='date' name='res_birthday' required></td><td>民族：</td>
            <td><input  style='border: 0' type='text' name='res_nation' maxlength='8' placeholder='最多输入八个字符' required></td>
        </tr>
        <tr>
            <td>籍贯：</td><td><input  style='border: 0' type='text' maxlength='8' placeholder='最多输入八个字符' name='res_nativePlace' required></td>
        <td>毕业院校：</td><td><input  style='border: 0' type='text' name='res_school' maxlength='20' placeholder='最多输入20个字符' required></td>
        </tr>
        <tr>
            <td>政治面貌：</td><td><input  style='border: 0' type='text' name='res_politics' maxlength='10' placeholder='最多输十个字符' required></td>
            <td>专业:</td><td><input  style='border: 0' type='text' name='res_major' maxlength='20' placeholder='最多输入20个字符' required></td>
        </tr>
        <tr>
            <td>学历：</td><td><input  style='border: 0' type='text' name='res_education' maxlength='10' placeholder='最多输入十个字符' required></td>
            <td>邮政编码：</td><td><input  style='border: 0' type='number' maxlength='6' placeholder='最高输入6位数' name='res_zipCode' required></td>
        </tr>
        <tr>
            <td>电话号码：</td><td><input  style='border: 0' type='number' maxlength='11' placeholder='最高输入11位数字' name='res_phone' required></td>
            <td>E-MAIL</td><td><input  style='border: 0' type='text' name='res_email' value='' required></td>
        </tr>
        <tr>
            <td>现住址：</td><td colspan='3'><input  style='border: 0' required type='text' maxlength='50' placeholder='最多输入50个字' name='res_address'></td>
        </tr>
        <tr>
            <td colspan='4' align='center'>自我描述</td>
        </tr>
        <tr>
            <td colspan='4'><textarea name='res_evaluation' maxlength='225'></textarea></td>
        </tr>
        <input type='hidden' id='uid' name='res_uid' value="${sessionScope.user.user_id}">
        <tr>
            <td colspan='4' align='center' ><input type='submit' value='提交'></td>
        </tr>
    </table>
</form>
</body>
</html>