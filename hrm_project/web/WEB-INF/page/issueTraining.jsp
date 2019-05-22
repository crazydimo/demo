<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/20 0020
  Time: 16:43
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
            var obj1 = ${sessionScope.departmentsAdmin}
            $(".change0").click(function () {
                $("body").append("<div style='background-color: #C0C0C0;opacity:0.5;width: 100%;height: 100%;position:absolute;top: 0;'>" +
                    "<div>部门：<select class='change1'><option></option></select><select class='change2'><option></option></select>" +
                    "员工：<div class='change3'></div>" +
                    "<input type='submit' value='确认发布'></div></div>")
            });

            $(" .change1").change(function () {
                $.get("queryPosition",{"dep_id":$(this).val()},function (obj) {
                    $(" .change2 option").remove();
                    for (var i in obj) {
                        $(".change2").append("<option value='"+obj[i]['pos_id']+"'>"+obj[i]['pos_name']+"</option>")
                    }
                })
            });
            $(".change2").change(function () {
                $.get("queryEmployee",{"pos_id":$(this).val()},function (obj) {
                    $(" .change3 input").remove();
                    for (var i in obj) {
                        $(" .change3").append("<input type='checkbox' name='tae_empId' value='"+obj[i]['emp_id']+"'>"+obj[i]['emp_name'])
                    }
                })
            })
        });
    </script>
</head>
<body>
<div>
    <c:if test="${sessionScope.trainingsAdmin == null && fn:length(sessionScope.trainingsAdmin) == 0}">
        <h3>未创建培训活动</h3>
    </c:if>
    <c:if test="${sessionScope.trainingsAdmin != null && fn:length(sessionScope.trainingsAdmin) != 0}">
        <c:forEach items="${sessionScope.trainingsAdmin}" var="tra" varStatus="i">
                <c:choose>
                    <c:when test="${tra.tra_state == 0}">
                        <div>
                            <form action="confirmTraining" method="post">
                                <input type="hidden" name="tra_id" value="${tra.tra_id}">
                                主题：<input name="tra_title" value="${tra.tra_title}">
                                内容：<input name="tra_content" value="${tra.tra_content}">
                                地点：<input name="tra_address" value="${tra.tra_address}">
                                开始时间：<input type="date" name="tra_startTime" value="${tra.tra_startTime}">
                                结束时间：<input type="date" name="tra_endTime" value="${tra.tra_endTime}">
                                <%--部门：<select class="change1">
                                        <option></option>
                                            <c:forEach items="${sessionScope.departmentsAdmin}" var="dep">
                                                <option value="${dep.dep_id}">${dep.dep_name}</option>
                                            </c:forEach>
                                        </select>
                                职位：<select class="change2"><option></option></select>
                                员工：<div class="change3">
                                    </div>
                                <input type="submit" value="确认发布">--%>
                                <input type="hidden" name="tra_id" value="${tra.tra_id}">
                                <input type="button" class="change0" value="添加培训人员">
                            </form>
                            <form action="delTraining" method="post">
                                <input type="hidden" name="tra_id" value="${tra.tra_id}">
                                <input type="submit" value="删除">
                            </form>
                        </div>
                    </c:when>
                    <c:when test="${tra.tra_state == 1}">
                        <div>
                            <form action="" method="post">
                                <input type="hidden" name="tra_id" value="${tra.tra_id}">
                                主题：<input name="tra_title" value="${tra.tra_title}">
                                内容：<input name="tra_content" value="${tra.tra_content}">
                                地点：<input name="tra_address" value="${tra.tra_address}">
                                开始时间：<input type="date" name="tra_startTime" value="${tra.tra_startTime}">
                                结束时间：<input type="date" name="tra_endTime" value="${tra.tra_endTime}">
                                员工：<select name="tae_empId" ><option></option></select>
                            </form>
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div>
                            <form action="" method="post">
                                <input type="hidden" name="tra_id" value="${tra.tra_id}">
                                主题：<input name="tra_title" value="${tra.tra_title}">
                                内容：<input name="tra_content" value="${tra.tra_content}">
                                地点：<input name="tra_address" value="${tra.tra_address}">
                                开始时间：<input type="date" name="tra_startTime" value="${tra.tra_startTime}">
                                结束时间：<input type="date" name="tra_endTime" value="${tra.tra_endTime}">
                                员工：<select name="tae_empId"><option></option></select>
                                <input type="hidden" name="tra_id" value="${tra.tra_id}">
                                <input type="submit" value="删除">
                            </form>
                        </div>
                    </c:otherwise>
                </c:choose>
        </c:forEach>
    </c:if>

</div>
</body>
</html>