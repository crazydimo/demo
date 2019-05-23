<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/22 0022
  Time: 23:34
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
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="title-text">
            <div class="col-md-12 headfontsize" >
                <nav class="navbar navbar-default">
                    <div class="container-fluid">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="#">小高在吗有限公司</a>
                        </div>
                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav">
                                <li><a href="#">了解小高</a></li>
                                <li><a href="#">招聘信息</a></li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">我的简历 <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <c:if test="${sessionScope.resume==null}">
                                            <li><a data-toggle="modal" data-target="#createResume">创建简历</a></li>
                                        </c:if>
                                        <c:if test="${sessionScope.resume!=null}">
                                            <li><a class="btn-group-lg" data-container="body" data-toggle="popover" data-placement="bottom"  data-content="你只能创建一份简历">创建简历</a></li>
                                        </c:if>
                                        <c:if test="${sessionScope.resume!=null}">
                                            <li><a data-toggle="modal" data-target="#modifyResume">查看简历</a></li>
                                        </c:if>
                                        <c:if test="${sessionScope.resume==null}">
                                            <li><a class="btn-group-lg" data-container="body" data-toggle="popover" data-placement="bottom"  data-content="去创建一份属于你自己的简历">查看简历</a></li>
                                        </c:if>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">我的投递 <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Action</a></li>
                                        <li><a href="#">Another action</a></li>
                                        <li><a href="#">Something else here</a></li>
                                    </ul>
                                </li>
                            </ul>
                            <ul class="nav navbar-nav navbar-right">
                                <li><a href="#">注销</a></li>
                            </ul>
                        </div><!-- /.navbar-collapse -->
                    </div><!-- /.container-fluid -->
                </nav>
            </div>
        </div>
    </div>
</div>
<%--创建简历--%>
<div class="modal fade" id="createResume" tabindex="-1" role="dialog" aria-labelledby="myResume">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myResume">我的简历</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" action="addResume" method="post">
                    <table class="table table-hover">
                        <tr>
                            <td>姓名:</td><td><input type="text" maxlength="8" placeholder="最多输入八个字符" name="res_name" required style="border: 0" ></td><td>性别:</td><td>
                            <input type="radio" name="res_sex" value="男" required>男<input type="radio" name="res_sex" value="女" required>女</td>
                        </tr>
                        <tr>
                            <td>出生年月日：</td><td><input style='border: 0' type='date' name='res_birthday' required></td><td>民族：</td>
                            <td><input  style='border: 0' type='text' name='res_nation' maxlength='8' placeholder='最多输入八个字符' required></td>
                        </tr>
                        <tr>
                            <td>籍贯：</td><td><input  style="border: 0" type="text" maxlength="8" placeholder="最多输入八个字符" name="res_nativePlace" required></td>
                            <td>毕业院校：</td><td><input  style="border: 0" type="text" name="res_school" maxlength="20" placeholder="最多输入20个字符" required></td>
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
                            <td colspan="4"><textarea name="res_evaluation" maxlength="225"></textarea></td>
                        </tr>
                        <input type="hidden" name="res_uid" value="${sessionScope.user.user_id}">
                        <button type="submit" class="btn btn-primary">创建简历</button>
                    </table>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<%--查看简历--%>
<div class="modal fade" id="modifyResume" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">我的简历</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" action='updateResume' method='post'>
                    <table class="table table-hover">
                        <tr>
                            <input type="hidden" name="res_id" value="${sessionScope.resume.res_id}">
                            <td>姓名:</td><td><input type='text' maxlength='8' name='res_name' required style='border: 0' value="${sessionScope.resume.res_name}"></td>
                            <td>性别:</td><td><input type='text' name='res_sex' value='${sessionScope.resume.res_sex}' required></td>
                        </tr>
                        <tr>
                            <td>出生年月日：</td><td><input style='border: 0' type='date' name='res_birthday' value="${sessionScope.resume.res_birthday}" required></td>
                            <td>民族：</td><td><input  style='border: 0' type='text' name='res_nation' maxlength='8' value="${sessionScope.resume.res_nation}"  required></td>
                        </tr>
                        <tr>
                            <td>籍贯：</td><td><input  style='border: 0' type='text' maxlength='8' value="${sessionScope.resume.res_nativePlace}" name='res_nativePlace' required></td>
                            <td>毕业院校：</td><td><input  style='border: 0' type='text' name='res_school' maxlength='20' value="${sessionScope.resume.res_school}" required></td>
                        </tr>
                        <tr>
                            <td>政治面貌：</td><td><input  style='border: 0' type='text' name='res_politics' maxlength='10' value="${sessionScope.resume.res_politics}"  required></td>
                            <td>专业:</td><td><input  style='border: 0' type='text' name='res_major' maxlength='20' value="${sessionScope.resume.res_major}" required></td>
                        </tr>
                        <tr>
                            <td>学历：</td><td><input  style='border: 0' type='text' name='res_education' maxlength='10' value="${sessionScope.resume.res_education}" required></td>
                            <td>邮政编码：</td><td><input  style='border: 0' type='number' maxlength='6' value="${sessionScope.resume.res_zipCode}" name='res_zipCode' required></td>
                        </tr>
                        <tr>
                            <td>电话号码：</td><td><input  style='border: 0' type='number' maxlength='11' value="${sessionScope.resume.res_phone}" name='res_phone' required></td>
                            <td>E-MAIL</td><td><input  style='border: 0' type='text' name='res_email' value='${sessionScope.resume.res_email}' required></td>
                        </tr>
                        <tr>
                            <td>现住址：</td><td colspan='3'><input  style='border: 0' required type='text' maxlength='50' value="${sessionScope.resume.res_address}" name='res_address'></td>
                        </tr>
                        <tr>
                            <td colspan='4' align='center'>自我描述</td>
                        </tr>
                        <tr>
                            <td colspan='4'><textarea name='res_evaluation' maxlength='225'>${sessionScope.resume.res_evaluation}</textarea></td>
                        </tr>
                        <input type='hidden' name='res_uid' value="${sessionScope.user.user_id}">
                        <button type="submit" class="btn btn-primary">修改简历</button>
                    </table>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

<script src="js/jquery-3.1.0.js"></script>
<script src="js/bootstrap.min.js"></script>
<script>
    $('.btn-group-lg').popover();
</script>
</body>
</html>