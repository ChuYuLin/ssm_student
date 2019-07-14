<%--
  Created by IntelliJ IDEA.
  User: 14733
  Date: 2019-06-13
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生信息</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/student/save.do" method="post">

        <div>
            <div>姓名</div>
            <div>
                <input type="text" name="name" placeholder="姓名">
            </div>
        </div>
        <div>
            <div>a年龄</div>
            <div>
                <input type="text" name="age" placeholder="年龄">
            </div>
        </div>
        <div>
            <div>生日</div>
            <div>
                <input type="date" name="birthday" placeholder="生日">
            </div>
        </div>
        <div>
            <div>地址</div>
            <div>
                <input type="text" name="address" placeholder="家庭住址">
            </div>
        </div>
            <div>
                <button type="submit">保存</button>
                <button type="button" onclick="history.back(-1);">返回</button>
            </div>
    </form>
</body>
</html>
